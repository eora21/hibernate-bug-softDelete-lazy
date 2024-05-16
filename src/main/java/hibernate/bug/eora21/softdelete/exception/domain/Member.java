package hibernate.bug.eora21.softdelete.exception.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import org.hibernate.annotations.SoftDelete;

@Entity
@SoftDelete
public class Member {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Team team;
}
