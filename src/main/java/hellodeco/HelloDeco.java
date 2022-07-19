package hellodeco;

public class HelloDeco {
	/*
	 * DO NOT MODIFY THIS CLASS
	 */

	public static void main(String[] args) {
		System.out.println("Tutorial 1 Collaborators:");
		DECO2800CollaboratorsList tutorial1 = new Tutorial1Collaborators();
		tutorial1.addCollaborators();
		tutorial1.printCollaborators();
		System.out.println();

		System.out.println("Tutorial 2 Collaborators:");
		DECO2800CollaboratorsList tutorial2 = new Tutorial2Collaborators();
		tutorial2.addCollaborators();
		tutorial2.printCollaborators();
		System.out.println();

		System.out.println("Tutorial 3 Collaborators:");
		DECO2800CollaboratorsList tutorial3 = new Tutorial3Collaborators();
		tutorial3.addCollaborators();
		tutorial3.printCollaborators();
		System.out.println();

		System.out.println("External Tutorial 1 Collaborators:");
		DECO2800CollaboratorsList external1 = new ExternalTutorial1Collaborators();
		external1.addCollaborators();
		external1.printCollaborators();
		System.out.println();
	}
}
