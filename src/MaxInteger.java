import java.util.Scanner;

public class MaxInteger {
    public int FindMaxInteger(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so thu nhat:");
        int number1 = nhap.nextInt();
        
        System.out.println("Nhap so thu 2:");
        int number2 = nhap.nextInt();
        
        System.out.println("Nhap so thu 3:");
        int number3 = nhap.nextInt();
        int max =number1;
        if(number2>max){
            max =number2;
        }
        if(number3>max){
            max=number3;
        }
        nhap.close();
        return max;
        
    }

}
