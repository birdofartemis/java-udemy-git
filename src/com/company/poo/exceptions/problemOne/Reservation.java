package com.company.poo.exceptions.problemOne;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkin;
    private Date checkout;

    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Integer roomNumber, Date checkin, Date checkout) {
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public long duration(){
       long diff = getCheckout().getTime()-getCheckin().getTime();
       return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    void updateDate(Date checkin, Date checkout){
        this.checkin = checkin;
        this.checkout = checkout;
    }
    @Override
    public final String toString(){
        return "Reservation: Room " + getRoomNumber() + ", checkin " + sdf.format(getCheckin()) + ", checkOut "
                + sdf.format(getCheckout()) + ", nights: " + duration();
    }
}
