import java.util.*;

class Student {

	public static void main(String[] args){
	String index;
	String firstName;
	String lastName;
	SLL<Integer> labPoints = new SLL<Integer>();
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
		labPoints.insertLast(scanner.nextInt());
}

    public Student(String index) {
		this.index = index;
	}

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
		double suma = 0;
		SLLNode<Integer> tmp = labPoints.getFirst();
		while(tmp != null){
			suma = suma + tmp.element;
			tmp = tmp.succ; }
		double prosek = suma/labPoints.length();
	}

	public boolean hasSignature() {
        	boolean flag = false;
		if (labPoints.lenght() >= 8) {
			return flag = true;
		}
	}


}}
