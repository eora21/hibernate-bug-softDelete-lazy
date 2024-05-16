package hibernate.bug.eora21.softdelete.noexception;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SoftDeleteLazyNoExceptionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoftDeleteLazyNoExceptionApplication.class, args);
    }

}
