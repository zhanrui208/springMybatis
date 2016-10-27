package com.dao.mapper;



import java.util.List;

import com.core.SqlMapper;
import com.entity.base.Admin;
import com.entity.vo.AdminVo;


@SqlMapper
public interface AdminMapper {

	Admin findByAdminName(String adminName);
	
	int findAdminCount(Admin admin);
    
//    List<AdminVo> findAdminList(Pager pager);
    
    Admin findAdminById( Integer id);
    
    void save(Admin admin);
    
    void update(Admin admin);
    
    void delete(Integer id);
}
