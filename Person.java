package designPatternBuilder;

import java.time.LocalDate;

public class Person {

	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private String addressOne;
	private String addressTwo;
	private String sex;
	private boolean driverLicence;
	private boolean married;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getAddressOne() {
		return addressOne;
	}

	public void setAddressOne(String addressOne) {
		this.addressOne = addressOne;
	}

	public String getAddressTwo() {
		return addressTwo;
	}

	public void setAddressTwo(String addressTwo) {
		this.addressTwo = addressTwo;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public boolean isDriverLicence() {
		return driverLicence;
	}

	public void setDriverLicence(boolean driverLicence) {
		this.driverLicence = driverLicence;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public PersonBuilder builder(String string1, String string2, String string3, String string4, LocalDate date,
			String string6, boolean b, boolean c) {
		// TODO Auto-generated method stub
		return new PersonBuilder();
	}

	public class PersonBuilder {
		private String firstName;
		private String lastName;
		private LocalDate birthDate;
		private String addressOne;
		private String addressTwo;
		private String sex;
		private boolean driverLicence;
		private boolean married;

		public PersonBuilder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public PersonBuilder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public PersonBuilder birthDate(LocalDate birthDate) {
			this.birthDate = birthDate;
			return this;
		}

		public PersonBuilder addressOne(String addressOne) {
			this.addressOne = addressOne;
			return this;
		}

		public PersonBuilder addressTwo(String addressTwo) {
			this.addressTwo = addressTwo;
			return this;
		}

		public PersonBuilder sex(String sex) {
			this.sex = sex;
			return this;
		}

		public PersonBuilder driverLicence(boolean driverLicence) {
			this.driverLicence = driverLicence;
			return this;
		}

		public PersonBuilder married(boolean married) {
			this.married = married;
			return this;
		}

		public Person build() {
			Person person = new Person();
			person.firstName = this.firstName;
			person.lastName = this.lastName;
			person.addressOne = this.addressOne;
			person.addressTwo = this.addressTwo;
			person.birthDate = this.birthDate;
			person.sex = this.sex;
			person.driverLicence = this.driverLicence;
			person.married = this.married;
			return person;
		}
	}
}