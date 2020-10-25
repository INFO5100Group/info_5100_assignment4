/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Flight;

import java.util.Date;

import Business.Persona.*;

/**
 *
 * @author Administrator
 */
public class Ticket {
    public static int ticketCount = 0;
    
    private int ID;
    private Customer ticketCustomer;
    private Seat ticketSeat;
    private Date createDate;
    
    public Ticket(){
        this.ID = ++ ticketCount;
        this.createDate = new Date();
    }

    public Ticket(Customer c, Seat s){
        this();
        this.ticketCustomer = c;
        this.ticketSeat = s;
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Seat getTicketSeat() {
        return this.ticketSeat;
    }

    public void setTicketSeat(Seat ticketSeat) {
        this.ticketSeat = ticketSeat;
    }

    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Customer getTicketCustomer() {
        return this.ticketCustomer;
    }

    public void setTicketCustomer(Customer ticketCustomer) {
        this.ticketCustomer = ticketCustomer;
    }

    
}
