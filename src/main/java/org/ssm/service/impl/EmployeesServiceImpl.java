package org.ssm.service.impl;

import org.springframework.stereotype.Service;
import org.ssm.dao.IEmployeesMapper;
import org.ssm.pojo.Employees;
import org.ssm.service.IEmployeesService;

import javax.annotation.Resource;

/**
 * @author wgp
 * @remark
 * @create 2019-10-28-11:07
 */
@Service
public class EmployeesServiceImpl implements IEmployeesService {

    @Resource
    private IEmployeesMapper mapper;

    @Override
    public int deleteByPrimaryKey(Integer empNo) {
        return mapper.deleteByPrimaryKey(empNo);
    }

    @Override
    public int insert(Employees record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Employees record) {
        return mapper.insertSelective(record);
    }

    @Override
    public Employees selectByPrimaryKey(Integer empNo) {
        return mapper.selectByPrimaryKey(empNo);
    }

    @Override
    public int updateByPrimaryKeySelective(Employees record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Employees record) {
        return mapper.updateByPrimaryKey(record);
    }
}
