package creation.builder;

/**
 * packageName : creation.builder
 * fileName : Graphics
 * author : macbook
 * date : 2022/05/09
 * description : Graphics 클래스 (빌더에서 사용할 클래스)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/05/09         macbook          최초 생성
 */
public class Graphics {
    String graphic;

    public Graphics(String graphic) {
        this.graphic = graphic;
    }

    String getInfo() {
        return graphic;
    }
}
