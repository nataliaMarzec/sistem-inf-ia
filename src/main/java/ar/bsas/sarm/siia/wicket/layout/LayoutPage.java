package ar.bsas.sarm.siia.wicket.layout;

import org.apache.wicket.Page;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.Link;

import ar.bsas.sarm.wicket.home.HomePage;

public abstract class LayoutPage extends WebPage {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LayoutPage() {
		this.agregarLink("homePage", HomePage.class);
//		this.agregarLink("alumnosPage", ListadoAlumnoPage.class);
	}
	
	private void agregarLink(String nombre, Class<? extends Page> pageClass) {
		this.add(new Link<String>(nombre) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void onClick() {
				this.setResponsePage(pageClass);
			}
		});
	}
}
