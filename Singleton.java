public class Singleton {
    private static Singleton singleton = new Singleton(); //단 하나의 객체만 생성할 수 있도록 하는 것이 Singleton이다.
    //클래스 외부에서 new 연산자로 생성자 호출 불가능하다(단 하나의 객체만 생성해야 하므로).
    //단, 클래스 내부에서는 new 연산자로 생성자 호출이 가능하다.

    private Singleton(){}
    static Singleton getInstance(){
        return singleton;
    }
}
