package tela.login.interfacemusica;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Registro extends JFrame {

    // CORRIGIDO: Variável renomeada de 'labelStatus' para 'statusLabel'
    // (ou vice-versa, para que o nome coincida com o uso em todo o código)
    private JComboBox<String> seletorClasses;
    private JPanel painelCampos;
    private CardLayout cardLayout;
    private JLabel statusLabel; // Nome correto usado em todo o código.

    private Map<String, JTextField[]> camposPorClasse;

    public Registro(){
        super("Registro de Classes");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(10, 10));

        // --- Configuração da ComboBox ---
        JPanel painelTopo = new JPanel(new FlowLayout(FlowLayout.CENTER));
        String[] nomesClasses = {"Leo", "Show", "Mundo"};

        // CORRIGIDO: Adiciona os nomes das classes diretamente no JComboBox
        seletorClasses = new JComboBox<>(nomesClasses);

        // CORRIGIDO: Adiciona o ActionListener para trocar os campos quando a seleção mudar
        seletorClasses.addActionListener(e -> trocarCampos());

        painelTopo.add(new JLabel("Selecione a Classe:")); // Adicionado Label para instrução
        painelTopo.add(seletorClasses);
        this.add(painelTopo, BorderLayout.NORTH);

        cardLayout = new CardLayout();
        painelCampos = new JPanel(cardLayout);
        camposPorClasse = new HashMap<>();

        configurarPainelEntrada();
        this.add(painelCampos, BorderLayout.CENTER);

        JButton botaoRegistrar = new JButton("Registrar");
        botaoRegistrar.addActionListener(e -> registrarDados());

        // CORRIGIDO: Inicialização de statusLabel (o nome agora coincide com a declaração de campo)
        statusLabel = new JLabel("Aguardando registro...", SwingConstants.CENTER);

        JPanel painelFundo = new JPanel(new BorderLayout());
        painelFundo.add(botaoRegistrar, BorderLayout.CENTER);
        painelFundo.add(statusLabel, BorderLayout.SOUTH);
        this.add(painelFundo, BorderLayout.SOUTH);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        // Chamada inicial para mostrar o primeiro painel
        trocarCampos();
    }

    private void configurarPainelEntrada(){
        // Note: As chaves do mapa (leo, show, mundo) devem corresponder aos itens da ComboBox.
        // Se a ComboBox usar "Leo", "Show", "Mundo" (com a primeira letra maiúscula),
        // as chaves do mapa e os nomes dos painéis também devem ser assim.
        String[] atributosLeo={"Nome","Altura","Aniversario"};
        camposPorClasse.put("Leo", criarCampos("Leo",atributosLeo));

        String[] atributosShow={"Cantor","Local","Publico"};
        camposPorClasse.put("Show", criarCampos("Show",atributosShow));

        String[] atributosMundo={"Nome","Nuvens","Estações"};
        camposPorClasse.put("Mundo", criarCampos("Mundo",atributosMundo));
    }

    private JTextField[] criarCampos(String nomeClasse, String[] atributos){
        JPanel painel = new JPanel(new GridLayout(atributos.length, 2, 5, 5));
        JTextField[] campos = new JTextField[atributos.length];

        for(int i=0; i<atributos.length; i++){
            painel.add(new JLabel(atributos[i] + ":"));
            campos[i] = new JTextField(20);
            painel.add(campos[i]);
        }
        painelCampos.add(painel, nomeClasse);
        return campos;
    }

    // CORRIGIDO: Tipo de retorno 'void' adicionado
    private void trocarCampos(){
        String classeSelecionada = (String) seletorClasses.getSelectedItem();
        cardLayout.show(painelCampos, classeSelecionada);
        this.pack();
        statusLabel.setText("Aguardando registro...");
    }

    private void registrarDados(){
        String classeSelecionada = (String) seletorClasses.getSelectedItem();
        JTextField[] campos = camposPorClasse.get(classeSelecionada);

        if (campos == null) {
            statusLabel.setText("ERRO: Selecione uma classe válida.");
            return;
        }

        StringBuilder dados = new StringBuilder();
        dados.append(classeSelecionada).append(";");

        for(JTextField campo : campos){
            dados.append(campo.getText()).append(";");
        }
        if (dados.length()> 0){
            dados.setLength(dados.length()-1);
        }
        if (salvarCSV(dados.toString())) {
            statusLabel.setText("Registro com sucesso! Dados salvos em dados.csv.");
        } else {
            statusLabel.setText("ERRO ao registrar! Verifique permissões do arquivo.");
        }
    }

    private boolean salvarCSV(String linha) {
        try (PrintWriter pw = new PrintWriter(new FileWriter("dados.csv", true))) {
            pw.println(linha);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Registro());
    }
}