package hellodeco;

import java.util.ArrayList;

public class Tutorial2Collaborators extends AbstractCollaboratorsList {

	/**
	 * Initialises the Studio2Collaborators.
	 */
	public Tutorial2Collaborators() {
		/*
		 * DO NOT MODIFY THIS METHOD.
		 */
		collaborators = new ArrayList<DecoPerson>();
	}

	@Override
	public void addCollaborators() {
		/*
		 * Below, insert a new line adding yourself to the collaborators list.
		 *
		 * NOTE: Ensure you maintain alphabetical order.  
		 */

		collaborators.add(new DecoPerson("Aaron Coox", "a-coox", "Tutor"));
		collaborators.add(new DecoPerson("Anastasia Laczko", "StasiaL", "Tutor"));
		collaborators.add(new DecoPerson("Ari Bowe", "AriBowe", "Tutor"));
		collaborators.add(new DecoPerson("George Mihnea", "BozenX", "Tutor"));
		collaborators.add(new DecoPerson("Guowei Yang", "guoweiyang", "Lecturer"));
		collaborators.add(new DecoPerson("Nathan Corcoran", "usrnatc", "Student"));
		collaborators.add(new DecoPerson("Richard Thomas", "applebyter", "Course Coordinator"));
		collaborators.add(new DecoPerson("Rick Astley", "NeverGonnaGive", "Student"));
	}
}
