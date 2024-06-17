/*
package javaBasico.gerenciadortarefas;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    GerenciadorDeTarefas gerenciadorDeTarefas = new GerenciadorDeTarefas();

    while(true){
        System.out.println("1. Adicionar Tarefa");
        System.out.println("2. Listar Tarefa");
        System.out.println("3. Completar Tarefa");
        System.out.println("4. Sair");
        System.out.println("Escolha uma opção: ");
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha gerada pelo nextInt

        switch (escolha){
            case 1:
                System.out.println("Digite a descrição da tarefa: ");
                String descricao = scanner.nextLine();
                gerenciadorDeTarefas.adicionarTarefa(descricao);
                break;
            case 2:
                gerenciadorDeTarefas.listarTarefas();
                break;
            case 3:
                System.out.println("Digite o da tarefa a ser completada: ");
                int indice = scanner.nextInt();
                gerenciadorDeTarefas.completarTarefa(indice);
                break;
            case 4:
                System.out.println("Saindo........");
                scanner.close();
                break;
            default:
                throw new IllegalStateException("Opção inválida: " + escolha);
        }
    }
}
*/
