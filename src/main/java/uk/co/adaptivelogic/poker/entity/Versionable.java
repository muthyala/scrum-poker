package uk.co.adaptivelogic.poker.entity;

import javax.persistence.Version;
import java.io.Serializable;

public abstract class Versionable implements Serializable {
    @Version
    private int version;

    public Integer getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
