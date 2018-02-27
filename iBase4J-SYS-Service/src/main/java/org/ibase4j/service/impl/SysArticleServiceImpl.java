package org.ibase4j.service.impl;

import org.ibase4j.model.SysArticle;
import org.ibase4j.service.ISysArticleService;
import org.springframework.cache.annotation.CacheConfig;

import com.alibaba.dubbo.config.annotation.Service;
import com.weibo.api.motan.config.springsupport.annotation.MotanService;

import top.ibase4j.core.base.BaseService;

/**
 * <p>
 * 文章 服务实现类
 * </p>
 *
 * @author ShenHuaJie
 * @since 2017-03-12
 */
@Service(interfaceClass = ISysArticleService.class)
@MotanService(interfaceClass = ISysArticleService.class)
@CacheConfig(cacheNames = "sysArticle")
public class SysArticleServiceImpl extends BaseService<SysArticle> implements ISysArticleService {

}