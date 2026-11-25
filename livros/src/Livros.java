public class Livros implements IntLivros {
    
    //Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoas leitor;

    //Getters
    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getTotPaginas(){
        return totPaginas;
    }

    public int getPagAtual(){
        return pagAtual;
    }

    public boolean getAberto(){
        return aberto;
    }

    public Pessoas getLeitor(){
        return leitor;
    }

    //Setters

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setTotPaginas(int totPaginas){
        this.totPaginas = totPaginas;
    }

    public void setPagAtual(int pagAtual){
        this.pagAtual = pagAtual;
    }

    public void setAberto(boolean aberto){
        this.aberto = aberto;
    }

    public void setLeitor(Pessoas leitor){
        this.leitor = leitor;
    }

    //Métodos
    public void detalhes(){
        
    }

    @Override
    public void abrir(){

    }

    @Override 
    public void fechar(){

    }

    @Override 
    public void folhear(){

    }

    @Override 
    public void avançarPag(){

    }

    @Override 
    public void voltarPag(){
        
    }
}
