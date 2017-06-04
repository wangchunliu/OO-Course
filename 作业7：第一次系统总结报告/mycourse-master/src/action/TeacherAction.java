package action;







import java.util.List;

import java.util.Map;



import org.apache.struts2.interceptor.ApplicationAware;

import org.apache.struts2.interceptor.SessionAware;



import com.opensymphony.xwork2.ActionSupport;



import dao.TeacherDAO;

import model.Student;

import model.Teacher;



public class TeacherAction extends ActionSupport implements SessionAware, ApplicationAware {



	

	private Map<String, Object> session;

	private Map<String, Object> application;

	

	

	private TeacherDAO teacherDAO;

	

	private Teacher teacher;

	

	private String cname;

	private List<Student> stList;

	

	

	//登录

	public String login() throws Exception {

		boolean b = teacherDAO.login(teacher);

		if (b) {

			session.put("teacher", teacher);

			session.put("cnames", teacherDAO.getCnames(teacher.getTid()));

			application.put("tname", teacherDAO.getTname(teacher.getTid()));

			return "login_success";

		}

		return "login_input";

	}



	

	

	//注销

	public String logout() throws Exception {

		if (session.get("teacher") != null && application.get("tname") != null) {

			session.remove("teacher");

			application.remove("tname");

		}

		return "logout_success";

	}



	

	//根据教师号和课程名列出学生

	public String listStudent() throws Exception {

		

		Teacher t = (Teacher)session.get("teacher");

		stList = teacherDAO.listStudent(t.getTid(),cname);

		System.out.println("-------------------" + stList);

		return "list_student_success";

	}

	

	

	public TeacherDAO getTeacherDAO() {

		return teacherDAO;

	}



	public void setTeacherDAO(TeacherDAO teacherDAO) {

		this.teacherDAO = teacherDAO;

	}



	public Teacher getTeacher() {

		return teacher;

	}



	public void setTeacher(Teacher teacher) {

		this.teacher = teacher;

	}



	public void setApplication(Map<String, Object> arg0) {

		application = arg0;

		

	}



	public void setSession(Map<String, Object> arg0) {

		session = arg0;

		

	}







	public String getCname() {

		return cname;

	}







	public void setCname(String cname) {

		this.cname = cname;

	}







	public List<Student> getStList() {

		return stList;

	}







	public void setStList(List<Student> stList) {

		this.stList = stList;

	}

	

	

}