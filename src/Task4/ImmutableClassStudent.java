package com.company.Task4;

import java.util.Date;

public final class ImmutableClassStudent {
    private String name;
    private String workName;
    private int id;
    private Date date;
    
    public ImmutableClassStudent(String name, String workName, int id, Date date) {
        this.name = name;
        this.workName = workName;
        this.id = id;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getWorkName() {
        return workName;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return (Date) date.clone();
    }
}
