package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import entidades.Denuncia;
import entidades.Usuario;
import util.JPAUtil;

public class DenunciaDao {
	
	
	public static void salvar(Denuncia d) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		em.persist(d);
		em.getTransaction().commit();
		em.close();
	}
	
	public static void editar(Denuncia d) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		em.merge(d);
		em.getTransaction().commit();
		em.close();
	}
	
	public static void excluir(Denuncia d) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		d = em.find(Denuncia.class, d.getId());
		em.remove(d);
		em.getTransaction().commit();
		em.close();
		
	}
	
	public static List<Denuncia> listar() {
		EntityManager em = JPAUtil.criarEntityManager();
		Query q = em.createQuery("select d from Denuncia d");
		List<Denuncia> lista = q.getResultList();
		em.close();
		return lista;
	}
}