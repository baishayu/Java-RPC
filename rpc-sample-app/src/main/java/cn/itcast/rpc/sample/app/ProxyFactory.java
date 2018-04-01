package cn.itcast.rpc.sample.app;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cn.itcast.rpc.client.RpcProxy;
import cn.itcast.rpc.simple.client.HelloService;
import cn.itcast.rpc.simple.client.Person;

//@Configuration
public class ProxyFactory implements ApplicationContextAware {

	@Autowired
//	private RpcProxy rpcProxy;
	
//	private List<String> list;
//	
//	public void setList(List<String> list) {
//		this.list = list;
//	}

	/*@Bean
	public HelloService setBean0(){
		return rpcProxy.create(HelloService.class);
	}*/
	
	
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		DefaultListableBeanFactory acf = (DefaultListableBeanFactory) ctx.getAutowireCapableBeanFactory();
		MyTest test = new MyTestImpl();
//		acf.registerDisposableBean(beanName, bean );
	} 
	 
}
