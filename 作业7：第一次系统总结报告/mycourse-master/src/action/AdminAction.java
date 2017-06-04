package action;



import java.util.List;



import java.util.Map;



import org.apache.struts2.interceptor.ApplicationAware;



import com.opensymphony.xwork2.ActionSupport;



import dao.AdminDAO;

import model.Admin;

import model.Course;

import model.InfoDTO;

import model.Student;

import model.Teacher;



public class AdminAction extends ActionSupport implements ApplicationAware {





	private Map<String, Object> application;

	

	private AdminDAO adminDAO;

	

	private int sid;

	private int cid;

	private int tid;

	

	private Admin admin;

	private Student st;

	private Course c;

	

	private List<Student> stList;

	private List<Course> couList;

	private List<Teacher> teaList;

	private List<InfoDTO> infoList;

	

	





	//登录

	public String login() throws Exception {

		//AdminDAO adminDAO = new AdminDAO();

		if(adminDAO.login(admin) != null) {

			application.put("admin", admin);

			return "login_success";

		}

		return "login_input";

	}

	

	//注销

	public String logout() throws Exception {

		if (application.get("admin") != null) {

			application.remove("admin");

		}

		return "logout_success";

	}

	

	//列出所有学生

	public String listStudent() throws Exception {

		//AdminDAO adminDAO = new AdminDAO();

		System.out.println("ceshi");

		stList = adminDAO.listStudent();

		return "list_student_success";

	}

	

	//列出所有课程

	public String listCourse() throws Exception {

		//AdminDAO adminDAO = new AdminDAO();

		couList = adminDAO.listCourse();

		return "list_course_success";

	}

	

	//列出所有老师

	public String listTeacher() throws Exception {

		//AdminDAO adminDAO = new AdminDAO();

		teaList = adminDAO.listTeacher();

		return "list_teacher_success";

	}

	

	//列出所有选课信息

	public String listInfo() throws Exception {

		//AdminDAO adminDAO = new AdminDAO();

		infoList = adminDAO.listInfo();

		return "list_info_success";

	}

	

	//删除学生

	public String deleteStudent() throws Exception {

		//AdminDAO adminDAO = new AdminDAO();

		adminDAO.deleteStudent(sid);

		return "delete_student_success";

	}

	

	//删除学生

	public String deleteCourse() throws Exception {

		//AdminDAO adminDAO = new AdminDAO();

		adminDAO.deleteCourse(cid);

		return "delete_course_success";

	}

	

	//删除一条选课信息

	public String deleteInfo() throws Exception {

		//AdminDAO adminDAO = new AdminDAO();

		adminDAO.deleteInfo(sid,cid,tid);

		return "delete_info_success";

	}

	

	//添加学生

	public String addStudent() throws Exception {

		//AdminDAO adminDAO = new AdminDAO();

		adminDAO.add(st);

		return "add_student_success";

	}

	

	//添加课程

	public String addCourse() throws Exception {

		//AdminDAO adminDAO = new AdminDAO();

		adminDAO.add(c);

		return "add_course_success";

	}



	public void setApplication(Map<String, Object> arg0) {

		application = arg0;

		

	}



	public int getSid() {

		return sid;

	}



	public void setSid(int sid) {

		this.sid = sid;

	}



	public int getCid() {

		return cid;

	}



	public void setCid(int cid) {

		this.cid = cid;

	}



	public List<Student> getStList() {

		return stList;

	}



	public void setStList(List<Student> stList) {

		this.stList = stList;

	}



	public List<Course> getCouList() {

		return couList;

	}



	public void setCouList(List<Course> couList) {

		this.couList = couList;

	}



	public List<InfoDTO> getInfoList() {

		return infoList;

	}



	public void setInfoList(List<InfoDTO> infoList) {

		this.infoList = infoList;

	}



	public Admin getAdmin() {

		return admin;

	}



	public void setAdmin(Admin admin) {

		this.admin = admin;

	}



	public Student getSt() {

		return st;

	}



	public void setSt(Student st) {

		this.st = st;

	}



	public Course getC() {

		return c;

	}



	public void setC(Course c) {

		this.c = c;

	}



	public int getTid() {

		return tid;

	}



	public void setTid(int tid) {

		this.tid = tid;

	}

	

	public AdminDAO getAdminDAO() {

		return adminDAO;

	}



	public void setAdminDAO(AdminDAO adminDAO) {

		this.adminDAO = adminDAO;

	}



	public List<Teacher> getTeaList() {

		return teaList;

	}



	public void setTeaList(List<Teacher> teaList) {

		this.teaList = teaList;

	}

		

}