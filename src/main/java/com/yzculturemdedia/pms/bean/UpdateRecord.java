package com.yzculturemdedia.pms.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class UpdateRecord {
	//项目主键、用户主键、更新描述、更新时间
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;
	@Column
	private String pid;
	@Column
	private String uid;
	@Column
	private String description;
	@Column
	private String lastupdate;
	
	
	
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
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLastupdate() {
		return lastupdate;
	}
	public void setLastupdate(String lastupdate) {
		this.lastupdate = lastupdate;
	}
	@Override
	public String toString() {
		return "UpdateRecord [id=" + id + ", pid=" + pid + ", uid=" + uid + ", description=" + description
				+ ", lastupdate=" + lastupdate + "]";
	}
	
	 
	
}
