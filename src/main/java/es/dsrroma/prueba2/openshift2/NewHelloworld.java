
package es.dsrroma.prueba2.openshift2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
public class NewHelloworld {
	
	@GetMapping("/new")
	public ResponseEntity<String> getHelloDocker() {
	
		String mensajeHtml = "<html>"
                + "<head>"
                + "<style>"
                + "body { display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0; }"
                + "#parpadeo { font-size: 200px; font-weight: bold; animation: cambioColor 1s infinite; }"
                + "@keyframes cambioColor { "
                + "  0% { color: black; }"
                + "  25% { color: red; }"
                + "  50% { color: green; }"
                + "  75% { color: blue; }"
                + "  100% { color: black; }"
                + "}"
                + "</style>"
                + "</head>"
                + "<body>"
                + "<div id='parpadeo'>Hola Mundo!!!</div>"
                + "</body>"
                + "</html>";
        return ResponseEntity.ok(mensajeHtml);
	}
}
