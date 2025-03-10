package cleancode.minesweeper.tobe.cell;

/*
    도메인 지식을 얻었따!

    1. 열림/닫힘 개념과 사용자가 확인했다 개념은 다름
    2. sign(String) 기반의 BOARD가 있고, 상황에 따라 표시할 sign을 갈아끼움
       -> Cell이라는 정보를 담을 공간, 객체가 생김
       -> board는 Cell의 상태를 변화시키는 방향으로 가야함!
 */

public interface Cell {

    String FLAG_SIGN = "⚑";
    String UNCHECKED_SIGN = "□";

    boolean isLandMine();

    boolean hasLandMineCount();

    String getSign();


    void flag();

    void open();

    boolean isChecked();

    boolean isOpened();
}
