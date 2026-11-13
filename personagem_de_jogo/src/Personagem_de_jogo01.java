import java.util.Scanner;

public class Personagem_de_jogo01{

    private String nome;
    private int vida;
    private int vida1;
    private int vida2;
    private int dano;
    private int nivel;
    private int atri;

    public Personagem_de_jogo01(String nome){
        this.setnome(nome);
        this.vida = 100;
        this.vida1 = 50;
        this.vida2 = 150;
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

    public int getvida1(){
        return this.vida1;
    }

    public int getvida2(){
        return this.vida2;
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
        if (vida < 0) {
            this.vida = 0;      
        } else {
        this.vida = vida;
        }
    }


    public void setvida1(int vida1){
        if (vida1 < 0) {
            this.vida1 = 0;      
        } else {
        this.vida1 = vida1;
        }
    }

    public void setvida2(int vida2){
        if (vida2 < 0) {
            this.vida2 = 0;      
        } else {
        this.vida2 = vida2;
        }
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
        System.out.print("Deseja entrar na Dungeon [Sim/Não]:");
        String entrar = sc.nextLine();
        if (entrar.equals("Sim")){
            System.out.println("Você entra na Dungeon com sucesso.");
        }else{
            System.out.println("Você se acovardou. ");
            System.out.print("DERROTA");
        }
    }

    public void inimigoint(Scanner sc){
        System.out.println("");
        System.out.println("==========================");
        System.out.println("Ao entrar na Dungeon você se deparar com um inimigo");
        System.out.println("Você só têm duas opções");
        System.out.println("[ 1 ] Lutar");
        System.out.println("[ 2 ] Correr");
        System.out.print("Qual você escolhe: ");
        int escolha = sc.nextInt();
        if(escolha == 1){
            System.out.println("==========================");
            System.out.println("A batalha começa");
            inimigo1(sc);

        }else {
            System.out.println("Você consegue fugir e sai da Dungeon");
            System.out.println("DERROTA");
        }
    }

    public void vida1(){
        System.out.println("");
        System.out.println("==========================");
        System.out.println("          INIMIGO         ");
        System.out.println("Pontos de vida: " + getvida1());
    }
    
    public void vida2(){
        System.out.println("");
        System.out.println("==========================");
        System.out.println("          INIMIGO         ");
        System.out.println("Pontos de vida: " + getvida2());
    }

    public void inimigo1(Scanner sc){
        System.out.println("");
        System.out.println("==========================");
        vida1();
        System.out.println("==========================");
        System.out.println("         A Ç Õ E S        ");
        System.out.println("");
        for(; this.vida > 0 && this.vida1 > 0;){
            System.out.println("[ 1 ] ATACAR");
            System.out.println("[ 2 ] ESQUIVAR");
            System.out.print("Escolha: ");
            int luta = sc.nextInt();
            switch(luta){
                case 1:
                    this.vida1 -= this.dano;
                    this.setvida(this.getvida() - 10);
                    vida1();
                    status();
                    break;
                case 2:
                    System.out.println("Você esquivou com sucesso!");
                    vida1();
                    status();
            }
        }
        if (this.vida > 0){
            System.out.println("Parabens você derrotou o inimigo!");
            System.out.println("Porém quando você menos espera.");
            System.out.println("Outro inimigo pula em você e não te deixa escapatoria, lute pela sua vida");
            inimigo2(sc);
        }else{
            System.out.println("DERROTA");
        }
    }

    public void inimigo2(Scanner sc){
        System.out.println("");
        System.out.println("==========================");
        System.out.println("        ARANHA REAL       ");
        System.out.println("");
        System.out.println("Pontos de Vida: " + getvida2());
        System.out.println("");
        System.out.println("==========================");
        System.out.println("         A Ç Õ E S        ");
        System.out.println("");
        for(; this.vida > 0 && this.vida2 > 0;){
            System.out.println("[ 1 ] ATACAR");
            System.out.println("[ 2 ] ESQUIVAR");
            System.out.print("Escolha: ");
            int luta = sc.nextInt();
            switch(luta){
                case 1:
                    this.vida2 -= this.dano;
                    this.setvida(this.getvida() - 10);
                    vida2();
                    status();
                    break;
                case 2:
                    System.out.println("Você esquivou com sucesso!");
                    vida2();
                    status();
            }
        }
        if(this.vida > 0){
            System.out.println("Eu Matheus Nunes criador do jogo te nomeio o novo heroi. Parabens! " +getnome());
        }else{
            System.out.println("DERROTA");
        }
    }
}