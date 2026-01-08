public class Person implements Repkaitem {
    String name;
    String namePadezh;

    Person(String name, String namePadezh) {
        this.name = name;
        this.namePadezh = namePadezh;
    }

    public String pull(Person person) {
        return namePadezh + "for" + person.namePadezh;
    }

    public String getNamePadezh() {
        return namePadezh;
    }
}
