import java.util.Scanner;

public class TesteFuncao02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int i = leia.nextInt();
        int f = leia.nextInt();

        System.out.println(Operacoes.contador(i,f));

    }
}
