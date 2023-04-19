//package com.landproject.model;
//
//import lombok.Getter;
//import lombok.Setter;
//
//import javax.persistence.*;
//
//@Entity
//@Getter
//@Setter
//public class InvestorBid {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private int ibId;
//    private long numOfBricks;
//    private float bidPercent;
//    @OneToOne
//    @JoinColumn(name = "invBidId", referencedColumnName = "invId")
//    private Investor investor;
//    @ManyToOne
//    @JoinColumn(name = "invBidLand", referencedColumnName = "landId")
//    private Land landList;
//}
