package desafio1.exercicio3;

import javax.swing.*;
class HelloWorld {
    public static void main(String[] args) {
        int numeroInicial;
        String numero = JOptionPane.showInputDialog(null, "Digite um número");
        numeroInicial = Integer.parseInt(numero);

        // Variável para o WHILE e DO-WHILE
        int contador = 0;
        int contadorDois = 0;

        String texto = "";
        for (int i = 0; i <= numeroInicial; i++) {
            texto += "for: " + i + "\n";
        }

        while(contador <= numeroInicial) {
            texto += "while: " + contador + "\n";
            contador++;
        }

        do {
            texto += "do-while: " + contadorDois + "\n";
            contadorDois++;
        } while (contadorDois <= numeroInicial);
        JOptionPane.showMessageDialog(null, texto);
    }
}