package edu.mim.subsription.model;

import lombok.Data;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.List;

@Entity
@Data
public class Company {
    @Id
    @GeneratedValue
    Long id;
    String companyName;
    Double packageAmount;
}
