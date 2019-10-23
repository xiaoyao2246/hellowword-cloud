package com.xiaojian.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRule {

    @Bean
    public IRule initRule() {
        //return new RoundRobinRule();//轮询
        //return new RandomRule();
        return new MyLoadBalanceRule();
    }
}
