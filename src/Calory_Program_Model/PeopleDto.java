package Calory_Program_Model;

public class PeopleDto {
	int idx;
	String name, sex, age, phone, address;
	
	public PeopleDto() {
		this(0, "","","","","");
	}

	public PeopleDto(int idx, String name, String sex, String age, String phone, String address) {
		this.idx = idx;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return " | " + idx + " | " + name + " | " + sex + " | " + age + " | " + phone
				+ " | " + address +" | ";
	}
	
	
	
}
