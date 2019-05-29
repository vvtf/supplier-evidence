package tk.vvtf.suppliers.controllers;

import org.springframework.web.bind.annotation.*;
import tk.vvtf.suppliers.FakeDB;
import tk.vvtf.suppliers.entity.SupplierReport;

@RestController
public class SupplierController {

    @PostMapping("/postSupplierReport")
    public void postJobOffer(@RequestBody SupplierReport supplierReport) {
        System.out.println(supplierReport);
        FakeDB.supplierReports.add(supplierReport);
    }
}
