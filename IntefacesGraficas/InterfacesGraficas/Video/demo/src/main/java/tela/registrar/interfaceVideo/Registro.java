package tela.registrar.interfaceVideo;

import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Registro extends JFrame {

    private JComboBox<String> seletorClasses;
    private JPanel painelCampos;
    private CardLayout cardLayout;
    private JLabel statusLabel;

    private Map<String, JTextField[]> camposPorClasse;

    public Registro(){
        super("Registro de Classes");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(10, 10));

        JPanel painelTopo = new JPanel(new FlowLayout(FlowLayout.CENTER));
        String[] nomesClasses = {"Plataforma", "videoFelca", "Influenciador"};

        seletorClasses = new JComboBox<>(nomesClasses);
        seletorClasses.addActionListener(e -> trocarCampos());

        painelTopo.add(new JLabel("Selecione a Classe:"));
        painelTopo.add(seletorClasses);
        this.add(painelTopo, BorderLayout.NORTH);

        cardLayout = new CardLayout();
        painelCampos = new JPanel(cardLayout);
        camposPorClasse = new HashMap<>();

        configurarPainelEntrada();
        this.add(painelCampos, BorderLayout.CENTER);

        JButton botaoRegistrar = new JButton("Registrar");
        botaoRegistrar.addActionListener(e -> registrarDados());

        statusLabel = new JLabel("Aguardando registro...", SwingConstants.CENTER);

        JPanel painelFundo = new JPanel(new BorderLayout());
        painelFundo.add(botaoRegistrar, BorderLayout.CENTER);
        painelFundo.add(statusLabel, BorderLayout.SOUTH);
        this.add(painelFundo, BorderLayout.SOUTH);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        trocarCampos();
    }

    private void configurarPainelEntrada(){

        String[] atributosPlataforma={"Nome","Moderacao Eficiente (boolean)","Qtd. Usuários"};
        camposPorClasse.put("Plataforma", criarCampos("Plataforma",atributosPlataforma));

        String[] atributosVideoFelca={"Título","Duração (min)","Visualizações (int)"};
        camposPorClasse.put("videoFelca", criarCampos("videoFelca",atributosVideoFelca));

        String[] atributosInfluenciador={"Nome","Investigado (boolean)","Seguidores (int)"};
        camposPorClasse.put("Influenciador", criarCampos("Influenciador",atributosInfluenciador));
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

        String nomeDoArquivo = classeSelecionada + ".csv";

        if (salvarCSV(dados.toString(), nomeDoArquivo)) {
            statusLabel.setText("Registro com sucesso! Dados salvos em " + nomeDoArquivo + ".");
        } else {
            statusLabel.setText("ERRO ao registrar! Verifique permissões do arquivo.");
        }
    }
    private boolean salvarCSV(String linha, String nomeArquivo) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(nomeArquivo, true))) {
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