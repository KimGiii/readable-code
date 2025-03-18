package cleancode.studycafe.tobe.model.pass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static cleancode.studycafe.tobe.model.pass.StudyCafePassType.FIXED;
import static cleancode.studycafe.tobe.model.pass.StudyCafePassType.HOURLY;
import static org.junit.jupiter.api.Assertions.*;

class StudyCafePassTypeTest {

    @DisplayName("사용자가 선택한 좌석 이용권이 사물함 이용이 가능한지 확인한다.")
    @Test
    void isLockerType() {

        // given
        StudyCafeSeatPass seatPassOne = StudyCafeSeatPass.of(HOURLY, 4, 6500, 0.0);
        StudyCafePassType seatPassOneType = seatPassOne.getPassType();

        StudyCafeSeatPass seatPassTwo = StudyCafeSeatPass.of(FIXED, 4, 250000, 0.1);
        StudyCafePassType seatPassTwoType = seatPassTwo.getPassType();

        // when
        Set<StudyCafePassType> LOCKER_TYPES = Set.of(FIXED);

        // then
        assertFalse(LOCKER_TYPES.contains(seatPassOneType));
        assertTrue(LOCKER_TYPES.contains(seatPassTwoType));
    }

}
