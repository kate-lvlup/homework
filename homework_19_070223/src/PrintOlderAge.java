public class PrintOlderAge implements People {
    @Override
    public boolean check(Person person) {
        return person.getAge() > 17;
    }
}
