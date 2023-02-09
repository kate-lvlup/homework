import java.util.ArrayList;
import java.util.List;

public class Personalities {
    public static void main(String[] args) {
        Person person1 = new Person(19, 'w', "Katy");
        Person person3 = new Person(25, 'm', "Alexey");
        Person person4 = new Person(12, 'm', "Dima");
        Person person2 = new Person(21, 'w', "Vika");
        Person person5 = new Person(20, 'm', "Yevgen");
        Person person6 = new Person(17, 'm', "Yegor");
        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        personList.add(person6);
        Personalities personalities = new Personalities();
        personalities.printWoman(personList);
        System.out.println();
        personalities.printOlderAge(personList, 17);
        System.out.println();
        personalities.printYoungerAgeMan(personList, 23);

        System.out.println("*****************************");
        personalities.printCheck(personList, new PrintWoman());
        System.out.println();
        personalities.printCheck(personList, new PrintOlderAge());
        System.out.println();
        personalities.printCheck(personList, new PrintYoungerAgeMan());

        System.out.println("*****************************");
        personalities.printCheck(personList, new People() {
            @Override
            public boolean check(Person person) {
                return person.getGender() == 'w';
            }
        });
        System.out.println();
        personalities.printCheck(personList, new People() {
            @Override
            public boolean check(Person person) {
                return person.getAge() > 17;
            }
        });
        System.out.println();
        personalities.printCheck(personList, new People() {
            @Override
            public boolean check(Person person) {
                return person.getAge() < 23 && person.getGender() == 'm';
            }
        });

        System.out.println("*****************************");
        personalities.printCheck(personList, person -> person.getGender() == 'w');
        System.out.println();
        personalities.printCheck(personList, person -> person.getAge() > 17);
        System.out.println();
        personalities.printCheck(personList, person -> person.getAge() < 23 && person.getGender() == 'm');
    }

    public void printWoman(List<Person> personList) {
        for (Person person : personList) {
            if (person.getGender() == 'w') {
                System.out.println(person);
            }
        }
    }

    public void printOlderAge(List<Person> personList, int age) {
        for (Person person : personList) {
            if (person.getAge() > age) {
                System.out.println(person);
            }
        }
    }

    public void printYoungerAgeMan(List<Person> personList, int age) {
        for (Person person : personList) {
            if (person.getAge() < age && person.getGender() == 'm') {
                System.out.println(person);
            }
        }
    }

    public void printCheck(List<Person> personList, People people) {
        for (Person person : personList) {
            if (people.check(person)) {
                System.out.println(person);
            }
        }
    }


}

