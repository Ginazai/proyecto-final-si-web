$(document).ready(function() {
	
	function setActive(elem) {
		if(!$(elem).first().hasClass('active')){
			$(elem).first().addClass('active');
		}
	}
	
	setActive('.destacados-carousel-item');
	setActive('.noticias-carousel-item');
	setActive('.eventos-carousel-item');
	setActive('.destacados-indicador');
	setActive('.noticias-indicador');
	setActive('.eventos-indicador');
	
});