package com.fuchengbang.eduservice.controller;

import com.fuchengbang.commonutils.R;
import org.springframework.web.bind.annotation.*;


/**
 * @Auther : coach
 * @create : 2020/11/27 0027 13:38
 */
@RestController
@RequestMapping("eduservice/user")
@CrossOrigin //解决跨域问题
public class LoginController {
    //login
    @PostMapping("/login")
    public R login() {
        return R.ok().data("token", "admin");
    }

    //info
    @GetMapping("/info")
    public R info() {
        return R.ok().data("roles", "[admin]").data("name", "admin").data("avatar", "https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
    }
}
