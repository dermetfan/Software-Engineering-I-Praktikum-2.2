package se_01;

import java.util.HashSet;
import java.util.Set;

public class Project {
    private final String[][] rules;
    private final Set<String> activities = new HashSet<>();

    public Project(final String[][] rules) {
        this.rules = rules;
        for (final String[] rule : rules) {
            activities.add(rule[0]);
            activities.add(rule[1]);
        }
    }

    public boolean isWellSorted(final String[] sequence) {
        final Set<String> yet = new HashSet<>();

        for (final String activity : sequence) {
            for (final String[] rule : rules) {
                if (rule[1].equals(activity) && !yet.contains(rule[0]) ||
                    yet.contains(activity)) // each activity must occur only once
                    return false;
            }
            yet.add(activity);
        }

        // the sequence must contain all activities
        return yet.equals(activities);
    }
}
