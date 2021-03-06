package model;

import java.util.ArrayList;

public class SaleOrder {
	private int saleOrderID;
	private Employee employee;
	private ArrayList<SaleOrderLine> saleOrderLines;
	private Customer customer;
	private int paymentMethod;

	public SaleOrder(Employee employee) {
		this.employee = employee;
		saleOrderLines = new ArrayList<>();
		paymentMethod = 0;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public int getSaleOrderID() {
		return saleOrderID;
	}

	public void setSaleOrderID(int saleOrderID) {
		this.saleOrderID = saleOrderID;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(int paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public void addSaleOrderLine(SaleOrderLine saleOrderLine) {
		saleOrderLines.add(saleOrderLine);
	}

	public ArrayList<SaleOrderLine> getSaleOrderLines() {
		return saleOrderLines;
	}

	public void setSaleOrderLines(ArrayList<SaleOrderLine> saleOrderLines) {
		this.saleOrderLines = saleOrderLines;
	}
}
