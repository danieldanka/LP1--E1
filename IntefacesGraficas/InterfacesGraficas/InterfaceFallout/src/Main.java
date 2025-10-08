import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Main extends JFrame {
    private JComboBox<String> seletorClasses;
    private JPanel painelCampos;
    private CardLayout cardLayout;
    private JLabel statusLabel;
    private Map<String, JTextField[]> camposPorClasse;

    public Main() {
        super("Registro de Classes");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(10, 10));

        JPanel painelTopo = new JPanel(new FlowLayout(FlowLayout.CENTER));
        // Mudei os nomes das classes para as que estamos usando
        String[] nomesClasses = new String[]{"Refugiado", "Robo", "Cachorro"};
        this.seletorClasses = new JComboBox<>(nomesClasses);
        this.seletorClasses.addActionListener((e) -> this.trocarCampos());
        painelTopo.add(new JLabel("Selecione a Classe:"));
        painelTopo.add(this.seletorClasses);
        this.add(painelTopo, BorderLayout.NORTH);

        this.cardLayout = new CardLayout();
        this.painelCampos = new JPanel(this.cardLayout);
        this.camposPorClasse = new HashMap<>();
        this.configurarPainelEntrada(); // Este método foi atualizado
        this.add(this.painelCampos, BorderLayout.CENTER);

        JButton botaoRegistrar = new JButton("Registrar");
        botaoRegistrar.addActionListener((e) -> this.registrarDados());
        this.statusLabel = new JLabel("Aguardando registro...", JLabel.CENTER);

        JPanel painelFundo = new JPanel(new BorderLayout());
        painelFundo.add(botaoRegistrar, BorderLayout.CENTER);
        painelFundo.add(this.statusLabel, BorderLayout.SOUTH);
        this.add(painelFundo, BorderLayout.SOUTH);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.trocarCampos();
    }

    private void configurarPainelEntrada() {
        // Configurei os atributos para cada uma das suas classes
        String[] atributosRefugiado = new String[]{"Nome", "Gênero", "Estado de Sobrevivência"};
        this.camposPorClasse.put("Refugiado", this.criarCampos("Refugiado", atributosRefugiado));

        String[] atributosRobo = new String[]{"Modelo", "Estado", "Flutuante (true/false)"};
        this.camposPorClasse.put("Robo", this.criarCampos("Robo", atributosRobo));

        String[] atributosCachorro = new String[]{"Nome", "Raça", "Lealdade"};
        this.camposPorClasse.put("Cachorro", this.criarCampos("Cachorro", atributosCachorro));
    }

    private JTextField[] criarCampos(String nomeClasse, String[] atributos) {
        JPanel painel = new JPanel(new GridLayout(atributos.length, 2, 5, 5));
        JTextField[] campos = new JTextField[atributos.length];

        for (int i = 0; i < atributos.length; ++i) {
            painel.add(new JLabel(atributos[i] + ":"));
            campos[i] = new JTextField(20);
            painel.add(campos[i]);
        }

        this.painelCampos.add(painel, nomeClasse);
        return campos;
    }

    private void trocarCampos() {
        String classeSelecionada = (String) this.seletorClasses.getSelectedItem();
        this.cardLayout.show(this.painelCampos, classeSelecionada);
        this.pack(); // Reajusta o tamanho da janela para caber os novos campos
        this.statusLabel.setText("Aguardando registro para " + classeSelecionada + "...");
    }

    private void registrarDados() {
        String classeSelecionada = (String) this.seletorClasses.getSelectedItem();
        JTextField[] campos = (JTextField[]) this.camposPorClasse.get(classeSelecionada);

        if (campos == null) {
            this.statusLabel.setText("ERRO: Selecione uma classe válida.");
            return;
        }

        // Verifica se algum campo está vazio
        for (JTextField campo : campos) {
            if (campo.getText().trim().isEmpty()) {
                this.statusLabel.setText("ERRO: Todos os campos devem ser preenchidos.");
                return;
            }
        }

        StringBuilder dados = new StringBuilder();
        dados.append(classeSelecionada).append(";");

        for (JTextField campo : campos) {
            dados.append(campo.getText()).append(";");
        }

        if (dados.length() > 0) {
            dados.setLength(dados.length() - 1); // Remove o último ";"
        }

        if (this.salvarCSV(dados.toString())) {
            this.statusLabel.setText("'" + classeSelecionada + "' registrado com sucesso em dados.csv!");
            // Limpa os campos após o registro
            for (JTextField campo : campos) {
                campo.setText("");
            }
        } else {
            this.statusLabel.setText("ERRO ao registrar! Verifique as permissões do arquivo.");
        }
    }

    private boolean salvarCSV(String linha) {
        // O "true" no FileWriter faz com que ele adicione a linha no final do arquivo (append)
        try (PrintWriter pw = new PrintWriter(new FileWriter("dados.csv", true))) {
            pw.println(linha);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main());
    }
}