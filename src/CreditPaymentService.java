public class CreditPaymentService {
    public double calculate(double credit, double i, int month) {
        double monthRate = i / 12 / 100;
        double payment = credit * (monthRate * Math.pow(1 + monthRate, month) / (Math.pow(1 + monthRate, month) - 1));


        return payment;
    }
}
