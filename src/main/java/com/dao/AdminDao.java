package com.dao;



import java.util.List;

import com.entity.base.Admin;


/**
 * 
 *    
 * 椤圭洰鍚嶇О锛歭eimingtech-admin   
 * 绫诲悕绉帮細AdminDao   
 * 绫绘弿杩帮細鎺ュ彛
 * 淇敼澶囨敞锛�  
 * @version    
 *
 */
public interface AdminDao {
    
	/**
     * 鏍规嵁鐧诲綍鍚嶆煡鎵剧敤鎴�     * @return
     */
    Admin findByAdminName(String adminName);
    
	public int findAdminCount(Admin admin);
    
//    public List<AdminVo> findAdminList(Pager pager);
    
    public Admin findAdminById(Integer id);
    
    public void save(Admin admin);
    
    public void update(Admin admin);
    
    public void delete(Integer id);
    
}