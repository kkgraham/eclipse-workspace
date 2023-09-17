package petApp;

public class Pet {
	String petType;
	String petName;
	int petAge;
	int dogSpaces;
	int catSpaces;
	int daysStay;
	double amountDue;

	public Pet(String petType, String petName, int petAge, int daysStay) {      // initializes pet info
		petType = "NoType";
		petName = "NoName";
		petAge = -1;
		daysStay = -1;
	}

	public String getPetType() {          // obtains petType
		return petType;
	}

	public void setPetType(String petType) {      // sets petType
		this.petType = petType;
	}

	public String getPetName() {       // obtains petName
		return petName;
	}

	public void setPetName(String petName) {       // sets petName
		this.petName = petName;
	}

	public int getPetAge() {       // obtains petAge
		return petAge;
	}

	public void setPetAge(int petAge) {          // set petAge
		this.petAge = petAge;
	}

	public int getDogSpaces() {        // obtain dogSpaces
		return dogSpaces;
	}

	public void setDogSpaces(int dogSpaces) {     // set dogSpaces
		this.dogSpaces = dogSpaces;
	}

	public int getCatSpaces() {         // obtain catSpaces
		return catSpaces;
	}

	public void setCatSpaces(int catSpaces) {       // set catSpaces
		this.catSpaces = catSpaces;
	}

	public int getDaysStay() {        // obtain daysStay
		return daysStay;
	}

	public void setDaysStay(int daysStay) {     // sets daysStay
		this.daysStay = daysStay;
	}

	public double getAmountDue() {         // getAmountDue
		return amountDue;
	}

	public void setAmountDue(double amountDue) {     // set amountDue
		this.amountDue = amountDue;
	}
	
	

}
