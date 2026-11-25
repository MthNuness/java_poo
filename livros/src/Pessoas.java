public class Pessoas {
    
    //Atributos
    private String nome;
    private int idade;
    private String sexo;

    //Getters
    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public String getsexo(){
        return sexo;
    }

    //Setters   
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    //Métodos
    public Pessoas(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void fazerAniversario(){
        setIdade(getIdade() + 1);
    }
        
}
