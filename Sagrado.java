package activity;

public class Sagrado_MethodActivity {
    static int calculate(int num1, int num2) {
        return num1 + num2;
    }
    static double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default:
                System.out.println("Invalid operator");
                return 0;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("The sum of 5 and 3 is " + calculate(5,3,'+'));
        System.out.println("The difference of 5 and 3 is " + calculate(5,3,'-'));
        System.out.println("The product of 5 and 3 is " + calculate(5,3,'*'));
        System.out.println("The quotient of 15 and 3 is " + calculate(15,3,'/'));
    }
    
}
