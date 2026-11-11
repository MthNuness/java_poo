public class Caneta01{

    public static void main(String [] args){
        Caneta02 c1 = new Caneta02();
        c1.modelo = "Cis";
        c1.cor = "Preta";
        c1.ponta = 0.5f;
        c1.carga = 90;
        c1.tampado = false;

        c1.status();
        c1.rabiscar();


    }

}
