package academy.devdojo.maratonajava.javacore.Kenumeration.test;

import academy.devdojo.maratonajava.javacore.Kenumeration.domain.Customer;
import academy.devdojo.maratonajava.javacore.Kenumeration.domain.CustomerType;
import academy.devdojo.maratonajava.javacore.Kenumeration.domain.PaymentType;

public class CustomerTest01 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Mikasa", CustomerType.PESSOA_FISICA, PaymentType.CREDITO);
        Customer customer2 = new Customer("Levi", CustomerType.PESSOA_JURIDICA, PaymentType.CREDITO);
        Customer customer3 = new Customer("Eren", CustomerType.PESSOA_JURIDICA, PaymentType.DEBITO);

        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(customer3);
        System.out.println(PaymentType.CREDITO.calcDiscount(100));
        System.out.println(PaymentType.DEBITO.calcDiscount(50));
        CustomerType customerType = CustomerType.valueOf("PESSOA_FISICA");
        System.out.println(customerType.getReportName());
        CustomerType customerType1 = CustomerType.customerTypeByReportName("Pessoa física");
        System.out.println(customerType1);

    }
}
