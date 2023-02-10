public class PrintOlderAge implements Checkable {
    @Override
    public boolean check(Person person) {
        return person.getAge() > 17;
    }
}
