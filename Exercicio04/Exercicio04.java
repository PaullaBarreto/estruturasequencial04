import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com a primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.println("");
        System.out.print("Entre com a segunda nota: ");
        double n2 = sc.nextDouble();
        System.out.println("");
        System.out.print("Entre com a terceira nota: ");
        double n3 = sc.nextDouble();
        System.out.println("");
        System.out.print("Entre com a quarta nota: ");
        double n4 = sc.nextDouble();
        sc.close();

        double media = (n1 + n2 + n3 + n4)/4;

        System.out.println("A média das 4 notas é: " + media);
        
    }
}