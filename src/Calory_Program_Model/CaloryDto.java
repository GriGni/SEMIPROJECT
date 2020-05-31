package Calory_Program_Model;

public class CaloryDto {
	int idx, bkcal, lkcal, dkcal;
	String breakfast, lunch, dinner;
	int sumKcal = bkcal + lkcal + dkcal;
	
	public CaloryDto() {
		this(0,"",0,"",0, "", 0, 0);
	}

	public CaloryDto(int idx, String breakfast, int bkcal, String lunch, int lkcal, String dinner, int dkcal, int sumKcal) {
		this.idx=idx;
		this.breakfast=breakfast;
		this.bkcal=bkcal;
		this.lunch=lunch;
		this.lkcal=lkcal;
		this.dinner=dinner;
		this.dkcal=dkcal;
		this.sumKcal=sumKcal;
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
		return " | " + idx + " | " + breakfast + " | " + bkcal + "kcal | " + lunch + " | "
				+ lkcal + "kcal | " + dinner + " | " + dkcal + "kcal | The amount of Calroy is " + sumKcal + ". | ";
	}
	
	
	
	
}
