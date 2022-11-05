package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int mainCount = 0;
        int stepen = 0;
        int two = 2;
        if (power < 0) {
            System.out.println("too much power");
        } else {
                while (mainCount <= power) {
                System.out.println((int) Math.pow(2.0, mainCount));
                mainCount++;
            }
        }
    }
}
