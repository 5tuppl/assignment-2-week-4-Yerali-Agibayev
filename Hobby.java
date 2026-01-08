package common;
public class Hobby implements Desire, Dream {
    static int INDEX = 1;

    @Override
    public String toString() {
        INDEX += 2;
        return "" + INDEX;
    }
}
