/*
 * You can use the following import statements
 *
 * import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
 * 
 * import javax.persistence.*;
 * import java.util.List;
 * 
 */

// Write your code here
package com.example.eventmanagementsystem.model;

import javax.persistence.*;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.example.eventmanagementsystem.model.*;

@Entity
@Table(name = "event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "eventdate")
    private String eventDate;

    @ManyToMany(mappedBy = "events")
    @JsonIgnoreProperties("events")
    private List<Sponsor> sponsors = new ArrayList<>();

    public Event() {
    }

    public Event(int id, String name, String eventDate, List<Sponsor> sponsors) {
        this.id = id;
        this.name = name;
        this.eventDate = eventDate;
        this.sponsors = sponsors;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setSponsors(List<Sponsor> sponsors) {
        this.sponsors = sponsors;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

}
