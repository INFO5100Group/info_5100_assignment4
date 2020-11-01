/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Useinterface;

import Business.Airliner.*;
import Business.Flight.*;
import Business.Persona.*;
import Business.Travel.*;
import Useinterface.CustomerAction.*;
import Useinterface.Flight.*;
import Useinterface.ManageAirliners.*;
import Test.*;

import java.awt.CardLayout;

/**
 *
 * @author Administrator
 */
public class TravelAgencyMainJFrame extends javax.swing.JFrame {
    TravelAgency travelAgency;
    TravelOffice travelOffice;
    MasterTravelSchedule masterTravelschedule;
    /**
     * Creates new form TravelAgencyMainJFram
     */
    public TravelAgencyMainJFrame() {
        this.travelAgency = new TravelAgency();
        this.travelOffice = new TravelOffice();
        this.masterTravelschedule = new MasterTravelSchedule();
        initComponents();
        initData();
        
        setSize(1000, 800);
    }
    
    private void initData(){
        this.masterTravelschedule.getTravelOffice().setCustomerDirecotry(InitEverything.createCustomers());
        this.masterTravelschedule.getTravelOffice().setTicketDirectory(InitEverything.createTickets(this.masterTravelschedule.getTravelOffice().getCustomerDirecotry()));
        this.travelAgency.setAirlinerDirectory(InitEverything.createAirliners()); // create airliners
        for(Airliner liner : this.travelAgency.getAirlinerDirectory()){ // load all flights into a master list
            for(Flight f : liner.getSchedule()){
                this.masterTravelschedule.getFlightSchedule().add(f);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnAirliners = new javax.swing.JButton();
        btnFlight = new javax.swing.JButton();
        btnCustomer = new javax.swing.JButton();
        UserProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(200);

        btnAirliners.setText("CreateAirliners");
        btnAirliners.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAirlinersActionPerformed(evt);
            }
        });

        btnFlight.setText("CreateFlight");
        btnFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFlightActionPerformed(evt);
            }
        });

        btnCustomer.setText("Customer");
        btnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAirliners, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(btnAirliners, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(btnFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        UserProcessContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(UserProcessContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 844, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
        CustomerViewJPanel ccp = new CustomerViewJPanel(UserProcessContainer,masterTravelschedule);
        UserProcessContainer.add("customersview",ccp);
        CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
        layout.next(UserProcessContainer);
    }//GEN-LAST:event_btnCustomerActionPerformed

    private void btnFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFlightActionPerformed
        // TODO add your handling code here:
        FlightSchedule mt = masterTravelschedule.getFlightSchedule();
        CreateNewFlightsJPanel cnfp = new CreateNewFlightsJPanel(UserProcessContainer,masterTravelschedule);
        UserProcessContainer.add("flightcreajpanel",cnfp);
        CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
        layout.next(UserProcessContainer);
    }//GEN-LAST:event_btnFlightActionPerformed

    private void btnAirlinersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAirlinersActionPerformed
        // TODO add your handling code here:
        AirlinerDirectory ad = travelAgency.getAirlinerDirectory();
        CreateNewAirlinerJPanel cna = new CreateNewAirlinerJPanel(UserProcessContainer,travelAgency);
        UserProcessContainer.add("CreateNewAirlinerJPanel",cna);
        CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
        layout.next(UserProcessContainer);
    }//GEN-LAST:event_btnAirlinersActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TravelAgencyMainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel UserProcessContainer;
    private javax.swing.JButton btnAirliners;
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnFlight;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
