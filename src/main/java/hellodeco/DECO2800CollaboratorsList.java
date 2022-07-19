package hellodeco;

import java.util.List;

public interface DECO2800CollaboratorsList {

	/**
	 * Adds the course collaborators to the list.
	 */
	public void addCollaborators();

	/**
	 * Prints the contents of the collaborators list.
	 */
	public void printCollaborators();

	/**
	 * Returns a copy of the collaborators list.
	 * 
	 * @return A List containing the collaborators.
	 */
	public List<DecoPerson> getList();

}
