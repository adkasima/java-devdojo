package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setName("Jonas");
        employee.setAge(22);
        employee.setWages(new double[]{2.500, 2.600, 2.500});

        employee.print(employee);

    }
}
