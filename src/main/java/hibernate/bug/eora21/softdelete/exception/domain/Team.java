package hibernate.bug.eora21.softdelete.exception.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.hibernate.annotations.SoftDelete;

@Entity
@SoftDelete
public class Team {

    @Id
    @GeneratedValue
    private Long id;
}
