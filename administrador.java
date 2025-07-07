import java.util.Scanner;

public class administrador {
    public void gerenciarbiblioteca(){
        Scanner leia = new Scanner(System.in);

        System.out.println("Bem-vindo, gerente! Aqui você pode gerenciar a biblioteca.");
        System.out.println("O que você quer fazer? 1- listar livros, 2- Remover livro ou autor, 3- sair.");
        String esc = leia.nextLine();
        if(esc.equalsIgnoreCase("listar livros") || esc.equalsIgnoreCase("listar")){
            String livros[] = {"O Pequeno Príncipe","Dom Quixote","1984","Orgulho e Preconceito",
                    "O Senhor dos Anéis","Cem Anos de Solidão","Harry Potter e a Pedra Filosofal",
                    "O Apanhador no Campo de Centeio",
                    "O Alquimista","Moby Dick"};

            for(int i = 0; i<livros.length; i++){
                System.out.println(" " + livros[i]);
            }

        } else if (esc.equalsIgnoreCase("remover")) {
            System.out.println("Você deseja remover livro ou autor?");
            String escR = leia.nextLine();

            switch (escR){
                case "livro":
                    String livros[] = {"O Pequeno Príncipe","Dom Quixote","1984","Orgulho e Preconceito",
                            "O Senhor dos Anéis","Cem Anos de Solidão","Harry Potter e a Pedra Filosofal",
                            "O Apanhador no Campo de Centeio", "O Alquimista","Moby Dick"};

                    System.out.println("Qual livro você deseja remover? ");
                    String livroR = leia.nextLine();

                    boolean livroEncontrado = false;
                    for(int i=0;i< livros.length;i++){
                        if(livros[i].equalsIgnoreCase(livroR)){
                            livroEncontrado = true;
                            break;
                        }
                    }

                    if(livroEncontrado){
                        System.out.printf("O livro '%s' foi removido.",livroR);
                    } else {
                        System.out.printf("Como o livro '%s' não possui cadastro não foi removido.",livroR);
                    }
                break;

                case "autor":
                    String autores[] = {"Antoine de Saint-Exupéry","Miguel de Cervantes","George Orwell","Jane Austen",
                            "J.R.R. Tolkien","Gabriel García Márquez","J.K. Rowling","J.D. Salinger","Paulo Coelho",
                            "Herman Melville"};
                    System.out.print("OK! Qual autor você deseja remover? ");
                    String autorR = leia.nextLine();

                    boolean autorEncontrado = false;
                    for(int i=0;i<autores.length;i++){
                        if(autores[i].equalsIgnoreCase(autorR)){
                            autorEncontrado = true;
                            break;
                        }
                    }

                    if(autorEncontrado){
                        System.out.printf("O autor(a) %s foi removido(a).",autorR);
                    }
                    break;
                default:
                    System.out.println("Opção não encontrada.");
                    break;
            }

        } else if (esc.equalsIgnoreCase("sair")) {
            System.out.println("Saída com sucesso!");
        }
    }
}
