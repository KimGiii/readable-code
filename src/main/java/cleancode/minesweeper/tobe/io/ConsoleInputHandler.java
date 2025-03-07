package cleancode.minesweeper.tobe.io;

import static cleancode.minesweeper.tobe.Minesweeper.SCANNER;

public class ConsoleInputHandler {

    public String getUserInput() {
        return SCANNER.nextLine();
    }
}

