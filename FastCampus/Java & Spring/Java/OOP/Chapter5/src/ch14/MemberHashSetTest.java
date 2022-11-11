package ch14;

public class MemberHashSetTest {
     public static void main(String[] args){
        MemberHashSet memberHashSet = new MemberHashSet();

        Member mem1 = new Member(1001,"David");
        Member mem2 = new Member(1002,"John");
        Member mem3 = new Member(1003,"Tom");
        //Member mem4 = new Member(1004,"Daniel");
         Member mem4 = new Member(1003,"Daniel");

         memberHashSet.addMember(mem1);
         memberHashSet.addMember(mem2);
         memberHashSet.addMember(mem3);
         memberHashSet.addMember(mem4);

         memberHashSet.showAllMember();
         memberHashSet.removeMember(mem1.getMemberId());
         memberHashSet.showAllMember();
    }
}
