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
        if (tipo.equals("CC")){
            this.setsaldo(this.getsaldo() + 50);
        }else{
            this.setsaldo(this.getsaldo() + 150);
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

    public void menu(){
        System.out.println("=======================");
        System.out.println("        M E N U        ");
        System.out.println("=======================");
        System.out.println("");
        System.out.println("[ 1 ] Criar conta");
        System.out.println("[ 2 ] Deletar conta");
        System.out.println("[ 3 ] Depositar");
        System.out.println("[ 4 ] Sacar");
        System.out.println("");
        System.out.println("Digite qual deseja: ");
    }

    public void criar_conta(){
        this.setstatus(true);

    }

    

    
}
