package hello.hellospring.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;

@Configuration
public class SpringConfig {
	// Spring Bean에 멤버 서비스, 레포지토리 올려줌 	
	@Bean
	public MemberService memberService() {
		return new MemberService(memberRepository());
		}

	@Bean
	public MemberRepository memberRepository() {
		return new MemoryMemberRepository();
	}
	
}
