package com.kip.backtothepast.biz.api;


import com.kip.backtothepast.biz.model.User;
import com.kip.backtothepast.biz.service.UserService;
import com.kip.backtothepast.server.result.BaseController;
import com.kip.backtothepast.server.result.ResultEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author A
 */
@Api(tags = "用户管理")
@RestController
@RequestMapping("api/user")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;


    @ApiOperation(value = "创建、更新用户")
    @PostMapping("save")
    public ResultEntity save (@RequestBody User user){
        boolean result = userService.saveUser(user);
        if (result) {
            return success(true);
        } else {
            return failed(500, "失败");
        }
    }
}
