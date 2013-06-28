package uk.co.adaptivelogic.poker.entity;

import org.hibernate.annotations.NaturalId;

import javax.annotation.Generated;
import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Project extends Versionable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
