import java.util.Scanner;

public class Banco01 {
    
    //Atributos
    public int numconta = 10000 + (int)(Math.random() * 40001);
    protected String tipo;
    private String dono;
    private int saldo;
    private boolean status;
    private int escolha;

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

    public int getescolha(){
        return escolha;
    }

    //Setters

    public void setnumconta(int numconta){
        this.numconta = numconta;
    }

    public void setsaldo(int saldo){
        if (saldo >= 0){
            this.saldo = saldo;
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

    public void setescolha(int escolha){
        this.escolha = escolha;
    }

    //Métodos()
    public Banco01(){
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
        System.out.println("[ 5 ] Sair");
        System.out.println("");
        System.out.print("Digite qual deseja: ");
        this.escolha = sc.nextInt();
        switch(escolha){
            case 1: 
                if (this.getstatus() == false){
                    criar_conta(sc);
                } else{
                    System.out.println("");
                    System.out.println("Você já possue uma conta");
                }
                break;
            case 2:
                if (this.getstatus() == true){
                    deletar_conta(sc);
                }else{
                    System.out.println("");
                    System.out.println("Você não possue uma conta");
                }
                break;
            case 3:
                if (this.getstatus() == true){
                    depositar(sc);
                }else{
                    System.out.println("");
                    System.out.println("Você não possue uma conta");
                }

                break;
            case 4:
                if (this.getstatus() == true){
                    sacar(sc);
                }else{
                    System.out.println("");
                    System.out.println("Você não possue uma conta");
                }

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
        sc.nextLine();
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
        this.setstatus(true);
        status();
    }

    public void deletar_conta(Scanner sc){
        System.out.println("");
        System.out.println("");
        System.out.println("=======================");
        System.out.println("     DELETAR CONTA     ");
        System.out.println("");
        System.out.println("[ 1 ] Caso deseje deletar");
        System.out.println("[ 2 ] Caso deseje manter a conta");
        System.out.println("");
        System.out.print("Qual deseja: ");
        int deletar = sc.nextInt();
        System.out.println("");
        System.out.println("=======================");
        System.out.println("     DELETAR CONTA     ");
        switch (deletar){
            case 1:
                if (this.getsaldo() > 0){
                    System.out.println("");
                    System.out.println("INVÁLIDO!");
                    System.out.println("Saque todo o seu saldo antes de deletar sua conta");
                }else if (this.getsaldo() < 0){
                    System.out.println("");
                    System.out.println("INVÁLIDO!");
                    System.out.println("Pague sua divida antes de deletar sua conta");
                }else{
                    System.out.println("Conta deletada");
                    this.setstatus(false);
                }
                break;
            case 2:
                System.out.println("Voltando ao menu...");
                break;
        }
    }

    public void depositar(Scanner sc){
        System.out.println("");
        System.out.println("");
        System.out.println("=======================");
        System.out.println("       DEPOSITAR       ");
        System.out.println("");
        System.out.print("Quanto deseja depositar: ");
        int deposito = sc.nextInt();
        setsaldo(getsaldo() + deposito);
        status();
    }

    public void sacar(Scanner sc){
        System.out.println("");
        System.out.println("");
        System.out.println("=======================");
        System.out.println("         SACAR         ");
        System.out.println("");
        status();
        System.out.print("Quanto deseja sacar: ");
        int saque = sc.nextInt();
        if (saque > getsaldo()){
            System.out.println("");
            System.out.println("O saque supera o valor na conta");
        }else if (saque < 0){
            System.out.println("");
            System.out.println("Saques de valores negativos não são possíveis");
        }else{
            System.out.println("");
            System.out.println("Saque realizado com sucesso");
            setsaldo(getsaldo() - saque);
            status();
        }
    }

    public void status(){
        System.out.println("");
        System.out.println("=======================");
        System.out.println("         STATUS        ");
        System.out.println("");
        System.out.println("Nome: " + getdono());
        System.out.println("Número : #" + getnumconta());
        System.out.println("Tipo: " + gettipo());
        System.out.println("Saldo: " + getsaldo());
        System.out.println("Status: " + getstatus());
    }
}
