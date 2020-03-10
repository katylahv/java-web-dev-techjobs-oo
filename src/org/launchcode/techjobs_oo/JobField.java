package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {
    private int id;
    private static int nextId = 1;
    private String value;

    public JobField() {
        this.id = nextId;
        nextId++;
    }

    @Override
    public String toString() {
        if (value != "") {
            return " " + value+"\n";
        } else {
            return " Data not available\n";
        }
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
    public JobField(String value) {
        this();
        this.value = value;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jobField = (JobField) o;
        return getId() == jobField.getId();
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = "Data not available";
    }
}
