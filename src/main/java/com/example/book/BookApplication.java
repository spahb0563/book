package com.example.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication // 스프링 부트의 자동설정, 스프링 Bean 읽기와 생성을 모두 자도으로 설정, 이 클래스는 항상 프로젝트 최상단에 위치해야함
public class BookApplication { //메인 클래스
    public static void main(String[] args) {
        SpringApplication.run(BookApplication.class, args); // 내장 WAS실행, 서버에 톰캣 설치 불필요, 언제 어디서나 같은 환경에서 스프링 부트 배포 가능
    }

}
