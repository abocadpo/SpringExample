package com.abocado.spring.ex.jpa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abocado.spring.ex.jpa.domain.Student;
import com.abocado.spring.ex.jpa.repository.StudentRepository;


@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public Student addStudent(String name, String phoneNumber, String email, String dreamJob){
		
		Student student = Student.builder()
				.name(name)
				.phoneNumber(phoneNumber)
				.email(email)
				.dreamJob(dreamJob)		
				.build();
				
		student = studentRepository.save(student);
		return student;
	}
	
	public Student updateStudentDreamJob(int id, String dreamJob) {
		// update 대상이 되는 행을 조회한다.
		// 조회된 객체에서 필요한 멤버변수를 수정한다.
		// 해당 객체를 저장한다.
		
		// Optional<Student>
		// null일 수도 있는 객체를 리턴할때 사용하는 클래스
		Optional<Student> optionalStudent = studentRepository.findById(id);
		Student student = optionalStudent.orElse(null);
		
		if(student != null) {
			student = student.toBuilder()
			.dreamJob(dreamJob)
			.build();
			
			student = studentRepository.save(student);
		}
			
		return student;
	}	
	
	public void deleteStudent(int id) {
		// 삭제 대상의 객체를 얻어온다.
		// 객체를 기반으로 삭제한다.
//		Student student = studentRepository.findById(id).orElse(null);
//		
//		if(student != null) {
//			studentRepository.delete(student);
//		}
		
		Optional<Student> optionalStudent = studentRepository.findById(id);
		// 람다식 
		optionalStudent.ifPresent(student -> studentRepository.delete(student));
		
		
		
		
		
	}
	
	
	
}
