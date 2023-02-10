public class PrintYoungerAgeMan implements Checkable {

    @Override
    public boolean check(Person person) {
        return person.getAge() < 23 && person.getGender() == 'm';
    }
}
