package javaBasico.gerenciadortarefas;

public class Tarefa {
    private String descricao;
    private boolean completa;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.completa = false;
    }

    public String getDescricao(){
        return descricao;
    }

    public boolean isCompleta(){
        return completa;
    }

    public void marcarCompleta(){
        this.completa = true;
    }

    @Override
    public String toString() {
        return (completa ? "[X]" : "[]") + descricao;
    }
}
