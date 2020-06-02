package Calory_Program_Model;

import java.util.ArrayList;

public class PeopleAndCaloryDao {
	ArrayList<PeopleAndCaloryDto> dtoList;
	private int seq = 1;

	public PeopleAndCaloryDao(ArrayList<PeopleAndCaloryDto> dtoList) {
		this.dtoList = dtoList;
		this.dtoList.add(new PeopleAndCaloryDto(seq++, "daniel", "man", "30", "010-2456-3333", "osan", "pizza", 800,
				"chicken", 900, "hamburger", 900, 2600));
		this.dtoList.add(new PeopleAndCaloryDto(seq++, "karen", "female", "28", "010-3552-6742", "seoul",
				"rice with side dish", 700, "ramen", 800, "curtlet", 700, 2200));
		this.dtoList.add(new PeopleAndCaloryDto(seq++, "nicolas", "man", "34", "010-2345-6624", "suwon", "salad", 500,
				"fruit", 400, "barbecue", 1000, 1900));
	}

	public void insert(PeopleAndCaloryDto dto) {
		dto.setIdx(seq++);
		System.out.println(dto);
		dtoList.add(dto);

	}

	public ArrayList<PeopleAndCaloryDto> selectAll() {
		ArrayList<PeopleAndCaloryDto> list = new ArrayList<PeopleAndCaloryDto>();
		for (int i = 0; i < dtoList.size(); i++) {
			PeopleAndCaloryDto dto = dtoList.get(i);
			int idx = dto.getIdx();
			String name = dto.getName();
			String sex = dto.getSex();
			String age = dto.getAge();
			String phone = dto.getPhone();
			String address = dto.getAddress();
			String breakfast = dto.getBreakfast();
			int bkcal = dto.getBkcal();
			String lunch = dto.getLunch();
			int lkcal = dto.getLkcal();
			String dinner = dto.getDinner();
			int dkcal = dto.getDkcal();
			int sumKcal = dto.getSumKcal();
			PeopleAndCaloryDto newDto = new PeopleAndCaloryDto(idx, name, sex, age, phone, address, breakfast, bkcal,
					lunch, lkcal, dinner, dkcal, sumKcal);
			list.add(newDto);
		}
		return list;
	}

	public ArrayList<PeopleAndCaloryDto> select(PeopleAndCaloryDto ODto) {
		ArrayList<PeopleAndCaloryDto> list = new ArrayList<PeopleAndCaloryDto>();
		for (int i = 0; i < dtoList.size(); i++) {
			String sName = ODto.getName();
			if (sName.equals(dtoList.get(i).getName())) {
				PeopleAndCaloryDto dto = dtoList.get(i);
				int idx = dto.getIdx();
				String name = dto.getName();
				String sex = dto.getSex();
				String age = dto.getAge();
				String phone = dto.getPhone();
				String address = dto.getAddress();
				String breakfast = dto.getBreakfast();
				int bkcal = dto.getBkcal();
				String lunch = dto.getLunch();
				int lkcal = dto.getLkcal();
				String dinner = dto.getDinner();
				int dkcal = dto.getDkcal();
				int sumKcal = dto.getSumKcal();
				PeopleAndCaloryDto newDto = new PeopleAndCaloryDto(idx, name, sex, age, phone, address, breakfast,
						bkcal, lunch, lkcal, dinner, dkcal, sumKcal);
				list.add(newDto);
			}

		}
		return list;
	}

	public ArrayList<PeopleAndCaloryDto> select2(PeopleAndCaloryDto ODto2) {
		ArrayList<PeopleAndCaloryDto> list = new ArrayList<PeopleAndCaloryDto>();
		for (int i = 0; i < dtoList.size(); i++) {
			String sPhone = ODto2.getPhone();
			if (sPhone.equals(dtoList.get(i).getPhone())) {
				PeopleAndCaloryDto dto = dtoList.get(i);
				int idx = dto.getIdx();
				String name = dto.getName();
				String sex = dto.getSex();
				String age = dto.getAge();
				String phone = dto.getPhone();
				String address = dto.getAddress();
				String breakfast = dto.getBreakfast();
				int bkcal = dto.getBkcal();
				String lunch = dto.getLunch();
				int lkcal = dto.getLkcal();
				String dinner = dto.getDinner();
				int dkcal = dto.getDkcal();
				int sumKcal = dto.getSumKcal();
				PeopleAndCaloryDto newDto = new PeopleAndCaloryDto(idx, name, sex, age, phone, address, breakfast,
						bkcal, lunch, lkcal, dinner, dkcal, sumKcal);
				list.add(newDto);
			}
		}
		return list;
	}

	public void update(PeopleAndCaloryDto dto) {
		for(int i = 0; i<dtoList.size();i++) {
			String sName = dto.getName();
			if (sName.equals(dtoList.get(i).getName() == sName)) {
				dtoList.set(i, dto);
				return;
			}
		}
	}

	//ÀÛ¾÷Áß.
	public ArrayList<PeopleAndCaloryDto> selectFullPeople(PeopleAndCaloryDto PigPeople) {
		ArrayList<PeopleAndCaloryDto> list = new ArrayList<PeopleAndCaloryDto>();
		for (int i = 0; i < dtoList.size(); i++) {
			PeopleAndCaloryDto dto = dtoList.get(i);
			int idx = dto.getIdx();
			String name = dto.getName();
			String sex = dto.getSex();
			String age = dto.getAge();
			String phone = dto.getPhone();
			String address = dto.getAddress();
			String breakfast = dto.getBreakfast();
			int bkcal = dto.getBkcal();
			String lunch = dto.getLunch();
			int lkcal = dto.getLkcal();
			String dinner = dto.getDinner();
			int dkcal = dto.getDkcal();
			int sumKcal = dto.getSumKcal();
			PeopleAndCaloryDto newDto = new PeopleAndCaloryDto(idx, name, sex, age, phone, address, breakfast, bkcal,
					lunch, lkcal, dinner, dkcal, sumKcal);
			list.add(newDto);
		}
		return list;
	}
}