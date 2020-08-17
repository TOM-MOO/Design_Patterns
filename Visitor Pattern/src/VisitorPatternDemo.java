// 访问者模式：https://www.runoob.com/design-pattern/visitor-pattern.html
public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
