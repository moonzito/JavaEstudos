import java.util.Scanner;

public class TesteFuncao01 {

    static void soma(int a, int b){
        int s = a+b;
        System.out.printf("A soma é %d",s);
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int a = leia.nextInt();
        int b = leia.nextInt();
        soma(a,b);
    }
}
