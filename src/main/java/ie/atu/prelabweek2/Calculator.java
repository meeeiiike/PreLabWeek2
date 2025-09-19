package ie.atu.prelabweek2;

public class Calculator {
    private double num1;
    private double num2;
    private double total;
    private String operation;

    public Calculator(double num1, double num2, String operation ) {
        this.num1 = num1;
        this.num2 = num2;
        this.total = 0;
        this.operation = operation;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public String getOperation() {
        return operation;
    }

    public double getTotal() {
        return total;
    }

    public void calculateTotal() {
        switch (operation) {
        case "add":
            total = num1 + num2;
            break;
        case "subtract":
            total = num1 - num2;
            break;
        case "multiply":
            total  = num1 * num2;
            break;
        case "divide":
            if (num2 == 0) {
                System.out.println("Error: divide by zero");
                break;
            } else {
                total  = num1 / num2;
                break;
            }
            default:
                System.out.println("Error: unknown operation");
        }
    }
}
