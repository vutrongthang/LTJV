/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vtt.controllers;

import com.vtt.pojo.Category;
import com.vtt.pojo.Product;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author admin
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model model) {
    List<Category> cates = new ArrayList<>();
    cates.add(new Category(1, "Mobile"));
    cates.add(new Category(1, "Tablet"));
    cates.add(new Category(1, "Desktop"));
    
    List<Product> products = new ArrayList<>();
    products.add(new Product(1, "Ipad Pro 2020", "https://vtv1.mediacdn.vn/2019/10/10/photo-1-15706463929181755249740.jpg"));
    products.add(new Product(1, "Ipad Pro 2020", "https://vtv1.mediacdn.vn/2019/10/10/photo-1-15706463929181755249740.jpg"));
    products.add(new Product(1, "Ipad Pro 2020", "https://vtv1.mediacdn.vn/2019/10/10/photo-1-15706463929181755249740.jpg"));
    products.add(new Product(1, "Ipad Pro 2020", "https://vtv1.mediacdn.vn/2019/10/10/photo-1-15706463929181755249740.jpg"));
    products.add(new Product(1, "Ipad Pro 2020", "https://vtv1.mediacdn.vn/2019/10/10/photo-1-15706463929181755249740.jpg"));
    
    model.addAttribute("categories", cates);
    model.addAttribute("products", products);
        return "index";
    }
}
