

public class Funcionario {

    //Atributo
    private String setor;
    private boolean trabalhando;

    //Getters
    public String getSetor(){
        return setor;
    }

    public boolean getTrabalhando(){
        return trabalhando;
    }

    //Setters

    public void setSetor(String setor){
        this.setor = setor;
    }

    public void setTrabalhando(boolean trabalhando){
        this.trabalhando = trabalhando;
    }

    //Métodos
    public void mudarTrabalho(){
        if(getTrabalhando() == true){
            setTrabalhando(false);
        }else{
            setTrabalhando(true);
        }
    }
    
}
