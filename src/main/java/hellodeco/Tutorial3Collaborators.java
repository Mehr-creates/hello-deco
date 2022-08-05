package hellodeco;

import java.util.ArrayList;

public class Tutorial3Collaborators extends AbstractCollaboratorsList {

    /**
     * Initialises the Studio3Collaborators.
     */
    public Tutorial3Collaborators() {
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
        collaborators.add(new DecoPerson("Alexander Johnson", "KungKemi", "Student"));
        collaborators.add(new DecoPerson("Aman Gupta", "Aman Gupta", "Student"));
        collaborators.add(new DecoPerson("Anastasia Laczko", "StasiaL", "Tutor"));
        collaborators.add(new DecoPerson("Ash Ketchum",  "champion", "Tutor"));
        collaborators.add(new DecoPerson("Bailey Stoodley",  "BaileyS03", "Student"));
        collaborators.add(new DecoPerson("Caitlenn Alsop",  "c-alsop", "Student"));
        collaborators.add(new DecoPerson("Emma Schmidley", "schmidem", "Student"));
        collaborators.add(new DecoPerson("Garryco Thandi", "Harqua", "Student"));
        collaborators.add(new DecoPerson("George Mihnea", "BozenX", "Tutor"));
        collaborators.add(new DecoPerson("Guowei Yang", "guoweiyang", "Lecturer"));
        collaborators.add(new DecoPerson("Hoang Viet Nguyen", "nhVietS", "Student"));
        collaborators.add(new DecoPerson("Nisha Vashist", "NishaVashist0", "Student"));
        collaborators.add(new DecoPerson("Pragun Ramesha", "Xodacan", "Student"));
        collaborators.add(new DecoPerson("Pratham Manocha", "prathammanocha", "Student"));
        collaborators.add(new DecoPerson("Quoc Dat Mai", "quocdat402", "Student"));
        collaborators.add(new DecoPerson("Richard Thomas", "applebyter", "Course Coordinator"));
        collaborators.add(new DecoPerson("Rick Astley", "NeverGonnaGive", "Student"));
        collaborators.add(new DecoPerson("Ryan Gibbons", "rjg1", "Student"));
        collaborators.add(new DecoPerson("Sylvia Chen", "syl2211","Student"));
        collaborators.add(new DecoPerson("Thomas Keevers", "Thomas Keevers", "Student"));
        collaborators.add(new DecoPerson("Tyler Tevita", "Tyler", "Student2"));
        collaborators.add(new DecoPerson("Viktor Milanov", "Viktor Milanov", "Student2"));
        collaborators.add(new DecoPerson("Wenfeng Wang", "ww7796332", "Student"));

    }
}
