package com.shxt.modual.userinfo.domain;

public class userinfo {
private String id;
private String account;
private String realname;
private String sex;
private String stat;
private String department_id;
private String department_name;

public String getDepartment_name() {
	return department_name;
}
public void setDepartment_name(String department_name) {
	this.department_name = department_name;
}
public String getDepartment_id() {
	return department_id;
}
public void setDepartment_id(String department_id) {
	this.department_id = department_id;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getAccount() {
	return account;
}
public void setAccount(String account) {
	this.account = account;
}
public String getRealname() {
	return realname;
}
public void setRealname(String realname) {
	this.realname = realname;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public String getStat() {
	return stat;
}
public void setStat(String stat) {
	this.stat = stat;
}
@Override
public String toString() {
	return "userinfo [id=" + id + ", account=" + account + ", realname=" + realname + ", sex=" + sex + ", stat=" + stat
			+ "]";
}


}
