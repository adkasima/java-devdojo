package academy.devdojo.maratonajava.javacore.HInheritance.test;

import academy.devdojo.maratonajava.javacore.HInheritance.domain.Employee;

public class InheritanceTest02 {
    //0 - Bloco de inicialização estático da superclasse  é executado quando a JVM carregar a classe pai
    //1 - Bloco de inicialização estático da subclasse é executado quando a JVM carregar a classe filha
    //2 - Alocado espaço em memória pro objeto da superclasse
    //3 - Cada atributo de superclasse é criado e inicializado com valores default ou seja qual for da classe pai
    //4 - Bloco de inicialização da super classe é executado na ordem que aparece
    //5 - Construtor da superclasse é executado
    //6 - Alocado espaço em memória pro objeto da subclasse
    //7 - Cada atributo de subclasse é criado e inicializado com valores default ou seja qual for passado
    //8 - Bloco de inicialização da subclasse é executado na ordem que aparece
    //9 - Construtor da subclasse é executado
    public static void main(String[] args) {
        Employee employee = new Employee("Jiraya");
    }
}
