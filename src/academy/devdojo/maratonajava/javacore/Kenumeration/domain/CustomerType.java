package academy.devdojo.maratonajava.javacore.Kenumeration.domain;

public enum CustomerType {
    PESSOA_FISICA(1, "Pessoa física"),
    PESSOA_JURIDICA(2, "Pessoa jurídica");

    private final int value;
    private String reportName;

    CustomerType(int value, String reportName) {
        this.value = value;
        this.reportName = reportName;
    }

    public static CustomerType customerTypeByReportName(String reportName) {
        for (CustomerType customerType : values()) {
            if (customerType.getReportName().equals(reportName)) {
                return customerType;
            }
        }
        return null;
    }

    public int getValue() {
        return value;
    }

    public String getReportName() {
        return reportName;
    }
}
