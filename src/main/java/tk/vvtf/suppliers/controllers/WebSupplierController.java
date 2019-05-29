package tk.vvtf.suppliers.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tk.vvtf.suppliers.FakeDB;

@Controller
public class WebSupplierController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String offers(Model model) {
        model.addAttribute("supplierReports", FakeDB.supplierReports);
        return "index";
    }

}
