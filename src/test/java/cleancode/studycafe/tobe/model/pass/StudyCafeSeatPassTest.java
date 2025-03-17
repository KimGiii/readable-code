package cleancode.studycafe.tobe.model.pass;

import cleancode.studycafe.tobe.model.pass.locker.StudyCafeLockerPass;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static cleancode.studycafe.tobe.model.pass.StudyCafePassType.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StudyCafeSeatPassTest {

    @DisplayName("사용자가 이용권을 선택했을 때, 가격을 출력한다.")
    @Test
    void getPrice() {
        // given
        StudyCafeSeatPass seatPass = StudyCafeSeatPass.of(HOURLY, 2, 4000, 0.0);

        // when
        int price = seatPass.getPrice();

        // then
        assertThat(price).isEqualTo(4000);
    }

    @DisplayName("사용자가 선택한 사물함 이용권의 기간과 가격이 맞는지 확인한다.")
    @Test
    void isSameDurationType() {
        // given
        StudyCafeLockerPass lockerPass = StudyCafeLockerPass.of(FIXED, 4, 10000);

        // when
        boolean lockerPassDuration = lockerPass.isSameDuration(4);
        boolean lockerPassType = lockerPass.isSamePassType(FIXED);

        // then
        assertThat(lockerPassType && lockerPassDuration).isTrue();
    }
}
