package demo.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * 
 * @author Administrator
 * @date 2013年6月16日 15:56:14
 * @describe 地区表
 * 
 */
@Entity
public class Area
{

	/**
	 * 地区ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	/**
	 * 地区名称
	 */
	private String name;
	/**
	 * 城市ID
	 */
	private Integer city_ID;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "city_ID", insertable = false, updatable = false)
	private City city;

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public Integer getCity_ID()
	{
		return city_ID;
	}

	public void setCity_ID(Integer city_ID)
	{
		this.city_ID = city_ID;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public City getCity()
	{
		return city;
	}

	public void setCity(City city)
	{
		this.city = city;
	}
}
