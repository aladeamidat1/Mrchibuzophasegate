package data.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AccessCode {
    private int id;
    private String code;
    private Visitor visitor;
    private Resident resident;
    private LocalDateTime createdOn = LocalDateTime.now();
    private LocalDateTime startTimeAndDate;

}
