package lr2;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = in.nextInt();

        System.out.printf("В введенном числе %d тысяч\n", number / 1000 % 10);

        String str = String.valueOf(number);
        char[] chars = str.toCharArray();

        if (chars.length >= 4) {
            System.out.printf("В введенном числе %d тысяч\n", Integer.parseInt(String.valueOf(chars[chars.length - 4])));
        } else {
            System.out.println("В введенном числе 0 тысяч");
        }
        in.close();
    }
}