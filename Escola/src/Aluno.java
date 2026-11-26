public class Aluno {

    //Atributos
    private boolean matricula;
    private String curso;

    //Getters
    public boolean getMatricula(){
        return matricula;
    }

    public String getCurso(){
        return curso;
    }

    //Setters
    public void setMatricula(boolean matricula){
        this.matricula = matricula;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    //Métodos
    public Aluno(){
        setMatricula(true);
    }

    public void cancelarCurso(){
        setMatricula(false);
    }
}
