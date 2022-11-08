package ch10;

public class MemberArrayListTest {
     public static void main(String[] args){
        MemberArrayList arrayList = new MemberArrayList();

        Member mem1 = new Member(1001,"David");
        Member mem2 = new Member(1002,"John");
        Member mem3 = new Member(1003,"Tom");
        Member mem4 = new Member(1004,"Daniel");

        arrayList.addMember(mem1);
        arrayList.addMember(mem2);
        arrayList.addMember(mem3);
        arrayList.addMember(mem4);

        arrayList.showAllMember();
        arrayList.removeMember(mem1.getMemberId());
         arrayList.showAllMember();
    }
}
