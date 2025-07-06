import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        float n1 = leia.nextFloat();
        float n2 = leia.nextFloat();
        float n3 = leia.nextFloat();
        
        System.out.print("A nota final é igual a "+notas);
        
    }
    
    public static float notas(float n1, float n2, float n3){
        float mediaF = (n1+n2+n3);
        return mediaF;
    }
}