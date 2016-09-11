package cz.culture.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Created by jvalenta on 10.9.16.
 */

@Data
@Entity
@Table(name = "sector")
public class Sector {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Integer number;

    @Column
    private String name;

    @OneToMany(mappedBy = "sector", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Row> rows;

    @ManyToOne
    @JoinColumn(name = "hall_id")
    private Hall hall;

}
