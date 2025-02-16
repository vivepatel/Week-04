package annotations.intermediateproblem.maxlength;
public class User {

    @MaxLength(value = 10)
    private String username;

    public User(String username) {
        if (username.length() > getMaxLength("username")) {
            throw new IllegalArgumentException("Username exceeds maximum length");
        }
        this.username = username;
    }

    private int getMaxLength(String fieldName) {
        try {
            return this.getClass().getDeclaredField(fieldName).getAnnotation(MaxLength.class).value();
        } catch (NoSuchFieldException e) {
            throw new RuntimeException("Field not found", e);
        }
    }

    public String getUsername() {
        return username;
    }
}
