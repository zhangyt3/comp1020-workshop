public class Recursion {
    public static void main(String[] args) {
        int res = addDigits(38);
        System.out.println(res);
    }

    public static int addDigits(int num) {
        // BASE CASE: num is a single digit
        if (num / 10 == 0) { 
            return num;
        }

        // RECURSIVE CASE: add digits of num and recurse!
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return addDigits(sum);
    }
} 