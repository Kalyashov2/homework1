
public class massive {
    public static void main(String[] args) {
        //целочисленный массив заполненый 3 цифрами
        int weight[] = new int[]{1, 2, 3};
        System.out.println(java.util.Arrays.toString(weight));
        for (int i = weight.length - 1; i >= 0; i--) {
            System.out.print(weight[i] + ",");
        }
        System.out.println();


        //Массив, в котором можно хранить три дробных числа
        double fractional[] = {1.57, 7.654, 9.986};
        System.out.println(java.util.Arrays.toString(fractional));
        for (int i = fractional.length - 1; i >= 0; i--) {
            System.out.print(fractional[i] + ",");
        }
        System.out.println();


        //Произвольный массив
        int largeNumbers[] = {10000, 200000, 300000, 12311231, 12312322};
        System.out.println(java.util.Arrays.toString(largeNumbers));
        for (int i = largeNumbers.length - 1; i >= 0; i--) {
            System.out.print(largeNumbers[i] + ",");
        }
        System.out.println();

        //Задание 4, сделать нечётные числа в массиве чётными
        int nubmers[] = {1, 2, 5, 4, 7};
        for (int i = 0; i < nubmers.length; i++) {
            if (i % 2 == 0) {
                System.out.print(nubmers[i] + 1);
            }
        }



    }


    }




