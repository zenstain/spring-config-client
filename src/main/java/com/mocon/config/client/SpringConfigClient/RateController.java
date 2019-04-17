package com.mocon.config.client.SpringConfigClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RateController {
    @Value("${rate}")
    String rate;

    @Value("${lanecount}")
    String laneCount;

    @Value("${tollstart}")
    String tollStart;

    @Value("${tollstop}")
    String tollEnd;

    @RequestMapping("/rate")
    public String getRate(Model m) {
        m.addAttribute("rateamount", rate);
        m.addAttribute("lanes", laneCount);
        m.addAttribute("tollstart", tollStart);
        m.addAttribute("tollend", tollEnd);

        return "rateview"; //view name
    }
}
