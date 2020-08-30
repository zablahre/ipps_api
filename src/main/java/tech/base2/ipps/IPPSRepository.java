package tech.base2.ipps;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface IPPSRepository extends CrudRepository<medpar, medpar.ippsId> {
	
	public List<medpar> findByStateAndCity(String state, String city);
	
	public List<location> findDistinctByState(String state);

}

interface location {
	String getState();
	String getCity();
}