package domain;

public class Name {
    private static final int MAX_NAME_LENGTH = 5;

    private final String name;

    public Name(String value) {
        validate(value);
        name = value;
    }

    private void validate(String value) {
        if (value.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("이름은 최대 5글자 입니다.");
        }
        if (value.isBlank()) {
            throw new IllegalArgumentException("이름을 공백으로 생성할 수 없습니다.");
        }
    }
}
