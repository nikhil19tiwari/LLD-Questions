package in.nikhil.project.cache;

class StudentBuilder{
	int id;
	String name;
	int age;
    public StudentBuilder setId(int id) {
	this.id = id;
	return this;
    }
    public StudentBuilder setName(String name) {
    	this.name = name;
    	return this;
    }
    public StudentBuilder setAge(int age) {
    	this.age = age;
    	return this;
    }
    public Student build() {
    	return new Student(this);
    }
}

class Student{
	int id;
	String name;
	int age;
	Student(StudentBuilder builder){
		this.age = builder.age;
		this.name=builder.name;
		this.id=builder.id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
public class BuilderDesignPattern {
	public static void main(String []args) {
		Student sk = new StudentBuilder().setAge(21).setName("Komal").build();
		System.out.println(sk);
	}
}
