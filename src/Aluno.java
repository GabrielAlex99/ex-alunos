public class Aluno {
    private String nome;
    private String escola;
    private String materia;
    private final double[] nota;
    private int idade;

    public Aluno(String nome, int idade, String escola, String materia, int qtdNotas) {
        this.nome = nome;
        this.escola = escola;
        this.materia = materia;
        this.nota = new double[qtdNotas];
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

    public double[] getNota() {
        return nota;
    }

    public void setNota(int posicao, double nota) {
        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
        } else {
            this.nota[posicao] = nota;
        }
    }

    public double calcularMedia() {
        double soma = 0;
        for (double n : nota) {
            soma += n;
        }
        return soma / nota.length;
    }

    public void exibirDados() {
        System.out.print("Aluno: " + nome
                + " | Idade: " + idade + " anos"
                + " | Escola: " + escola
                + " | Matéria: " + materia
                + " | Notas: ");
        for (int i = 0; i < nota.length; i++) {
            System.out.print(nota[i]);
            if (i < nota.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print(" | Média: " + String.format("%.1f", calcularMedia()));
    }

}
