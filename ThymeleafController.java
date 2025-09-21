package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {

	// 次のURLで、リクエストハンドラメソッドである helloView が呼び出される。
	// http://localhost:8080/show
	@GetMapping("show")
	public String showView(Model model) {

		// 戻り値は「ビュー名を」を返す。
		return "main";

	}

}
