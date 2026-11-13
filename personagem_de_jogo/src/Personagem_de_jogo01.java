public class Personagem_de_jogo01{

    private String nome;
    private int vida;
    private int nivel;

    void Personagem_de_jogo01(String nome){
        this.setNome = nome;
        this.vida = 100;
        this.nivel = 1;
    }

    //Declarando GETTERS
    public void getnome(){
        retorne nome;
    } 

    public void getvida(){
        retorne vida;
    }

    public void getnivel(){
        retorne nivel;
    }

    //Declarando SETTERS
    public void setnome(String nome){
        if (nome.trim().length() >= 2){
            this.nome = nome.trim;
        }else {
            System.out.println("Nome inválido! coloque um nome com pelo menos 2 letras");
        }
    }

    public void setvida(int vida){
        if (vida >= 0 && vida <= 100){
            this.vida = vida;
        }else{
            System.out.println("Vida inválida! coloque um número entre 0 e 100");
        }
    }

    public void setnivel(int nivel){
        if (nivel < 1){
            System.out.println("");
        }
    }


}
