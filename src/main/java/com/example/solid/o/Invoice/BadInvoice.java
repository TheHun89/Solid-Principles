package com.example.solid.o.Invoice;

import lombok.Data;

@Data
public class BadInvoice {
    Invoice invoice;

    public BadInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToFile(String filename) {
        // Creates a file with given name and writes the invoice
    }

    public void saveToDatabase() {
        // Saves the invoice to database
    }
}
