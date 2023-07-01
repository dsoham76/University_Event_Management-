package com.example.University.Event.Management.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="Student")
public class Student {
    @NotNull
    @Id
    private Integer studentId;
    @NotBlank
    private String first_name;
    @NotBlank
    private String last_name;
    @Max(25)@Min(18)
    private Integer age;
    @Enumerated(EnumType.STRING)
    private Department department;
}
