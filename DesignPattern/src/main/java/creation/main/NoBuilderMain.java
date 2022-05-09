package creation.main;

import creation.builder.Cpu;
import creation.builder.Computer;
import creation.builder.Graphics;
import creation.builder.Ram;

/**
 * packageName : creation.main
 * fileName : NoBuilderMain
 * author : macbook
 * date : 2022/05/09
 * description : 기본 생성자와 매개변수 생성자를 이용해 값 초기화
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/05/09         macbook          최초 생성
 */
public class NoBuilderMain {
    public static void main(String[] args) {
        // 프리미엄 컴퓨터
        Cpu cpu = new Cpu("Intel Core i7");
        Ram ram = new Ram("16GB");
        Graphics graphics = new Graphics("RTX-3090");

        // 매개변수 3개 Computer 생성자 호출
        Computer premiumPC = new Computer(cpu, ram, graphics);
        // 컴퓨터 사양 정보 출력
        premiumPC.computerInfo();

        // 저가형 컴퓨터
        Cpu cpu2 = new Cpu("Intel Core i7");
        Ram ram2 = new Ram("8GB");
        Graphics graphics2 = new Graphics("RTX-3090");

        // 미들 저가 컴퓨터
        System.out.println("===== middleCostPC =====");
        Computer middleCostPC = new Computer(cpu2, null, graphics2);
        // 컴퓨터 사양 정보 출력
        middleCostPC.computerInfo();

        // 미들 저가 컴퓨터
        System.out.println("===== middleCostPC =====");
        Computer lowerCostPC = new Computer(cpu2, ram2, null);
        // 컴퓨터 사양 정보 출력
        lowerCostPC.computerInfo();

        // 미들 저가 컴퓨터
        System.out.println("===== middleCostPC =====");
        Computer superlowerCostPC = new Computer(cpu2, null, null);
        // 컴퓨터 사양 정보 출력
        superlowerCostPC.computerInfo();
    }
}