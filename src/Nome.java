//Imprima o nome do usuario de acordo com o numero de vezes solicitadas

import java.util.Scanner;

public class Nome {
    public static void main(String[] args) {
        String nome;
        int num;
        int i;

        Scanner n = new Scanner(System.in);
        
        System.out.println("Digite o seu nome");
        nome = n.nextLine();
        System.out.println("Digite a quantidade de vezes no qual você quer que o número se repita");
        num = n.nextInt();

        for (i=0; i<num; i++){
        System.out.println(nome);

        n.close();
    }
    }
}
