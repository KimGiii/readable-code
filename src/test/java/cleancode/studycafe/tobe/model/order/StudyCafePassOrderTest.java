package cleancode.studycafe.tobe.model.order;

import cleancode.studycafe.tobe.model.pass.StudyCafePass;
import cleancode.studycafe.tobe.model.pass.StudyCafeSeatPass;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static cleancode.studycafe.tobe.model.pass.StudyCafePassType.FIXED;
import static org.junit.jupiter.api.Assertions.*;

class StudyCafePassOrderTest {

    @DisplayName("고정석을 선택했을 때, 할인된 가격을 출력한다")
    @Test
    void getDiscountPrice() {
        // given
        StudyCafeSeatPass seatPass = StudyCafeSeatPass.of(FIXED, 12, 700000,0.15);

        // when
        int discountPrice = seatPass.getDiscountPrice();

        // then
        assertEquals(105000, discountPrice);
    }

}
