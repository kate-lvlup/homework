package com.example.webexmaple1.model.command;

import com.example.webexmaple1.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class UserCommand {
    private int number;
    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private LocalDate date;
    private String email;
    private String phoneNumber;
    private String address;

    public static UserCommand userToCommand(User user) {
        return UserCommand.builder()
                .id(user.getId())
                .username(user.getUsername())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .phoneNumber(user.getPhoneNumber())
                .date(user.getDate())
                .address(user.getAddress())
                .build();
    }

    public static List<UserCommand> usersToCommand(List<User> users) {
        List<UserCommand> usersCommandList = new ArrayList<>();
        for (int i = 0; i < users.size(); i++) {
            UserCommand command = userToCommand(users.get(i));
            command.setNumber(1 + i);
            usersCommandList.add(command);
        }
        return usersCommandList;
    }

}
