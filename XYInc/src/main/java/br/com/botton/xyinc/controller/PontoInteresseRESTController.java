package br.com.botton.xyinc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.botton.xyinc.entity.PontoInteresse;
import br.com.botton.xyinc.service.PontoInteresseService;

@RestController
public class PontoInteresseRESTController {

	@Autowired
	private PontoInteresseService service;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	private List<PontoInteresse> listAll(){
		return service.findAll();
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public PontoInteresse save(@ModelAttribute PontoInteresse pontoInteresse) {
		return service.save(pontoInteresse);
	}
	
	@RequestMapping(value= "/find-closest", method = RequestMethod.POST)
	public List<PontoInteresse> find(@RequestParam(value = "x") Long x, 
			@RequestParam(value = "y") Long y, 
			@RequestParam(value = "max") Double max){
		List<PontoInteresse> result = service.find(x, y, max);

		return result;
	}
	
}
