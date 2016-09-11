package cz.culture.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Created by jvalenta on 10.9.16.
 */

@Data
@Entity
@Table(name = "seat")
public class Seat {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "performance", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Visit> visits;

    @ManyToOne
    @JoinColumn(name = "row_id")
    private Row row;

}
