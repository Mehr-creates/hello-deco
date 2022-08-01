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
        collaborators.add(new DecoPerson("Guowei Yang", "guoweiyang", "Lecturer"));
        collaborators.add(new DecoPerson("Logan De Groot", "Logan-De-Groot", "Student"));
        collaborators.add(new DecoPerson("Richard Thomas", "applebyter", "Course Coordinator"));
        collaborators.add(new DecoPerson("Rick Astley", "NeverGonnaGive", "Student"));
        collaborators.add(new DecoPerson("Samantha Tran", "samantha-tran", "Tutor"));
        collaborators.add(new DecoPerson("Zhiyuan Xu", "DLAmeng", "Student"));
    }
} 
