package poly.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import poly.dto.EMPDTO;
import poly.service.IEMPService;
@Controller
public class EMPController {
	private Logger log=Logger.getLogger(getClass());
	
	@Resource(name="EMPService")
	IEMPService empService;
	
	@RequestMapping(value="EMP/EMPList")
	public String EMPList(ModelMap model){
		
		List<EMPDTO> rList=empService.getEmpList();  
		model.addAttribute("rList",rList);

		log.info("empList 시작");
		try {
		for(EMPDTO e : rList) {
			log.info("ename :" +e.getEname());
			log.info("empno :" +e.getEmpno());
		}
		
		}catch(NullPointerException e) {
			log.info("널포인터 오류 발생");
		}
		catch (Exception e) {
			log.info("-----오류발생------");
		}
		return "/EMP/EMPList";
	}
}
