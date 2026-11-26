public class Escola{
    public static void main(String[] args){
        Pessoas p1 = new Pessoas();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        //Classe aluno
        p2.setNome("Matheus");
        p2.setIdade(21);
        p2.setSexo("Masculino");
        System.out.println(p2.getNome() + " " + p2.getIdade() + " " + p2.getSexo());
        System.out.println(p2.getMatricula());
        p2.cancelarCurso();
        System.out.println(p2.getMatricula());
    }
}