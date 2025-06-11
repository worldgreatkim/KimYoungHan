package lang.immutable.address;

public class ImmutableAddress {
    private final String value;  //사실 final을 안붙여도 setter만 넣지 않으면 똑같은 기능을 하지만 final을 붙임으로써 좀 더 명확하게 할 수 있다.

    public ImmutableAddress(String value) {
        this.value = value;

    }

    public String getValue() {
        return value;
    }


    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
