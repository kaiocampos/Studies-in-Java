package javaBasico.gerenciadortarefas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorDeTarefas {
    private ArrayList<Tarefa> tarefas;

    public GerenciadorDeTarefas() {
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void listarTarefas() {
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i + 1) + ", " + tarefas.get(i));
        }
    }

    public void completarTarefa(int indice) {
        if (indice >= 1 && indice <= tarefas.size()) {
            tarefas.get(indice - 1).marcarCompleta();
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public void salvarTarefas(String nomeArquivo){
        try (FileWriter writer = new FileWriter(nomeArquivo)){
            for (Tarefa tarefa : tarefas){
                writer.write(tarefa.getDescricao() + "," + tarefa.isCompleta() + "\n");
            }
            System.out.println("Tarefas salvas com sucesso!");
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void carregarTarefas(String nomeArquivo){
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(",");
                if (partes.length == 2) {
                    String descricao = partes[0];
                    boolean completa = Boolean.parseBoolean(partes[1]);
                    Tarefa tarefa = new Tarefa(descricao);
                    if (completa) {
                        tarefa.marcarCompleta();
                    }
                    tarefas.add(tarefa);
                }
            }
            System.out.println("Tarefas carregadas com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao carregar tarefas: " + e.getMessage());
        }
    }
}
