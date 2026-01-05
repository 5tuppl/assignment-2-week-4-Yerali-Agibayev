import java.util.Scanner;

class task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long number = input.nextLong();
        long result = cube(number);
        System.out.println(result);
    }

    public static long cube(long number) {
        return number * number * number;
    }
 }


