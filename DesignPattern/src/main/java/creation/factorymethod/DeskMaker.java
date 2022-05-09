package creation.factorymethod;

/**
 * packageName : creation.factorymethod
 * fileName : DeskMaker
 * author : macbook
 * date : 2022/05/09
 * description : 의자 구현 클래스 (가구 인터페이스 상속)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/05/09         macbook          최초 생성
 */
public class DeskMaker implements Furniture{
    public DeskMaker() {
        System.out.println("책상 메이커 대기");
    }

    @Override
    public void make() {
        System.out.println("책상을 만들었습니다");
    }

    @Override
    public void newDesign() {
        System.out.println("새 책상을 연구합니다");
    }
}
