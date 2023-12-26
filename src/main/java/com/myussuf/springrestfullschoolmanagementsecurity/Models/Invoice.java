package com.myussuf.springrestfullschoolmanagementsecurity.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Invoice {
    @Id
    private long Id;
    @OneToMany(mappedBy = "invoice")
    private List<Student> studentid;
    @OneToMany(mappedBy = "invoice")
    private List<Subject> subject;
    private boolean paid;
    private Date Duedate;
    private Date InvoiceDate;
    @ManyToOne
    @JoinColumn(name = "payment_id")
    private Payment payment;
}
