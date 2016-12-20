package com.eMusicStore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by cheyufei on 12/19/16.
 */
@Controller
public class HomeController {

    @RequestMapping
    public String home() {
        return "home";
    }
}
