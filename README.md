# 数据库表

## 建库

```mysql
create database blog;
use blog;
```

## 后台用户表(backstageuser)

| 字段名   | java类型 | sql类型      | 为空   | 唯一   | 备注         |
| -------- | -------- | ------------ | ------ | ------ | ------------ |
| id       | Long     | bigint       | 不为空 | 唯一   | 主键         |
| username | String   | varchar(255) | 不为空 | 唯一   | 用户名       |
| password | String   | varchar(255) | 不为空 | 唯一   | 密码         |
| email    | String   | varchar(255) | 不为空 | 唯一   | 邮箱         |
| level    | String   | varchar(255) | 不为空 | 不唯一 | 账号权限等级 |

```mysql
create table backstageuser
(
    id       bigint auto_increment
        primary key,
    username varchar(32)  not null,
    password varchar(255) not null,
    level    varchar(10)  not null,
    email    varchar(64)  not null,
    constraint email
        unique (email),
    constraint username
        unique (username)
)charset = utf8;

```

