public class Caneta01{

    public static void main(String [] args){
        Caneta02 c1 = new Caneta02();
        Caneta02 c2 = new Caneta02();


        //Caneta 1
        c1.modelo = "Cis";
        c1.cor = "Preta";
        c1.ponta = 0.5f;
        c1.carga = 90;
        c1.tampado = false;

        c1.status();
        c1.rabiscar();


        //Caneta 2
        c2.modelo = "Cis";
        c2.cor = "Azul";
        c2.ponta = 0.7f;
        c2.carga = 65;
        c2.tampado = true;

        c2.status();
        c2.rabiscar();

    }

}
