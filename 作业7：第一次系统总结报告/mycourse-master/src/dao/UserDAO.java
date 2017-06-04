package dao;



import java.util.List;



import org.hibernate.Query;

import org.hibernate.Session;

import org.hibernate.SessionFactory;

import org.hibernate.Transaction;



import model.Course;

import model.CourseDTO;

import model.Info;

import model.InfoId;

import model.PasswordDTO;

import model.Student;

import model.User;



public class UserDAO {

	

	

	private SessionFactory sessionFactory;

	

	

	public SessionFactory getSessionFactory() {

		return sessionFactory;

	}



	public void setSessionFactory(SessionFactory sessionFactory) {

		this.sessionFactory = sessionFactory;

	}



	

	//判断帐号和密码是否正确

	public boolean login(User user) {

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		Query query = session.createQuery("select count(*) from User where sid = :sid and password = :password" );

		query.setLong("sid", user.getSid());

		query.setString("password", user.getPassword());

		int count = ((Long)query.uniqueResult()).intValue();

		tx.commit();

		session.close();

		return count > 0;

	}



	//列出已选课程列表

	public List<CourseDTO> listSelectedCourse(int sid) {

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		Query query = session.createQuery("select new model.CourseDTO(c.cid,c.cname,t.tid,t.tname) from Course c,Student s,Teacher t,Info i where c.cid=i.infoId.cid and s.sid=i.infoId.sid and i.infoId.sid=? and i.infoId.tid=t.tid" );

		query.setParameter(0, sid);

		List<CourseDTO> list = query.list();

		tx.commit();

		session.close();

		return list;

	}



	//列出未选课程列表

	public List<CourseDTO> listUnselectedCourse(Integer sid) {

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		Query query = session.createQuery("select new model.CourseDTO(c.cid,c.cname,t.tid,t.tname) from Course c,Student s,Teacher t,Info i where c.cid=i.infoId.cid and s.sid=i.infoId.sid and i.infoId.sid=? and i.infoId.tid=t.tid " );// where c.cid=i.infoId.cid and s.sid=i.infoId.sid and i.infoId.sid=? and i.infoId.tid=t.tid

		query.setParameter(0, sid);

		List<CourseDTO> list = query.list();

		System.out.println(list);

		query = session.createQuery("select new model.CourseDTO(c.cid,c.cname,t.tid,t.tname) from Course c,Teacher t " );//where c.cid=i.infoId.cid and s.sid=i.infoId.sid and i.infoId.tid=t.tid

		List<CourseDTO> list2 = query.list();

		System.out.println(list2);

		list2.removeAll(list);

		System.out.println(list2);

		tx.commit();

		session.close();

		return list2;

		

	}



	

	//选课

	public void selectCourse(Integer sid, int[] cids,int[] tids) {

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		for(int i=0; i<cids.length; i++) {

			InfoId id = new InfoId(sid,cids[i],tids[i]);

			Info info = new Info(id);

			session.save(info);

		}

		tx.commit();

		session.close();

	}



	

	//退课

	public void quitCourse(Integer sid, int[] cids,int[] tids) {

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		for(int i=0; i<cids.length; i++) {

			InfoId id = new InfoId(sid,cids[i],tids[i]);

			Info info = new Info(id);

			session.delete(info);

		}

		tx.commit();

		session.close();

	}



	

	//显示个人信息

	public Student showInfo(int sid) {

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		Student st = (Student)session.get(Student.class, sid);

		tx.commit();

		session.close();

		return st;

	}



	

	//更新个人信息

	public void updateInfo(Student st) {

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		session.update(st);

		tx.commit();

		session.close();

		

	}



	

	//修改密码

	public void changePassword(int sid,PasswordDTO password) {

		

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		Query query = session.createQuery("select count(*) from User where sid=? and password=?");

		query.setParameter(0, sid);

		query.setParameter(1, password.getOldPassword());

		int count = ((Long)query.uniqueResult()).intValue();

		if(count > 0){

			User user = (User) session.get(User.class, sid);

			user.setPassword(password.getNewPassword());

			session.update(user);

		}

		tx.commit();

		session.close();

		

	}



	

	//得到学生姓名

	public String getSname(Integer sid) {

		

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		Query query = session.createQuery("select sname from Student where sid=?");

		query.setParameter(0, sid);

		List<String> list = query.list();

		tx.commit();

		session.close();

		if(list != null && list.size() > 0){

			return list.get(0);

		}

		return "";

	}

	

}

