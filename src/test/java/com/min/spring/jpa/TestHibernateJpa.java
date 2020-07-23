package com.min.spring.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.min.spring.jpa.dao.ArticleDao;
import com.min.spring.jpa.entity.TmArticle;

/**
 *    测试事务，persist、save方法。没提交事务前，id已经赋值，数据库没有数据。
 *    提交事务后，对象才保存到数据库。
 * @author zhouzm
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-hibernate.xml")
public class TestHibernateJpa {
	@PersistenceContext
	private EntityManager em;
	
	@Autowired
	private ArticleDao articleDao;
	
	private TmArticle persistEm() {
		TmArticle tmArticle = new TmArticle();
		tmArticle.setContent("文章1：EM");
		tmArticle.setUserId(Long.valueOf(0));
		tmArticle.setTitle("11111");
		tmArticle.setJpaVersion(0);
		
		em.persist(tmArticle);
		
		return  tmArticle;
	}
	
	@Test
	@Transactional
	@Rollback(false)
	public void testEm() {
		TmArticle article = persistEm();
		System.out.println("EM:"+article.getId());
	}
	
	
	@Transactional
	@Rollback(false)//禁止回退
	public void testJPA() {
		TmArticle tmArticle = new TmArticle();
		tmArticle.setContent("文章2：JPA");
		tmArticle.setUserId(Long.valueOf(0));
		tmArticle.setTitle("22222");
		tmArticle.setJpaVersion(0);
		
		articleDao.save(tmArticle);
		System.out.println("JPA:"+tmArticle.getId());
	}
}
