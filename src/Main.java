public class Main {
    public static void main(String[] args) {
        SecondClass secondClass = new SecondClass();
        secondClass.setValues();
        secondClass.sum1(secondClass.a, secondClass.b);
        secondClass.sum2(secondClass.c, secondClass.d);
        secondClass.isSum1MoreThanSum2();
        secondClass.increaseSum1By1();
        secondClass.decreaseSum2By2();
        secondClass.isSum1MoreThanSum2();
        secondClass.isAtLeastOneResultDevidesTo2();
        }
    }