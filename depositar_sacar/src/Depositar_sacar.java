import java.util.Scanner;

public class Depositar_sacar{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Depositar_sacar01 d1 = new Depositar_sacar01();

        //Criando o Menu
        d1.menu();
        d1.menu = sc.nextInt();
        System.out.println("");
        System.out.println("=================================");
        System.out.println("");


        //Deposito / Sacar
       switch(d1.menu){
            case 1:
                d1.saldo();
                System.out.print("Quanto deseja depositar: ");
                d1.deposito = sc.nextInt();
                d1.depositar();

                break;
            case 2:
                d1.saldo();
                d1.sacar();
                break;
       }

    }
}