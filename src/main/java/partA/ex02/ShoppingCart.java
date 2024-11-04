package partA.ex02;

public class ShoppingCart {

    public static String calc() {
        String response = "";

        Calculator calc = new Calculator();

        String addResult = calc.add(43, 79);
        response += ("Add Result: " + addResult);

        String divResult = calc.divide(15, 0);
        response += ("Division Result: " + divResult);


        return response;
    }


    public static void main(String[] args) {
        String output = calc();
        System.out.print(output);

    }


}
