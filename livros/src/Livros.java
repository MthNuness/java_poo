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
    public Livros(String titulo, String autor, int totPaginas, Pessoas leitor){
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
    }

    public void detalhes(){
        getTitulo();
        getAutor();
        getTotPaginas();
        getPagAtual();
        getAberto();
        getLeitor();
    }

    @Override
    public void abrir(){
        setAberto(true);
    }

    @Override 
    public void fechar(){
        setAberto(false);
    }

    @Override 
    public void folhear(int pagina){
        this.pagAtual = pagina;
    }

    @Override 
    public void avancarPag(){
        setPagAtual(getPagAtual() + 1);
    }

    @Override 
    public void voltarPag(){
        this.pagAtual--;
    }
}
