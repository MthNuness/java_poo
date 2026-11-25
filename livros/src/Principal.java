public class Principal {
    public static void main(String[] args){
        Pessoas p[] = new Pessoas[2];
        Livros l[] = new Livros[2];

        p[0] = new Pessoas("Matheus", 21, "Masculino");
        p[1] = new Pessoas("Nunes", 18, "Masculino");

        l[0] = new Livros("Dom Casmurro", "Machado de Asis", 400, p[0]);
        l[1] = new Livros("Diário de um Banana", "Jeff Kinney", 250, p[1]);
        
        //Testando o primeiro leitor
        l[0].detalhes();
        for(int i = 0; i <= 4; i++){
            l[0].avancarPag();
        }
        l[0].detalhes();

        //Testando o segundo leitor
        l[1].detalhes();
        l[1].folhear(250);
        l[1].detalhes();
        l[1].folhear(270);
        l[1].detalhes();

    }
}
