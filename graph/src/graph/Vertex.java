package graph;

public class Vertex {
	
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Vertex(String value) {
		super();
		this.value = value;
	}

	@Override
	public String toString() {
		return "Vertex [value=" + value + "]";
	}
}
