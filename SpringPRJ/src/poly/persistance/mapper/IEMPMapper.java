package poly.persistance.mapper;

import java.util.List;

import config.Mapper;
import poly.dto.EMPDTO;

@Mapper("EMPMapper")
public interface IEMPMapper {

	List<EMPDTO> getEmpList();



}
