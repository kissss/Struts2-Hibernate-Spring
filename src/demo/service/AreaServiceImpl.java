package demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.dao.BaseDaoI;
import demo.model.Area;

@Service("areaService")
public class AreaServiceImpl implements AreaServiceI
{

	private BaseDaoI<Area> areaDao;

	@Autowired
	public void setAreaDao(BaseDaoI<Area> areaDao)
	{
		this.areaDao = areaDao;
	}

	@Override
	public void saveArea(Area area)
	{
		areaDao.save(area);
	}
}
