class MyInteger {
    // 成员变量
    private int value;

    /** constructor without args */
    public MyInteger(int value) {
        this.value = value;
    }

    // 成员方法
    /** get the value with int type */
    public int getValue() {
        return value;
    }

    /** if number is even, give back true,else other */
    public boolean isEven() {
        if (value % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /** if number is odd, give back true,else other */
    public boolean isOdd() {
        if (value % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    /** if number is prime number, give back true,else other */
    public boolean isPrime() {
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }

        }
        return true;
    }

    /** if number is even, give back true,else other */
    public static boolean isEven(int value) {
        if (value % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /** if number is odd, give back true,else other */
    public static boolean isOdd(int value) {
        if (value % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    /** if number is prime number, give back true,else other */
    public static boolean isPrime(int value) {
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }

        }
        return true;
    }

    /** if number is even, give back true,else other */
    public static boolean isEven(MyInteger value) {
        if (value.getValue() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /** if number is odd, give back true,else other */
    public static boolean isOdd(MyInteger value) {
        if (value.getValue() % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    /** if number is prime number, give back true,else other */
    public static boolean isPrime(MyInteger value) {
        for (int i = 2; i < value.getValue(); i++) {
            if (value.getValue() % i == 0) {
                return false;
            }

        }
        return true;
    }

    /** if value of object = value of give, return true */
    public boolean equals(int value) {
        return this.value == value;
    }

    /** if value of object = value of such object, return true */
    public boolean equals(MyInteger value) {
        return this.value == value.getValue();
    }

    /**
     * convert an array to int type.
     * For example, it should return 125 if the characters array is {'1', '2', '5'}.
     */
    public static int parseInt(char[] value) {
        return Integer.valueOf(String.valueOf(value));
    }

    /** convert String type to int type */
    public static int parseInt(String value) {
        return Integer.valueOf(value);
    }
}
