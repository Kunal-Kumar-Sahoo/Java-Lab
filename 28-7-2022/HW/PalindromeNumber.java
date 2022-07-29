//  Check if a number is a palindrome or not through CLI

class PalindromeNumber {
    public static void main(String[] args) {
        for(String num: args) {
            int _num = Integer.parseInt(num);
            if(isNumberPalindrome(_num))
                System.out.println(num + " is a Palindrome.");
            else 
                System.out.println(num + " is not a Palindrome.");
        }
    }
    
    static boolean isNumberPalindrome(int number) {
        int reversed = 0;
        for(int temp=number; temp>0; temp/=10)
            reversed = reversed*10 + temp%10;

        return number == reversed;
    }
}
