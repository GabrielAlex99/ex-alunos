import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int qtdAlunos;
        do {
            System.out.println("\nDigite a quantidade de alunos para cadastro:");
            qtdAlunos = scanner.nextInt();
            if (qtdAlunos <= 0) {
                System.out.println("\nA quantidade de alunos deve ser maior que zero.");
            }
        } while (qtdAlunos <= 0);

        int qtdNotas;
        do {
            System.out.println("\nDigite a quantidade de provas por aluno:");
            qtdNotas = scanner.nextInt();
            if (qtdNotas < 0) {
                System.out.println("\nA quantidade de provas não pode ser negativa.");
            }
        } while (qtdNotas < 0);
        scanner.nextLine();

        Aluno[] listaDeAlunos = new Aluno[qtdAlunos];

        for (int i = 0; i < qtdAlunos; i++) {
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

            listaDeAlunos[i] = new Aluno(nome, idade, escola, materia, qtdNotas);

            for (int j = 0; j < qtdNotas; j++) {
                double nota;
                do {
                    System.out.print("Digite a nota da prova " + (j + 1) + ": ");
                    nota = scanner.nextDouble();

                    if (nota < 0 || nota > 10) {
                        System.out.println("\nNota inválida! Digite uma nota entre 0 e 10.");
                    }
                } while (nota < 0 || nota > 10);

                listaDeAlunos[i].setNota(j, nota);
            }
            scanner.nextLine();
        }

        System.out.println("\n--- Resultado Final ---");
        for (Aluno aluno : listaDeAlunos) {
            aluno.exibirDados();
            System.out.println();
            System.out.println();
        }

        scanner.close();

    }

}
