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
@Table(name = "hall")
@ToString(of={"id", "name"})
public class Hall {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "hall", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Sector> sectors;

    @ManyToOne
    @JoinColumn(name = "building_id")
    private Building building;

}
