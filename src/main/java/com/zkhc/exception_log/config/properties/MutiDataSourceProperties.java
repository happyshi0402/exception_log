package com.zkhc.exception_log.config.properties;

import com.alibaba.druid.pool.DruidDataSource;

public class MutiDataSourceProperties {
    private String url = "jdbc:mysql://127.0.0.1:3306/biz?autoReconnect=true&useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull";
    private String username = "root";
    private String password = "123456";
    private String driverClassName = "com.mysql.cj.jdbc.Driver";
    private String validationQuery = "SELECT 'x'";
    private String[] dataSourceNames = new String[]{"exceptionAdminDataSource", "znkfAdminDatasource","loggingDatasource"};

    public MutiDataSourceProperties() {
    }

    public void config(DruidDataSource dataSource) {
        dataSource.setUrl(this.url);
        dataSource.setUsername(this.username);
        dataSource.setPassword(this.password);
        dataSource.setDriverClassName(this.driverClassName);
        dataSource.setValidationQuery(this.validationQuery);
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriverClassName() {
        return this.driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getValidationQuery() {
        return this.validationQuery;
    }

    public void setValidationQuery(String validationQuery) {
        this.validationQuery = validationQuery;
    }

    public String[] getDataSourceNames() {
        return this.dataSourceNames;
    }

    public void setDataSourceNames(String[] dataSourceNames) {
        this.dataSourceNames = dataSourceNames;
    }
}