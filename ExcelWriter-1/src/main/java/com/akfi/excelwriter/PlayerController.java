package com.akfi.excelwriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*") // Allows calls from frontend
public class PlayerController {

    @Autowired
    private ExcelWriterService excelWriterService;

    @PostMapping("/submit")
    public String savePlayer(@RequestBody Player player) {
        try {
            excelWriterService.writePlayer(player);
            return "Player saved to Excel successfully!";
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}
