package br.com.botton.xyinc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.botton.xyinc.entity.PontoInteresse;

@Repository
public interface PontoInteresseRepository extends CrudRepository<PontoInteresse, Long>{

	public List<PontoInteresse> findAll();
	
	//Usual Euclides distances
	//https://cp-algorithms.com/geometry/nearest_points.html
	@Query("SELECT p FROM PontoInteresse p WHERE round(sqrt( power((p.x - :x), 2) + power((p.y - :y),2)), 2) <= :max")
	List<PontoInteresse> findAllByDistance(@Param("x") Long x, @Param("y") Long y, @Param("max") Double max);
	
}
