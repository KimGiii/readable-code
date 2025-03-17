package cleancode.studycafe.tobe.model.order;

import cleancode.studycafe.tobe.model.pass.StudyCafeSeatPass;
import cleancode.studycafe.tobe.model.pass.locker.StudyCafeLockerPass;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static cleancode.studycafe.tobe.model.pass.StudyCafePassType.FIXED;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StudyCafePassOrderTest {

    @DisplayName("좌석을 선택했을 때, 사용자가 할인받은 가격을 출력한다.")
    @Test
    void getDiscountPrice() {
        // given
        StudyCafeSeatPass seatPass = StudyCafeSeatPass.of(FIXED, 12, 700000,0.15);

        // when
        int discountPrice = seatPass.getDiscountPrice();

        // then
        assertThat(discountPrice).isEqualTo(seatPass.getDiscountPrice());
    }

    @DisplayName("좌석을 선택했을 때, 사용자가 내야하는 총 금액을 출력한다.")
    @Test
    void getTotalPrice() {
        // given
        StudyCafeSeatPass seatPass = StudyCafeSeatPass.of(FIXED, 12, 700000,0.15);
        StudyCafeLockerPass lockerPass = StudyCafeLockerPass.of(FIXED, 12, 700000);
        StudyCafePassOrder passOrder = StudyCafePassOrder.of(seatPass, lockerPass);

        // when
        int lockerPassPrice = lockerPass.getPrice();
        int seatPassPrice = seatPass.getPrice() - seatPass.getDiscountPrice();
        int totalPrice = seatPassPrice + lockerPassPrice;

        // then
        assertThat(totalPrice).isEqualTo(passOrder.getTotalPrice());
    }
}
