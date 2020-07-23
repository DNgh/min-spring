package com.min.spring.jpa.dao;

import com.min.spring.jpa.enums.ArticleState;
import com.min.spring.jpa.entity.TmArticle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ArticleDao extends JpaRepository<TmArticle, Long> {
	public long countByState(ArticleState state);
}
