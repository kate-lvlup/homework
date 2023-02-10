public class PrintWoman implements Checkable {
    @Override
    public boolean check(Person person) {
        return person.getGender() == 'w';
    }
}