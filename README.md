# Spring-Boot Login 서비스

## 특징
- [legacy-spring-jwt-login](https://github.com/6lueparr0t/legacy-spring-jwt-login) 프로젝트를 계승한다.
- 전작의 문제였던, [TTL](https://redis.io/commands/expire) 을 구현해본다.
- 회원 정보는 MySql 이용하고, 로그인 & 로그아웃은 Redis 에 Token 을 저장하여 사용한다.
- 현재 작업 중단되었음.. 조만간 다시 재개할 예정.

## 기술 스택
- JAVA Spring Boot (v2.3.12.RELEASE)
- Gradle (v7.2)
- Redis (v6.2.6)
- Mysql (v8.0.28)

## 테이블 설계
* **USER (TBL_USER)**

| 필드명      | 자료형         | 설명          |
|----------|-------------|-------------|
| **no**   | Integer     | Primary Key |
| **id**   | String(100) | 아이디         |
| **name** | String(100) | 이름          |
| **mail** | String(300) | e-mail      |
| **pswd** | String(100) | 패스워드        |
| **cdtm** | String      | 생성 날짜       |
