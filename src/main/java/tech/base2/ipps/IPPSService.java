package tech.base2.ipps;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IPPSService {
	
	@Autowired
	private IPPSRepository ippsRepository;
	
	public List<location> findAllByState(String state) {
		return ippsRepository.findDistinctByState(state);
	}
	
	public List<medpar> findAllByStateAndCity(String state, String city) {
		return ippsRepository.findByStateAndCity(state, city);
	}

	public List<medpar> findAllAvailableLocations() {
		return ippsRepository.findAll();
	}
}
