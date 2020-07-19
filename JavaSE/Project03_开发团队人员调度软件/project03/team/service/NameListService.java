package project03.team.service;

import java.util.Arrays;
import static project03.team.service.Data.*;

import project03.team.bean.Architect;
import project03.team.bean.Designer;
import project03.team.bean.Employee;
import project03.team.bean.Equipment;
import project03.team.bean.NoteBook;
import project03.team.bean.PC;
import project03.team.bean.Printer;
import project03.team.bean.Programmer;

public class NameListService {
	private Employee[] employees;
	
	public NameListService() {
		init();
	}
	
	private void init() {
		employees = new Employee[EMPLOYEES.length];
		for(int i=0;i<employees.length;i++) {
			int empType = Integer.parseInt(EMPLOYEES[i][0]);
			int id = Integer.parseInt(EMPLOYEES[i][1]);
			String name = EMPLOYEES[i][2];
			int age = Integer.parseInt(EMPLOYEES[i][3]);
			double salary = Double.parseDouble(EMPLOYEES[i][4]);
			
			switch(empType) {
			case EMPLOYEE:
				employees[i] = new Employee(id, name, age, salary);
				break;
			case PROGRAMMER:
				Equipment equipment = getLineNumber(i);
				employees[i] = new Programmer(id, name, age, salary, equipment);	
				break;
			case DESIGNER:
				double bonus = Double.parseDouble(EMPLOYEES[i][5]);
				equipment = getLineNumber(i);
				employees[i] = new Designer(id, name, age, salary, equipment, bonus);
				break;
			case ARCHITECT:
				bonus = Double.parseDouble(EMPLOYEES[i][5]);
				equipment = getLineNumber(i);
				int stock = Integer.parseInt(EMPLOYEES[i][6]);
				employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
				break;
			}
		}
		
	}
	
	private Equipment getLineNumber(int i) {
		int equipType = Integer.parseInt(EQUIPMENTS[i][0]);
		switch(equipType) {
		case PC:
			return new PC(EQUIPMENTS[i][1],EQUIPMENTS[i][2]);
		case NOTEBOOK:
			double price = Double.parseDouble(EQUIPMENTS[i][2]);
			return new NoteBook(EQUIPMENTS[i][1], price);
		case PRINTER:
			return new Printer(EQUIPMENTS[i][1],EQUIPMENTS[i][2]);
		}
		return null;
	}
	
	public Employee[] getAllEmployees() {
//		return employees;
		return Arrays.copyOf(employees, employees.length);	
	}
	
	public Employee getEmployee(int id) throws TeamException {
		for(int i=0;i<employees.length;i++) {
			if(employees[i].getId() == id) {
				return employees[i];
			}
		}
		throw new TeamException("编号为：" + id + "的员工不存在");
	}
	
}
