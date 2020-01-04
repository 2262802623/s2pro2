package com.Attence.dao;

import java.util.List;

import com.Attence.entity.ATTENCE;

public interface ATTENCEdao {

	/**
	 * 查询
	 * @return 查询结果
	 */
	
	public List<ATTENCE> getShow();
	
	/**
	 * 添加考勤
	 * @param attence 传一个实体类
	 * @return 添加结果
	 */
	
	public int getadd(ATTENCE attence);
	
	/**
	 * 修改考勤
	 * @param attence 传一个实体类
	 * @return 修改结果
	 */
	
	public int getmodification(ATTENCE attence);
	
	/**
	 * 删除考勤
	 * @param ID 传一个ID
	 * @return 删除结果
	 */
	
	public int delete(int ID);
	
	/**
	 * 传一id修改
	 * @param ID 传一个id
	 * @return  修改结果
	 */
	
	public ATTENCE transfer(int ID);
}
