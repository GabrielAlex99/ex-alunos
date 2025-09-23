import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDigite a quantidade de alunos para cadastro:");
        int qtdAluno = scanner.nextInt();

        System.out.println("\nDigite a quantidade de notas por aluno:");
        int qtdNotas = scanner.nextInt();
        scanner.nextLine();

        Aluno[] alunos = new Aluno[qtdAluno];

        for (int i = 0; i < qtdAluno; i++) {
            System.out.println("\n--- Cadastro do Aluno " + (i + 1) + " ---");

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Escola: ");
            String escola = scanner.nextLine();

            System.out.print("Matéria: ");
            String materia = scanner.nextLine();

            alunos[i] = new Aluno(nome, idade, escola, materia, qtdNotas);

            for (int j = 0; j < qtdNotas; j++) {
                double nota;
                do {
                    System.out.print("Digite a nota " + (j + 1) + ": ");
                    nota = scanner.nextDouble();

                    if (nota < 0 || nota > 10) {
                        System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
                    }
                } while (nota < 0 || nota > 10);

                alunos[i].setNota(j, nota);
            }
            scanner.nextLine();
        }

        System.out.println("\n--- Resultado Final ---");
        for (Aluno aluno : alunos) {
            aluno.exibirDados();
            System.out.println();
            System.out.println();
        }

        scanner.close();

    }

}
