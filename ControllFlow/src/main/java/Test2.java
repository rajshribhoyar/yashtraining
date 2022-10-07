import java.util.Objects;

class Student{
public Student() {
	// TODO Auto-generated constructor stub
}
	int Id;
	String Name;
	int Age;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", Name=" + Name + ", Age=" + Age + "]";
	}
	public Student(int id, String name, int age) {
		super();
		Id = id;
		Name = name;
		Age = age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Age, Id, Name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Age == other.Age && Id == other.Id && Objects.equals(Name, other.Name);
	}
	
	
}
public class Test2 {
	public static void main(String[] args) {
		Student s1=new Student(1,"Ram",5);
		Student s2 = new Student(1, "Ram", 5);
		Student s3 = new Student(1, "Sham", 4);
		Student s4 = new Student(1, "Sham", 4);
		
		
		/*
		 * if(s1.equals(s2)) {
		 * 
		 * System.out.println("Baccha Mil Gaya");
		 * 
		 * 
		 * }else System.out.println("Bachha Nahi Mila");
		 * 
		 *
		 */
		
		
	}
}
