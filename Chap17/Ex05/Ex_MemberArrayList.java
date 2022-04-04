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
		try {
			arrayList.add(a, member);
		}catch(IndexOutOfBoundsException e) {
			System.out.println("예외가 발생되었습니다. 방 번호를 정확하게 입력하세요.");
		}
	}
	public boolean removeMember(int memberid) {	//ArrayList에 저장된 memberid 를 검색해서 해당 객체 삭제 remove(index)
		
//		arrayList.remove(Member.valueOf(memberid)); 이건 망함
		for(int i = 0; i < arrayList.size();i++) {
			Member member = arrayList.get(i);	//각 방에 저장된 Member 객체를 member 참조변수에 할당
			int tempid = member.getMemberid();	//객체의 getMemberid() 는 객체 내부의 memberid
			if(memberid == tempid) {
				arrayList.remove(i);			//arrayList 방에 저장된 객체를 제거
												//arrayList.remove(memberid or tempid); 도 가능
				System.out.println("회원님의 "+memberid+" 는 삭제되었습니다.");
				return true;
			}
		}
		System.out.println(memberid+" 가 존재하지 않습니다.");
		return false;
	}
	public void showAllMember () {	//ArrayList 에 저장된 모든 사용자 정보를 출력
		System.out.println(arrayList);
		for (int i = 0; i <arrayList.size();i++) {
			System.out.println(arrayList.get(i));	//각 방의 Member 객체 자체를 출력
		}
	}
	public void showSize() {
		System.out.println(arrayList.size());
	}
	
}



public class Ex_MemberArrayList {

	public static void main(String[] args) {

		//객체 생성
		MemberArrayList memArrayList = new MemberArrayList();	
		//객체를 생성하는 순간 arrayList 필드가 활성화됨
		//메소드 호출하기 위해서 객체 생성
		//addMember(), addMember2(), removeMember(), showAllMember()
		
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서원");
		Member memberHong = new Member(1004, "홍길동");
		Member memberKim = new Member(1005, "김김김");
		
		memArrayList.addMember(memberLee);		//각 개체를 생성해서 ArrayList 에 저장
		memArrayList.addMember(memberSon);
		memArrayList.addMember(memberPark);
		memArrayList.addMember(memberHong);
		
		memArrayList.showSize();
		
		//특정 index 방에 사용자 추가
		memArrayList.addMember2(3, memberKim);
		memArrayList.showSize();
		memArrayList.addMember2(8, memberKim);
		
		//모든 사용자 정보 출력
		memArrayList.showAllMember();
		
		//특정 id 를 가진 사용자 제거
		memArrayList.removeMember(1006);
		memArrayList.showSize();
		memArrayList.removeMember(1003);
		memArrayList.showSize();
		
		
		
		
		
		
		
		
		
	}

}
