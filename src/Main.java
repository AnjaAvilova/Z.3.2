public class Main {
    public static void main(String[] args) {
        int start = 100;
        int refill = 300;

        int bonus = 0;
        if (refill > 1000) {
            bonus = refill / 100;
        }
        int sumTotal = start + refill + bonus;

        System.out.println(sumTotal);
        System.out.println(bonus);
    }
}