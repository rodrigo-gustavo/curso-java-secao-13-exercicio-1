package entities;

import java.util.Date;

public class HourContract {

	private Integer hours;
	private Date date;
	private Double valuePerHour;

	public HourContract() {
	}

	public HourContract(Integer hours, Date date, Double valuePerHour) {
		this.hours = hours;
		this.date = date;
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public double totalValue() {
		return valuePerHour * hours;
	}
}
