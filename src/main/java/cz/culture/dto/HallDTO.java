package cz.culture.dto;

import cz.culture.entities.Building;
import cz.culture.entities.Sector;
import lombok.Data;

import java.util.List;

/**
 * Created by jvalenta on 11.9.16.
 */

@Data
public class HallDTO {

    private Long id;
    private String name;
    private List<Sector> sectors;
    private Building building;

}
