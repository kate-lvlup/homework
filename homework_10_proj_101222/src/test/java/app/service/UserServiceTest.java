package app.service;

import app.User;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @Test
    void checkGettingListOfUsernames() {
        UserService userService = new UserService();
        List<User> usersList = createUsers();
        List<String> usersNameList = new ArrayList<>();
        for (User element : usersList) {
            String str = element.getUsername();
            if (str.equals("username")) {
                usersNameList.add(element.getUsername());
            }
        }

        List<String> userNameListByMethod = userService.getListOfUsernames(usersList);

        assertEquals(5, usersNameList.size());
        assertEquals(usersNameList.size(), userNameListByMethod.size());
    }

    @Test
    void checkGettingListOfUserWithLastNameStartWithChar() {
        UserService userService = new UserService();
        List<User> userList = createUsers();
        userList.add(createUser(111, "username" + 0, "First Name" + 0, "Sega" + 0,
                "someEmail@gmail.com1", LocalDate.of(1990, 11, 10), true, null));
        userList.add(createUser(112, "username" + 112, "First Name" + 112, "Saymon" + 112,
                "someEmail@gmail.com1", LocalDate.of(1990, 11, 10), true, null));

        List<User> filteredList = userService.getListOfUserWithLastNameStartWithChar(userList, 'S');

        assertEquals(2, filteredList.size());
        assertEquals(userList.size() - createUsers().size(), filteredList.size());
    }

    @Test
    void filterByMailEndingWithString() {
        UserService userService = new UserService();
        List<User> usersList = createUsers();
        usersList.add(createUser(111, "username" + 0, "First Name" + 0, "Last Name" + 0,
                "someEmail@gmail.com1", LocalDate.of(1990, 11, 10), true, null));
        usersList.add(createUser(112, "username" + 112, "First Name" + 112, "Last Name" + 112,
                "someEmail@gmail.com1", LocalDate.of(1990, 11, 10), true, null));

        List<User> filteredUsers = userService.filterByMailEndingWithString(usersList, ".com");

        assertEquals(7, usersList.size());
        assertEquals(5, filteredUsers.size());
        assertIterableEquals(createUsers(), filteredUsers);
    }

    private User createUser(int id, String userName, String firstName, String lastName, String email, LocalDate birthDate,
                            boolean isAvailable, String phoneNumber) {
        User user = new User();
        user.setId(id);
        user.setUsername(userName);
        user.setEmail(email);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setDate(birthDate);
        user.setAvailable(isAvailable);
        user.setPhoneNumber(phoneNumber);
        return user;
    }

    private List<User> createUsers() {
        User user;
        List<User> list = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            user = createUser(i, "username", "First Name", "Last Name" + i,
                    "test@email.com", LocalDate.of(1990 + i, i, 10 + i), true, null);
            list.add(user);
        }
        return list;
    }

    @Test
    void checkGettingListOfUserIsAvailable() {
        UserService userService = new UserService();
        List<User> userList = createUsers();
        userList.add(createUser(111, "username" + 0, "First Name" + 0, "Last Name" + 0,
                "someEmail@gmail.com1", LocalDate.of(1990, 11, 10), false, null));
        userList.add(createUser(112, "username" + 112, "First Name" + 112, "Last Name" + 112,
                "someEmail@gmail.com1", LocalDate.of(1990, 11, 10), false, null));

        List<User> filteredList = userService.getListOfUserIsAvailable(userList);

        assertEquals(5, createUsers().size());
        assertNotEquals(7, createUsers().size());
        assertEquals(5, filteredList.size());
        assertNotEquals(2, filteredList.size());
        assertIterableEquals(createUsers(), filteredList);
    }

    @Test
    void checkGettingSetOfUserWithPhoneNumber() {
        UserService userService = new UserService();
        List<User> userList = createUsers();
        userList.add(createUser(111, "username" + 0, "First Name" + 0, "Last Name" + 0,
                "someEmail@gmail.com1", LocalDate.of(1990, 11, 10), false, "+380931112233"));
        userList.add(createUser(112, "username" + 112, "First Name" + 112, "Last Name" + 112,
                "someEmail@gmail.com1", LocalDate.of(1990, 11, 10), false, "+380931112244"));
        userList.add(createUser(113, "username" + 113, "First Name" + 113, "Last Name" + 113,
                "someEmail@gmail.com1", LocalDate.of(1990, 11, 10), true, null));
        userList.add(createUser(114, "username" + 114, "First Name" + 114, "Last Name" + 114,
                "someEmail@gmail.com1", LocalDate.of(1990, 11, 10), true, ""));

        Set<User> filteredSet = userService.getSetOfUserWithPhoneNumber(userList);

        assertEquals(2, filteredSet.size());
        assertNotEquals(7, filteredSet.size());
        assertNotEquals(filteredSet.size(), userList.size());
    }

    @Test
    void checkPrintingGroupedUsers() {
        List<User> userList = createUsers();
        userList.add(createUser(111, "username" + 0, "First Name1", "Last Name" + 2,
                "someEmail@gmail.com1", LocalDate.of(1990, 11, 10), false, null));
        userList.add(createUser(112, "username" + 112, "First Name1", "Last Name" + 1,
                "someEmail@gmail.com1", LocalDate.of(1990, 11, 10), false, null));

        Map<String, List<User>> stringListMap = userList.stream()
                .collect(Collectors.groupingBy(user -> user.getFirstName()));
        Set<String> setOfFirstName = Set.of("First Name", "First Name1");

        assertFalse(stringListMap.isEmpty());
        assertEquals(setOfFirstName, stringListMap.keySet());
        for (Map.Entry<String, List<User>> element : stringListMap.entrySet()) {
            List<User> userList2 = element.getValue().stream()
                    .sorted((User user1, User user2) -> user1.getLastName().compareToIgnoreCase(user2.getLastName()))
                    .toList();
            int i = 1;
            int j = 0;
            for (User user : userList2) {
                assertEquals("Last Name" + i, userList2.get(j).getLastName());
                i++;
                j++;
            }
        }
    }

    @Test
    void checkGettingSortUserGroupedByPattern() {
        UserService userService = new UserService();
        List<User> userList = createUsers();
        userList.add(createUser(111, "username" + 0, "First Name", "Last Name" + 7,
                "someEmail@gmail.com1", LocalDate.of(1990, 11, 10), false, null));
        userList.add(createUser(112, "username" + 112, "First Name", "Last Name" + 6,
                "someEmail@gmail.com1", LocalDate.of(1990, 11, 10), false, null));
        userList.add(createUser(112, "username" + 112, "First Name1", "Last Name" + 6,
                "someEmail@gmail.com1", LocalDate.of(1990, 11, 10), false, null));

        List<User> filteredList = userService.getSortUserGroupedByPattern(userList, "First Name");

        assertEquals(7, filteredList.size());
        assertNotEquals(1, filteredList.size());
        int i = 0;
        int j = 1;
        for (User element : filteredList) {
            assertEquals("Last Name" + j, filteredList.get(i).getLastName());
            i++;
            j++;
        }
    }

    @Test
    void getEarliestDateUserInfo() {
        UserService userService = new UserService();
        List<User> userList = createUsers();
        userList.add(createUser(111, "username" + 0, "First Name", "Last Name" + 7,
                "someEmail@gmail.com1", LocalDate.of(1989, 11, 10), false, null));
        userList.add(createUser(112, "username" + 112, "First Name", "Last Name" + 6,
                "someEmail@gmail.com1", LocalDate.of(1999, 11, 10), false, null));
        userList.add(createUser(112, "username" + 112, "First Name1", "Last Name" + 6,
                "someEmail@gmail.com1", LocalDate.of(1990, 11, 10), false, null));
        Map<Integer, LocalDate> integerLocalDateMap = userService.getEarliestDateUserInfo(userList);
        Set<Integer> integerSet = Set.of(111);
        Map.Entry<Integer, LocalDate> integerLocalDateEntry = integerLocalDateMap.entrySet()
                .stream()
                .findAny()
                .get();

        assertEquals(integerSet, integerLocalDateMap.keySet());
        assertEquals(1989, integerLocalDateEntry.getValue().getYear());
        assertEquals(11, integerLocalDateEntry.getValue().getMonthValue());
        assertEquals(10,integerLocalDateEntry.getValue().getDayOfMonth());
    }

    @Test
    void getGropedUserByMonthWithExactYear() {
        UserService userService = new UserService();
        List<User> users = createUsers();
        users.add(createUser(111, "username" + 111, "First Name" + 111, "Last Name" + 111,
                "someEmail@gmail.com1", LocalDate.of(1992, 3, 21), true, null));
        users.add(createUser(112, "username" + 112, "First Name" + 112, "Last Name" + 112,
                "someEmail@gmail.com1", LocalDate.of(1992, 2, 10), true, null));

        Map<Month, List<User>> groupedByMonthUsers = userService.getGropedUserByMonthWithExactYear(users, LocalDate.of(1992, 12, 12));
        Set<Month> setOfMonths = Set.of(Month.FEBRUARY, Month.MARCH);
        Map.Entry<Month, List<User>> monthListEntry = groupedByMonthUsers.entrySet()
                .stream()
                .filter(entry -> entry.getKey() == Month.FEBRUARY)
                .findAny()
                .get();
        User userFormMonthList = monthListEntry.getValue().stream()
                .filter(user -> user.getId() == 112)
                .findAny()
                .get();

        assertEquals(setOfMonths, groupedByMonthUsers.keySet());
        assertFalse((groupedByMonthUsers.isEmpty()));
        assertEquals(2, monthListEntry.getValue().size());
        assertEquals("username112", userFormMonthList.getUsername());
    }
}