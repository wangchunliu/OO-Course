package action;



import java.util.ArrayList;



import java.util.List;

import java.util.Map;



import org.apache.struts2.interceptor.ApplicationAware;

import org.apache.struts2.interceptor.SessionAware;



import com.opensymphony.xwork2.ActionSupport;



import dao.UserDAO;

import model.CourseDTO;

import model.PasswordDTO;

import model.Student;

import model.User;



public class UserAction extends ActionSupport implements SessionAware, ApplicationAware {



	private Map<String, Object> session;

	private Map<String, Object> application;

	

	private UserDAO userDAO;

	

	//登陆时用于校验

	private User user;

	

	//右上角显示学生姓名

	private String sname;

	

	//用于显示课程列表

	private List<CourseDTO> courses = new ArrayList<CourseDTO>();

	

	//选课，退课时获取课程id，和教师id

	private int[] cids;

	private int[] tids;

	

	//显示个人资料时获取学生信息

	private Student st;

	

	//修改密码时用于获取新旧密码

	private PasswordDTO password;

	

	

	//登录

	public String login() throws Exception {

		//UserDAO userDAO = new UserDAO();

		boolean b = userDAO.login(user);

		if (b) {

			session.put("user", user);

			application.put("sname", userDAO.getSname(user.getSid()));

			System.out.println(application.get("sname"));

			return "login_success";

		}

		return "login_input";

	}



	//注销

	public String logout() throws Exception {

		if (session.get("user") != null && application.get("sname") != null) {

			session.remove("user");

			application.remove("sname");

		}

		return "logout_success";

	}



	//列出未选课程

	public String listUnselectedCourse() throws Exception {

		User u = (User) session.get("user");

		//UserDAO userDAO = new UserDAO();

		courses = userDAO.listUnselectedCourse(u.getSid());

		return "list_unselected_course_success";

	}



	//选课

	public String selectCourse() throws Exception {

		User u = (User) session.get("user");

		//UserDAO userDAO = new UserDAO();

		//System.out.println("ceshi");

		userDAO.selectCourse(u.getSid(),cids,tids);

		return "select_course_success";

	}



	//列出已选课程

	public String listSelectedCourse() throws Exception {

		User u = (User) session.get("user");

		//UserDAO userDAO = new UserDAO();

		

		courses = userDAO.listSelectedCourse(u.getSid());

		return "list_selected_course_success";

	}



	//退选

	public String quitCourse() throws Exception {

		User u = (User) session.get("user");

		//UserDAO userDAO = new UserDAO();

		userDAO.quitCourse(u.getSid(),cids,tids);

		return "quit_course_success";

	}



	//显示个人资料

	public String showInfo() throws Exception {

		User u = (User) session.get("user");

		//UserDAO userDAO = new UserDAO();

		st = userDAO.showInfo(u.getSid());

		return "show_info_success";

	}



	//为更新显示个人资料

	public String showInfoForUpdate() throws Exception {

		User u = (User) session.get("user");

		//UserDAO userDAO = new UserDAO();

		st = userDAO.showInfo(u.getSid());

		return "show_info_for_update_success";

	}



	//更新个人资料

	public String updateInfo() throws Exception {

		//UserDAO userDAO = new UserDAO();

		userDAO.updateInfo(st);

		return "update_info_success";

	}

	

	

	//修改密码

	public String changePassword() throws Exception {

		//UserDAO userDAO = new UserDAO();

		User u = (User) session.get("user");

		userDAO.changePassword(u.getSid(),password);

		return "change_password_success";

	}

	

	public void setApplication(Map<String, Object> arg0) {

		application = arg0;

	}



	public void setSession(Map<String, Object> arg0) {

		session = arg0;

	}



	public User getUser() {

		return user;

	}



	public void setUser(User user) {

		this.user = user;

	}



	public String getSname() {

		return sname;

	}



	public void setSname(String sname) {

		this.sname = sname;

	}



	



	public List<CourseDTO> getCourses() {

		return courses;

	}



	public void setCourses(List<CourseDTO> courses) {

		this.courses = courses;

	}



	public int[] getCids() {

		return cids;

	}



	public void setCids(int[] cids) {

		this.cids = cids;

	}



	public Student getSt() {

		return st;

	}



	public void setSt(Student st) {

		this.st = st;

	}



	public UserDAO getUserDAO() {

		return userDAO;

	}



	public void setUserDAO(UserDAO userDAO) {

		this.userDAO = userDAO;

	}



	public int[] getTids() {

		return tids;

	}



	public void setTids(int[] tids) {

		this.tids = tids;

	}



	public PasswordDTO getPassword() {

		return password;

	}



	public void setPassword(PasswordDTO password) {

		this.password = password;

	}



	

}