package ul.programacionVII.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ul.programacionVII.Entidades.ContenidoEntidad;
import ul.programacionVII.Servicios.ContenidoServicio;

@Controller
public class Controlador {
	
	private final ContenidoServicio contenidoServicio;
	
	public Controlador(ContenidoServicio contenidoServicio) {
		this.contenidoServicio = contenidoServicio;
	}
	

	@GetMapping("/")
	public String Home(Model model) {
		List<ContenidoEntidad> destacados = contenidoServicio.getPorCategoria("destacados");
		List<ContenidoEntidad> noticias = contenidoServicio.getPorCategoria("noticias");
		List<ContenidoEntidad> eventos = contenidoServicio.getPorCategoria("eventos");
		List<ContenidoEntidad> juntaDirectiva = contenidoServicio.getPorCategoria("junta");
		List<ContenidoEntidad> beneficios = contenidoServicio.getPorCategoria("beneficios");
		List<ContenidoEntidad> sobreNosotros = contenidoServicio.getPorCategoria("sobre");
		model.addAttribute("titulo", "Inicio");
		model.addAttribute("destacados", destacados);
		model.addAttribute("noticias", noticias);
		model.addAttribute("eventos", eventos);
		model.addAttribute("junta", juntaDirectiva);
		model.addAttribute("beneficios", beneficios);
		model.addAttribute("sobre", sobreNosotros);
		return "index";
	}
}
