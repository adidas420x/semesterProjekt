package model;

public class Order {
	private int saleID;
	private Employee employee;
	
	public Order(int saleID, Employee employee) {
		this.saleID = saleID;
		this.employee = employee;
	}

	public int getSaleID() {
		return saleID;
	}

	public void setSaleID(int saleID) {
		this.saleID = saleID;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
