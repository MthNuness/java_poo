public class Luta00{

    public static void main (String[] args){
        Luta02 l[] = new Luta02[6];
        
        //Atribuindo objetos
        l[0] = new Luta02("Pretty boy", "França", 31, 1.75, 68.9, 11, 2, 1 );
        l[1] = new Luta02("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
        l[2] = new Luta02("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
        l[3] = new Luta02("Dead Code", "Austrália", 28, 1.93, 81.6, 13, 0, 2 );
        l[4] = new Luta02("UFOCobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3);
        l[5] = new Luta02("Nerdaart", "EUA", 30, 1.81, 105.7, 12, 2, 4);


        l[0].apresentar();
        l[0].status();

        l[1].apresentar();
        l[1].status();

        l[2].apresentar();
        l[2].status();

        l[3].apresentar();
        l[3].status();

        l[4].apresentar();
        l[4].status();

        l[5].apresentar();
        l[5].status();
        
        l[6].apresentar();
        l[6].status();
    }
}