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
        setAberto(false);
        setPagAtual(0);
    }

    public void detalhes(){
        System.out.println("");
        System.out.println("=======================================================");
        System.out.println("                     LIVRO ATUAL                       ");
        System.out.println("=======================================================");
        System.out.println("");
        System.out.println(this.leitor.getNome() + " está lendo o seguinte livro " + getTitulo());
        System.out.println("");
        System.out.println("Escrito pelo autor: " + getAutor() + " com um total de páginas igual a " + getTotPaginas() + " páginas");
        System.out.println("");
        System.out.println("Atualmente ele está na página: " + getPagAtual());
        System.out.println("");
        System.out.println("Ele está lendo agora?: " + getAberto());
        
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
        if(pagina <= this.totPaginas){
            this.pagAtual = pagina;
        }else if(pagina < 0){
            System.out.println("Não é possível ir até essa página, pois ela não existe");
        }else{
            System.out.println("Não é possível ir até essa página, pois ela não existe");
        }
    }

    @Override 
    public void avancarPag(){
        if(this.pagAtual <= this.totPaginas){
            setPagAtual(getPagAtual() + 1);
        }else{
            System.out.println("Você terminou o livro. Parabens!!!");
            setAberto(false);
        }
    }

    @Override 
    public void voltarPag(){
        if(getPagAtual() <= 0){
            System.out.println("Essa já é a primeira páginas");
        }else{
            this.pagAtual--;
        }
    }
}
