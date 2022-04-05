package Chap17.Ex06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

class Member{
	private int memberid;
	private String memberName;
	
	@Override
	public boolean equals(Object obj) {		
		if(obj instanceof Member) {				
			this.memberid = ((Member)obj).memberid;
			this.memberName = ((Member)obj).memberName;
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {				
		return Objects.hash(memberid, memberName);		
	}
	
	public Member(int memberid, String memberName) {	//생성자를 통해서 필드에 값 할당
		this.memberid = memberid;
		this.memberName = memberName;
	}

	public int getMemberid() {
		return memberid;
	}

	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 < "+memberid+" > 입니다.\r\n";
	}
}

class MemberHashSet {		
	private Set<Member> hashSet;
	
	
	public void addMember(Member member) {		
		hashSet.add(member);
	}

//	public boolean removeMember(int memberid) {	
//		
////		arrayList.remove(Member.valueOf(memberid)); 이건 망함
//		
//		System.out.println(memberid+" 가 존재하지 않습니다.");
//		return false;
//	}
	public void showAllMember () {	//ArrayList 에 저장된 모든 사용자 정보를 출력
		System.out.println(hashSet);
		Iterator<Member> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+"  ");
		}System.out.println();

	}
	public void showSize() {
		System.out.println(hashSet.size());
	}
	
}



public class Ex_MemberHashSet {

	public static void main(String[] args) {

		
		MemberHashSet memHashSet = new MemberHashSet();	
		
		
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서원");
		Member memberHong = new Member(1004, "홍길동");
		Member memberLee2 = new Member(1001, "이지원");
		
		memHashSet.addMember(memberLee);
	
		
		memHashSet.showSize();
		
		
		//모든 사용자 정보 출력
		memHashSet.showAllMember();
		
		//특정 id 를 가진 사용자 제거
//		memHashSet.removeMember(1006);
		memHashSet.showSize();
//		memHashSet.removeMember(1003);
		memHashSet.showSize();
		
		
		
		
		
		
		
		
		
	}

}
