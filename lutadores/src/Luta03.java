import java.util.Random;

public class Luta03 {
    
    //Atributos
    private Luta02 desafiado;
    private Luta02 desafiante;
    private int rounds;
    private boolean aprovado;

    //Getters
    public Luta02 getDesafiado(){
        return desafiado;
    }

    public Luta02 getDesafiante(){
        return desafiante;
    }

    public int getRounds(){
        return rounds;
    }

    public boolean getAprovado(){
        return aprovado;
    }

    //Setters

    public void setDesafiado(Luta02 desafiado){
        this.desafiado = desafiado;
    }

    public void setDesafiante(Luta02 desafiante){
        this.desafiante = desafiante;
    }

    public void setRounds(int rounds){
        this.rounds = rounds;
    }

    public void setAprovado(boolean aprovado){
        this.aprovado = aprovado;
    }

    //Método
    public void marcarLuta(Luta02 l1 , Luta02 l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            setAprovado(true);
            setDesafiado(l1);
            setDesafiante(l2);
        }else{
            setAprovado(false);
            setDesafiado(null);
            setDesafiante(null);
        }
    }
    
    public void lutar(){
        if(getAprovado() == true){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            //Vendo quem ganha
            Random r = new Random();
            int aleatorio = r.nextInt(3);
            switch (aleatorio){
                case 0:
                    System.out.println("====================================================");
                    System.out.println("De acordo com os jurados essa luta foi de alto nivél");
                    System.out.println("               e extremamente intensa               ");
                    System.out.println("                       EMPATE                       ");
                    System.out.println("====================================================");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();

                    break;
                case 1:
                    System.out.println("====================================================");
                    System.out.println("De acordo com os jurados essa luta foi de alto nivél");
                    System.out.println("               e extremamente intensa               ");
                    System.out.println("                VITORIA DO DESAFIADO                ");
                    System.out.println("====================================================");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();

                    break;
                case 2:
                    System.out.println("====================================================");
                    System.out.println("De acordo com os jurados essa luta foi de alto nivél");
                    System.out.println("               e extremamente intensa               ");
                    System.out.println("               VITORIA DO DESAFIANTE                ");
                    System.out.println("====================================================");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();

                    break;
            }

        }else{
            System.out.println("A luta não pode acontecer");
        }
    }
}
