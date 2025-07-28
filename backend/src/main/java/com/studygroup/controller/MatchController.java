package com.studygroup.controller;

import com.studygroup.entity.User;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

@RestController
@RequestMapping("/match")
public class MatchController {

    @PostMapping("/run")
    public String match(@RequestBody List<User> users) {
        try {
            ProcessBuilder pb = new ProcessBuilder("python3", "scripts/matchmaker.py");
            Process p = pb.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            StringBuilder result = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                result.append(line).append("\n");
            }
            return result.toString();
        } catch (Exception e) {
            return "Error running matcher: " + e.getMessage();
        }
    }
}
