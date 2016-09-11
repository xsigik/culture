package cz.culture.entities;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by jvalenta on 10.9.16.
 */

@Data
@Entity
@Table(name = "visit")
public class Visit {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Date date;

    @Column
    private String note;

    @Column(precision = 10, scale = 2)
    private BigDecimal price = BigDecimal.ZERO;

    @ManyToOne
    @JoinColumn(name = "performance")
    private Performance performance;

    @ManyToOne
    @JoinColumn(name = "seat")
    private Seat seat;

    @ManyToOne
    @JoinColumn(name = "user")
    private User user;

}
