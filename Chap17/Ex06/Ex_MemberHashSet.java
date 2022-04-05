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
	
	public Member(int memberid, String memberName) {	//�����ڸ� ���ؼ� �ʵ忡 �� �Ҵ�
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
		return memberName + " ȸ������ ���̵�� < "+memberid+" > �Դϴ�.\r\n";
	}
}

class MemberHashSet {		
	private Set<Member> hashSet;
	
	
	public void addMember(Member member) {		
		hashSet.add(member);
	}

//	public boolean removeMember(int memberid) {	
//		
////		arrayList.remove(Member.valueOf(memberid)); �̰� ����
//		
//		System.out.println(memberid+" �� �������� �ʽ��ϴ�.");
//		return false;
//	}
	public void showAllMember () {	//ArrayList �� ����� ��� ����� ������ ���
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
		
		
		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "�չα�");
		Member memberPark = new Member(1003, "�ڼ���");
		Member memberHong = new Member(1004, "ȫ�浿");
		Member memberLee2 = new Member(1001, "������");
		
		memHashSet.addMember(memberLee);
	
		
		memHashSet.showSize();
		
		
		//��� ����� ���� ���
		memHashSet.showAllMember();
		
		//Ư�� id �� ���� ����� ����
//		memHashSet.removeMember(1006);
		memHashSet.showSize();
//		memHashSet.removeMember(1003);
		memHashSet.showSize();
		
		
		
		
		
		
		
		
		
	}

}
