package m5;

class Monkey extends RescueAnimal {
	//Instance Variable
	private String Species;
	private String tailLength;
	private String height;
	private String bodyLength;
	
	//Constructor
	public Monkey(String name, String species, String gender, String age,
		    String weight, String acquisitionDate, String acquisitionCountry,
			String trainingStatus, boolean reserved, String inServiceCountry, String tailLength, String height,
			String bodyLength) {
		       	setName(name);
		        setSpecies(species);
		        setGender(gender);
		        setAge(age);
		        setWeight(weight);
		        setAcquisitionDate(acquisitionDate);
		        setAcquisitionLocation(acquisitionCountry);
		        setTrainingStatus(trainingStatus);
		        setReserved(reserved);
		        setInServiceCountry(inServiceCountry);
		        setTailLength(tailLength);
		        setHeight(height);
		        setBodyLength(bodyLength);        
	}

	//Mutators
	public void setTailLength(String tailLength) {
		this.tailLength = tailLength;
	}
	public void setSpecies(String species) {
		this.Species = species;
	}
	public void setBodyLength(String bodyLength) {
		this.bodyLength = bodyLength;
	}
	public void setHeight(String height) {
		this.height = height;
	}

	//Accessors
	public String getSpecies() {
		return Species;
	}
	public String getBodyLength() {
		return bodyLength;
	}
	public String getTailLength() {
		return tailLength;
	}
	public String getHeight() {
		return height;
	}
	@Override public String toString() {
    	return "Name: " + getName() + " Training Status: " + getTrainingStatus() + " Reservation Status: " + getReserved();
    }
}
