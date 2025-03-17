package cleancode.studycafe.tobe.model.pass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static cleancode.studycafe.tobe.model.pass.StudyCafePassType.HOURLY;
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
        assertEquals(4000, price);
    }
  
}
