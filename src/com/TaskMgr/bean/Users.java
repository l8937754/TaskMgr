package com.TaskMgr.bean;

import java.io.Serializable;
public class Users implements Serializable{
/*自动生成类，部分字段需要调整*/
private String ID;
private String NAME;
private String LOGINNAME;
private String PASSWORD; 
private String DEPARTMANT;
private String GROUPS;
private String STATUS;
private String GROUPTYPE;

public void setID(String ID){ this.ID=ID; }

public String getID(){ return ID; }

public void setNAME(String NAME){ this.NAME=NAME; }

public String getNAME(){ return NAME; }

public void setLOGINNAME(String LOGINNAME){ this.LOGINNAME=LOGINNAME; }

public String getLOGINNAME(){ return LOGINNAME; }

public void setPASSWORD(String PASSWORD){ this.PASSWORD=PASSWORD; }

public String getPASSWORD(){ return PASSWORD; }

public void setDEPARTMANT(String DEPARTMANT){ this.DEPARTMANT=DEPARTMANT; }

public String getDEPARTMANT(){ return DEPARTMANT; }

public void setGROUPS(String GROUPS){ this.GROUPS=GROUPS; }

public String getGROUPS(){ return GROUPS; }

public void setSTATUS(String STATUS){ this.STATUS=STATUS; }

public String getSTATUS(){ return STATUS; }

public void setGROUPTYPE(String GROUPTYPE){ this.GROUPTYPE=GROUPTYPE; }

public String getGROUPTYPE(){ return GROUPTYPE; }

}
