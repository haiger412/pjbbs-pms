package com.yzculturemdedia.pms.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Project {
	//主键、项目名称、开始时间、开发周期、进度、创建者、创建时间、更新时间、背景图。
	@Id
	@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
	@GeneratedValue(generator = "jpa-uuid")
	private String id;
	@Column
	private String name;
	@Column
	private String startdate;
	@Column
	private String daylimit;//工期
	@Column
	private String progress;//进度
	@Column
	private String createdby;//创建者id
	@Column
	private String coverimg;//封面图地址。
	@Column
	private String creationtime;//创建时间。
	@Column
	private String lastupdate;//更新时间。
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getDaylimit() {
		return daylimit;
	}
	public void setDaylimit(String daylimit) {
		this.daylimit = daylimit;
	}
	public String getProgress() {
		return progress;
	}
	public void setProgress(String progress) {
		this.progress = progress;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	public String getCoverimg() {
		return coverimg;
	}
	public void setCoverimg(String coverimg) {
		this.coverimg = coverimg;
	}
	public String getCreationtime() {
		return creationtime;
	}
	public void setCreationtime(String creationtime) {
		this.creationtime = creationtime;
	}
	public String getLastupdate() {
		return lastupdate;
	}
	public void setLastupdate(String lastupdate) {
		this.lastupdate = lastupdate;
	}
	
	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", startdate=" + startdate + ", daylimit=" + daylimit
				+ ", progress=" + progress + ", createdby=" + createdby + ", coverimg=" + coverimg + ", creationtime="
				+ creationtime + ", lastupdate=" + lastupdate + "]";
	}

	
	
}
