package objectEx;



public class Member {
	public static void main(String[] args) {
		
		Member mem1 = new Member("id");
		System.out.println("===========================");
		
		/**
		 * hashCode()
		 * 
		 * 객체를 식별하는 하나의 정수값
		 * Object클래스의 객체 해시코드 메소드 객체 메모리 번지를 이용하여 
		 * 해시코드를 만들어 리턴한다.
		 * ==>>>객체마다 다른값을 가진다.
		 *두 객체가 동등한지 비교하는데 사용된다. 
		 */
		Object obj = new Object();
		obj.equals(new String("안녕"));
		
		String str = Integer.toHexString(mem1.hashCode());
		System.out.println("mem1 hashCode :"+mem1.hashCode());
		System.out.println("hashCode 16진수로변환 :"+str);
		System.out.println("mem1 toString :"+mem1.toString());
		System.out.println("===========================");
		
		Member mem2 = new Member("id");
		
		System.out.println("===========================");
		System.out.println("mem2 hashCode :"+mem2.hashCode());
		System.out.println("mem2 toString :"+mem2.toString());
		System.out.println("===========================");
		
		System.out.println("mem1.equals(mem2): ");
		System.out.println(mem1.equals(mem2));
		
	}
	private String id;
	
	public Member(String id) {
		this.id=id;
		
	}
	
	@Override
	/**
	 * Member 객체가 가지고 있는 id(this.id) 값과
	 * 매개변수로 받은 Object의 id값이 일치 하는지 비교
	 */
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			System.out.println("obj.equals결과 : "+super.equals(obj));;
			System.out.println("Member.equals결과 : ");
			
			if(getId().equals(member.id)){
				return true;
			}else {
				return false;
			}
		
			
		}
		
		
		//객체가 가지고 있는 id값이 같다면 true 리턴
		
		return false;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
