import java.util.Scanner;

public class usuario {
    public void acessarBiblioteca(){
        Scanner leia = new Scanner(System.in);

        System.out.println("Bem-vindo,Usuário! Aqui você pode procurar por livros ou autores.");
        System.out.println("O que você deseja fazer? 1- Procurar livros ou 2- Procurar autores");
        String esc = leia.nextLine();

        if(esc.equalsIgnoreCase("procurar livros") || esc.equalsIgnoreCase("livros")){
            String livros[] = {"O Pequeno Príncipe","Dom Quixote","1984","Orgulho e Preconceito",
            "O Senhor dos Anéis","Cem Anos de Solidão","Harry Potter e a Pedra Filosofal","O Apanhador no Campo de Centeio",
            "O Alquimista","Moby Dick"};

            System.out.println("OK! Qual livro você deseja procurar? ");
            String livro = leia.nextLine();

            boolean encontrado = false;
            for(int i = 0; i< livros.length;i++){
                if (livros[i].equalsIgnoreCase(livro)) {
                    encontrado = true;
                    break;
                }
            }

            if(encontrado){
                System.out.printf("O livro '%s' está na biblioteca",livro);
            } else{
                System.out.printf("O livro '%s' não está na biblioteca",livro);
            }
        } else if (esc.equalsIgnoreCase("procurar autor") || esc.equalsIgnoreCase("autores")) {
            String autores[] = {"Antoine de Saint-Exupéry","Miguel de Cervantes","George Orwell","Jane Austen",
            "J.R.R. Tolkien","Gabriel García Márquez","J.K. Rowling","J.D. Salinger","Paulo Coelho","Herman Melville"};

            System.out.println("Certo! Qual autor você deseja procurar? ");
            String autor = leia.nextLine();

            boolean encontrado = false;
            for(int i=0; i< autores.length;i++){
                if(autores[i].equalsIgnoreCase(autor)){
                    encontrado = true;
                    break;
                }
            }

            if(encontrado){
                System.out.printf("O autor '%s' possui livros na biblioteca.",autor);
            } else {
                System.out.printf("O autor '%s' não possui livros na biblioteca.",autor);
            }

        }

    }
}
