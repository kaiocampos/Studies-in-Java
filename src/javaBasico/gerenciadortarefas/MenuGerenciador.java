package javaBasico.gerenciadortarefas;

import java.util.Scanner;

public class MenuGerenciador {
    private GerenciadorDeTarefas gerenciador;
    private Scanner scanner;

    public MenuGerenciador() {
        gerenciador = new GerenciadorDeTarefas();
        scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int escolha;
        do {
            System.out.println("===== Gerenciador de Tarefas =====");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Completar Tarefa");
            System.out.println("4. Salvar Tarefas");
            System.out.println("5. Carregar Tarefas");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (escolha) {
                case 1:
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    gerenciador.adicionarTarefa(descricao);
                    break;
                case 2:
                    gerenciador.listarTarefas();
                    break;
                case 3:
                    System.out.print("Digite o número da tarefa a completar: ");
                    int indice = scanner.nextInt();
                    gerenciador.completarTarefa(indice);
                    break;
                case 4:
                    gerenciador.salvarTarefas("tarefas.txt");
                    break;
                case 5:
                    gerenciador.carregarTarefas("tarefas.txt");
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (escolha != 6);

        scanner.close();
    }


}

