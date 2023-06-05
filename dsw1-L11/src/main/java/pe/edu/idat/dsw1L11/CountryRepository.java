package pe.edu.idat.dsw1L11;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Country;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class CountryRepository {
	private static final Map<String, Country> countries = new HashMap<>();

	@PostConstruct
	public void initData() {
	 
		 

		Country pe = new Country();
		pe.setName("lunes");
        pe.setMONDAY("monday");
		countries.put(pe.getName(), pe);


		Country mar = new Country();
		mar.setName("martes");
        mar.setMONDAY("Tuesday");
		countries.put(mar.getName(), mar);

		Country mier = new Country();
		mier.setName("miercoles");
        mier.setMONDAY("Wednesday");
		countries.put(mier.getName(), mier);

		Country jue = new Country();
		jue.setName("jueves");
        jue.setMONDAY("Wednesday");
		countries.put(jue.getName(), jue);

		Country vie = new Country();
		vie.setName("viernes");
        vie.setMONDAY("Friday");
		countries.put(vie.getName(), vie);

		Country sab = new Country();
		sab.setName("sabado");
        sab.setMONDAY("saturday");
		countries.put(sab.getName(), sab);

		Country dom = new Country();
		dom.setName("domingo");
        dom.setMONDAY("sunday");
		countries.put(dom.getName(), dom);

		


	}

	public Country findCountry(String name) {
		Assert.notNull(name, "The country's name must not be null");
		return countries.get(name);
	}
}