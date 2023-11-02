import java.util.Scanner;

public class test3 {
    /**
     * codingan ini berupa program pengecekan untuk kata polindrome
     * left = pengecekan dari kiri ke kanan
     * right = input.leghth() - 1 berfungsi untuk melakukan pengecekan dari kanan yang dimulai dari index dikurang 1
     * @param args
     */
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Masukkan kata: ");
        String input = inputScanner.nextLine().toLowerCase().replaceAll("[^a-zA-Z]", "");


        boolean isPalindrome = true;
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome.");
            System.out.println(input);
        } else {
            System.out.println("Bukan palindrome.");
            System.out.println(input);
        }
    }
}