//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner leia = new Scanner(System.in);
        
        int n[] = {3,5,8,2};
        //Um vetor com 4 posições (0,1,2,3)
        
        int num[] = {3,2,8,7,5,4};
        /*for(int i=0; i<=5;i++){
        *   System.out.print(num[i]);
        *} 
        *A ESTRUTURA 'FOR' ESTÁ SENDO USADA 
        * PARA EXIBIR OS VALORES CONTIDOS NO
        * VETOR.
        */ 
        
        
        /*for(int i = 0; i<=num.length-1;i++){
        *    System.out.print(num[i]);
        *    
        *    ESSA ESTRUTURA É A MESMA COISA :P
        * 
        *}
        */
        
        /*String livros[] = {"Bíblia","Pinóquio"};
        for(int i=0; i<=livros.length-1;i++){
            System.out.println(livros[i]);
        }*/
        
        String mes[] = {"Jan","Fev","Mar","Abr","Jun"};
        int dias[] = {31,28,30,31,30};
        for(int i=0; i<mes.length;i++){
            System.out.println("O mês "+mes[i])+" tem "+dias[i]+" dias");
        }
        
    }
}