package hellodeco;

import java.util.ArrayList;

public class Tutorial1Collaborators extends AbstractCollaboratorsList {

    /**
     * Initialises the Studio1Collaborators.
     */
    public Tutorial1Collaborators() {
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
        collaborators.add(new DecoPerson("Alysha Ismail", "alyshaziya", "Student"));
        collaborators.add(new DecoPerson("Anastasia Laczko", "StasiaL", "Tutor"));
        collaborators.add(new DecoPerson("Caleb Ang", "caleb-ang", "Student"));
        collaborators.add(new DecoPerson("Connor Ryan", "Connor-Ryan-1998", "Student"));
        collaborators.add(new DecoPerson("Eugene Chong", "eugene2341", "Student"));
        collaborators.add(new DecoPerson("Guowei Yang", "guoweiyang", "Lecturer"));
        collaborators.add(new DecoPerson("Harland Jensen", "harland-jensen", "Student"));
	    collaborators.add(new DecoPerson("Junyao Li", "lijunyao1", "Student"));
        collaborators.add(new DecoPerson("Kurt Lucas", "kurt-553", "Student"));
        collaborators.add(new DecoPerson("Logan De Groot", "Logan-De-Groot", "Student"));
        collaborators.add(new DecoPerson("Ly Phung", "lyphng", "Student"));
        collaborators.add(new DecoPerson("Olivia Leighton","Olivialeighton","Student"));
        collaborators.add(new DecoPerson("Pranav", "Pranav", "Student"));
        collaborators.add(new DecoPerson("Reuben Jonathan Joseph", "Reuben Joseph", "Student"));
        collaborators.add(new DecoPerson("Richard Thomas", "applebyter", "Course Coordinator"));
        collaborators.add(new DecoPerson("Rick Astley", "NeverGonnaGive", "Student"));
        collaborators.add(new DecoPerson("Samantha Tran", "samantha-tran", "Tutor"));
        collaborators.add(new DecoPerson("Satya Bhasale", "Satya Bhasale", "Student"));
        collaborators.add(new DecoPerson("Shiyu Liu", "11shiyu", "Student"));
        collaborators.add(new DecoPerson("Tara-Jade Garnsworthy", "tgarnsworthy", "Student"));
        collaborators.add(new DecoPerson("Zhiyuan Xu", "DLAmeng", "Student"));

    }
}
