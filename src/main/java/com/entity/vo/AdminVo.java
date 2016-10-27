package com.entity.vo;



import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

import com.entity.base.Admin;



/**
 * admin 绠＄悊鍛樿〃
 *    
 * 椤圭洰鍚嶇О锛歭eimingtech-entity   
 * 绫诲悕绉帮細Admin   
 * 绫绘弿杩帮細   
 * 淇敼澶囨敞锛�  
 * @version    
 *
 */
@Data
@ToString
public class AdminVo extends Admin implements Serializable {
	
	private String gname;

}