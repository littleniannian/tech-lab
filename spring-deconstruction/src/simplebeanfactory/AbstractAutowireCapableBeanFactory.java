package simplebeanfactory;

public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {
    /**
     * 完成BEAN的实例化,并且放入singleton缓存
     * @param beanName
     * @param beanDefinition
     * @return
     * @throws BeansException
     */
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            // 这里实例化BEAN，但只实例化了无参的BEAN。存在问题。之后使用CGLIB代理解决问题
            bean =  beanDefinition.getBeanClass().getConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        registerSingleton(beanName,bean);
        return bean;
    }
}
