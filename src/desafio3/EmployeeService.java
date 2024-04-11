package desafio3;
public class EmployeeService {

    public static double netSalary(Employee employee, double tax) {
        return employee.getGrossSalary() - (employee.getGrossSalary() * (tax/100));
    }

    public static void increaseSalary(Employee employee) {
        double salarioAumentado = employee.getGrossSalary() + (employee.getGrossSalary() * 10/100);
        employee.setGrossSalary(salarioAumentado);
    }
}