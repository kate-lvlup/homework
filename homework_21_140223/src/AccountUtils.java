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

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AccountUtils {
    //Method1
    public static List<Account> returnListAccountsWithBalanceGreater1000(List<Account> accountList) {
        List<Account> newAccountList = new ArrayList<>();
        accountList.stream()
                .filter(account -> account.getBalance() > 1000)
                .forEach(account -> newAccountList.add(account));
        return newAccountList;
    }

    //Method2
    public static List<String> returnListFirstLastNameInBrazil(List<Account> accountList) {
        List<String> newAccountList = new ArrayList<>();
        accountList.stream()
                .filter(account -> account.getCountry() == "Brazil")
                .map(account -> account.getFirstName() + " + " + account.getLastName())
                .forEach(s -> newAccountList.add(s));
        return newAccountList;
    }

    //Method3
    public static Optional<Account> returnOptionalAccountWithLargestBalance(List<Account> accountList) {
        Optional<Account> optional;
        return optional = accountList.stream()
                .sorted((o1, o2) -> {
                    if (o1.getBalance() > o2.getBalance()) {
                        return 1;
                    } else if (o1.getBalance() < o2.getBalance()) {
                        return -1;
                    } else {
                        return 0;
                    }
                })
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
        List<Account> newAccountList = new ArrayList<>();
        accountList.stream()
                .filter(account -> account.getBirthday().getMonth() + 1 == monthInt).forEach(account -> newAccountList.add(account));
        for (Account element : newAccountList) {
            System.out.println(element);
        }
    }

    //Method5
    public static int returnNumberOfAccountsWithFemaleGender(List<Account> accountList) {
        int count = 0;
        return count = (int) accountList.stream()
                .filter(account -> account.getGender() == 'w')
                .count();
    }

    //Method6
    public static Optional<Double> returnTotalAmountOnAccountsJohnson(List<Account> accountList) {
        Optional<Double> sum;
        return sum = accountList.stream()
                .filter(account -> account.getLastName() == "Johnson")
                .map(account -> account.getBalance())
                .reduce((double1, double2) -> double1 + double2);
    }

    //Method7
    public static List<Account> returnSortedListOfUsersByLastThenFirstName(List<Account> accountList) {
        List<Account> newAccountList = new ArrayList<>();
        accountList.stream()
                .sorted((o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName()))
                .sorted((o1, o2) -> o1.getLastName().compareTo(o2.getLastName()))
                .forEach(account -> newAccountList.add(account));
        return newAccountList;
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
    }

    //Method9
    public static int returnNumberOfAccountsWithAgeAbove30Years(List<List<Account>> listOfListsOfAccounts) {
        return (int) listOfListsOfAccounts.stream()
                .flatMap((Function<List<Account>, Stream<?>>) accountList -> accountList.stream().filter(account -> {
                    Date date = new Date();
                    return date.getYear() - account.getBirthday().getYear() > 30;
                }))
                .count();
    }

}




