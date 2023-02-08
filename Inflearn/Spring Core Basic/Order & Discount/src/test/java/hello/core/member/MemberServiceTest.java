package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MemberServiceTest {
    MemberService memberService = new MemberServiceImpl();

    @Test
    public void join(){
        //given 주어진것
        Member member = new Member(1L,"memberA",Grade.VIP);

        //when 이렇게 하면
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //then 어떻게 된다
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
