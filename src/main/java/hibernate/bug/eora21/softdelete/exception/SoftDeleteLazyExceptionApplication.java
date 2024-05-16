package hibernate.bug.eora21.softdelete.exception;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SoftDeleteLazyExceptionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoftDeleteLazyExceptionApplication.class, args);
    }

}
