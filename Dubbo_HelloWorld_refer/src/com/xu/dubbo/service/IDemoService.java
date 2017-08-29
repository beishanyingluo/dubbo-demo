package com.xu.dubbo.service;

/**
 * 此接口应该 服务提供方提供jar包
 * (该接口需单独打包，在服务提供方和消费方共享)
 * @author Administrator
 *
 */
public interface IDemoService {
	/**
	 * 求和
	 * @param x
	 * @param y
	 * @return
	 */
	public int sum(Integer x ,Integer y);
	/**
	 * 计算连个数的乘积
	 * @param x
	 * @param y
	 * @return
	 */
	public int multi(Integer x ,Integer y);
	
}
