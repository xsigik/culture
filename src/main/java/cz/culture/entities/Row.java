package cz.culture.entities;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

/**
 * Created by jvalenta on 10.9.16.
 */

@Data
@Entity
@Table(name = "row")
@ToString(of={"id", "number"})
public class Row {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Integer number;

    @OneToMany(mappedBy = "row", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Seat> seats;

    @ManyToOne
    @JoinColumn(name = "sector_id")
    private Sector sector;

}
