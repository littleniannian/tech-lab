public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            bean =  beanDefinition.getBeanClass().getDeclaredConstructor((Class<?>) null).newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        registerSingleton(beanName,bean);
        return bean;
    }
}
