 import java.util.Scanner;
public class Exercise03_05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter today's day: ");
        int today = sc.nextInt();
        System.out.println("Enter the number of days elapsed since today: ");
        int elapse = sc.nextInt();
        //条件语句判断
        if(today == 0){ 
            if(elapse == 1){
                System.out.println("Today is Sunday and the future day is Monday");
            }else if(elapse == 2){
                System.out.println("Today is Sunday and the future day is Tuesday");  
            }else if(elapse == 3){
                System.out.println("Today is Sunday and the future day is Wednesday");
            }else if(elapse == 4){
                System.out.println("Today is Sunday and the future day is Tursday");
            }else if(elapse == 5){
                System.out.println("Today is Sunday and the future day is Friday");
            }else if(elapse == 6){
                System.out.println("Today is Sunday and the future day is Saturday");
            }
        }else if(today == 1){
            if(elapse == 1){
                System.out.println("Today is Monday and the future day is Tuesday");
            }else if(elapse == 2){
                System.out.println("Today is Monday and the future day is Wednesday");  
            }else if(elapse == 3){
                System.out.println("Today is Monday and the future day is Tursday");
            }else if(elapse == 4){
                System.out.println("Today is Monday and the future day is Friday");
            }else if(elapse == 5){
                System.out.println("Today is Monday and the future day is Saturday");
            }else if(elapse == 6){
                System.out.println("Today is Monday and the future day is Sunday");
            }
            
        }else if(today == 2){
            if(elapse == 1){
                System.out.println("Today is Tuesday and the future day is Wednesday");
            }else if(elapse == 2){
                System.out.println("Today is Tuesday and the future day is Tursday");  
            }else if(elapse == 3){
                System.out.println("Today is Tuesday and the future day is Friday");
            }else if(elapse == 4){
                System.out.println("Today is Tuesday and the future day is Saturday");
            }else if(elapse == 5){
                System.out.println("Today is Tuesday and the future day is Sunday");
            }else if(elapse == 6){
                System.out.println("Today is Tuesday and the future day is Monday");
            }
            
        }else if(today == 3){
            if(elapse == 1){
                System.out.println("Today is Wednesday and the future day is Tursday");
            }else if(elapse == 2){
                System.out.println("Today is Wednesday and the future day is Friday");  
            }else if(elapse == 3){
                System.out.println("Today is Wednesday and the future day is Saturday");
            }else if(elapse == 4){
                System.out.println("Today is Wednesday and the future day is Sunday");
            }else if(elapse == 5){
                System.out.println("Today is Wednesday and the future day is Monday");
            }else if(elapse == 6){
                System.out.println("Today is Wednesday and the future day is Tuesday");
            }
            
        }else if(today == 4){
            if(elapse == 1){
                System.out.println("Today is Tursday and the future day is Friday");
            }else if(elapse == 2){
                System.out.println("Today is Tursday and the future day is Saturday");  
            }else if(elapse == 3){
                System.out.println("Today is Tursday and the future day is Sunday");
            }else if(elapse == 4){
                System.out.println("Today is Tursday and the future day is Monday");
            }else if(elapse == 5){
                System.out.println("Today is Tursday and the future day is Tuesday");
            }else if(elapse == 6){
                System.out.println("Today is Tursday and the future day is Wednesday");
            }
            
        }else if(today == 5){
            if(elapse == 1){
                System.out.println("Today is Friday and the future day is Saturday");
            }else if(elapse == 2){
                System.out.println("Today is Friday and the future day is Sunday");  
            }else if(elapse == 3){
                System.out.println("Today is Friday and the future day is Monday");
            }else if(elapse == 4){
                System.out.println("Today is Friday and the future day is Tuesday");
            }else if(elapse == 5){
                System.out.println("Today is Friday and the future day is Wednesday");
            }else if(elapse == 6){
                System.out.println("Today is Friday and the future day is Tursday");
            }

            
        }else if(today == 6){
            if(elapse == 1){
                System.out.println("Today is Saturday and the future day is Sunday");
            }else if(elapse == 2){
                System.out.println("Today is Saturday and the future day is Monday");  
            }else if(elapse == 3){
                System.out.println("Today is Saturday and the future day is Tuesday");
            }else if(elapse == 4){
                System.out.println("Today is Saturday and the future day is Wednesday");
            }else if(elapse == 5){
                System.out.println("Today is Saturday and the future day is Tursday");
            }else if(elapse == 6){
                System.out.println("Today is Saturday and the future day is Friday");
            }
            
        }
            

        }
}
