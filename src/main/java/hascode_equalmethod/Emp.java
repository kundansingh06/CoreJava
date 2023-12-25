package hascode_equalmethod;
import java.util.Objects;
public class Emp {
	int id;
	String name;
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Emp)) {
			return false;
		}
		Emp other = (Emp) obj;
		return Objects.equals(id, other.id);
	}
}
