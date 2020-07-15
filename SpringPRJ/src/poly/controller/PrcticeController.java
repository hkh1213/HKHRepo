package poly.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.omg.CORBA.NVList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static poly.util.CmmUtil.nvl;

@Controller
public class PrcticeController {

	private Logger log=Logger.getLogger(this.getClass());
	

	@RequestMapping(value="table")
	public String table() {
		log.info("table Start!!");
		
		return "/table";
	}

	/*
	 * @RequestMapping(value="get") public String get(HttpServletRequest
	 * request,ModelMap model) throws Exception { String
	 * name=nvl(request.getParameter("name"));
	 * 
	 * model.addAttribute("name",name); log.info("name :"+name);
	 * 
	 * return "/get"; }
	 */	
	/*
	 * @RequestMapping(value="postForm") public String postForm() {
	 * log.info("PostForm Start"); return "/postForm"; }
	 */
	@RequestMapping(value="doPost",method=RequestMethod.POST)
	public String doPost(HttpServletRequest request,ModelMap model)
			throws Exception {
		String name=nvl(request.getParameter("name"));
		
		log.info("get 시작");
		log.info("name :"+name);
		model.addAttribute("name",name);
		if(name.equals("홍기현"))
			return "/get";	
		else
			return "/postForm2";
	}	
}
