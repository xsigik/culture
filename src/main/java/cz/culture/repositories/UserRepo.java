package cz.culture.repositories;

import cz.culture.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jvalenta on 11.9.16.
 */

public interface UserRepo extends JpaRepository<User, Long> {

}