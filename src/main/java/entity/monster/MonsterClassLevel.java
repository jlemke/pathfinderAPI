package entity.monster;

import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.Table;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created by Joe on 5/22/2017.
 */
@Entity
@Table(name = "monster_class_levels")
public class MonsterClassLevel {

    private String className;

    @ManyToOne
    @JoinColumn(name = "monster_name")
    private Monster monster;
}
