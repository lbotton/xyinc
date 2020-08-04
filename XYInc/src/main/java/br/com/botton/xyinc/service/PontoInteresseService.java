package br.com.botton.xyinc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.botton.xyinc.entity.PontoInteresse;
import br.com.botton.xyinc.repository.PontoInteresseRepository;

@Service
public class PontoInteresseService {

	@Autowired
	private PontoInteresseRepository repo;
	
	public List<PontoInteresse> findAll(){
		return repo.findAll();
	}
	
	public PontoInteresse save(PontoInteresse pontoInteresse) {
		return repo.save(pontoInteresse);
	}
	
	public List<PontoInteresse> find(Long x, Long y, Double max){
		return repo.findAllByDistance(x,y,max);
	}
	
}
