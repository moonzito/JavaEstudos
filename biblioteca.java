import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //Criar uma aplicação simulando o aplicativo de uma biblioteca usando tudo
        // o que aprendi usando tudo o que aprendi no Curso em Vídeo.

        System.out.print("Olá! Por favor escolha o usuário:\n");
        System.out.println("1- Usuário, 2- Admin");
        String dec = leia.nextLine();

        if (dec.equals("1") || dec.equals("Usuario")){
            System.out.print("Bem-vindo! Agora o que você deseja fazer?\n");
            System.out.println("1- Procurar livro, 2- Procurar autor");
            String decUsu = leia.nextLine();

            if(decUsu.equals("1")) {
                String livros[] = {"Do dia para a noite","Dias quentes","Café com Deus Pai","Isso e aquilo","Dias frios",
                        "Elo Monsters Books: Flow Pack","Don't Let Him in","A mother's Love","Nightshade",
                        "The Breakfast Club Adventures", "Atmosphere"};

                System.out.print("Certo! Qual livro você deseja procurar? ");
                String livro = leia.nextLine();

                boolean encontrado = false;
                //Essa estrutura procura o livro digitado na lista livros.
                for (int i = 0; i < livros.length; i++) {
                    if (livros[i].equalsIgnoreCase(livro)) {
                        encontrado = true;
                        break;
                    }
                }

                if (encontrado) {
                    System.out.printf("O livro '%s' está na biblioteca.",livro);
                } else{
                    System.out.printf("O livro '%s' não está na biblioteca.",livro);
                }

            } if(decUsu.equals("2")){
                boolean autorB = false;
                String autores[] = {"Bobbie Goods","Boobie Goods","Junior Rostirola","Bobbie Goods","Bobbie Goods",
                "Enaldinho","Lisa Jewell","Daniele Steel","Michael Connely","Marcus Rashford","Taylor Jenkins Reid"};

                System.out.print("Ok! Qual autor você deseja procurar? ");
                String autor = leia.nextLine();

                //Essa estrutura procura o autor digitado na lista autores.
                for (int i = 0; i<autores.length;i++){
                    if(autores[i].equalsIgnoreCase(autor)){
                        autorB = true;
                        break;
                    }
                }

                if(autorB){
                    System.out.printf("O autor '%s' tem livros na biblioteca.",autor);
                } else{
                    System.out.println("o autor '%s' não possui livros algum cadastrado na biblioteca;");
                }
            }

        } if(dec.equals("2")){
            System.out.print("Digite o login: ");
            String login = leia.nextLine();

            System.out.print("Digite a senha: ");
            String senha = leia.nextLine();

            if(login.equals("admin") && senha.equals("admin")){
                System.out.print("Bem-vindo, administrador.");
            } else{
                System.out.println("Usuário ou Senha incorreta.");
                int cont = 4;

                while (cont>0){
                    System.out.println("Digite o admin mais uma vez: ");
                    String login2= leia.nextLine();

                    System.out.println("Digite a senha mais uma vez: ");
                    String senha2 = leia.nextLine();
                    cont--;

                    if(cont==0){
                        System.out.print("Número de tentativas excessivas.");
                        break;
                    } if (login2.equals("admin") && senha2.equals("admin")){
                        System.out.println("Bem-vindo! Administrador.");
                        break;
                    }

                }

            }

        }
    }
}
