package cleancode.studycafe.tobe.model.pass;

// 이용권 하위에 좌석 이용권과 사물함 이용권이 존재한다는 도메인 발견 -> 추상화 레벨이 높은 설계 필요
// 이용권을 인터페이스로 분리한 이후, 좌석 이용권과 사물함 이용권으로 구체화
public interface StudyCafePass {

    StudyCafePassType getPassType();

    int getDuration();

    int getPrice();

}
