package creation.factorymethod;

/**
 * packageName : creation.factorymethod
 * fileName : ChairMaker
 * author : macbook
 * date : 2022/05/09
 * description : 의자 구현 클래스 (가구 인터페이스 상속)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/05/09         macbook          최초 생성
 */
public class ChairMaker implements Furniture {
    public ChairMaker() {
        System.out.println("의자 메이커 대기");
    }

    @Override
    public void make() {
        System.out.println("의자를 만들었습니다");
    }

    @Override
    public void newDesign() {
        System.out.println("새 의자를 연구합니다");
    }
}
