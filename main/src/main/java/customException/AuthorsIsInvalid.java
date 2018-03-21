package customException;

public class AuthorsIsInvalid extends  Exception {
    public AuthorsIsInvalid(String message) {
        super(message);
    }
}
