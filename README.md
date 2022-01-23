# Spring-Boot Login 서비스

## 특징
- [spring-jwt-server](https://github.com/6lueparr0t/spring-jwt-server) 프로젝트를 계승한다.
- 전작의 문제였던, [TTL](https://redis.io/commands/expire) 을 구현해본다.
- 회원 정보는 MySql 이용하고, 로그인 & 로그아웃은 Redis 에 Token 을 저장하여 사용한다.