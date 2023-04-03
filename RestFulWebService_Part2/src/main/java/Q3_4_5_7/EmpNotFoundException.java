package Q3_4_5_7;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class EmpNotFoundException extends RuntimeException {
    public EmpNotFoundException(String s) {
        super(s);
    }
}
