package com.company.poo.generics.map.ex3.entities;

import java.util.Objects;

public class Candidate{
    private String name;
    private Integer votes;

    public Candidate(String name, Integer votes) {
        this.name = name;
        this.votes = votes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidate candidate = (Candidate) o;
        return name.equals(candidate.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
