package ul.programacionVII.Servicios;

import java.util.List;

import ul.programacionVII.Entidades.ContenidoEntidad;

public interface ContenidoServicio {
	
	List<ContenidoEntidad> allContenido();
	
	ContenidoEntidad saveContenido(ContenidoEntidad contenido);
	
	void deleteContenido(Long id);
	
	ContenidoEntidad getContenido(Long id);

	ContenidoEntidad editarContenido(Long id, ContenidoEntidad contenido);
	
	List<ContenidoEntidad> getPorCategoria(String categoria);
}