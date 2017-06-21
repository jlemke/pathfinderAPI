package entity.monster;

import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.Table;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created by Joe on 5/22/2017.
 */

public class MonsterClassLevel {

    private String className;
    private Monster monster;
}
