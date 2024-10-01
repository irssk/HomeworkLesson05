package app;

public class MainProgram {
    public static void main(String[] args) {
        double income = 10000;
        double tax = calculateTax(income);
        System.out.println("For an income of " + income + ", the tax is: " + tax);
    }

    public static double calculateTax(double income) {
        double tax;

        if (income <= 10000) {
            tax = income * 0.025;  // 2.5% для доходів до 10,000 включно
        } else if (income <= 25000) {
            tax = 10000 * 0.025 + (income - 10000) * 0.043;  // 2.5% для перших 10,000 + 4.3% для решти до 25,000
        } else {
            tax = 10000 * 0.025 + (25000 - 10000) * 0.043 + (income - 25000) * 0.067;  // 2.5% для перших 10,000, 4.3% для наступних 15,000, і 6.7% для решти
        }

        return tax;
    }
}