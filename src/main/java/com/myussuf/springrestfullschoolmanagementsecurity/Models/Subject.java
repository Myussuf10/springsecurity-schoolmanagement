package com.myussuf.springrestfullschoolmanagementsecurity.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subject
{   @Id
    private long subejctid;
    @OneToMany(mappedBy = "subject")
    private List<Student> student;
    private String subjectname;
    private int price;
    @ManyToOne
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;
}
