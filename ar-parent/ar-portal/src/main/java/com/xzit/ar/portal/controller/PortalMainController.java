/**  
 * @Title: MainController.java
 * @Package com.xzit.ar.portal.controller
 * @Description: TODO
 * @author Mr.Black
 * @date 2016年1月14日 下午2:05:32
 * @version V1.0  
 */
package com.xzit.ar.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xzit.ar.common.base.BaseController;

/**
 * @ClassName: MainController
 * @Description: TODO PortalMainController
 * @author Mr.Black
 * @date 2016年1月14日 下午2:05:32
 */
@Controller
@RequestMapping("")
public class PortalMainController extends BaseController {

	@RequestMapping("/index")
	public String index() {
		return "portal-main/index";
	}
}