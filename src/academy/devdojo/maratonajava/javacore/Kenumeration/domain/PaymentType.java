package academy.devdojo.maratonajava.javacore.Kenumeration.domain;

public enum PaymentType {
    DEBITO {
        @Override
        public double calcDiscount(double value) {
            return value * 0.1;
        }
    }, CREDITO {
        @Override
        public double calcDiscount(double value) {
            return value * 0.05;
        }
    };

    public abstract double calcDiscount(double value);


    }