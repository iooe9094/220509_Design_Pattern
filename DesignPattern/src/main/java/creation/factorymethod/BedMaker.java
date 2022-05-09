package creation.factorymethod;

/**
 * packageName : creation.factorymethod
 * fileName : BedMaker
 * author : macbook
 * date : 2022/05/09
 * description : 침대 구현 클래스 (가구 인터페이스 상속)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/05/09         macbook          최초 생성
 */
public class BedMaker implements Furniture {
    // 자동기능 - 컨트롤 + 엔터 -> 생성자, get set 등
    public BedMaker() {
        System.out.println("침대 메이커 대기");
    }

    @Override
    public void make() {
        System.out.println("침대를 만들었습니다");
    }

    @Override
    public void newDesign() {
        System.out.println("새 침대를 연구합니다");
    }
}
