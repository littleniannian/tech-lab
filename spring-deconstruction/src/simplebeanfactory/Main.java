package simplebeanfactory;

public class Main {
    public static void main(String[] args) {
        AbstractBeanFactory abstractBeanFactory = new DefaultListableBeanFactory();
        BeanDefinition userServiceBeanDefinition = new BeanDefinition(UserService.class);
        abstractBeanFactory.registerSingleton("userService",userServiceBeanDefinition);
        // 第一次创建实例对象
        UserService userService = (UserService) abstractBeanFactory.getBean("userService");
        // 第二次从singletonMap中获取singleton
        UserService userSingleService = (UserService)abstractBeanFactory.getBean("userService");
    }
}