package demo.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BaseDaoImpl<T> implements BaseDaoI<T>
{

	private SessionFactory sessionFactory;

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(T o)
	{
		sessionFactory.getCurrentSession().save(o);
	}

}
