package poly.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import poly.dto.EMPDTO;
import poly.persistance.mapper.IEMPMapper;
import poly.service.IEMPService;

@Service("EMPService")
public class EMPService implements IEMPService{

	@Resource(name="EMPMapper")
	IEMPMapper empManager;
	
	@Override
	public List<EMPDTO> getEmpList() {
		// TODO Auto-generated method stub
		return empManager.getEmpList();
	}
	
}
