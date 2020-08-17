public class Computer implements ComputerPart {
    private final ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart cp : parts) {
            cp.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
