package services;

import dtos.requests.CreateResidentRequest;
import dtos.responses.CreateResidentResponse;

public interface ResidentServices {

    CreateResidentResponse registerResident(CreateResidentRequest createResidentRequest);
}
