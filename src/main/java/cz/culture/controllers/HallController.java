package cz.culture.controllers;

import cz.culture.entities.Hall;
import cz.culture.services.HallService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jvalenta on 11.9.16.
 */

@Slf4j
@Controller
@RequestMapping(value = "/hall/")
public class HallController {

    @Autowired
    HallService hallService;

    @RequestMapping(value = "{id}", produces = "application/json", method = RequestMethod.GET)
    @ResponseBody
    public Hall getHall(@PathVariable(value = "id") Long id) throws Exception {

        Hall hall = hallService.getHall(id);
        log.info("Nalezena scena: {}", hall);

        return hall;

    }

}
