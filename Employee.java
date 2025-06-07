package interview_programs;

//public class Employee implements Comparable<Employee> {
	public class Employee {

	private int id;
	private String name;

//	@Override
//	public int compareTo(Employee e) {
//		if (id == e.getId()) {
//			return 0;
//		} else if (id > e.getId()) {
//			return 1;
//		} else {
//			return -1;
//		}
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}
