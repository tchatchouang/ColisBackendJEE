package colis.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import colis.com.dao.ColisDao;
import colis.com.entities.colis.Colis;

@RestController
@CrossOrigin("*") // pour gere les erreu d'ente  ex: Orig

public class ColisRestServices {
	
	@Autowired // injection des depenses
	private ColisDao colisDao;

			@RequestMapping(value="/colis", method=RequestMethod.POST)// elle nous permet d'avoir le resultat de cette requet par http
			public Colis saveColis(@RequestBody Colis c){
				return colisDao.save(c);
			}
}
