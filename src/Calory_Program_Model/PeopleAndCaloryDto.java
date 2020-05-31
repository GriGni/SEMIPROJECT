package Calory_Program_Model;

public class PeopleAndCaloryDto {
	int idx, bkcal, lkcal, dkcal;
	String name, sex, age, phone, address, breakfast, lunch, dinner;
	int sumKcal = bkcal + lkcal + dkcal;
	
	
	public PeopleAndCaloryDto() {
		this(0,"","","","","","",0,"",0,"",0, 0);
	}
	
	public PeopleAndCaloryDto(int idx, String name, String sex, String age, String phone, String address,
			String breakfast, int bkcal, String lunch, int lkcal, String dinner, int dkcal, int sumKcal) {
		this.idx = idx;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.idx = idx;
		this.phone = phone;
		this.address = address;
		this.breakfast = breakfast;
		this.bkcal = bkcal;
		this.lunch = lunch;
		this.lkcal = lkcal;
		this.dinner = dinner;
		this.dkcal = dkcal;
		this.sumKcal = sumKcal;
		
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getBkcal() {
		return bkcal;
	}
	public void setBkcal(int bkcal) {
		this.bkcal = bkcal;
	}
	public int getLkcal() {
		return lkcal;
	}
	public void setLkcal(int lkcal) {
		this.lkcal = lkcal;
	}
	public int getDkcal() {
		return dkcal;
	}
	public void setDkcal(int dkcal) {
		this.dkcal = dkcal;
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
	public String getBreakfast() {
		return breakfast;
	}
	public void setBreakfast(String breakfast) {
		this.breakfast = breakfast;
	}
	public String getLunch() {
		return lunch;
	}
	public void setLunch(String lunch) {
		this.lunch = lunch;
	}
	public String getDinner() {
		return dinner;
	}
	public void setDinner(String dinner) {
		this.dinner = dinner;
	}
	public int getSumKcal() {
		return sumKcal;
	}
	public void setSumKcal(int sumKcal) {
		this.sumKcal = sumKcal;
	}
	@Override
	public String toString() {
		return  " | " + idx + " | " + name  + " | " + sex + " | " + age
				+ " | " + phone + " | " + address + " | " +"the amount of calory is " + sumKcal + "kcal" +  " | ";
	}

	

	
	
}
