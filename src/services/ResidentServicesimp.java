package services;

import data.models.Resident;
import data.repository.ResidentRepository;
import data.repository.Residents;
import dtos.requests.CreateResidentRequest;
import dtos.responses.CreateResidentResponse;

public class ResidentServicesimp implements ResidentServices {

    private ResidentRepository residentRepository = new Residents();
    @Override
    public CreateResidentResponse registerResident(CreateResidentRequest request) {
        validateCreateResidentRequest(request);
        Resident resident = new Resident();
        resident.setAddress(request.getAddress());
        resident.setEmail(request.getEmail());
        resident.setFullName(request.getFullName());
        resident.setPhone(request.getPhone());
        Resident savedResident = residentRepository.save(resident);
        CreateResidentResponse response = new CreateResidentResponse();
        response.setMessage("Resident created Successfully");
        return response;
    }

    public LoginResidentResponse login(LoginResidentRequest request) {
            Resident resident = residentRepository.findB(request.getEmail());
            boolean residentIsEmpty = resident == null;
            if (residentIsEmpty) throw new RuntimeException("User not found");

            boolean passwordIsNotFound = !resident.getPassword().equals(request.getPassword());
            if (passwordIsNotFound) throw new RuntimeException("Invalid password");

            return new LoginResidentResponse(resident.getId(), resident.getFullName(),
                    "Welcome back " + resident.getFullName() + "! Your ID is " + resident.getId()
            );
        }

        private void verifyIfEmailExist(String email){
            Resident emailExists = residentRepository.findByEmail(email);
            if(emailExists != null) throw new IllegalArgumentException("Email has already been used");
        }
        private void verifyPhoneNumber(String phoneNumber){
            Resident phoneExist = residentRepository.findByPhoneNumber(phoneNumber);
            if (phoneExist != null) throw new IllegalArgumentException("Phone number is already used");
        }
    }







