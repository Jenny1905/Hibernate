package com.tns.jpacrud.service;

import com.tns.jpacrud.entities.Student;

public interface StudentService 
{
	public abstract void addStudent(Student student);//create
	public abstract Student findStudentById(int id);//retrieve
	public abstract void updateStudent(Student student);//update
	public abstract void removeStudent(Student student);//delete

}
