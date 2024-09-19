package academy.devdojo.maratonajava.javacore.Kenumeration.domain;

public class Customer {


    private String name;
    private CustomerType customerType;
    private PaymentType paymentType;

    public Customer(String name, CustomerType customerType, PaymentType paymentType) {
        this.name = name;
        this.customerType = customerType;
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", customerType=" + customerType.getReportName() +
                ", customerTypeInt=" + customerType.getValue() +
                ", paymentType=" + paymentType +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

}
