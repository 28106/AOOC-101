import java.util.Scanner;
class sort {
        public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i <=9; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i <=9; i++) {
            for (int j = i+1; j <=9; j++) {
                if (numbers[i] > numbers[j]) {
                   
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println("Numbers in ascending order:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}

