import java.util.Scanner;

public class Banco{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Banco01 c1 = new Banco01();

        c1.menu(sc);
        for(; c1.getescolha() != 5;){
            c1.menu(sc);
        }
        sc.close();
    }
}