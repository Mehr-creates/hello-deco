package hellodeco;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractCollaboratorsList implements DECO2800CollaboratorsList {

	protected List<DecoPerson> collaborators;

	@Override
	public abstract void addCollaborators();

	@Override
	public void printCollaborators() {
		System.out.println("Richard Thomas (AppleByter) -  Course Coordinator");
		for (DecoPerson collaborator : collaborators) {
			System.out.println(collaborator);
		}
	}

	@Override
	public List<DecoPerson> getList() {
		return new ArrayList<DecoPerson>(collaborators);
	}

}
