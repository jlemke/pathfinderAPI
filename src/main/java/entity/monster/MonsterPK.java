package entity.monster;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Primary key for Monster entity
 * Created by Joe on 5/22/2017.
 */
public class MonsterPK implements Serializable {

    private String monsterName;
    private String source;

    public MonsterPK() {}

    public MonsterPK(String monsterName, String source) {
        this.monsterName = monsterName;
        this.source = source;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MonsterPK)) return false;

        MonsterPK monsterPK = (MonsterPK) o;

        if (!monsterName.equals(monsterPK.monsterName)) return false;
        return source.equals(monsterPK.source);
    }

    @Override
    public int hashCode() {
        int result = monsterName.hashCode();
        result = 31 * result + source.hashCode();
        return result;
    }
}
