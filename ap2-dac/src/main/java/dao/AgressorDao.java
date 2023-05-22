package dao;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import dao.AgressorDao;

import entidades.Agressor;
import entidades.Vitima;
import util.JPAUtil;

import static util.MessageUtil.*;

import java.util.List;

public class AgressorDao {
	
	public static void salvar(Agressor a) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		em.persist(a);
		em.getTransaction().commit();
		em.close();
	}
	
	public static void editar(Agressor a) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		em.merge(a);
		em.getTransaction().commit();
		em.close();
	}
	
	public static void excluir(Agressor a) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		a = em.find(Agressor.class, a.getId());
		em.remove(a);
		em.getTransaction().commit();
		em.close();
	}
	
	public static List<Agressor> listar(Agressor a) {
		EntityManager em = JPAUtil.criarEntityManager();
		Query q = em.createQuery("select a from Agressor a");
		List<Agressor> lista = q.getResultList();
		em.close();
		return lista;
	}

}