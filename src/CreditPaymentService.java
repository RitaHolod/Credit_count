public class CreditPaymentService {
    public double calculate (double credit, double i, int month){
        i = 9.99/month/100;
        double payment = credit*(i*Math.pow(1+i,month)/(Math.pow(1+i,month)-1));


        return payment;
    }
}
