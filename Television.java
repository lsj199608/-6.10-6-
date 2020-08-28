public class Television {
    String example;
    static String company = "samsung";
    static String model = "LCD";
    static String info;

    static{ //정적 블록과 정적 메소드는 이들 내부에 인스턴스 필드나 인스턴스 메소드를 사용할 수 없다. 그리고 객체 참조인
        //this 키워드도 사용 불가능. 즉, static 블록 내부에서 example 변수 사용 불가, this.example 사용 불가.

        info = company + "-"+model;
    }
}
