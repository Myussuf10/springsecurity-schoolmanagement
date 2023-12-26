package com.myussuf.springrestfullschoolmanagementsecurity.Repository;

import com.myussuf.springrestfullschoolmanagementsecurity.Models.Invoice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepo extends CrudRepository<Invoice,Long> {
}
