/**
 * Project Name:simpledemo
 * File Name:myController.java
 * Package Name:com.wangmeng.springclouddocker.simpledemo.controller
 * Date:2019年4月28日下午11:04:49
 * Copyright (c) 2019, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.wangmeng.springclouddocker.simpledemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:myController <br/>
 * Function: test myController. <br/>
 * Date: 2019年4月28日 下午11:04:49 <br/>
 * 
 * @author wangmeng
 * @version
 * @see
 */

@RestController
@RequestMapping("/mycontroller")
public class myController {
	@GetMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name) {
		return "hello " + name;
	}
}

