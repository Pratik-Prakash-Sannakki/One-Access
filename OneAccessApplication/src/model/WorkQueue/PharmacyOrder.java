/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.WorkQueue;

import model.PharmacyCatalog.PharmacyCatalog;

/**
 *
 * @author adityaillur
 */
public class PharmacyOrder {
    public PharmacyOrder(PharmacyCatalog catalog) {
        this.catalog = catalog;
    }

    public PharmacyCatalog getCatalog() {
        return catalog;
    }

    public void setCatalog(PharmacyCatalog catalog) {
        this.catalog = catalog;
    }
    private PharmacyCatalog catalog;
}
