package com.jocarreira.html2react.model;

import java.util.List;

public class MenuItem {

    private int id;
    private String label;
    private String link;
    private List<MenuItem> subitems;

    public MenuItem(int id, String label, String link) {
        this.id = id;
        this.label = label;
        this.link = link;
    }

    public int getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public String getLink() {
        return link;
    }

    public List<MenuItem> getSubitems() {
        return subitems;
    }

    public void setSubitems(List<MenuItem> subitems) {
        this.subitems = subitems;
    }
}
