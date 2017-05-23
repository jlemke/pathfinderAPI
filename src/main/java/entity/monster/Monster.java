package entity.monster;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Joe on 5/22/2017.
 */

@Entity
@Table(name = "monster", schema = "bestiarydb")
@IdClass(MonsterPK.class)
public class Monster {

    @Id
    @Column(name = "monster_name", nullable=false)
    private String monsterName;
    @Id
    @Column(name = "`source`")
    private String source;

    @Column(name = "visual_description")
    private String visualDescription;

    @Column(name = "challenge_rating")
    private double cr;

    @Column(name = "experience_points")
    private int xp;

    @Column(name = "race")
    private String race;

    @OneToMany(mappedBy = "monster")
    private List<MonsterClassLevel> monsterClassLevels;

    @Column(name = "")
    private
}
