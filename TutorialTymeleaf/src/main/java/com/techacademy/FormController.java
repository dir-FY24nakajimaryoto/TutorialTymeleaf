package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.annotation.PostConstruct;

@Controller
public class FormController {

    // "/input"アドレスに対する「GETメソッド」を受け取る関数
    // - ~~/inputにアクセスするとgetFormメソッドが実行される
    @GetMapping("/input")
    public String getForm() {
        // input.htmlに画面遷移
        return "input";
    }
    
    // "/confirm"アドレスに対する「POSTメソッド」を受け取る関数
    // - input.htmlの「送信」ボタンをクリックすると、フォームの内容がPOSTメソッドとしてサーバに送信される
    // -- POSTメソッドとして送信された際にpostFormメソッドが実行される
    // - @RequestParam("val")でフォームから送信されたvalの値を取得
    // -- フォームで送信された値を取得するアノテーション。引数の名前とフォーム送信の名前は一致すべし
    // -- フォームから送信されたvalという名の値を、String valに渡している
    @PostMapping("/confirm")
    public String postForm(@RequestParam("val") String val, Model model) {
        
        // フォームから送信されてきた値をModelに登録
        model.addAttribute("val", val);
        
        // confirm.htmlに画面遷移
        return "confirm";
    }
    
}
