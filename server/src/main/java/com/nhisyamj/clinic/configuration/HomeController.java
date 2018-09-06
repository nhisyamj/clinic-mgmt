package com.nhisyamj.clinic.configuration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *<h1>HomeController</h1>
 * Home redirection to swagger api documentation
 * <p>
 ***
 * @author: Hisyam Johan
 * @since: 16/08/2018
 * @version: 1.0
 * Time: 10:50 PM
 * Email: nhisyamj@gmail.com
 ***
 */

@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String index() {
        System.out.println("swagger-ui.html");
        return "redirect:swagger-ui.html";
    }
}
