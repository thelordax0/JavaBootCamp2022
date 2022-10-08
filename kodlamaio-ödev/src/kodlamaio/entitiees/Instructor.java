package kodlamaio.entitiees;

import java.util.List;

public class Instructor {
	private int id;
	private String name;
	private List<Course> courses;
	private double rate;
	
	public Instructor(int id, String name, List<Course> courses, double rate) {
		super();
		this.id = id;
		this.name = name;
		this.courses = courses;
		this.rate = rate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	
	
	
	
}
