package partA.ex02;

public class Calculator {
    public static String add(int x, int y){
        String response = "";
        response += x + y;
        return response;
    }

    // This method could throw an ArithmeticException
    public static String divide(int x, int y) {
        String response = "";
        response += x / y;
        return response;
    }

    public static void main(String[] args) {
        String addOutput = add(1,27);
        String divideOutput = divide(3,2);
        System.out.println("sum: " + addOutput);
        System.out.println("output: " + divideOutput);
    }
}
