public class Caneta02{
    String modelo;
    String cor;
    Float ponta;
    int carga;
    Boolean tampado;

    void status(){
        System.out.println(this.modelo);
        System.out.println(this.cor);
        System.out.println(this.ponta);
        System.out.println(this.carga);
        System.out.println(this.tampado);
    }

    void rabiscar (){
        if (tampado == true){
            System.out.println("Tire a tampa");
        }else{
            System.out.println("Pronta para escrever");
        }
    }

    void tampar (){
        if (tampado == false){
            tampado = true;
        }
    }

    void destampar (){
        if (tampado == true){
            tampado = false;
        }
    }
}   