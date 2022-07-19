package hellodeco;

public class DecoPerson implements Comparable <DecoPerson> {

	private String name;
	private String username;
	private String role;

	public DecoPerson(String name, String username, String role) {
		this.name = name;
		this.username = username;
		this.role = role;
	}

	@Override
	public String toString() {
		return String.format("%s (%s) - %s", name, username, role);
	}

	@Override
	public int compareTo(DecoPerson other) {
		/*
		 * This isn't the best way of doing this, but it compares the way I want
		 * (lexicographically on name, username and role - in that order)/
		 */
		return this.toString().toLowerCase().compareTo(other.toString().toLowerCase());
	}

	@Override
	public boolean equals(Object object) {
		/*
		 * As above, this isn't the best way of doing this, but it *does* determine
		 * equality on all the values we need.
		 */
		return this.toString().equals(object.toString());
	}

	@Override
	public int hashCode() {
		/*
		 * As above, this isn't the best way of doing this, but it *does* satisfy the
		 * constrain that equal things have equal hashCodes.
		 */
		return this.toString().hashCode();
	}

}
