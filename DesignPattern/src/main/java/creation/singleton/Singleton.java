package creation.singleton;

/**
 * packageName : creation.singleton
 * fileName : Singleton
 * author : macbook
 * date : 2022/05/09
 * description : 공유 객체 ( Singleton )
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/05/09         macbook          최초 생성
 */
public class Singleton {

    private static Singleton singleton = null;

    // 생성자를 다른 클래스에서 호출하지 못하도록 막음 (private)
    private Singleton() {
        System.out.println("객체 생성 완료");
    }

    // Singleton 만드는데 이미 만들어져 있으면 객체를 생성하지 않음
    public static Singleton getInstance() {
        if (singleton == null) {
            // 객체 생성이 안되어 있으면 하나 생성
            singleton = new Singleton();
        }
        return singleton;
    }
}
