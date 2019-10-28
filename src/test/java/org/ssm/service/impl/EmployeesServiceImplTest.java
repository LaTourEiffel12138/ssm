package org.ssm.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.ssm.dao.IEmployeesMapper;
import org.ssm.pojo.Employees;

import static org.junit.Assert.*;

/**
 * @author wgp
 * @remark
 * @create 2019-10-28-11:34
 */
//配置spring和junit整合，这样junit在启动时就会加载spring容器
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring的配置文件
@ContextConfiguration({"classpath:applicationContext.xml"})
public class EmployeesServiceImplTest {

    @Autowired(required = false)
    private EmployeesServiceImpl service;

    @Test
    public void selectByPrimaryKey() {
        Integer empNo = 10001;
        Employees employees = service.selectByPrimaryKey(empNo);
        System.out.print("Employees"+employees);
    }
}