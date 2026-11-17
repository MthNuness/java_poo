import java.util.Scanner;

public class Banco01 {
    
    //Atributos
    public int numconta = this.numconta = 10000 + (int)(Math.random() * 40001);
    protected String tipo;
    private String dono;
    private int saldo;
    private boolean status;

    //Getters
    public int getnumconta(){
        return numconta;
    }

    public String gettipo(){
        return tipo;
    }

    public String getdono(){
        return dono;
    }

    public int getsaldo(){
        return saldo;
    }

    public boolean getstatus(){
        return status;
    }

    //Setters

    public void setnumconta(int numconta){
        this.numconta = numconta;
    }

    public void setsaldo(int saldo){
        if (saldo >= 0){
            this.saldo += saldo;
        }else{
            System.out.println("Deposito invalido");
        }
    }

    public void settipo(String tipo){
        if (tipo.trim().equals("CC")){
            this.setsaldo(this.getsaldo() + 50);
            this.tipo = tipo;
        }else{
            this.setsaldo(this.getsaldo() + 150);
            this.tipo = tipo;
        }
    }

    public void setdono(String dono){
        if(dono.trim().length() >=4){
            this.dono = dono;
        }else{
            System.out.print("Escreva um nome como no mínimo 4 letras");
        }
    }

    public void setstatus(boolean status) {
        this.status = status;
    }

    //Métodos()
    public void Banco01(){
        this.setstatus(false);
        this.setsaldo(0);
    }

    public void menu(Scanner sc){
        System.out.println("=======================");
        System.out.println("        M E N U        ");
        System.out.println("=======================");
        System.out.println("");
        System.out.println("[ 1 ] Criar conta");
        System.out.println("[ 2 ] Deletar conta");
        System.out.println("[ 3 ] Depositar");
        System.out.println("[ 4 ] Sacar");
        System.out.println("");
        System.out.print("Digite qual deseja: ");
        int escolha = sc.nextInt();
        switch(escolha){
            case 1: 
                criar_conta(sc);

                break;
            case 2:
                deletar_conta();

                break;
            case 3:
                depositar();

                break;
            case 4:
                sacar();

                break;
        }
    }

    public void criar_conta(Scanner sc){
        //Nome
        System.out.println("");
        System.out.println("");
        System.out.println("=======================");
        System.out.println("     CRIANDO CONTA     ");
        System.out.println("");
        System.out.print("Informe o nome da sua conta: ");
        String N1 = sc.nextLine();
        String nomeC = sc.nextLine();
        this.setdono(nomeC);

        //Tipo de conta
        System.out.println("");
        System.out.println("");
        System.out.println("=======================");
        System.out.println("     TIPO DA CONTA     ");
        System.out.println("[ CC ] Caso deseje uma conta corrente");
        System.out.println("[ CP ] Caso deseje uma conta poupança");
        System.out.println("");
        System.out.print("Qual deseja: ");
        String tipo1 = sc.nextLine();
        this.settipo(tipo1);

        //Criou
        System.out.println("");
        System.out.println("=======================");
        System.out.println("         STATUS        ");
        System.out.println("");
        System.out.println("Nome: " + getdono());
        System.out.println("Número : #" + getnumconta());
        System.out.println("Tipo: " + gettipo());
        System.out.println("Saldo: " + getsaldo());
        this.setstatus(true);
        System.out.println("Status: " + getstatus());
    }

    public void deletar_conta(){

    }

    public void depositar(){

    }

    public void sacar(){

    }

    

    
}
