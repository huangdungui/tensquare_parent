package com.tensquare.search.dao;

import com.tensquare.search.pojo.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @program: tensquare_parent
 * @description: dao
 * @author: huangdungui
 * @create: 2019-10-21 10:24
 **/
public interface ArticleDao extends ElasticsearchRepository<Article, String> {
    public Page<Article> findByTitleOrContentLike(String title, String content, Pageable pageable);
}
