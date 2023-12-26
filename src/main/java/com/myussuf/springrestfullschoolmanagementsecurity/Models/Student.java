package com.myussuf.springrestfullschoolmanagementsecurity.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
    @Id
    private long studentid;
    private String fullname;
    private String address;
    private String fathercontact;
    private String mothercontact;
    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;
    @ManyToOne
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;

}
