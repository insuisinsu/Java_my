package Chap17.Ex05;

import java.util.ArrayList;

//

//DTO, VO : 각 계층간에 데이터를 받아서 전달해주는 클래스
class Member{
	private int memberid;
	private String memberName;
	
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

class MemberArrayList {		//MemberArrayList 를 객체화 하면 ArrayList 객체가 생성됨
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {	// 기본 생성자
		arrayList = new ArrayList<Member>();
	}

	public void addMember(Member member) {		//Member 객체를 받아서 맨마지막 방에 값을 추가하는 메소드 add
		arrayList.add(member);
	}
	public void addMember2(int a, Member member) {	//매개변수 2개를 받아서 특정 index 방 번호에 값 추가 add
		arrayList.add(a, member);
	}
	public boolean removeMember(int memberid) {	//ArrayList에 저장된 memberid 를 검색해서 해당 객체 삭제 remove(index)
		
		arrayList.remove(Member.valueOf(memberid));
		return false;
	}
	public void showAllMember () {	//ArrayList 에 저장된 모든 사용자 정보를 출력
		System.out.println(arrayList);
	}
}



public class Ex_MemberArrayList {

	public static void main(String[] args) {

		//객체 생성
		MemberArrayList memArrayList = new MemberArrayList();
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서원");
		Member memberHong = new Member(1004, "홍길동");
		Member memberKim = new Member(1005, "김김김");
		
		memArrayList.addMember(memberLee);		//각 개체를 생성해서 ArrayList 에 저장
		memArrayList.addMember(memberSon);
		memArrayList.addMember(memberPark);
		memArrayList.addMember(memberHong);
		
		//특정 index 방에 사용자 추가
		memArrayList.addMember2(3, memberKim);
		
		//모든 사용자 정보 출력
		memArrayList.showAllMember();
		
		//특정 id 를 가진 사용자 제거
		memArrayList.removeMember(1003);
		
		
		
		
		
		
		
		
		
	}

}
