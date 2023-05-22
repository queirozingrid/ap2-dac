package dao;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import dao.VitimaDao;
import entidades.Usuario;
import entidades.Vitima;
import util.JPAUtil;

import static util.MessageUtil.*;

import java.util.List;

public class VitimaDao {
	
	public static void salvar(Vitima v) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		em.persist(v);
		em.getTransaction().commit();
		em.close();
		
	}
	
	public static void editar(Vitima v) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		em.merge(v);
		em.getTransaction().commit();
		em.close();
		
	}
	
	public static void excluir(Vitima v) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		v = em.find(Vitima.class, v.getId());
		em.remove(v);
		em.getTransaction().commit();
		em.close();
	}
	
	public static List<Vitima> listar(Vitima v) {
		EntityManager em = JPAUtil.criarEntityManager();
		Query q = em.createQuery("select v from Vitima v");
		List<Vitima> lista = q.getResultList();
		em.close();
		return lista;
	}
}