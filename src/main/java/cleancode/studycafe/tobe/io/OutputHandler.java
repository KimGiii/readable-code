package cleancode.studycafe.tobe.io;

import cleancode.studycafe.tobe.model.order.StudyCafePassOrder;
import cleancode.studycafe.tobe.model.pass.StudyCafePassType;
import cleancode.studycafe.tobe.model.pass.StudyCafeSeatPass;
import cleancode.studycafe.tobe.model.pass.locker.StudyCafeLockerPass;
import cleancode.studycafe.tobe.model.pass.StudyCafePass;

import java.util.List;
import java.util.Optional;

import static java.lang.System.*;

public class OutputHandler {

    public void showWelcomeMessage() {
        out.println("*** 프리미엄 스터디카페 ***");
    }

    public void showAnnouncement() {
        out.println("* 사물함은 고정석 선택 시 이용 가능합니다. (추가 결제)");
        out.println("* !오픈 이벤트! 2주권 이상 결제 시 10% 할인, 12주권 결제 시 15% 할인! (결제 시 적용)");
        out.println();
    }

    public void askPassTypeSelection() {
        out.println("사용하실 이용권을 선택해 주세요.");
        out.println("1. 시간 이용권(자유석) | 2. 주단위 이용권(자유석) | 3. 1인 고정석");
    }

    public void showPassListForSelection(List<StudyCafeSeatPass> passes) {
        out.println();
        out.println("이용권 목록");
        for (int index = 0; index < passes.size(); index++) {
            StudyCafeSeatPass pass = passes.get(index);
            out.println(String.format("%s. ", index + 1) + display(pass));
        }
    }

    public void askLockerPass(StudyCafeLockerPass lockerPass) {
        out.println();
        String askMessage = String.format(
            "사물함을 이용하시겠습니까? (%s)",
            display(lockerPass)
        );

        out.println(askMessage);
        out.println("1. 예 | 2. 아니오");
    }

    // 사용자가 선택한 이용권의 총 금액을 계산
    public void showPassOrderSummary(StudyCafePassOrder passOrder) {
        StudyCafeSeatPass selectedPass = passOrder.getSeatPass();
        Optional<StudyCafeLockerPass> optionalLockerPass = passOrder.getLockerPass();

        out.println();
        out.println("이용 내역");
        out.println("이용권: " + display(selectedPass));

        optionalLockerPass.ifPresent(lockerPass ->
            out.println("사물함: " + display(lockerPass))
        );

        int discountPrice = passOrder.getDiscountPrice();
        if (discountPrice > 0) {
            out.println("이벤트 할인 금액: " + discountPrice + "원");
        }

        int totalPrice = passOrder.getTotalPrice();
        out.println("총 결제 금액: " + totalPrice + "원");
        out.println();
    }

    public void showSimpleMessage(String message) {
        out.println(message);
    }

    // StudyCafePass 에서 display 메서드 분리
    private String display(StudyCafePass pass) {
        StudyCafePassType passType = pass.getPassType();
        int duration = pass.getDuration();
        int price = pass.getPrice();

        if (passType == StudyCafePassType.HOURLY) {
            return String.format("%s시간권 - %d원", duration, price);
        }
        if (passType == StudyCafePassType.WEEKLY) {
            return String.format("%s주권 - %d원", duration, price);
        }
        if (passType == StudyCafePassType.FIXED) {
            return String.format("%s주권 - %d원", duration, price);
        }
        return "";
    }

}
