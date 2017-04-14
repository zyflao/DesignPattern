package behavior.Visitor;

public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}