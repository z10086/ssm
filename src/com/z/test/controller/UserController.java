package com.z.test.controller;

/**
 * Created by Administrator on 2015/11/22.
 */


        import javax.annotation.Resource;
        import javax.servlet.http.HttpServletRequest;

        import com.z.test.pojo.User;
        import com.z.test.service.IUserService;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;

    @RequestMapping("/showUser")
    @ResponseBody
    public User toIndex(HttpServletRequest request,Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUserById(userId);
        model.addAttribute("user", user);
        return user;
    }
}
