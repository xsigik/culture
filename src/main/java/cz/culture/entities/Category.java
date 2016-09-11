package cz.culture.entities;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

/**
 * Created by jvalenta on 10.9.16.
 */

@Data
@Entity
@Table(name = "category")
@ToString(of={"id", "name"})
public class Category {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

}
