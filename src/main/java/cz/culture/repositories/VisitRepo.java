package cz.culture.repositories;

import cz.culture.entities.Performance;
import cz.culture.entities.Visit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by jvalenta on 11.9.16.
 */

public interface VisitRepo extends JpaRepository<Visit, Long> {

    @Query("select v from Visit v where v.performance=:performance")
    List<Visit> findByPerformance(@Param("performance") Performance performance);

}