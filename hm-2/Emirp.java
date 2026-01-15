//需求：如果一个质数的回文仍是质数，输出
public class Emirp {
    public static void main(String[] args) {
        int count = 1;
        int number = 0;

        while (count <= 100) {
            number += 1;
            if (isPalindrome(number) == false) {
                int rNumber = reverse(number);
                if (isPrime(number) && isPrime(rNumber)) {
                    // 输出
                    System.out.print(number + " ");
                    if (count % 10 == 0) {
                        System.out.println();
                    }
                    count++;
                }
            }
        }
    }

    // 方法

    /** 反转数字并返回反转后的数值 */
    static int reverse(int number) {
        int temp = number;
        int reversenumber = 0;
        while (temp != 0) {
            int ge = temp % 10;
            temp /= 10;
            reversenumber = reversenumber * 10 + ge;
        }
        return reversenumber;
    }

    /** 对数字的回文判断，并返回：是--true，不是--false */
    static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    /** 是否是质数的判断，并返回：是--true，不是--false */
    public static boolean isPrime(int num) {
        boolean flag = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

}
