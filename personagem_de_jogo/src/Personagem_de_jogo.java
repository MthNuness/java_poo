import java.util.Scanner;

public class Personagem_de_jogo{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        menu p2 = new menu();

        //Menu
        p2.menu1();
        String nome1 = sc.nextLine();
        Personagem_de_jogo01 p1 = new Personagem_de_jogo01(nome1);

        //Status
        p1.status();

        //Atributos
        p1.atributos();
        int atri1 = 3;
        p1.upar(atri1, sc);
        p1.status();

        //Dungeons 
        p1.dungeon(sc);

        //Combate
        p1.inimigoint(sc);
    }
}