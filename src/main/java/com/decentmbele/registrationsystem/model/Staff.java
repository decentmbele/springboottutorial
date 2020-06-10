package com.decentmbele.registrationsystem.model;

import javax.persistence.*;


@Entity
public class Staff {
    @Id
    private long staffId;

    @Embedded
    private Person member;

    public Staff() {
    }

    public Staff(long staffId, Person member) {
        this.staffId = staffId;
        this.member = member;
    }

    public long getStaffId() {
        return staffId;
    }

    public void setStaffId(long staffId) {
        this.staffId = staffId;
    }

    public Person getMember() {
        return member;
    }

    public void setMember(Person member) {
        this.member = member;
    }
}
