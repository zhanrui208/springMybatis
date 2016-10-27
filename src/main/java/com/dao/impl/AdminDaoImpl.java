package com.dao.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.dao.AdminDao;
import com.dao.mapper.AdminMapper;
import com.entity.base.Admin;
import com.entity.vo.AdminVo;



@Repository
public class AdminDaoImpl implements AdminDao {
	
    @Resource
    private AdminMapper adminMapper;

    /**
     *获取总条�?     */
    public int findAdminCount(Admin admin) {
        return adminMapper.findAdminCount(admin);
    }

//    /**
//     * 分页
//     */
//    public List<AdminVo> findAdminList(Pager pager) {
//        return adminMapper.findAdminList(pager);
//    }

    @Override
    public void save(Admin admin) {
        // TODO Auto-generated method stub
        adminMapper.save(admin);
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        adminMapper.delete(id);
    }

    @Override
    public void update(Admin admin) {
        // TODO Auto-generated method stub
        adminMapper.update(admin);
    }

    @Override
    public Admin findAdminById(Integer id) {
        // TODO Auto-generated method stub
        return adminMapper.findAdminById(id);
    }

    @Override
    public Admin findByAdminName(String adminName) {
        return adminMapper.findByAdminName(adminName);
    }

}
