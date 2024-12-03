package Projeto;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu 
{
    public static void main(String args[]) 
    {
        Sistema sistema = new Sistema();
        Scanner teclado = new Scanner(System.in);

        int escolha = 0;

        do {
            try 
            {
                limpaTela();
                System.out.println();
                System.out.println("===========================\nSISTEMA DE GESTÃO DE CURSOS\n===========================\n");
                System.out.println("SEJA BEM VINDO!!!!\n\n");
                System.out.println("Selecione uma opção:\n");
                System.out.println("    1. Fazer cadastro para ser o nosso Aluno!");
                System.out.println("    2. Fazer login");
                System.out.println("    3. Sair");
                System.out.print("\nDigite sua escolha: ");
                escolha = Integer.parseInt(teclado.nextLine());
                switch(escolha) 
                {
                    case 1:
                        limpaTela();
                        sistema.criarContaAluno();
                        break;
                    case 2:
                        limpaTela();
                        fazerLoginMenu(teclado, sistema);
                        break;
                    case 3:
                        System.out.println("Saindo...");
                        return;
                    default:
                        System.out.print("\nOpção inválida, tente novamente.");
                        teclado.nextLine();
                        break;
                }
            } catch(NumberFormatException numberFormatException) {
                System.out.print("\nEntrada inválida, tente novamente.");
                teclado.nextLine();
            }
        } while(escolha != 3);
        
        teclado.close();
    }

    //metodo estático para coletar os dados do login
    public static void fazerLoginMenu(Scanner teclado, Sistema sistema)
    {

        // Dados do usuário
        String email;
        String senha;
        int opcao = 0;

        // Menu de login
        do
        {
            try
            {
                do 
                {
                    System.out.println();
                    System.out.println("===========================\nSISTEMA DE GESTÃO DE CURSOS\n===========================\n");
                    System.out.println("Opções para Login:\n");
                    System.out.println("    1 - Aluno");
                    System.out.println("    2 - Administrador");
                    System.out.println("    3 - Professor");
                    System.out.println("    4 - Voltar");
                    System.out.print("\nEscolha uma opção: ");
                    opcao = teclado.nextInt();
                    teclado.nextLine();
                    switch (opcao) 
                    {
                        case 1:
                            Menu.limpaTela();
                            System.out.println("================\nLOGIN NO SISTEMA\n================\n");
                            System.out.print("Insira seu email: ");
                            email = teclado.nextLine();
                            System.out.print("\nInsira sua Senha: ");
                            senha = teclado.nextLine();
                            sistema.fazerLoginUsuarioAluno(email, senha);
                            break;
                        case 2:
                            Menu.limpaTela();
                            System.out.println("================\nLOGIN NO SISTEMA\n================\n");
                            System.out.print("Insira seu email: ");
                            email = teclado.nextLine();
                            System.out.print("\nInsira sua Senha: ");
                            senha = teclado.nextLine();
                            sistema.fazerLoginUsuarioAdministrador(email, senha);
                            break;
                        case 3:
                            Menu.limpaTela();
                            System.out.println("================\nLOGIN NO SISTEMA\n================\n");
                            System.out.print("Insira seu email: ");
                            email = teclado.nextLine();
                            System.out.print("\nInsira sua Senha: ");
                            senha = teclado.nextLine();
                            sistema.fazerLoginUsuarioProfessor(email, senha);
                            break;
                        case 4:
                            Menu.limpaTela();
                            return;
                        default:
                            System.out.print("\nOpção inválida, tente novamente.");
                            teclado.nextLine();
                            break;
                    }
                } while(opcao != 4); 
            } catch(InputMismatchException inputMismatchException)
            {
                System.out.print("\nEntrada inválida, tente novamente.");
                teclado.nextLine();
                teclado.nextLine();
            }
        } while(opcao != 1 || opcao != 2 || opcao != 3);
    }

    //método para limpar a tela
    public static void limpaTela()
    {
        try
        {
            if (System.getProperty("os.name").contains("Windows"))
            {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }    
        } catch (IOException | InterruptedException ex) {}
    }
}