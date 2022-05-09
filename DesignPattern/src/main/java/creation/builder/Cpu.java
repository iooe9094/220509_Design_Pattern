package creation.builder;

/**
 * packageName : creation.builder
 * fileName : CPU
 * author : macbook
 * date : 2022/05/09
 * description : CPU class (빌더에서 사용할 클래스)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/05/09         macbook          최초 생성
 */
public class Cpu {
    String cpu;

    public Cpu(String cpu) {
        this.cpu = cpu;
    }

    String getInfo() {
        return cpu;
    }
}
