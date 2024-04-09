// Felipe Fumagalli, Jose Gabriel Kojo, Nicole Fatuch

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int contador = 5;
        System.out.println("----- Bem vindo! -----");
        Usuario user;
        while (contador != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("O que você deseja fazer? (1: Criar usuário. 2: Tweetar. 3: Criar comunidade. 0: Sair.)");
            int numInteiro = scanner.nextInt();
            if(numInteiro == 1) {
                user = new Usuario();
                user.criarUsuario();
            }
            else if (numInteiro == 2) {
                Tweet tweet = new Tweet();
                tweet.criarTweet();
            }
            else if (numInteiro == 3) {
                Comunidade comunidade = new Comunidade();
                comunidade.criarComunidade();
            }
            else if (numInteiro == 0) {
                System.out.println("Até mais!");
                break;
            }
            else {
                System.out.println("Por favor, digite uma opção válida");
            }
        }
    }
}