
public class ChildClass {

		public String name ;
		public String gender ;
		public int age ;
		public ChildClass() {
			System.out.println("ChildClass constructor");
		}
		public void setInfo(String name, String gender,int age) {
			System.out.println("----setInfo() START----");
			this.name = name;
			this.gender = gender;
			this.age = age;
		}
		public void getInfo() {
			System.out.println("----getInfo() START----");
			
			System.out.println("name :" +name);
			System.out.println("gender :" +gender);
			System.out.println("age :" +age);
		}
		private void mysecret() {
			System.out.println("This is my secret");
		}
	}


