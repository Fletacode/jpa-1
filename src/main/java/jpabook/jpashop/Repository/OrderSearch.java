package jpabook.jpashop.Repository;


import jpabook.jpashop.domain.OrderStatus;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Repository;

@Getter @Setter
public class OrderSearch {

    private String memberName; //회원 이름
    private OrderStatus orderStatus; //주문 상태 ORDER , CANCEL


}
