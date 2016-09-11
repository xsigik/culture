package cz.culture.services;

import cz.culture.dto.HallDTO;
import cz.culture.entities.Hall;
import cz.culture.repositories.HallRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jvalenta on 11.9.16.
 */

@Service
@Slf4j
public class HallService {

    @Autowired
    HallRepo hallRepo;

    @Transactional
    public HallDTO getHall(Long id) {

        Hall hall = hallRepo.findOne(id);

        HallDTO dto = new HallDTO();
        dto.setId(hall.getId());
        dto.setName(hall.getName());
        dto.setSectors(hall.getSectors());
        dto.setBuilding(hall.getBuilding());

        return dto;
    }

}
