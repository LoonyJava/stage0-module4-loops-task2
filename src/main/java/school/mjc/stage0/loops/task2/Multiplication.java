package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int count = 0;
        int ourNumber = 0;
        int counter = 0;
        if (multiplyByAndToInclusive == 0) {

        } else if (multiplyByAndToInclusive < 0) {
            count = (-1) * multiplyByAndToInclusive;
            count = multiplyByAndToInclusive;
            while (counter >= count) {
                System.out.println((-1) * ourNumber);
                ourNumber = ourNumber - multiplyByAndToInclusive;
                counter--;
            }
        } else {
            count = multiplyByAndToInclusive;
            while (counter <= count) {
                System.out.println(ourNumber);
                ourNumber = ourNumber + multiplyByAndToInclusive;
                counter++;
            }
        }
    }
}
