public class AlunoTest {

    public static void main(String[] args) {
        testarCalculoMediaComMultiplasNotas();
        testarCalculoMediaComNotasExtremas();
        testarCalculoMediaSemProvas();
        System.out.println("Todos os testes passaram!");
    }

    private static void testarCalculoMediaComMultiplasNotas() {
        Aluno aluno = new Aluno("Ana", 15, "Escola Modelo", "Matemática", 3);
        aluno.setNota(0, 7);
        aluno.setNota(1, 8);
        aluno.setNota(2, 9);

        assertAproximado(8.0, aluno.calcularMedia(), "A média deve considerar todas as notas informadas.");
    }

    private static void testarCalculoMediaComNotasExtremas() {
        Aluno aluno = new Aluno("Bruno", 16, "Escola Modelo", "História", 2);
        aluno.setNota(0, 0);
        aluno.setNota(1, 10);

        assertAproximado(5.0, aluno.calcularMedia(), "A média deve lidar com notas nos limites do intervalo permitido.");
    }

    private static void testarCalculoMediaSemProvas() {
        Aluno aluno = new Aluno("Carla", 17, "Escola Modelo", "Química", 0);

        assertAproximado(0.0, aluno.calcularMedia(), "Sem provas cadastradas, a média deve ser zero.");
    }

    private static void assertAproximado(double esperado, double atual, String mensagem) {
        double margemErro = 0.0001;
        if (Math.abs(esperado - atual) > margemErro) {
            throw new AssertionError(mensagem + " Esperado: " + esperado + ", obtido: " + atual);
        }
    }
}
