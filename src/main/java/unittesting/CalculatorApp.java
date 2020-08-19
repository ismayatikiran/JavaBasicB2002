package unittesting;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(2,3);
        calculator.subtraction(5,2);
        System.out.println("Add: "+ calculator.add(2,3)+"Sub: "+calculator.subtraction(5,2));
    }
}
