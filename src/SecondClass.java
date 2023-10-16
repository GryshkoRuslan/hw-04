import java.util.Scanner;

public class SecondClass {
    public int a;
    public int b;
    public int c;
    public int d;

    public int sum1;
    public int sum2;

    public void setValues() {
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Введите значение для переменной a:");
        a = consoleInput.nextInt();
        System.out.println("Введите значение для переменной b:");
        b = consoleInput.nextInt();
        System.out.println("Введите значение для переменной c:");
        c = consoleInput.nextInt();
        System.out.println("Введите значение для переменной d:");
        d = consoleInput.nextInt();
        consoleInput.close();
    }

    public void sum1(int firstValue, int secondValue) {
        sum1 = firstValue + secondValue;
        System.out.println("Сумма a + b равна: " + sum1);
    }

    public void sum2(int thirdValue, int fourthValue) {
        sum2 = thirdValue + fourthValue;
        System.out.println("Сумма c + d равна: " + sum2);
    }

    public void increaseSum1By1() {
        sum1 += 1;
        System.out.println("Увеличили sum1 на 1 вышло: " + sum1);
    }

    public void decreaseSum2By2() {
        sum2 -= 2;
        System.out.println("Уменьшили sum2 на 2 вышло: " + sum2);
    }

  public void  isSum1MoreThanSum2() {
        System.out.println("sum1 больше чем sum2 ?: " +  (sum1 > sum2));
  }

  public void isAtLeastOneResultDevidesTo2() {
        System.out.println("sum1 или sum2 кратно 2 ?: " + ((sum1 % 2 == 0) || (sum2 % 2 == 0)));
  }
}
