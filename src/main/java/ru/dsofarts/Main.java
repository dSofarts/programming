package ru.dsofarts;

public class Main {

    public static void main(String[] args) {
        System.out.println(countBits(1234));
    }

    public static String createPhoneNumber(int[] array) {
        if (array.length != 10) {
            return "";
        }

        StringBuilder phoneNumber = new StringBuilder("(");
        for (int i = 0; i < array.length; i++) {
            if (i == 3) {
                phoneNumber.append(") ");
            } else if (i == 6) {
                phoneNumber.append("-");
            }
            phoneNumber.append(array[i]);
        }
        return phoneNumber.toString();
    }

    public static int countBits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number &= (number - 1);
        }
        return count;
    }
}