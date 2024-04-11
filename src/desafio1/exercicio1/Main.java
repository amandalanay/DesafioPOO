package desafio1.exercicio1;

import javax.swing.*;

class Main {
    public static void main(String[] args) {

        String numero = JOptionPane.showInputDialog(null, "Digite um numero");
        int numeroInicial = Integer.parseInt (numero);

        if (numeroInicial > 0) {
            System.out.print("O número é positivo");
        }

        else if  (numeroInicial < 0) {
            System.out.print("O número negativo");

        } else {
            System.out.println("O numero é neutro");
        }


    }
}