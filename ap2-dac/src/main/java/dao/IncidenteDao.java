package dao;

import java.util.List;

import javax.persistence.EntityManager;

import entidades.Incidente;
import util.JPAUtil;

public class IncidenteDao {
	
	
	public static void salvar(Incidente incidente) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		em.persist(incidente);
		em.getTransaction().commit();
		em.close();
	}
	
	public static void editar(Incidente incidente) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		em.merge(incidente);
		em.getTransaction().commit();
		em.close();
	}
	
	public static void excluir(Incidente incidente) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		incidente = em.find(Incidente.class, incidente.getId());
		em.remove(incidente);
		em.getTransaction().commit();
		em.close();
		
	}
	
	public static List<Incidente> listar() {
		EntityManager em = JPAUtil.criarEntityManager();
		String jpql = "select i from Incidente i";
		List<Incidente> lista = em.createQuery(jpql, Incidente.class).getResultList();
		em.close();
		return lista;
	}
}