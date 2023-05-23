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
	
	public static Boolean encontraPorLoginESenha(String login, String senha) {
		EntityManager em = JPAUtil.criarEntityManager();
		String jpql = "select u from Usuario u where u.login = :login and u.senha = :senha";
		
		try {
			List<Usuario> usuariosEncontrados = em.createQuery(jpql, Usuario.class).
					setParameter("login", login).
					setParameter("senha", senha).getResultList();
			
			if (usuariosEncontrados.size()==0) {
				return false;
			} else {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			
			return false;
		} finally {
			em.close();
		}
	}
	
	// implementar login() ???
	// sim!!!
		
}