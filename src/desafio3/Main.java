package desafio3;

import javax.swing.*;
class HelloWorld {
    public static void main(String[] args) {
        Employee employee = new Employee();
        String name;
        double grossSalary, tax;

        name = JOptionPane.showInputDialog(null, "Digite seu nome:");
        employee.setName(name);
        grossSalary = Double.valueOf(JOptionPane.showInputDialog(null,"Digite o salário bruto:"));
        employee.setGrossSalary(grossSalary);
        tax = Double.valueOf(JOptionPane.showInputDialog(null,"Insira a taxa de imposto:"));
        employee.setTax(tax);

        JOptionPane.showMessageDialog(null, employee + "\n" + "Seu salário líquido é: " + EmployeeService.netSalary(employee, tax));

        Employee employee1 = new Employee(name,grossSalary, tax);

        name = JOptionPane.showInputDialog(null, "Digite seu nome:");
        employee1.setName(name);
        grossSalary = Double.valueOf(JOptionPane.showInputDialog(null,"Digite o salário bruto:"));
        employee1.setGrossSalary(grossSalary);
        tax = Double.valueOf(JOptionPane.showInputDialog(null,"Insira a taxa de imposto:"));
        employee1.setTax(tax);

        JOptionPane.showMessageDialog(null, employee1 + "\n" + "Seu salário líquido é: " + EmployeeService.netSalary(employee1, tax));


        JOptionPane.showMessageDialog(null,employee + "\nSalário líquido do funcionário: " + EmployeeService.netSalary(employee, tax) + "\n" + employee1 + "\nSalário líquido do funcionário: " + EmployeeService.netSalary(employee1, tax));

        JOptionPane.showMessageDialog(null, "Funcinário 1 recebe um aumento de 10% em seu salário...");
        EmployeeService.increaseSalary(employee);

        JOptionPane.showMessageDialog(null,employee + "\nSalário líquido do funcionário: " + EmployeeService.netSalary(employee, tax) + "\n" + employee1 + "\nSalário líquido do funcionário: " + EmployeeService.netSalary(employee1, tax));
    }
}