package cz.culture.repositories;

import cz.culture.entities.Performance;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jvalenta on 11.9.16.
 */

public interface PerformanceRepo extends JpaRepository<Performance, Long> {

}