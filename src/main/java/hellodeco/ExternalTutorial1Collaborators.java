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
        collaborators.add(new DecoPerson("Bohan Zhao", "Bohankkk", "Student"));
        collaborators.add(new DecoPerson("Guowei Yang", "guoweiyang", "Lecturer"));
        collaborators.add(new DecoPerson("Jingyi Li", "AlynnLi", "Student"));
        collaborators.add(new DecoPerson("Junwen Zhu", "JZ1890", "Student"));
        collaborators.add(new DecoPerson("Kevin Zheng", "Kevin-Zheng", "Student"));
        collaborators.add(new DecoPerson("Kexin Du", "motaA0309", "Student"));
        collaborators.add(new DecoPerson("Richard Thomas", "applebyter", "Course Coordinator"));
        collaborators.add(new DecoPerson("Rick Astley", "NeverGonnaGive", "Student"));
        collaborators.add(new DecoPerson("Rio Tanabe", "riotanabe", "Student"));
        collaborators.add(new DecoPerson("Rio Tanabe", "riotanabe", "Student2"));
        collaborators.add(new DecoPerson("Samantha Tran", "samantha-tran", "Tutor"));
        collaborators.add(new DecoPerson("Samantha Tran2", "samantha-tran2", "Tutor"));
        collaborators.add(new DecoPerson("Shiyu Liu", "11shiyu", "Student"));
        collaborators.add(new DecoPerson("Shuhui Wang", "Aryawwww", "Student"));
        collaborators.add(new DecoPerson("Xinkai Tang", "Kai9613", "Student"));
        collaborators.add(new DecoPerson("Yaojun Tan", "PendaZz", "Student"));
        collaborators.add(new DecoPerson("Yingxin Liu", "LIU-Evelyn", "Student"));
        collaborators.add(new DecoPerson("Yu Ouyang", "YuOuyang99", "Student"));
        collaborators.add(new DecoPerson("Yuqiao Tong", "CodingDavid2", "Student"));
        collaborators.add(new DecoPerson("Zihao Xia", "zihao-xia", "Student"));
    }
}


