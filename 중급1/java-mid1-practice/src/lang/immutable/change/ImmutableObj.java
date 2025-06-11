package lang.immutable.change;

public class ImmutableObj {
    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }
    public ImmutableObj add(int addValue) {
//        int result = value + addValue;
//        return new ImmutableObj(result);

        return new ImmutableObj(value + addValue);
    }

    public int getValue() {
        return value;
    }
}
