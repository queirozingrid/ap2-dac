package dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import entidades.Usuario;
import util.JPAUtil;

public class UsuarioDao {
	
	public static void salvar(Usuario user) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		em.close();
	
	}
	
	public static void editar(Usuario user) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		em.merge(user);
		em.getTransaction().commit();
		em.close();
	}
	
	public static void excluir(Usuario user) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		user = em.find(Usuario.class, user.getId());
		em.remove(user);
		em.getTransaction().commit();
		em.close();
	}
	
	public static List<Usuario> listar(Usuario user) {
		EntityManager em = JPAUtil.criarEntityManager();
		Query q = em.createQuery("select user from Usuario user");
		List<Usuario> lista = q.getResultList();
		em.close();
		return lista;
	}
	
	// implementar login() ???
		
}