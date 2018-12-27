package ar.bsas.sarm.wicket.home;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;

import ar.bsas.sarm.siia.hibernate.HibernateConf;

public class WicketApplication extends WebApplication{

	@Override
	public Class<? extends Page> getHomePage() {
		HibernateConf.modo = "server";
		return HomePage.class;
	}
	@Override
	protected void init() {
		super.init();
	    getComponentInstantiationListeners().add(new SpringComponentInjector(this));
	}
}
