import java.util.*;

public class CustomerNameReverserT6X {
    static String reverseCustomerName(String customerName) {
        char[] chars = customerName.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String customerName = sc.nextLine();
            
            System.out.println("Original Name: " + customerName);
            System.out.println("Reversed Name: " + reverseCustomerName(customerName));
        }
    }
}