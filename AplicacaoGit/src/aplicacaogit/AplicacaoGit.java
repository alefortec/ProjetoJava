package aplicacaogit;
import java.util.Scanner;
public class AplicacaoGit {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Meu primeiro software "
        + "versionado com git e hospedado no GitHub!");
        System.out.println("Digite o primeiro valor:");
        int num1 = scan.nextInt();
        System.out.println("Digite o segundo valor:");
        int num2 = scan.nextInt();
        System.out.println("O Resultado é: "+(num1+num2));
    }
    
}
