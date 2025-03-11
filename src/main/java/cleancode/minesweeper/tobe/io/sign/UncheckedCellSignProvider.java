package cleancode.minesweeper.tobe.io.sign;

import cleancode.minesweeper.tobe.cell.CellSnapshot;

public class UncheckedCellSignProvider implements CellSignProvidable{

    private static final String UNCHECKED_SIGN = "□";

    @Override
    public String provide(CellSnapshot cellSnapshot) {
        return UNCHECKED_SIGN;
    }
}
