public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        int[] firstArray = new int[3];
        for (int i = 1; i <= 3; i++) {
            firstArray[i - 1] = i;
        }

        float[] secondArray = {1.57f, 7.654f, 9.986f};
        int[] thirdArray = {4, 5, 6, 7};
        System.out.println("Задание выполнено.");

        System.out.println(" ");

        System.out.println("Задание 2:");
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i]);
            if (i == firstArray.length - 1) {
                System.out.print("\n");
            } else {
                System.out.print(", ");
            }
        }

        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i]);
            if (i == secondArray.length - 1) {
                System.out.print("\n");
            } else {
                System.out.print(", ");
            }
        }

        for (int i = 0; i < thirdArray.length; i++) {
            System.out.print(thirdArray[i]);
            if (i == thirdArray.length - 1) {
                System.out.print("\n");
            } else {
                System.out.print(", ");
            }
        }

        System.out.println(" ");

        System.out.println("Задание 3:");
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[firstArray.length - 1 - i]);
            if (i == firstArray.length - 1) {
                System.out.print("\n");
            } else {
                System.out.print(", ");
            }
        }

        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[secondArray.length - 1 - i]);
            if (i == secondArray.length - 1) {
                System.out.print("\n");
            } else {
                System.out.print(", ");
            }
        }

        for (int i = 0; i < thirdArray.length; i++) {
            System.out.print(thirdArray[thirdArray.length - 1 - i]);
            if (i == thirdArray.length - 1) {
                System.out.print("\n");
            } else {
                System.out.print(", ");
            }
        }

        System.out.println(" ");

        System.out.println("Задание 4:");
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] % 2 == 1) {
                firstArray[i]++;
            }
            System.out.print(firstArray[i]);
            if (i == firstArray.length - 1) {
                System.out.print("\n");
            } else {
                System.out.print(", ");
            }
        }
    }
}