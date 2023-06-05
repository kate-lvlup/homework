package com.example.webexmaple1.controller.REST;

import com.example.webexmaple1.dao.imp.UserDaoImpl;
import com.example.webexmaple1.model.User;
import com.example.webexmaple1.model.command.UserCommand;
import com.example.webexmaple1.model.command.UserUpdateCommand;
import com.example.webexmaple1.util.UserCommandValidator;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Path("/")
public class UsersRESTServlet {
    private final UserDaoImpl userDao;

    public UsersRESTServlet() {
        userDao = new UserDaoImpl();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("users")
    public List<UserCommand> getAllUsers() {
        List<User> dbUsers = userDao.getAllUsers();
        List<UserCommand> usersCommand = UserCommand.usersToCommand(dbUsers);
        return usersCommand;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("users/{id}")
    public UserCommand getUserById(@PathParam("id") long id) {
        Optional<User> optional = userDao.getUserById(id);
        User user = optional.orElseThrow(() -> new RuntimeException("USER NOT FOUND"));
        return UserCommand.userToCommand(user);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("users")
    public Response createUser(User user) {
        try {
            userDao.createUser(user);
        } catch (Exception e) {
            return Response
                    .status(Response.Status.INTERNAL_SERVER_ERROR)
                    .entity(e.getCause().getMessage())
                    .build();
        }
        return Response
                .status(Response.Status.CREATED)
                .entity("User CREATED")
                .build();
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("users/{id}")
    public Response updateUser(@PathParam("id") long id, User user) {
        UserUpdateCommand userUpdateCommand = UserUpdateCommand.builder()
                .username(user.getUsername())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .date(user.getDate())
                .email(user.getEmail())
                .phoneNumber(user.getPhoneNumber())
                .address(user.getAddress())
                .build();

        Map<String, String> errors = UserCommandValidator.validateUserCommand(userUpdateCommand);

        List<User> users = userDao.findUsersByUserName(user.getUsername());
        if (users.size() > 0) {
            errors.put("username", "username already exists, must be unique");
        }


        if (!errors.isEmpty()) {
            return Response
                    .status(Response.Status.BAD_REQUEST)
                    .entity(errors)
                    .build();
        } else {
            userDao.updateUserById(id, userUpdateCommand);
            return Response
                    .status(Response.Status.ACCEPTED)
                    .entity("User UPDATED")
                    .build();
        }
    }


    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path("users/{id}")
    public Response deleteUserById(@PathParam("id") long id) {
        userDao.deleteUserById(id);
        return Response
                .status(Response.Status.ACCEPTED)
                .entity("User DELETED")
                .build();
    }

}
