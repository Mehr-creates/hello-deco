package hellodeco;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class CollaboratorsTest {
	
	@Test
	public void tutorial1TestAlphabetical() {
		testAlphabetical(new Tutorial1Collaborators());
	}
	
	@Test
	public void tutorial1TestNotNull() {
		testNotNull(new Tutorial1Collaborators());
	}
	
	@Test
	public void tutorial1TestRickAstleyIsStillThere() {
		testRickAstleyIsStillThere(new Tutorial1Collaborators());
	}
	
	@Test
	public void tutorial2TestAlphabetical() {
		testAlphabetical(new Tutorial2Collaborators());
	}
	
	@Test
	public void tutorial2TestNotNull() {
		testNotNull(new Tutorial2Collaborators());
	}
	
	@Test
	public void tutorial2TestRickAstleyIsStillThere() {
		testRickAstleyIsStillThere(new Tutorial2Collaborators());
	}
	
	@Test
	public void tutorial3TestAlphabetical() {
		testAlphabetical(new Tutorial3Collaborators());
	}
	
	@Test
	public void tutorial3TestNotNull() {
		testNotNull(new Tutorial3Collaborators());
	}
	
	@Test
	public void tutorial3TestRickAstleyIsStillThere() {
		testRickAstleyIsStillThere(new Tutorial3Collaborators());
	}

	@Test
	public void external1TestAlphabetical() {
		testAlphabetical(new ExternalTutorial1Collaborators());
	}

	@Test
	public void external1TestNotNull() {
		testNotNull(new ExternalTutorial1Collaborators());
	}

	@Test
	public void external1TestRickAstleyIsStillThere() {
		testRickAstleyIsStillThere(new ExternalTutorial1Collaborators());
	}


	/**
	 * Tests to ensure the CollaboratorsList is in alphabetical order.
	 */
	private void testAlphabetical(AbstractCollaboratorsList collaboratorsList) {
		collaboratorsList.addCollaborators();

		List<DecoPerson> collabs = collaboratorsList.getList();

		for (int i = 0; i < collabs.size() - 1; i++) {
			assertTrue("List is not in alphabetical order: " + collabs.get(i) + " does not come before "
					+ collabs.get(i + 1), collabs.get(i).compareTo(collabs.get(i + 1)) < 0);
		}
	}

	/**
	 * Tests to ensure the CollaboratorsList does not contain null entries.
	 */
	private void testNotNull(AbstractCollaboratorsList collaboratorsList) {
		collaboratorsList.addCollaborators();

		List<DecoPerson> collabs = collaboratorsList.getList();

		for (int i = 0; i < collabs.size(); i++) {
			assertTrue("List contains null entries.", collabs.get(i) != null);
		}
	}

	/**
	 * Tests to ensure the CollaboratorsList still contains Rick Astley.
	 */
	private void testRickAstleyIsStillThere(AbstractCollaboratorsList collaboratorsList) {
		collaboratorsList.addCollaborators();

		List<DecoPerson> collabs = collaboratorsList.getList();

		assertTrue(
				"Rick Astley has given you up! Rick Astley has let you down! "
						+ "Rick Astley has run around and deserted you! Rick Astley has made you cry! "
						+ "Rick Astley has said goodbye! Rick Astley has told a lie and hurt you! Put him back!",
				collabs.contains(new DecoPerson("Rick Astley", "NeverGonnaGive", "Student")));
	}

}
