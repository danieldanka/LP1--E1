import java.util.Scanner;

public class media {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota da P1: ");
        double P1 = scanner.nextDouble();


        System.out.println("Digite a nota da E1: ");
        double E1 = scanner.nextDouble();


        System.out.println("Digite a nota da E2: ");
        double E2 = scanner.nextDouble();


        System.out.println("Digite a nota das Atividades Extras (X): ");
        double X = scanner.nextDouble();


        System.out.println("Digite a nota da Substituição (SUB): ");
        double SUB = scanner.nextDouble();


        System.out.println("Digite a nota da API: ");
        double API = scanner.nextDouble();


        double mediaFinal = ((P1*0.5+E1*0.2+E2*0.3+X+SUB*0.15)*0.5)+(Math.max(P1*0.5+E1*0.2+E2*0.3+X+(SUB*0.15)-5.9, 0)/(P1*0.5+E1*0.2+E2*0.3+X+(SUB*0.15)-5.9))*API*0.5;

        System.out.println("A sua média final: " + ((mediaFinal > 10) ? 10 : mediaFinal));
        System.out.println("O aluno foi: " + ((mediaFinal >= 6) ? "Aprovado" : "Reprovado"));

        scanner.close();

    }

}

