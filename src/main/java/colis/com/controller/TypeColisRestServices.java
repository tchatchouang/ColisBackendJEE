package colis.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import colis.com.dao.TypeColisDao;
import colis.com.entities.typeColis.TypeColis;


@RestController
@CrossOrigin("*") // pour gere les erreu d'ente  ex: Orig

public class TypeColisRestServices {
	
	@Autowired // injection des depenses
	private TypeColisDao typeColisDao;

			@RequestMapping(value="/colis/typeColis", method=RequestMethod.POST)// elle nous permet d'avoir le resultat de cette requet par http
			public TypeColis saveColisType(@RequestBody TypeColis tc){
				return typeColisDao.save(tc);
			}
}
