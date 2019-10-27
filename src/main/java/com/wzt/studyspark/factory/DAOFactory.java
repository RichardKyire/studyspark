package com.wzt.studyspark.factory;


import com.wzt.studyspark.dao.ITaskDAO;
import com.wzt.studyspark.dao.TaskDAOImpl;

/**
 * DAO工厂类
 * @author Administrator
 *
 */
public class DAOFactory {

	/**
	 * 获取任务管理DAO
	 * @return DAO
	 */
	public static ITaskDAO getTaskDAO() {
		return new TaskDAOImpl();
	}
	
}
