package cz.culture.controllers;

import cz.culture.dto.HallDTO;
import cz.culture.services.HallService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public HallDTO getHall(@PathVariable(value = "id") Long id) throws Exception {

        HallDTO dto = hallService.getHall(id);
        log.info("Nalezena hala: {}", dto);

        return dto;

    }

}
