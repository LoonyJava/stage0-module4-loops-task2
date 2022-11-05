package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        boolean flag = true;
        for (int P = 2; P <= printToInclusive; P++) {
            for (int i = 2; i < P; i++) {
                if (P % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.println(P);
            else flag = true;
        }
    }
}
