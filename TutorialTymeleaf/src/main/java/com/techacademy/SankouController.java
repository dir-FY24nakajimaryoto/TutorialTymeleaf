package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SankouController {

    @GetMapping("/sankou/{val1}/{val2}")
    public String getSankou(@PathVariable int val1, @PathVariable int val2, Model model) {
        
        // パスパラメータで受け取った値をModelに登録
        model.addAttribute("val1", val1);
        model.addAttribute("val2", val2);
        
        // sankou.htmlに画面遷移
        return "sankou";
    }
    
}
