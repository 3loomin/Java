package hello.core.order;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class OrderServiceTest {
    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

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
