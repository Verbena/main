package seedu.whatnow.testutil;

import seedu.whatnow.commons.exceptions.IllegalValueException;
import seedu.whatnow.model.WhatNow;
import seedu.whatnow.model.task.*;

/**
 *
 */
public class TypicalTestTasks {

    public static TestTask alice, benson, carl, daniel, elle, fiona, george, hoon, ida;

    public TypicalTestTasks() {
        try {
            alice =  new TaskBuilder().withName("Alice Pauline").withTags("friends").build();
            benson = new TaskBuilder().withName("Benson Meier").withTags("owesMoney", "friends").build();
            carl = new TaskBuilder().withName("Carl Kurz").build();
            daniel = new TaskBuilder().withName("Daniel Meier").build();
            elle = new TaskBuilder().withName("Elle Meyer").build();
            fiona = new TaskBuilder().withName("Fiona Kunz").build();
            george = new TaskBuilder().withName("George Best").build();

            //Manually added
            hoon = new TaskBuilder().withName("Hoon Meier").build();
            ida = new TaskBuilder().withName("Ida Mueller").build();
        } catch (IllegalValueException e) {
            e.printStackTrace();
            assert false : "not possible";
        }
    }

    public static void loadWhatNowWithSampleData(WhatNow ab) {

        try {
            ab.addTask(new Task(alice));
            ab.addTask(new Task(benson));
            ab.addTask(new Task(carl));
            ab.addTask(new Task(daniel));
            ab.addTask(new Task(elle));
            ab.addTask(new Task(fiona));
            ab.addTask(new Task(george));
        } catch (UniqueTaskList.DuplicateTaskException e) {
            assert false : "not possible";
        }
    }

    public TestTask[] getTypicalTasks() {
        return new TestTask[]{alice, benson, carl, daniel, elle, fiona, george};
    }

    public WhatNow getTypicalWhatNow(){
        WhatNow ab = new WhatNow();
        loadWhatNowWithSampleData(ab);
        return ab;
    }
}