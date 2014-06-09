package demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 * 
 * @author Administrator
 * @date 2013年6月16日 15:56:19
 * @describe 城市表
 * 
 */
@Entity
public class City
{

	/**
	 * 城市ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	/**
	 * 城市名称
	 */
	private String name;
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "city_ID", insertable = false, updatable = false)
	private Set<Area> areas = new HashSet<Area>();

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Set<Area> getAreas()
	{
		return areas;
	}

	public void setAreas(Set<Area> areas)
	{
		this.areas = areas;
	}

}
