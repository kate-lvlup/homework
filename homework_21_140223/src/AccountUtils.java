// Создать класс Account c полями firstName, lastName, country, birthday, balance,
// gender (и все сопутствующие методы необходимые для работы с классом)
//создать класс AccountUtils в котором будет реализована логика изменения акаунтов.
// Для примера лучше использовать 10+ акаунтов
//1) Создать метод который обрабатывает полученный список аккаунтов возвращая акаунты с балансом больше 1000
//2) Создать метод который обрабатывает полученный список аккаунтов возвращая список имя+фамилия в акаунтах,
// где страна Бразилия
//3) Создать метод который обрабатывает полученный список аккаунтов возвращая Optional<Account> с наибольшим балансом
//4) Создать метод который обрабатывает полученный список аккаунтов, принимая как параметр месяц рождения,
// метод должен вывести на екран всех пользователей с указанным месяцем рождения, ничего не возвращая
//5) Создать метод который обрабатывает полученный список аккаунтов, вернуть кол-во акаунтов с женским полом
//6) Создать метод который обрабатывает полученный список аккаунтов,
// вернуть общую сумму на счетах всех аккаунтов с фамилией "johnson"
//7) Создать метод который обрабатывает полученный список аккаунтов, вернуть отсортированный список пользователей,
// по фамилии, если фамилия совпадает то по имени
//8) Создать метод который обрабатывает полученный список аккаунтов, который возвращает сгруппированную коллекцию по странам
//9) Реализовать метод который принимает список списков акаунтов (List<List<Account>>)
// который считает кол-во акаунтов с возрастом 30+ лет.  В примере создать три разных списка акакунтов

import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AccountUtils {
    //Method1
    public static List<Account> returnListAccountsWithBalanceGreater1000(List<Account> accountList) {
        return accountList.stream()
                .filter(account -> account.getBalance() > 1000)
                .collect(Collectors.toList());
    }

    //Method2
    public static List<String> returnListFirstLastNameInBrazil(List<Account> accountList) {
        return accountList.stream()
                .filter(account -> account.getCountry().equals("Brazil"))
                .map(account -> account.getFirstName() + " + " + account.getLastName())
                .collect(Collectors.toList());
    }

    //Method3
    public static Optional<Account> returnOptionalAccountWithLargestBalance(List<Account> accountList) {
        return accountList.stream()
                .max((o1, o2) -> {
                    if (o1.getBalance() > o2.getBalance()) {
                        return 1;
                    } else if (o1.getBalance() < o2.getBalance()) {
                        return -1;
                    } else {
                        return 0;
                    }
                });
    }

    //Method4
    public static void returnAllUsersWithSpecMonthOfBirth(List<Account> accountList, int monthInt) {
        accountList = accountList.stream()
                .filter(new Predicate<Account>() {
                    @Override
                    public boolean test(Account account) {
                        return account.getBirthday().getMonthValue() == monthInt;
                    }
                }).collect(Collectors.toList());
        for (Account element : accountList) {
            System.out.println(element);
        }
    }

    //Method5
    public static long returnNumberOfAccountsWithFemaleGender(List<Account> accountList) {
        return accountList.stream()
                .filter(account -> account.getGender() == 'w')
                .count();
    }

    //Method6
    public static Double returnTotalAmountOnAccountsJohnson(List<Account> accountList) {
        return accountList.stream()
                .filter(account -> account.getLastName().equals("Johnson"))
                .map(account -> account.getBalance())
                .reduce(0.0, (double1, double2) -> double1 + double2);
    }

    //Method7
    public static List<Account> returnSortedListOfUsersByLastThenFirstName(List<Account> accountList) {
        return accountList.stream()
                .sorted(Comparator.comparing((Account account) -> account.getLastName()).thenComparing(account1 -> account1.getFirstName()))
                .collect(Collectors.toList());
    }

    //Method8
    public static void returnGroupedMapByCountry(List<Account> accountList) {
        Map<String, List<Account>> newGroupMap = new HashMap<>();
        newGroupMap = accountList.stream().collect(Collectors.groupingBy(account -> account.getCountry()));
        for (Map.Entry<String, List<Account>> element : newGroupMap.entrySet()) {
            System.out.println(element.getKey());
            for (Account account : element.getValue()) {
                System.out.println(account.getFirstName() + " " + account.getLastName() + " " + account.getBalance() + " " + account.getGender());
            }
            System.out.println();
        }
//        Another solution by teacher!!!
//        newGroupMap.entrySet()
//                .forEach(x -> System.out.println(x));
    }

    //Method9
    public static long returnNumberOfAccountsWithAgeAbove30Years(List<List<Account>> listOfListsOfAccounts) {
        return listOfListsOfAccounts.stream()
                .flatMap((Function<List<Account>, Stream<?>>) accountList -> accountList.stream().filter(account -> {
                    LocalDate localDate = LocalDate.now();
                    return localDate.getYear() - account.getBirthday().getYear() > 30;
                }))
                .count();
    }
}




