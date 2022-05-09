package creation.builder;

/**
 * packageName : creation.builder
 * fileName : RAM
 * author : macbook
 * date : 2022/05/09
 * description : RAM class (빌더에서 사용할 클래스)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/05/09         macbook          최초 생성
 */
public class Ram {
    String ram;

    public Ram(String ram) {
        this.ram = ram;
    }

     String getInfo() {
        return ram;
    }
}
