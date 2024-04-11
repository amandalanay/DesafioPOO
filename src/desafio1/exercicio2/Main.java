package desafio1.exercicio2;

import javax.swing.*;
class Main {
    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog(null, "Digite um numero para saber o dia da semana que corresponde");
        int numeroInicial = Integer.parseInt(numero);

        switch (numeroInicial) {
                case (DiasDaSemana.DOMINGO):
                    JOptionPane.showMessageDialog (null,"Domingo");
                    break;
                case (DiasDaSemana.SEGUNDA):
                    JOptionPane.showMessageDialog (null,"Segunda");
                    break;

                case (DiasDaSemana.TERCA):
                    JOptionPane.showMessageDialog(null, "Terca");
                    break;

                case (DiasDaSemana.QUARTA):
                    JOptionPane.showMessageDialog (null,"Quarta");
                    break;

                case (DiasDaSemana.QUINTA):
                    JOptionPane.showMessageDialog(null,"Quinta");
                    break;

                case (DiasDaSemana.SEXTA):
                    JOptionPane.showMessageDialog (null,"Sexta");
                    break;

                 case (DiasDaSemana.SABADO):
                     JOptionPane.showMessageDialog (null, "Sabado");
                    break;

            }
        }
    }
