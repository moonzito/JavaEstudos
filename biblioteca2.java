import java.util.Scanner;

public class biblioteca2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Você é 'usuário' ou 'administrador'?");
        String dec = leia.nextLine();

        if(dec.equalsIgnoreCase("usuario")){
            usuario u = new usuario();
            u.acessarBiblioteca();
        } else if (dec.equalsIgnoreCase("administrador")) {
            administrador a = new administrador();
            a.gerenciarbiblioteca();
        } else {
            System.out.println("Busca não encontrada.");
        }

        leia.close();
    }
}
