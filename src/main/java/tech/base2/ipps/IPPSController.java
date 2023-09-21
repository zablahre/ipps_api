package tech.base2.ipps;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IPPSController {
	@Autowired
	private IPPSService ippsService;

	@RequestMapping("/")
	public List<medpar> getAllLocations() {
		return ippsService.findAllAvailableLocations();
	}

    // Mapping to get cities for state 
	@RequestMapping("/{state}")
	public List<location> getLocations(@PathVariable String state) {
		return ippsService.findAllByState(state);
	}
	
	// Get medpar objects according to city and state chosen
	@RequestMapping("/{state}/{city}")
	public List<medpar> getQuiz(@PathVariable String state, @PathVariable String city) {
		return ippsService.findAllByStateAndCity(state, city);
	}

}
