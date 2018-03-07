package day01;

public class Demo {

    /**
     * main psvm
     * @param args
     */
    public static void main(String[] args) {
        int array[] = new int[]{5,6,7};
        print(array);
    }

    public static void print(int[] array){

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
