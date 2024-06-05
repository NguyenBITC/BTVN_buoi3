 public class CheckYear{
    public void CheckLeapYear(int year){
        if(year%400==0){
            System.out.println("day la nam nhuan");
        }
        else if(year%4==0 && year%100!=0){
            System.out.println("day la nam nhuan");
        }
        else{
            System.out.println("day khong la nam nhuan \n");
        }
    }
}