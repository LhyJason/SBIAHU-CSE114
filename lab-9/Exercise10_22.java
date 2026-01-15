// import java.util.StringBuilder;
// class MyString1 {
//     // members
//     private char[] chars;

//     /** constructor with no-args */
//     public MyString1() {
//     }

//     /** constructor with args */
//     public MyString1(char[] chars) {
//         this.chars = chars;
//     }

//     /** achieve the function of s.charAt[] */
//     public char charAt(int index) {
//         return chars[index];
//     }

//     /** achieve the function of s.length() */
//     public int length() {
//         return chars.length;
//     }

//     /** achieve the function of s.subString() */
//     public MyString1 substring(int begin, int end) {
//         chars[] temp = chars[end - begin];
//         for (int i = 0; i < temp.length; i++) {
//             temp[i] = chars[begin + i];
//         }
//         MyString1 newArr = new MyString1(temp);
//         return newArr;
//     }

//     /** achieve the function of s.toLowerCase() */
//     public MyString1 toLowerCase() {
//         char[] temp = new char[chars.length];
//         for (int i = 0; i < chars.length; i++) {
//             temp[i] = Character.toLowerCase(chars[i]);
//         }
//         MyString1 newArr = new MyString1(temp);
//         return newArr;
//     }

//     /** achieve the function of s.equals() */
//     public boolean equals(MyString1 s) {
//         StringBuilder sb1 = new StringBuilder(this.chars);
//         StringBuilder sb2 = new StringBuilder(s);
//         String s1 = sb1.toString();
//         String s2 = sb2.toString();
//         return s1.equals(s2);
//     }

//     /** achieve the function of s.valueOf() */
//     public static MyString1 valueOf(int i) {
//         char[] temp = new char[40];
//         int size = 0;
//         while (i != 0) {
//             int number = i % 10;
//             i = i / 10;
//             temp[size] = (char) (number + '0');
//             size++;
//         }
//         MyString1 newArr = new MyString1(temp);
//         return newArr; 

//         /** achieve the function of s.toChars() */
//         // public char[] toChars() {
//         // return chars;
//         // }

//     }
// }
