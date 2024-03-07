package es.dsrroma.prueba2.openshift2;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
public class second {
	
	@GetMapping("/second")
	public ResponseEntity<String> getHelloDocker() {
	
	        return ResponseEntity.ok("Soy la segunda prueba puedo subir esto a github");
	    
	}

}