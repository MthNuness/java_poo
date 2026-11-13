import java.util.Scanner;

public class Personagem_de_jogo01{

    private String nome;
    private int vida;
    private int dano;
    private int nivel;
    private int atri;

    public Personagem_de_jogo01(String nome){
        this.setnome(nome);
        this.vida = 100;
        this.dano = 10;
        this.nivel = 1;
    }

    //GETTERS

    public String getnome(){
        return this.nome;
    }

    public int getvida(){
        return this.vida;
    }

    public int getdano(){
        return this.dano;
    }

    public int getnivel(){
        return this.nivel;
    }

    public int getatri(){
        return this.atri;
    }

    //SETTERS
    public void setnome(String nome){
        if (nome.trim().length() >= 2){
            this.nome = nome.trim();
        }else {
            System.out.println("Nome inválido. Coloque pelo menos 2 letras");
        }
    }

    public void setvida(int vida){
        this.vida = vida;
    }

    public void setdano(int dano){
        this.dano = vida;
    }

    public void setnivel(int nivel){
        this.nivel = nivel;
    }

    public void setatri(int atri){
        this.atri = atri;
    }

    //Interface
    public void status(){
        System.out.println("");
        System.out.println("");
        System.out.println("==========================");
        System.out.println("          STATUS          ");
        System.out.println("Nome: " + getnome());
        System.out.println("Vida: " + getvida());
        System.out.println("Dano: " + getdano());
        System.out.println("Nível: " + getnivel());
    }

    public void atributos(){
        System.out.println("");
        System.out.println("==========================");
        System.out.println("   PONTOS DE ATRIBUTO: 3  ");
        System.out.println("");
        System.out.println("[ 1 ] Vida: Ganha 10 pontos de vida");
        System.out.println("[ 2 ] Dano: Ganha 10 pontos de dano");
        System.out.println("[ 3 ] Nível: Ganha 5 pontos de vida e 5 pontos de dano");
        System.out.print("Como deseja utiliza-los: ");
    }

    public void upar(int atri, Scanner sc){
        for(;atri != 0; atri--){
            int upar = sc.nextInt();

            switch (upar){
                case 1:
                    this.vida += 10;
                    break;
                case 2:
                    this.dano += 10;
                    break;
                case 3: 
                    this.vida += 5;
                    this.dano += 5;
                    this.nivel += 1;
            }

            status();
            System.out.print("Como deseja utiliza-los: ");
        }
    }

    public void dungeon(Scanner sc){
        String entrar0 = sc.nextLine();

        System.out.println("");
        System.out.println("==========================");
        System.out.print("Deseja entrar na Dungeon [Sim/Não]: ");
        String entrar = sc.nextLine();
        if (entrar.equals("Sim")){
            System.out.println("Você entra na Dungeon com sucesso.");
        }else{
            System.out.println("Você se acovardou. ");
            System.out.print("DERROTA");
        }
    }

}
