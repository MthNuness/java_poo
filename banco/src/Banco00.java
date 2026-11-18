import java.util.Scanner;

public interface Banco00 {

    //Métodos abstratos

    void menu(Scanner sc);
    void criar_conta(Scanner sc);
    void deletar_conta(Scanner sc);
    void depositar(Scanner sc);
    void sacar(Scanner sc);
    void status();
}