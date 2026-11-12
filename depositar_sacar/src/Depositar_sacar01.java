public class Depositar_sacar01{

    private double saldo = 1000 + (int)(Math.random() * 5000);
    public int menuA;
    public int depositoA;
    public int sacarA;

    void menu(){
        System.out.println("=================================");
        System.out.println("            B A N C O            ");
        System.out.println("=================================");
        System.out.println("[ 1 ] DEPOSITAR");
        System.out.println("[ 2 ] SACAR");
        System.out.print("Digite qual opção deseja");
    }

    void separar(){
        System.out.println("");
        System.out.println("=================================");
        System.out.println("");
    }

    void saldo(){
        System.out.println("Saldo atual: " + saldo);
    }

    void depositar(){
        if(depositoA < 0){
            System.out.print("Não aceitamos números negativos");
        } else{
            saldo += depositoA;
            System.out.print("Saldo atual: " + saldo);
        }
    }

    void sacar(){
        if(sacarA > saldo){
            System.out.print("O saque supera o valor do seu saldo");
        }else if(sacarA <= 0){
            System.out.print("Não aceitamos números negativos");
        }else{
            saldo -= sacarA;
            System.out.print("Saldo atual: " + saldo);
        }
    }
}