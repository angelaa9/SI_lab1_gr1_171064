class Student {
	String index;
	String firstName;
	String lastName;

	//TODO constructor
	ArrayList<String> labPoints = new ArrayList<String>( );

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
	}

	public boolean hasSignature() {
		//TODO
	}
}
