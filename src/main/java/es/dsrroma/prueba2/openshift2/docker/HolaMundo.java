package es.dsrroma.prueba2.openshift2.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
public class HolaMundo {
	
	@GetMapping("/Hola")
	public ResponseEntity<String> getHelloDocker() {
	
	        return ResponseEntity.ok("Hola Mundo!!!");
	    
	}

}
