import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
    String usuario;
    int i;
    Scanner nome = new Scanner(System.in);

    System.out.println("Digite seu nome");
    usuario = nome.nextLine();

    for(i=0; i<=10; i++){
    System.out.println(usuario);
    nome.close();
    }
}
}