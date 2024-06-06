
public class App {
    public static void main(String[] args) throws Exception {
        //tính năm nhuận
        CheckYear year = new CheckYear();
        year.CheckLeapYear(2020);
        year.CheckLeapYear(2013);
        year.CheckLeapYear(1000);
        //máy tính
        Calculator calculator = new Calculator(); 
        calculator.CalculatorInterger("+", 9, 8);
        calculator.CalculatorInterger("-", 9, 8);
        calculator.CalculatorInterger("*", 9, 8);
        calculator.CalculatorInterger("/", 8,2);
        calculator.CalculatorInterger("/", 9, 0);
        calculator.CalculatorInterger("", 9, 88);
       //songuyenlonnhat
        MaxInteger maxInteger = new MaxInteger();
        int max = maxInteger.FindMaxInteger();
        System.out.println("So lon nhat la: " + max);
        //tìm x
        Equation equation = new Equation();
        equation.CalculateQuadratic(0, 0, 6);
        equation.CalculateQuadratic(4, 5, 6);
        equation.CalculateQuadratic(0, 3, 9);
        equation.CalculateQuadratic(1, -4,4);
        equation.CalculateQuadratic(4, 8, 3);
    }
}
