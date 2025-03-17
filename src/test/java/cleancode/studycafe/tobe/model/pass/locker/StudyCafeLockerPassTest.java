package cleancode.studycafe.tobe.model.pass.locker;

import cleancode.studycafe.tobe.model.pass.StudyCafePassType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static cleancode.studycafe.tobe.model.pass.StudyCafePassType.FIXED;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StudyCafeLockerPassTest {

    @DisplayName("사용자가 선택한 사물함 이용권의 기간을 확인한다.")
    @Test
    void isSameDuration() {
        // given
        StudyCafeLockerPass lockerPass = StudyCafeLockerPass.of(FIXED, 12, 30000);

        // when
        int lockerPassDuration = lockerPass.getDuration();

        // then
        assertThat(lockerPassDuration).isEqualTo(12);
    }

    @DisplayName("사용자가 선택한 좌석 이용권이 사물함이 사용 가능한 타입인지 확인한다.")
    @Test
    void isSameType() {
        // given
        StudyCafeLockerPass lockerPass = StudyCafeLockerPass.of(FIXED, 12, 30000);

        // when
        StudyCafePassType lockerPassType = lockerPass.getPassType();

        // then
        assertThat(lockerPassType).isEqualTo(FIXED);
    }

}
