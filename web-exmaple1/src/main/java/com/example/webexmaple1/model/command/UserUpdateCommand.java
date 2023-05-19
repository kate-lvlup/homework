package com.example.webexmaple1.model.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class UserUpdateCommand {
    private String username;
    private String firstName;
    private String lastName;
    private LocalDate date;
    private String email;
    private String phoneNumber;
    private String address;
}
