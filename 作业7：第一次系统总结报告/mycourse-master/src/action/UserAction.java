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

	

	//��½ʱ����У��

	private User user;

	

	//���Ͻ���ʾѧ������

	private String sname;

	

	//������ʾ�γ��б�

	private List<CourseDTO> courses = new ArrayList<CourseDTO>();

	

	//ѡ�Σ��˿�ʱ��ȡ�γ�id���ͽ�ʦid

	private int[] cids;

	private int[] tids;

	

	//��ʾ��������ʱ��ȡѧ����Ϣ

	private Student st;

	

	//�޸�����ʱ���ڻ�ȡ�¾�����

	private PasswordDTO password;

	

	

	//��¼

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



	//ע��

	public String logout() throws Exception {

		if (session.get("user") != null && application.get("sname") != null) {

			session.remove("user");

			application.remove("sname");

		}

		return "logout_success";

	}



	//�г�δѡ�γ�

	public String listUnselectedCourse() throws Exception {

		User u = (User) session.get("user");

		//UserDAO userDAO = new UserDAO();

		courses = userDAO.listUnselectedCourse(u.getSid());

		return "list_unselected_course_success";

	}



	//ѡ��

	public String selectCourse() throws Exception {

		User u = (User) session.get("user");

		//UserDAO userDAO = new UserDAO();

		//System.out.println("ceshi");

		userDAO.selectCourse(u.getSid(),cids,tids);

		return "select_course_success";

	}



	//�г���ѡ�γ�

	public String listSelectedCourse() throws Exception {

		User u = (User) session.get("user");

		//UserDAO userDAO = new UserDAO();

		

		courses = userDAO.listSelectedCourse(u.getSid());

		return "list_selected_course_success";

	}



	//��ѡ

	public String quitCourse() throws Exception {

		User u = (User) session.get("user");

		//UserDAO userDAO = new UserDAO();

		userDAO.quitCourse(u.getSid(),cids,tids);

		return "quit_course_success";

	}



	//��ʾ��������

	public String showInfo() throws Exception {

		User u = (User) session.get("user");

		//UserDAO userDAO = new UserDAO();

		st = userDAO.showInfo(u.getSid());

		return "show_info_success";

	}



	//Ϊ������ʾ��������

	public String showInfoForUpdate() throws Exception {

		User u = (User) session.get("user");

		//UserDAO userDAO = new UserDAO();

		st = userDAO.showInfo(u.getSid());

		return "show_info_for_update_success";

	}



	//���¸�������

	public String updateInfo() throws Exception {

		//UserDAO userDAO = new UserDAO();

		userDAO.updateInfo(st);

		return "update_info_success";

	}

	

	

	//�޸�����

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