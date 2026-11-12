import java.util.Scanner;

public class Depositar_sacar{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Depositar_sacar01 d1 = new Depositar_sacar01();

        //Criando o Menu
        d1.menu();
        d1.menuA = sc.nextInt();
        d1.separar();


        //Deposito / Sacar
       switch(d1.menuA){
            case 1:
                d1.saldo();
                System.out.print("Quanto deseja depositar: ");
                d1.depositoA = sc.nextInt();
                d1.depositar();

                break;
            case 2:
                d1.saldo();
                System.out.print("Quanto deseja sacar: ");
                d1.sacarA = sc.nextInt();
                d1.sacar();

                break;
       }
       sc.close();
    }
}