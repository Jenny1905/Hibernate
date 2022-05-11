package com.tns.jpacrud.dao;

import javax.persistence.EntityManager;

import com.tns.jpacrud.entities.Student;

public class StudentDaoImpl implements StudentDao
{
	private EntityManager entityManager;

	public StudentDaoImpl() 
	{
		entityManager = JPAUtil.getEntityManager();
	}
	public void addStudent(Student student)
	{
		entityManager.persist(student);//create
	}
	public Student getStudentById(int id) 
	{
		Student student = entityManager.find(Student.class,id);
		return student;
	}
	public void updateStudent(Student student)
	{
		entityManager.merge(student);
	}
	public void removeStudent(Student student)
	{
		entityManager.remove(student);
	}
	public void commitTransaction()
	{
		entityManager.getTransaction().commit();
	}
	public void beginTransaction() 
	{
		entityManager.getTransaction().begin();
	}
	
	


}
