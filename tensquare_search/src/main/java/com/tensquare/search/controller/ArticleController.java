package com.tensquare.search.controller;

import com.tensquare.search.pojo.Article;
import com.tensquare.search.service.ArticleService;
import entity.PageResult;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

/**
 * @program: tensquare_parent
 * @description: controller
 * @author: huangdungui
 * @create: 2019-10-21 10:30
 **/
@RestController
@CrossOrigin
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping(method = RequestMethod.POST)
    public Result save(@RequestBody Article article){
        articleService.save(article);
        return new Result(true, StatusCode.OK,"保存成功");
    }

    @RequestMapping(value = "/{key}/{page}/{size}", method = RequestMethod.GET)
    public Result findByKey(@PathVariable String key, @PathVariable int page, @PathVariable int size) {
        Page<Article> pagedate = articleService.findByKey(key,page,size);
        return new Result(true, StatusCode.OK, "查询成功", new PageResult<Article>(pagedate.getTotalElements(), pagedate.getContent()));
    }


}
