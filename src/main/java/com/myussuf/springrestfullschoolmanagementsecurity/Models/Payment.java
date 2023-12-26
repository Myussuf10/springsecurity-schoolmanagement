package com.myussuf.springrestfullschoolmanagementsecurity.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    @Id
    private long id;
    @OneToMany(mappedBy = "payment")
    private List<Invoice> invoice;
    private String paymentMethod;
    private Status status;
    private Date paymentDate;

}
