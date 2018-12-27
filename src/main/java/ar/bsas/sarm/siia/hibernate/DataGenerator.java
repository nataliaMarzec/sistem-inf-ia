package ar.bsas.sarm.siia.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class DataGenerator {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	protected void generate() {
		
		
		
		Transaction ts = sessionFactory.getCurrentSession().beginTransaction();
		
		
		ts.commit();
	}
}
