package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	private UUID SectionID;
	private UUID StudentID;
	private UUID Enrollment;
	private double Grade;
	private Object EnrollmentID;
	
	private void Enrollment() {
		//Stub
	}

	public Enrollment(UUID StudentID, UUID SectionID) {
		this.StudentID = StudentID;
		this.SectionID = SectionID;
		this.EnrollmentID = EnrollmentID;
	}
	public void SetGrade(double grade) {
		this.Grade = grade;
		
		
	}

}
