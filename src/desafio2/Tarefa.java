package desafio2;

import javax.swing.*;
import java.util.HashSet;

public class Tarefa {
    private int id;
    private String descricao;
    public Tarefa() {

    }
    public Tarefa(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
    public int getId() {
        return id;
    }

    public void adicionar(HashSet<String> tarefas) {
        String tarefaAdicionada = JOptionPane.showInputDialog(null, "Qual o nome da tarefa que deseja adicionar?");
        tarefas.add(tarefaAdicionada);
        JOptionPane.showMessageDialog(null, "Sua tarefa foi adicionada com sucesso!" + "\n" + "Retornando ao menu...");
    }
    public void visualizar(HashSet<String> tarefas) {
        JOptionPane.showMessageDialog(null, "Tarefas cadastradas: " + "\n" + tarefas.toString());
    }
    public void remover(HashSet<String> tarefas) {
        String tarefaParaRemover = JOptionPane.showInputDialog(null, "Qual tarefa deseja remover?" + "\n" + tarefas);
        tarefas.remove(tarefaParaRemover);
        JOptionPane.showMessageDialog(null, "Tarefa removida com sucesso!" + "\n" + "Retornando ao menu...");
    }
}
