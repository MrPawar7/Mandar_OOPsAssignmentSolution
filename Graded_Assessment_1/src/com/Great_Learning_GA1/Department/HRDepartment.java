package com.Great_Learning_GA1.Department;

public class HRDepartment extends SuperDepartment {

	public String departmentName() {
		return " HR Department ";
	}

	public String getTodaysWork() {
		return " Fill today’s timesheet and mark your attendance";
	}

	public String getWorkDeadline() {
		return " Complete by EOD ";
	}

	public String doActivity() {
		return "Team Lunch";
	}
}
