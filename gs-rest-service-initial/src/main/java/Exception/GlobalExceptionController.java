package Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionController {

    @ExceptionHandler(NoResultException.class)
    public ResponseEntity<ErrorResponse> handleException(NoResultException e) {
        ErrorResponse errorResponse = new ErrorResponse("record_not_found", e.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
    }
    
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Void> handleException(ResourceNotFoundException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
