package hellodeco;

import java.util.ArrayList;

public class ExternalTutorial1Collaborators extends AbstractCollaboratorsList {

    /**
     * Initialises the Studio6Collaborators.
     */
    public ExternalTutorial1Collaborators() {
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
        collaborators.add(new DecoPerson("Guowei Yang", "guoweiyang", "Lecturer"));
        collaborators.add(new DecoPerson("Richard Thomas", "applebyter", "Course Coordinator"));
        collaborators.add(new DecoPerson("Rick Astley", "NeverGonnaGive", "Student"));
        collaborators.add(new DecoPerson("Samantha Tran", "samantha-tran", "Tutor"));
        collaborators.add(new DecoPerson("Samantha Tran2", "samantha-tran2", "Tutor"));
        collaborators.add(new DecoPerson("Xinkai Tang", "Kai9613", "Student"));
        collaborators.add(new DecoPerson("Yuqiao Tong", "CodingDavid2", "Student"));
        collaborators.add(new DecoPerson("Zihao Xia", "zihao-xia", "Student"));

    }
}


