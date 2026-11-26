public class Professor {

    //Atributos
    private String especialidade;
    private double salario;

    //Getters
    public String getEspecialidade(){
        return especialidade;
    }

    public double getSalario(){
        return salario;
    }

    //Setters

    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    //Métodos
    public void receberAumento(){
        this.salario *= 1.1;
    }
    
    
}
