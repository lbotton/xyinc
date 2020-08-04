package br.com.botton.xyinc.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.botton.xyinc.entity.PontoInteresse;

@Component
public class InitDb {
 
    @Autowired
    private PontoInteresseService pontoInteresseService;
    
    @PostConstruct
    private void postConstruct() {
        PontoInteresse p1 = new PontoInteresse("Lanchonete", Long.valueOf(27), Long.valueOf(12));
        pontoInteresseService.save(p1);
        
        PontoInteresse p2 = new PontoInteresse("Posto", Long.valueOf(31), Long.valueOf(18));
        pontoInteresseService.save(p2);
        
        PontoInteresse p3 = new PontoInteresse("Joalheria", Long.valueOf(15), Long.valueOf(12));
        pontoInteresseService.save(p3);
        
        PontoInteresse p4 = new PontoInteresse("Floricultura", Long.valueOf(19), Long.valueOf(21));
        pontoInteresseService.save(p4);
        
        PontoInteresse p5 = new PontoInteresse("Pub", Long.valueOf(12), Long.valueOf(8));
        pontoInteresseService.save(p5);
        
        PontoInteresse p6 = new PontoInteresse("Supermercado", Long.valueOf(23), Long.valueOf(6));
        pontoInteresseService.save(p6);
        
        PontoInteresse p7 = new PontoInteresse("Churrascaria", Long.valueOf(28), Long.valueOf(12));
        pontoInteresseService.save(p7);
        
    }
}