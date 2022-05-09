package creation.main;

import creation.builder.*;

/**
 * packageName : creation.main
 * fileName : BuilderMain
 * author : macbook
 * date : 2022/05/09
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/05/09         macbook          최초 생성
 */
public class BuilderMain {
    public static void main(String[] args) {
        Cpu cpu = new Cpu("Intel core i7");
        Ram ram = new Ram("16GB");
        Graphics graphics = new Graphics("RTX-3090");

        // Builder를 이용해서 원하는 구성으로 컴퓨터를 조립
        // Builder 생성자를 호출하면 컴퓨터가 생성됨
        Builder builder = new Builder();

        // 세팅된 값이 설정된 computer 객체가 반환
        Computer premiumPC = builder.setCpu(cpu).setRam(ram).setGraphics(graphics).build();

        // 프리미엄 컴퓨터 정보 보기
        premiumPC.computerInfo();

        // 저가형 컴퓨터 조립
        Cpu cpu2 = new Cpu("Intel core i7");
        Ram ram2 = new Ram("8GB");
        Graphics graphics2 = new Graphics("RTX-3060");

        System.out.println("===== middleCostPC =====");
        builder = new Builder();
        Computer middleCostPC = builder.setCpu(cpu2).setGraphics(graphics2).build();
        // 중저가형 PC 정보 출력
        middleCostPC.computerInfo();

        System.out.println("===== lowerCostPC =====");
        builder = new Builder();
        Computer lowerCostPC = builder.setCpu(cpu2).setRam(ram2).build();
        // 저가형 PC 정보 출력
        lowerCostPC.computerInfo();

        System.out.println("===== superlowerCostPC =====");
        builder = new Builder();
        Computer superlowerCostPC = builder.setCpu(cpu2).build();
        // 초저가형 PC 정보 출력
        superlowerCostPC.computerInfo();
    }
}
