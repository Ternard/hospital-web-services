package com.hospital.dto;

import jakarta.validation.constraints.*;
import lombok.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PatientDTO {
    private Long id;

    @NotNull(message = "User ID is required")
    private Long userId;

    @NotNull(message = "Date of birth is required")
    @PastOrPresent(message = "Date of birth must be in the past")
    private LocalDate dateOfBirth;

    @NotNull(message = "Gender is required")
    private String gender;

    private String address;
    private String emergencyContact;
    private String emergencyContactPhone;
    private String bloodGroup;
    private String allergies;
    private String medicalHistory;

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
}