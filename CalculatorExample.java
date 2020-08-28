public class CalculatorExample {
    public static void main(String[] args){
        Calculator cal = new Calculator();

        double result1 = 10*10*Calculator.pi;
        int result2 = Calculator.plus(10,5);
        int result3 = Calculator.minus(10,5);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        double result4 = 10*10*cal.pi; //정적요소는 객체참조 변수(cal.pi)로도 접근이 가능하지만, 클래스 이름으로 접근하는 것이 좋다.
        int result5= cal.plus(10,5);
        int result6 = cal.minus(10,5);

        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
    }
}
