package com.revature.quizzard.repositories;

import com.revature.quizzard.models.AppUser;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Repository // @Component @Service @Repository @Controller
public class UserRepo implements CrudRepo<AppUser> {

	private SessionFactory sessionFactory;

	@Autowired
	public UserRepo(SessionFactory factory){
		sessionFactory = factory;
	}

	@Override
	public List<AppUser> findAll() {

		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from AppUser", AppUser.class).getResultList();
	}

	public Optional<AppUser> findUserByUsernameAndPassword(String un, String pw){
		Session session = sessionFactory.getCurrentSession();
		return Optional.of(session.createQuery("from AppUser au where au.username = :un and au.password = :pw", AppUser.class)
				.setParameter("un", un)
				.setParameter("pw", pw)
				.getSingleResult());
	}

	public Optional<AppUser> findUserByUsername(String un){
		Session session = sessionFactory.getCurrentSession();
		return Optional.ofNullable(session.createQuery("from AppUser au where au.username = :un", AppUser.class)
				.setParameter("un", un)
				.getSingleResult());
	}

	public Optional<AppUser> findUserByEmail(String em){
		Session session = sessionFactory.getCurrentSession();
		return Optional.ofNullable(session.createQuery("from AppUser au where au.email = :em", AppUser.class)
				.setParameter("em", em)
				.getSingleResult());
	}

	@Override
	public Optional<AppUser> findById(int id) {
		Session session = sessionFactory.getCurrentSession();
		return Optional.ofNullable(session.get(AppUser.class, id)); // get returns null, load throws an error.
	}

	@Override
	public Optional<AppUser> save(AppUser newObj) {
		Session session = sessionFactory.getCurrentSession();
		session.save(newObj);
		return Optional.of(newObj);
	}

	@Override
	public boolean update(AppUser updatedObj) {
		Session session = sessionFactory.getCurrentSession();

		return false;
	}

	@Override
	public boolean deleteById(int id) {
		Session session = sessionFactory.getCurrentSession();
		return false;
	}

}
