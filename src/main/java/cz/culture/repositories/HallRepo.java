package cz.culture.repositories;

import cz.culture.entities.Hall;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jvalenta on 11.9.16.
 */

public interface HallRepo extends JpaRepository<Hall, Long> {
}