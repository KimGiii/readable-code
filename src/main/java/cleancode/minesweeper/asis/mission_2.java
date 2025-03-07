//package cleancode.minesweeper.asis;
//
//public class mission_2 {
//
//    public boolean validateOrder(Order order) {
//
//        if (checkOrder(order) != 0) {
//            if (checkOrderPrice(order) < 0) {
//                if (checkUserInfo(order)) {
//                    invalidateUserInfo();
//                    return false;
//                }
//                return true;
//            }
//            if (checkOrderPrice(order) <= 0) {
//                invalidateOrderPrice();
//                return false;
//            }
//        }
//        invalidateOrder();
//        return false;
//    }
//
//    private static void invalidateOrder() {
//        log.info("주문 항목이 없습니다.");
//    }
//
//    private static void invalidateOrderPrice() {
//        log.info("올바르지 않은 총 가격입니다.");
//    }
//
//    private static void invalidateUserInfo() {
//        log.info("사용자 정보가 없습니다.");
//    }
//
//    private static boolean checkUserInfo(Order order) {
//        return order.hasNoCustomerInfo();
//    }
//
//    private static double checkOrderPrice(Order order) {
//        return order.getTotalPrice();
//    }
//
//    private static double checkOrder(Order order) {
//        return order.getItems().size();
//    }
//}
