package cleancode.studycafe.tobe.model.pass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static cleancode.studycafe.tobe.model.pass.StudyCafePassType.WEEKLY;
import static org.junit.jupiter.api.Assertions.*;

class StudyCafeSeatPassesTest {

    @DisplayName("")
    @Test
    void findPassBy() {
        // given
        StudyCafeSeatPass selectedPass = StudyCafeSeatPass.of(WEEKLY, 4, 150000, 0.1);
        StudyCafePassType selectedPassType = selectedPass.getPassType();

        // when

        // then
    }

}
