package com.TaskMgr.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.TaskMgr.bean.Notice;
import com.TaskMgr.bean.Users;
import com.TaskMgr.service.UsersServer;
import com.TaskMgr.service.ILoginLogServer;
import com.TaskMgr.service.INoticeServer;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<Users>{

	private Users user = new Users();
	@Override
	public Users getModel() {
		// TODO Auto-generated method stub
		return user;
	}
  private UsersServer userserver;
  private ILoginLogServer loginlogserver;
  private INoticeServer noticeserver;
  
  public void setUserserver(UsersServer us) {this.userserver = us;}
  public void setLoginlogserver(ILoginLogServer loginlogserver) {this.loginlogserver =loginlogserver;}
  public void setNoticeserver(INoticeServer noticeserver) {this.noticeserver=noticeserver;}
  
  public String login() {	  
	  Users userinfo = userserver.findoneuser(user);
	  if(userinfo==null) {
		 this.addActionError("用户名或密码不正确");
		 return "loginFail";
	  }else {
		  ServletActionContext.getRequest().getSession().setAttribute("userinfo", userinfo);
		  List<Users> loglist = new ArrayList<Users>();
		   loglist = loginlogserver.find_first(userinfo);
			   ServletActionContext.getRequest().getSession().setAttribute("loglist", loglist);
			   
			/*   	  List<Notice> noticelist = noticeserver.findalllist();
		  	ServletActionContext.getRequest().getSession().setAttribute("noticelist", noticelist);
		  	*/
				 List noticelist = noticeserver.findByPage(1, 5);
				 ServletActionContext.getRequest().setAttribute("noticelist", noticelist);
		  loginlogserver.save(userinfo, ServletActionContext.getRequest().getRemoteAddr());
			 
		  return "loginsuccess";
	  }
  }
}
