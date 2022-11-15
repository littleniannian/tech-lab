package simplebeanfactory;

public class Main {
    public static void main(String[] args) {
        DefaultListableBeanFactory abstractBeanFactory = new DefaultListableBeanFactory();
        BeanDefinition userServiceBeanDefinition = new BeanDefinition(UserService.class);
        abstractBeanFactory.registerBeanDefinition("userService",userServiceBeanDefinition);
        // 第一次创建实例对象
        UserService userService = (UserService) abstractBeanFactory.getBean("userService");
        userService.queryUserInfo();
        // 第二次从singletonMap中获取singleton
        UserService userSingleService = (UserService)abstractBeanFactory.getBean("userService");
        userSingleService.queryUserInfo();
    }
}