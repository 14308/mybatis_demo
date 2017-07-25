package com.example.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.baomidou.mybatisplus.spring.MybatisSqlSessionFactoryBean;
import org.mybatis.spring.boot.autoconfigure.MybatisProperties;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import javax.sql.DataSource;

/**
 * Created by 陆小凤 on 2017/7/20.
 */
@Configuration
@EnableConfigurationProperties({DataSourceProperties.class, MybatisProperties.class})
public class DatabaseConfig {

    private final DataSourceProperties dataSourceProperties;

    private final MybatisProperties properties;

    public DatabaseConfig(DataSourceProperties dataSourceProperties, MybatisProperties properties, ResourceLoader resourceLoader) {
        this.dataSourceProperties = dataSourceProperties;
        this.properties = properties;
    }


    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(this.dataSourceProperties.getUrl());
        dataSource.setUsername(this.dataSourceProperties.getUsername());
        dataSource.setPassword(this.dataSourceProperties.getPassword());
        return dataSource;
    }

    @Bean
    public MybatisSqlSessionFactoryBean mybatisSqlSessionFactoryBean() {
        MybatisSqlSessionFactoryBean mybatisSqlSessionFactoryBean = new MybatisSqlSessionFactoryBean();
        mybatisSqlSessionFactoryBean.setDataSource(this.dataSource());

        //扫描自己写的mapper.xml
        if (!ObjectUtils.isEmpty(this.properties.resolveMapperLocations())) {
            mybatisSqlSessionFactoryBean.setMapperLocations(this.properties.resolveMapperLocations());
        }

        if (StringUtils.hasLength(this.properties.getTypeAliasesPackage())) {
            mybatisSqlSessionFactoryBean.setTypeAliasesPackage(this.properties.getTypeAliasesPackage());
        }
        if (StringUtils.hasLength(this.properties.getTypeHandlersPackage())) {
            mybatisSqlSessionFactoryBean.setTypeHandlersPackage("com.helioscloud.atlantis.persistence.typehandler," + this.properties.getTypeHandlersPackage());
        } else {
            // By default, helios-core type handlers need to be included.
            mybatisSqlSessionFactoryBean.setTypeHandlersPackage("com.helioscloud.atlantis.persistence.typehandler");
        }
        return mybatisSqlSessionFactoryBean;
    }
}
