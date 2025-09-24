public class Aluno {
    private String nome;
    private String escola;
    private String materia;
    private final double[] notas;
    private int idade;

    public Aluno(String nome, int idade, String escola, String materia, int qtdNotas) {
        this.nome = nome;
        this.escola = escola;
        this.materia = materia;
        this.notas = new double[qtdNotas];
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNota(int posicao, double nota) {
        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
        } else {
            this.notas[posicao] = nota;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double calcularMedia() {
        if (notas.length == 0) {
            return 0;
        }

        double soma = 0;
        for (double n : notas) {
            soma += n;
        }
        return soma / notas.length;
    }

    public void exibirDados() {
        System.out.print("Aluno: " + nome
                + " | Idade: " + idade + " anos"
                + " | Escola: " + escola
                + " | Matéria: " + materia
                + " | Notas: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i]);
            if (i < notas.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print(" | Média: " + String.format("%.1f", calcularMedia()));
    }

}
