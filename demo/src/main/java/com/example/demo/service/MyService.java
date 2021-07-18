package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.input.UserInputDTO;
import com.example.demo.model.User;
import com.example.demo.output.OutputDTO;
import com.example.demo.repository.MyRepository;

@Service
public class MyService {

	@Autowired
	private MyRepository repository;
	
	
	public OutputDTO saveUser(UserInputDTO user)
	{
		User userToSave = User.builder()
				.name(user.getName())
				.email(user.getEmail())
				.build();
		return repository.save(userToSave).viewAsDTO();
	}
	
//	public DoctorOutputDTO save(DoctorInputDTO doctorInput) {
//		Doctor doctorToSave = Doctor.builder()
//				.imagePreviewUrl(doctorInput.getImagePreviewUrl())
//				.name(doctorInput.getName())
//				
//				.telephone(doctorInput.getTelephone())
//				.speciality(doctorInput.getSpeciality())
//				.email(doctorInput.getEmail())
//				.fee(doctorInput.getFee())
//				.consultationTime(doctorInput.getConsultationTime())
//				.build();
//
//		return repository.save(doctorToSave).viewAsDTO();
//	}
}
