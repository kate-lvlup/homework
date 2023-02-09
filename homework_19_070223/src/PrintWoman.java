public class PrintWoman implements People {
    @Override
    public boolean check(Person person) {
        return person.getGender() == 'w';
    }
}