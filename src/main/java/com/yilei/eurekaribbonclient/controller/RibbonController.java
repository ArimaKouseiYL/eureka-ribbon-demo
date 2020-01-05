package com.yilei.eurekaribbonclient.controller;

import com.yilei.eurekaribbonclient.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: yilei
 * @Date: 2020/1/5
 * @Description:
 */
@RestController
public class RibbonController {

    @Autowired
    RibbonService ribbonService;

    @GetMapping("hi")
    public String hi(@RequestParam(required = false,defaultValue = "leis") String name){
        return ribbonService.hi(name);
    }

}
