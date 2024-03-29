package hello.core.member;

import hello.core.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class MemberServiceTest {
    MemberService memberService;

    @BeforeEach
    public void beforeEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

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
