package ch14;

public class Member {
    private int memberId;
    private String memberName;

    public Member(int memberId, String memberName){
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                '}';
    }

    //HashSet에서는 중복을 정의 내리기 위해 equals랑 hashcode를 override해줘야 한다!


    @Override
    public boolean equals(Object o) {
        if(o instanceof Member){
            Member member = (Member)o;
            if(this.memberId == member.memberId){
                return true;
            }
            else return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return memberId;
    }
}
