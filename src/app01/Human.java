package app01;

public class Human {
	public Human() {
		this.address = new Address();
		//super();
	}
	private String humanName;
	private int humanAge;
	private int humanHeight;
	private int humanWeight;

	private final Address address;
	
	public Human(String humanName,int humanAge,int humanHeight,int humanWeight) {
		this.address = new Address();
	//	super();
		this.humanName=humanName;
		this.humanAge=humanAge;
		this.humanHeight=humanHeight;
		this.humanWeight=humanWeight;
		// TODO Auto-generated constructor stub
	}
		
	public String getHumanName() {
		return humanName;
	}
	public void setHumanName(String humanName) {
		this.humanName = humanName;
	}
	public int getHumanAge() {
		return humanAge;
	}
	public void setHumanAge(int humanAge) {
		if(humanAge>0) {
			this.humanAge = humanAge;
		}else{
			System.out.println("Age is not Valid.");
		}

	}
	public int getHumanHeight() {
		return humanHeight;
	}
	public void setHumanHeight(int humanHeight) {
		if(humanHeight>30) {
			this.humanHeight = humanHeight;
		}else {
			System.out.println("Height is not valid.");
		}
		
	}
	public int getHumanWeight() {
		return humanWeight;
	}
	public void setHumanWeight(int humanWeight) {
		if(humanWeight>5) {
			this.humanWeight = humanWeight;
		}else {
			System.out.println("Weight is not valid");
		}
		
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address createAddressObj) {
		
	}

	public Address createAddressObj() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override //toString method
	public String toString() {
		return "Human [humanName=" + humanName + ", humanAge=" + humanAge + ", humanHeight=" + humanHeight
				+ ", humanWeight=" + humanWeight + ", address=" + address + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Human human=(Human) obj;
		if(this.humanAge == human.humanAge) {
			return true;
		}
	//	return super.equals(obj);
		return false;
	}
	
	

	
}
