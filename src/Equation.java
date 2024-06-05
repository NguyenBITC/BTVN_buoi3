

public class Equation {
    public void CalculateQuadratic(int a,int b, int c){
         
        if(a==0&&b==0){
            System.out.println("Phuong trinh vo nghiem");
        }
        else if(a==0){
            double x = -c/b;
            System.out.println("Phuong trinh co mot nghiem la: " + x);
        }
        else {
            double delta = b*b - 4 *a*c;
            if(delta>0){
                double x1 = (-b + Math.sqrt(delta))/(2*a);
                double x2 = (-b - Math.sqrt(delta))/(2*a);
                System.out.println("Phuong trinh co 2 nghiem phan biet: x1 = "+ x1 + " x2 = " +x2);
            }
            else if(delta==0){
                double x3 = -b/(2*a);
                System.out.println("Phuong trinh co nghiem kep la: x= "+x3);
            }
            else{
            System.out.println("Phuong trinh vô nghiem");
            }
    }
}
}
