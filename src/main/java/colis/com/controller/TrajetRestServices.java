package colis.com.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import colis.com.dao.TrajetDao;
import colis.com.entities.personnes.Personnes;
import colis.com.entities.trajets.Trajet;

@RestController
@CrossOrigin("*") // pour gere les erreu d'ente  ex: Orig

public class TrajetRestServices {
	
	@Autowired // injection des depenses
	private TrajetDao trajetDao;

			@RequestMapping(value="/trajet", method=RequestMethod.POST)// elle nous permet d'avoir le resultat de cette requet par http
			public Trajet saveTrajet(@RequestBody Trajet t){
				return trajetDao.save(t);
			}
			@RequestMapping(value="/trajet/list", method=RequestMethod.GET)// elle nous permet d'avoir le resultat de cette requet par http
			public Trajet listTrajet(@RequestParam(name="idTrajet", defaultValue="")String idTrajet){
				return  trajetDao.findOne(Long.parseLong(idTrajet));
			}
			@RequestMapping(value="/trajet/all", method=RequestMethod.GET)// elle nous permet d'avoir le resultat de cette requet par http
			public List<Trajet> getPersonnes(){
				return trajetDao.findAll();
			}
}
