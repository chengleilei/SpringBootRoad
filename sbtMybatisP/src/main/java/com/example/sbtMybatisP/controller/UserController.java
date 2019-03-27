package com.example.sbtMybatisP.controller;

import org.springframework.web.bind.annotation.*;

import com.example.sbtMybatisP.mapper.UserMapper;
import com.example.sbtMybatisP.entity.T_user;

import javax.annotation.Resource;
import java.util.List;
/**
*@Autor:cll
*@CreateDate:2019/3/25 16:23
*@version:1.0
*@Description:controller file,curd
*/
@RestController
public class UserController {
    @Resource
    private UserMapper um;

    //Increase one record
    @RequestMapping(value = "/addRecord", method = RequestMethod.POST)
    public int addRecord(T_user ur){
        //
        //T_user nUser = new T_user(5, "er", "nan", 190, 90);
        //T_user nUser = new T_user();
        //nUser.setName("ll");
        return um.insert(ur);

    }
    //Delete
    @RequestMapping(value = "/delete/id/{id}", method = RequestMethod.DELETE)
    public int deleteById(@PathVariable("id") Integer id){
        //
        return um.deleteById(id);
    }
    //updateByid
    @RequestMapping(value = "/update", method=RequestMethod.PUT)
    public int updateById(T_user ur){
        return um.updateById(ur);
    }
    //selectList:Query All
    @RequestMapping("/select")
    public List selectAll(){
        //
        List<T_user> user = um.selectList(null);
        for(int i = 0; i < user.size(); i++){
            System.out.println(user.get(i));
            System.out.println(user.get(i).getClass());
            System.out.println("==");
        }
        //System.out.println(user);
        return user;
    }
}
