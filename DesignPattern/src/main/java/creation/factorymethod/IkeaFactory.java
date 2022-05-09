package creation.factorymethod;

/**
 * packageName : creation.factorymethod
 * fileName : IkeaFactory
 * author : macbook
 * date : 2022/05/09
 * description : 이케아 공장 (객체 생성)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/05/09         macbook          최초 생성
 */
public class IkeaFactory {
    public Furniture order(String type) {

        if(type == "bed") {
            return new BedMaker();
        } else if (type == "chair") {
            return new ChairMaker();
        } else if (type == "desk") {
            return new DeskMaker();
        }

        return null;
    }
}
