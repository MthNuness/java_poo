public class Luta02 {

    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    //Getters
    public String getNome(){
        return nome;
    }

    public String getNacionalidade(){
        return nacionalidade;
    }

    public int getIdade(){
        return idade;
    }

    public float getAltura(){
        return altura;
    }

    public float getPeso(){
        return peso;
    }

    public String getCategoria(){
        return categoria;
    }

    public int getVitorias(){
        return vitorias;
    }

    public int getDerrotas(){
        return derrotas;
    }

    public int getEmpates(){
        return empates;
    }

    //Setters

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public void setPeso(float peso){
        this.peso = peso;
        
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public void setVitoria(int vitorias){
        this.vitorias = vitorias;
    }

    public void setDerrotas(int derrotas){
        this.derrotas = derrotas;
    }

    public void setEmpates(int empates){
        this.empates = empates;
    }

    //Constructor 
    public Luta02(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        setpeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    
}
