package com.example.sbtMybatisP.controller;

import org.apache.ibatis.jdbc.Null;
import org.springframework.web.bind.annotation.*;

import com.example.sbtMybatisP.mapper.UserMapper;
import com.example.sbtMybatisP.entity.T_user;

import javax.annotation.Resource;
import java.util.HashMap;
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
        int resultNum = -1;
        try{
            resultNum = um.insert(ur);
        }catch(Exception e){
            e.printStackTrace();
        }
        //
        //T_user nUser = new T_user(5, "er", "nan", 190, 90);
        //T_user nUser = new T_user();
        //nUser.setName("ll");
        return resultNum;

    }
    //Delete
    @RequestMapping(value = "/delete/id/{id}", method = RequestMethod.DELETE)
    public int deleteById(@PathVariable("id") Integer id){
        //
        int resultNum = -1;
        try{
            resultNum = um.deleteById(id);
        }catch(Exception e){
            e.printStackTrace();
        }
        return resultNum;
    }
    //updateByid
    @RequestMapping(value = "/update", method=RequestMethod.PUT)
    public int updateById(T_user ur){
        int resultNum = -1;
        try{
            resultNum = um.updateById(ur);
        }catch(Exception e){
            e.printStackTrace();
        }
        return resultNum;
    }
    //selectList:Query All
    @RequestMapping("/select")
    public List selectAll(){
        //
        List<T_user> user = null;
        try{
            user = um.selectList(null);
            for(int i = 0; i < user.size(); i++){
                System.out.println(user.get(i));
                System.out.println(user.get(i).getClass());
                System.out.println("==");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        //System.out.println(user);
        return user;
    }
    @RequestMapping(value = "/selectByMap", method = RequestMethod.GET)
    public List selectByMap(String sName){
        //
        List<T_user> ur = null;
        try{
            HashMap<String, Object> Smap = new HashMap<>(10);
            Smap.put("name", sName);
            ur = um.selectByMap(Smap);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
