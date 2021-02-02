package edu.mim.subsription.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Subscription {
    @Id
    @GeneratedValue
    private Long id;
    private Double subscriptionCharge;
    @OneToOne
    private User subscriptionUser;
    @OneToOne
    private Company subscriptionCompany;
}
