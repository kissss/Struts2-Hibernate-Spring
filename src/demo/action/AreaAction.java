package demo.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import demo.model.Area;
import demo.service.AreaServiceI;

@ParentPackage("basePackage")
@Namespace("/")
@Action("AreaAction")
@Results(
{ @Result(name = "success", location = "/success.jsp"), @Result(name = "error", location = "/error.jsp") })
public class AreaAction
{

	private AreaServiceI areaService;
	private Area area;

	@Autowired
	public void setAreaService(AreaServiceI areaService)
	{
		this.areaService = areaService;
	}

	public String saveAreaAction()
	{
		try
		{
			areaService.saveArea(area);
			return "success";
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return "error";
	}

	public Area getArea()
	{
		return area;
	}

	public void setArea(Area area)
	{
		this.area = area;
	}
}
