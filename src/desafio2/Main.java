
package desafio2;

import javax.swing.*;
        import java.util.HashSet;
class HelloWorld {
    public static void main(String[] args) {
        HashSet<String> tarefas = new HashSet<>();
        JOptionPane.showMessageDialog(null, "Bem-vindo à Lista de Tarefas!");
        Tarefa tarefa = new Tarefa();
        boolean sair = false;

        while (!sair) {
            int escolhaDasOpcoesDoMenu = Integer.parseInt(JOptionPane.showInputDialog(null, """
                    Menu:\s
                    1. Adicionar tarefa
                    2. Visualizar tarefas
                    3.Remover tarefa
                    4.Sair"""));

            if (escolhaDasOpcoesDoMenu == Options.ADICIONAR) {
                tarefa.adicionar(tarefas);
            }
            else if (escolhaDasOpcoesDoMenu == Options.VISUALIZAR) {
                tarefa.visualizar(tarefas);
            }
            else if (escolhaDasOpcoesDoMenu == Options.REMOVER) {
                tarefa.remover(tarefas);
            }
            else {
                JOptionPane.showMessageDialog(null, "Até mais...");
                sair = true;
            }
        }
    }
}