package guru.springframework;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by bautisj on 12/14/2017.
 */
@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware{

    public LifeCycleDemoBean() {
        System.out.println("I'm the LifeCicle Constructor ");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## Bean Factory has been set");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("## My bean name is" + name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## The bean has been destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## The LifeCycleBean has its properties set!");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## The Application context has been set !");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("## The post Construct annotated method has been called");
    }

    @PreDestroy
    public void  preDestroy(){
        System.out.println("## The pre Destroy annotated method has been called");
    }

    public void beforeInit(){
        System.out.println("## Before Init Called by Bean post Processor");
    }

    public void afterInit(){
        System.out.println("## After init Called by Bean post Processor");
    }
}
