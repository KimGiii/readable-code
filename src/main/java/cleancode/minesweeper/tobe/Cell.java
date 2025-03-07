package cleancode.minesweeper.tobe;

/*
    도메인 지식을 얻었따!

    1. 열림/닫힘 개념과 사용자가 확인했다 개념은 다름
    2. sign(String) 기반의 BOARD가 있고, 상황에 따라 표시할 sign을 갈아끼움
       -> Cell이라는 정보를 담을 공간, 객체가 생김
       -> board는 Cell의 상태를 변화시키는 방향으로 가야함!
 */

public class Cell {

    private static final String FLAG_SIGN = "⚑";
    private static final String LAND_MINE_SIGN = "☼";
    private static final String UNCHECKED_SIGN = "□";
    private static final String EMPTY_SIGN = "■";

    private int nearbyLandMineCount;
    private boolean isLandMine;
    private boolean isFlagged;
    private boolean isOpened;

    // Cell이 가진 속성 : 근처 지뢰 개수, 지뢰 여부
    // Cell의 상태 : 깃발 유무, 열림/닫힘, 사용자가 확인함

    private Cell(int nearbyLandMineCount, boolean isLandMine, boolean isFlagged, boolean isOpened) {
        this.nearbyLandMineCount = nearbyLandMineCount;
        this.isLandMine = isLandMine;
        this.isFlagged = isFlagged;
        this.isOpened = isOpened;
    }
    // 정적 팩토리 메소드 -> 이름을 따로 줄 수 있어서
    public static Cell of(int nearbyLandMineCount, boolean isLandMine, boolean isFlaged, boolean isOpened) {
        return new Cell(nearbyLandMineCount, isLandMine, isFlaged, isOpened);
    }

    public static Cell create() {
        return of(0, false, false, false);
    }

    public void turnOnLandMine() {
        this.isLandMine = true;
    }

    public void updateNearByLandMineCount(int count) {
        this.nearbyLandMineCount = count;
    }

    public void flag() {
        this.isFlagged = true;
    }

    public void open() {
        this.isOpened = true;
    }

    public boolean isChecked() {
        return isFlagged || isOpened;
    }

    public boolean isLandMine() {
        return isLandMine;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public boolean hasLandMineCount() {
        return this.nearbyLandMineCount != 0;
    }

    public String getSign() {
        if(isOpened) {
            if (isLandMine) {
                return LAND_MINE_SIGN;
            }
            if(hasLandMineCount()) {
                return String.valueOf(nearbyLandMineCount);
            }
            return EMPTY_SIGN;
        }

        if(isFlagged) {
            return FLAG_SIGN;
        }

        return UNCHECKED_SIGN;
    }
}
