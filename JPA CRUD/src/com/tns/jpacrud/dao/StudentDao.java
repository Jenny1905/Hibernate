package com.tns.jpacrud.dao;

import com.tns.jpacrud.entities.Student;

public interface StudentDao
{
	public abstract void addStudent(Student student);//create
	public abstract Student getStudentById(int id);//retrieve
	public abstract void updateStudent(Student student);//update
	public abstract void removeStudent(Student student);//delete
	public abstract void commitTransaction();
	public abstract void beginTransaction();

}
