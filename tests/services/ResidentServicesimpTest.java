package services;

import dtos.requests.CreateResidentRequest;
import dtos.responses.CreateResidentResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ResidentServicesimpTest {

    ResidentServices residentService;
    @BeforeEach
    public void setUp() {
        residentService = new ResidentServicesimp();
    }

    @Test
    void testThatResidentCanBeRegistered() {
        CreateResidentRequest createResidentRequest = new CreateResidentRequest();
        createResidentRequest.setAddress("semicolon village is poor");
        createResidentRequest.setEmail("email@email.com");
        createResidentRequest.setFullName("Resident007");
        createResidentRequest.setPhone("123456789");

        CreateResidentResponse response = residentService.registerResident(createResidentRequest);
        assertNotNull(response);
    }
    @Test
    public void test_That_Resident_Cannot_Register_with_Invalid_Details() {
        CreateResidentRequest createResidentRequest = new CreateResidentRequest();
        createResidentRequest.setAddress("Amidat Alade");
        createResidentRequest.setEmail("12347372");
        createResidentRequest.setFullName("187321");
        createResidentRequest.setPhone("abcdesfg");

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            residentService.registerResident(createResidentRequest);
        });
        assertEquals("Invalid Details", exception.getMessage());
    }

}