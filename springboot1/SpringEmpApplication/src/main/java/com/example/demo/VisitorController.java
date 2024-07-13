package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.data.annotation.Id;
@Controller
public class VisitorController {
    @Autowired
    private VisitorRepository visitorRepository;

    @GetMapping("/addVisitor")
    public String addVisitorForm(Model model) {
        model.addAttribute("visitor", new Visitor());
        return "add_visitor";
    }

    @PostMapping("/addVisitor")
    public String addVisitor(@ModelAttribute Visitor visitor) {
        visitorRepository.save(visitor);
        return "redirect:/dashboard";
    }

    @GetMapping("/showVisitors")
    public String showVisitors(Model model) {
        List<Visitor> visitors = visitorRepository.findAll();
        model.addAttribute("visitors", visitors);
        return "show_visitors";
    }

    @GetMapping("/deleteVisitor/{id}")
    public String deleteVisitor(@PathVariable Long id) {
        visitorRepository.deleteById(id);
        return "redirect:/showVisitors";
    }

    @GetMapping("/editVisitor/{id}")
    public String editVisitorForm(@PathVariable Long id, Model model) {
        Visitor visitor = visitorRepository.findById(id).orElse(null);
        model.addAttribute("visitor", visitor);
        return "edit_visitor";
    }

    @PostMapping("/updateVisitor/{id}")
    public String updateVisitor(@PathVariable Long id, @ModelAttribute Visitor updatedVisitor) {
        visitorRepository.findById(id).ifPresent(visitor -> {
            visitor.setName(updatedVisitor.getName());
            visitor.setMobileNo(updatedVisitor.getMobileNo());
            
            visitor.setIdCardDetails(updatedVisitor.getIdCardDetails());
            visitorRepository.save(visitor);
        });
        return "redirect:/showVisitors";
    }
}
// VisitorController.java
