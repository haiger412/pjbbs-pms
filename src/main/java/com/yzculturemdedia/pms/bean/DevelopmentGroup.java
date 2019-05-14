package com.yzculturemdedia.pms.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

/**
 * 项目开发组成员。
 * @author Administrator
 *
 */
@Entity
public class DevelopmentGroup {
	@Id
	@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
	@GeneratedValue(generator = "jpa-uuid")
	private String pid;//项目id
	
	@Column
	private String uid;//用户id
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
	
	@Override
	public String toString() {
		return "DevelopmentGroup [pid=" + pid + ", uid=" + uid + "]";
	}
	
}
