package StudyJava;

public class Tree {
	private String name;
	private String color;
	public String getName() {
	return name;
	}
	public void setName(String name) {
		this.name=name;
		}
	public String getColor() {
		return color;
		}
	public void setColor(String color) {
		this.color= color;
		}
	public void treePrint() {
		System.out.println("나는 부모입니다.");
	}
	
	
			// instance == 클래스가 메모리에 올라간 상태
		    // 메모리에 올리는 과정 == 인스턴스화!!
			// 부모클래스 ==슈퍼클래스  자식클래스==자기자신
			// 
	

}
