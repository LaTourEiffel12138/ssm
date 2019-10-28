package org.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.ssm.pojo.Employees;
import org.ssm.service.IEmployeesService;

import javax.annotation.Resource;

/**
 * @author wgp
 * @remark
 * @create 2019-10-28-13:26
 */
@Controller
@RequestMapping("/employees")
public class EmployeesController implements IEmployeesService {

    @Resource
    private IEmployeesService service;

    @Override
    public int deleteByPrimaryKey(Integer empNo) {
        return 0;
    }

    @Override
    public int insert(Employees record) {
        return 0;
    }

    @Override
    public int insertSelective(Employees record) {
        return 0;
    }

    @Override
    public Employees selectByPrimaryKey(@RequestParam(value = "empNo",required = false) Integer empNo) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Employees record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Employees record) {
        return 0;
    }
}
