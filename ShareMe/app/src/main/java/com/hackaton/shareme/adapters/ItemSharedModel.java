package com.hackaton.shareme.adapters;

public class ItemSharedModel {
    private String shared_object;
    private String person_owner;
    // Constructor
    public ItemSharedModel(String shared_object, String person_owner) {
        this.shared_object = shared_object;
        this.person_owner = person_owner;
    }

    //getter and setter
    public String getPerson_object() {
        return shared_object;
    }

    public void setPerson_object(String person_name) {
        this.shared_object = person_name;
    }

    public String getPerson_owner() {
        return person_owner;
    }

    public void setPerson_owner(String person_owner) {
        this.person_owner = person_owner;
    }


}
