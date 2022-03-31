package Chap17.Ex05;

import java.util.ArrayList;

//

//DTO, VO : �� �������� �����͸� �޾Ƽ� �������ִ� Ŭ����
class Member{
	private int memberid;
	private String memberName;
	
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

class MemberArrayList {		//MemberArrayList �� ��üȭ �ϸ� ArrayList ��ü�� ������
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {	// �⺻ ������
		arrayList = new ArrayList<Member>();
	}

	public void addMember(Member member) {		//Member ��ü�� �޾Ƽ� �Ǹ����� �濡 ���� �߰��ϴ� �޼ҵ� add
		arrayList.add(member);
	}
	public void addMember2(int a, Member member) {	//�Ű����� 2���� �޾Ƽ� Ư�� index �� ��ȣ�� �� �߰� add
		arrayList.add(a, member);
	}
	public boolean removeMember(int memberid) {	//ArrayList�� ����� memberid �� �˻��ؼ� �ش� ��ü ���� remove(index)
		
		arrayList.remove(Member.valueOf(memberid));
		return false;
	}
	public void showAllMember () {	//ArrayList �� ����� ��� ����� ������ ���
		System.out.println(arrayList);
	}
}



public class Ex_MemberArrayList {

	public static void main(String[] args) {

		//��ü ����
		MemberArrayList memArrayList = new MemberArrayList();
		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "�չα�");
		Member memberPark = new Member(1003, "�ڼ���");
		Member memberHong = new Member(1004, "ȫ�浿");
		Member memberKim = new Member(1005, "����");
		
		memArrayList.addMember(memberLee);		//�� ��ü�� �����ؼ� ArrayList �� ����
		memArrayList.addMember(memberSon);
		memArrayList.addMember(memberPark);
		memArrayList.addMember(memberHong);
		
		//Ư�� index �濡 ����� �߰�
		memArrayList.addMember2(3, memberKim);
		
		//��� ����� ���� ���
		memArrayList.showAllMember();
		
		//Ư�� id �� ���� ����� ����
		memArrayList.removeMember(1003);
		
		
		
		
		
		
		
		
		
	}

}
