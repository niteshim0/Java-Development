public class OddBehaviour {
    public static void main(String[] args) {
        float a = 0.7f;
        float b = 0.1f;
        float c = a - b; // It doesn't give 0.6 it gives 0.59999996 , it also depends on how float stored in memory according to IEEE 754 standard , always use BigDecimal for precise calculations
        System.out.println(c);
        System.out.println((double)(a)); // give output as 0.699999988079071
    }
}