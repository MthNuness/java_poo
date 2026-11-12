public class Depositar_sacar01{

    private double saldo = 1000 + (int)(Math.random() * 5000);
    public int menu;
    public int deposito;

    void menu(){
        System.out.println("=================================");
        System.out.println("            B A N C O            ");
        System.out.println("=================================");
        System.out.println("[ 1 ] DEPOSITAR");
        System.out.println("[ 2 ] SACAR");
        System.out.print("Digite qual opção deseja");
    }

    void saldo(){
        System.out.println("Saldo atual: " + saldo);
    }

    void depositar(){
        if(deposito < 0){
            System.out.print("Não aceitamos números negativos");
        } else{
            saldo += deposito;
            System.out.print("Saldo atual: " + saldo);
        }

    }

    void sacar(){

    }
}