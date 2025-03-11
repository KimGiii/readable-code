package cleancode.minesweeper.tobe;

import cleancode.minesweeper.tobe.config.GameConfig;
import cleancode.minesweeper.tobe.gamelevel.GameLevel;
import cleancode.minesweeper.tobe.gamelevel.Begginer;
import cleancode.minesweeper.tobe.io.ConsoleInputHandler;
import cleancode.minesweeper.tobe.io.ConsoleOutputHandler;
import cleancode.minesweeper.tobe.io.InputHandler;
import cleancode.minesweeper.tobe.io.OutputHandler;

public class GameApplication {

    public static void main(String[] args) {
        GameConfig gameConfig = new GameConfig(
                new Begginer(),
                new ConsoleInputHandler(),
                new ConsoleOutputHandler()
        );

        Minesweeper minesweeper = new Minesweeper(gameConfig);
        minesweeper.initialize();
        minesweeper.run();
    }


    /**
     * DIP - Dependency Inversion Principle
     *
     * DI - Dependency Injection -> "3"
     *
     * IoC - Inversion of Control
     * 프로그램의 흐름을 framework에 의해 제어된다.
     */
}