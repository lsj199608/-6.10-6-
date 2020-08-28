public class PersonExample {
    public static void main(String[] args){
        Person P1 = new Person("1234567-1234567",  "계백");
        System.out.println(P1.nation);
        System.out.println(P1.ssn);
        System.out.println(P1.name);

        //p1.nation = "usa";
        //p1.ssn = "654321-7654321"; 파이날 필드는 값 수정 불가.
        P1.name = "을지문덕";
    }
}
