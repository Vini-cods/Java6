public class Academia {
    public static void main(String[] args) {
        AlunoAcademia aluno1 = new AlunoAcademia("Lucas Mendes", 80.0, 1.75);
        AlunoAcademia aluno2 = new AlunoAcademia("Marina Lopes", 52.0, 1.60);

        aluno1.exibirStatus();
        System.out.println();
        aluno2.exibirStatus();
    }
}