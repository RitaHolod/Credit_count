public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double credit = 1_000_000;
        double i = 9.99;
        int month = 36;
        int paymentYear = (int) service.calculate(credit, i, month);
        System.out.println("Ваш ежемесячный платеж: " + paymentYear);
    }
}

