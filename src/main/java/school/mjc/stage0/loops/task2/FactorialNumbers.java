package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int count = 0;
        int secCount = 1;
        int number = 1;
        if (printToInclusive != 0) {
            while (count < printToInclusive) {
                if (count == 0 || count == 1) {
                    System.out.println("1");
                }
                while (secCount <= count) {
                    number = number + number * secCount;
                    System.out.println(number);
                    secCount++;
                }
                count++;
            }
        } else {
            System.out.println("1");
        }
    }
}
