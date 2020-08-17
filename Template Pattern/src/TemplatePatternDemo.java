// 模板模式：https://www.runoob.com/design-pattern/template-pattern.html
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        game = new Football();
        game.play();
    }
}
