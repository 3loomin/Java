package hello.core.order;

import hello.core.AppConfig;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class OrderServiceTest {

    MemberService memberService;
    OrderService orderService;

    @BeforeEach
    public void beforeEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }

    @Test
    public void createOrder(){
        //given
        Long memeberId = 1L;
        Member member = new Member(memeberId, "memeberA", Grade.VIP);

        //when
        memberService.join(member);
        Order order = orderService.createOrder(memeberId, "ItemA", 10000);

        //then
        Assertions.assertThat(order.getDiscoundPrice()).isEqualTo(1000);
    }
}
