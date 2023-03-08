package com.example.UserManagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="users")
public class User {
    @Id
    private Integer userId;
    private String username;
    private String dateOfBirth;
    private String  email;
    private String phoneNo;
    private LocalDate date;
    private LocalTime time;
}
