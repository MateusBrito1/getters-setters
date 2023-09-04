package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe");
        felipe.setIdade(8);
        felipe.setSexo("Masculino");

        System.out.println(felipe.getSexo());
        System.out.println("O Aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos");
    }
}
