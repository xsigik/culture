package cz.culture.repositories;

import cz.culture.entities.Building;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jvalenta on 11.9.16.
 */

public interface BuildingRepo extends JpaRepository<Building, Long> {

}