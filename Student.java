import java.util.*;

class Student {
	String index;
	String firstName;
	String lastName;

	//TODO constructor
	ArrayList<Integer> labPoints = new ArrayList<Integer>( );
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
		labPoints.insertLast(scanner.nextInt());
}
		public Student(String index) {
		this.index = index;
	}

	//TODO seters & getters

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getIndex() {
		return index;
	}

	public String getLastName() {
		return lastName;
	}

	public double getAverage() {
		//TODO
		return labPoints/5;
	}

	public boolean hasSignature() {
		//TODO

		if (labPoints.lenght >= 8)
			return true;
		else
			return false;

	}





}
