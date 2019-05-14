package com.yzculturemdedia.pms.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

/**
 * 项目里程碑。
 * @author Administrator
 */
@Entity
public class ProjectMileStore {
	//主键、项目主键、阶段编号、阶段描述、
	@Id
	@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
	@GeneratedValue(generator = "jpa-uuid")
	private String id;//主键
	@Column
	private String pid;//项目id
	@Column
	private Integer phase;//阶段。数字
	@Column
	private String description;//描述
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public Integer getPhase() {
		return phase;
	}
	public void setPhase(Integer phase) {
		this.phase = phase;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	@Override
	public String toString() {
		return "ProjectMileStore [id=" + id + ", pid=" + pid + ", phase=" + phase + ", description=" + description
				+ "]";
	}
	
	
	
}
