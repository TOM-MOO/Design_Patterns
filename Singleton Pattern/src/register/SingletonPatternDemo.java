package register;

// 单例模式：https://www.runoob.com/design-pattern/singleton-pattern.html
public class SingletonPatternDemo {
    public static void main(String[] args) {

        //不合法的构造函数
        //编译时错误：构造函数 Singleton() 是不可见的
        //Singleton object = new Singleton();

        //获取唯一可用的对象
        Singleton object = Singleton.getInstance();

        //显示消息
        object.showMessage();
    }
}