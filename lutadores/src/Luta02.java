public class Luta02 {

    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
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

    public double getAltura(){
        return altura;
    }

    public double getPeso(){
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

    public void setAltura(double altura){
        this.altura = altura;
    }

    public void setPeso(double peso){
        this.peso = peso;
        this.setCategoria();
        
    }

    private void setCategoria(){
        if (this.peso <= 52.2){
            this.categoria = "inválido";
        }else if(this.peso <= 70.3){
            this.categoria = "Leve";
        }else if(this.peso <= 83.9){
            this.categoria = "Médio";
        }else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }
    }

    public void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }

    public void setDerrotas(int derrotas){
        this.derrotas = derrotas;
    }

    public void setEmpates(int empates){
        this.empates = empates;
    }

    //Constructor 
    public Luta02(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    //Métodos
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }

    public void apresentar(){
        System.out.println("================================");
        System.out.println("            LUTADORES           ");
        System.out.println("================================");
        System.out.println("");
        System.out.println("Nome do Lutador: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade() + " Anos");
        System.out.println("Pesando atualmente: " + this.getPeso() + " Kg");
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
    }

    public void status(){
        System.out.println(getNome());
        System.out.println("É um peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " Vitorias");
        System.out.println(this.getDerrotas() + " Derrotas");
        System.out.println(this.getEmpates() + "Empates");
    }
}
