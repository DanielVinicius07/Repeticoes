//Escreva um algoritmo que calcule a soma dos números de 1 a 15
public class Calcular {
    public static void main(String[] args) {
    int soma = 0;
    int i;
    for(i = 1; i<=15; i++) {
    soma += i;
    System.out.println(soma);
    }
    System.out.println("A soma dos números entre 1 e 15 é igual à: " + soma);
    }
    
}
