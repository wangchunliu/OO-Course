package dao;



import java.util.List;





import org.hibernate.Query;

import org.hibernate.Session;

import org.hibernate.SessionFactory;

import org.hibernate.Transaction;



import model.Admin;

import model.Course;

import model.Info;

import model.InfoDTO;

import model.InfoId;

import model.Student;

import model.Teacher;





public class AdminDAO {



	private SessionFactory sessionFactory;

	

	

	public SessionFactory getSessionFactory() {

		return sessionFactory;

	}



	public void setSessionFactory(SessionFactory sessionFactory) {

		this.sessionFactory = sessionFactory;

	}

	

	//判断帐号和密码是否正确

	public String login(Admin admin) {

		String result = null;

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		Query query = session.createQuery("select username from Admin where username = ? and password = ? " );

		query.setParameter(0, admin.getUsername());

		query.setParameter(1, admin.getPassword());

		List list = query.list();

		tx.commit();

		session.close();

		if (list.size() > 0) {

			result = (String) list.get(0);

		}

		return result;

	}



	//列出所有学生

	public List<Student> listStudent() {

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		Query query = session.createQuery("from Student" );

		List<Student> list = query.list();

		tx.commit();

		session.close();

		return list;

	}



	

	//列出所有课程

	public List<Course> listCourse() {

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		Query query = session.createQuery("from Course" );

		List<Course> list = query.list();

		tx.commit();

		session.close();

		return list;

	}



	

	//列出所有教师信息

	public List<Teacher> listTeacher() {

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		Query query = session.createQuery("from Teacher" );

		List<Teacher> list = query.list();

		tx.commit();

		session.close();

		return list;

	}

	

	//列出所有选课信息

	public List<InfoDTO> listInfo() {

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		Query query = session.createQuery("select new model.InfoDTO(s.sid,s.sname,s.ssex,s.sage,s.sdept,c.cid,c.cname,t.tid,t.tname) from Student s,Course c,Teacher t,Info i where t.tid=i.infoId.tid and s.sid=i.infoId.sid and c.cid=i.infoId.cid");

		List<InfoDTO> list = query.list();

		tx.commit();

		session.close();

		return list;

	}



	//删除某个学生

	public void deleteStudent(int sid) {

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		Student st = (Student) session.get(Student.class, sid);

		session.delete(st);

		tx.commit();

		session.close();

	}



	//删除某个课程

	public void deleteCourse(int cid) {

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		Course c = (Course) session.get(Course.class, cid);

		session.delete(c);

		tx.commit();

		session.close();

		

	}



	//删除某条选课记录

	public void deleteInfo(int sid, int cid,int tid) {

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		InfoId id = new InfoId(sid,cid,tid);

		Info info = new Info(id);

		session.delete(info);

		tx.commit();

		session.close();		

	}



	//添加学生

	public void add(Student st) {

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		session.save(st);

		tx.commit();

		session.close();

	}



	

	//添加课程

	public void add(Course c) {

		//System.out.println(c.getCname());

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		session.save(c);

		tx.commit();

		session.close();

	}





}