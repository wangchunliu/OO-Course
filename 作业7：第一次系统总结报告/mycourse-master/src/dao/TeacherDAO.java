package dao;





import java.util.List;



import org.hibernate.Query;

import org.hibernate.Session;

import org.hibernate.SessionFactory;

import org.hibernate.Transaction;



import model.Student;

import model.Teacher;



public class TeacherDAO {



	private SessionFactory sessionFactory;



	public SessionFactory getSessionFactory() {

		return sessionFactory;

	}



	public void setSessionFactory(SessionFactory sessionFactory) {

		this.sessionFactory = sessionFactory;

	}

	



	//判断帐号和密码是否正确

	public boolean login(Teacher teacher) {

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		Query query = session

				.createQuery("select count(*) from Teacher where tid = :tid and tpassword = :tpassword");

		query.setLong("tid", teacher.getTid());

		query.setString("tpassword", teacher.getTpassword());

		int count = ((Long) query.uniqueResult()).intValue();

		tx.commit();

		session.close();

		return count > 0;

	}



	// 得到教师姓名

	public String getTname(Integer tid) {

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		Query query = session

				.createQuery("select tname from Teacher where tid=?");

		query.setParameter(0, tid);

		List<String> list = query.list();

		tx.commit();

		session.close();

		if (list != null && list.size() > 0) {

			return list.get(0);

		}

		return "";

	}



	// 得到教师所教课程名

	public List<String> getCnames(Integer tid) {

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		Query query = session

				.createQuery("select distinct c.cname from Teacher t,Course c,Info i where c.cid=i.infoId.cid and t.tid=i.infoId.tid and t.tid=?");

		query.setParameter(0, tid);

		List<String> list = query.list();

		tx.commit();

		session.close();

		System.out.println("-------------------" + list);

		if (list != null && list.size() > 0) {

			return list;

		}

		return null;

	}



	

	

	//通过教师号和课程名列出选课学生

	public List<Student> listStudent(int tid,String cname) {

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		Query query = session

				.createQuery("select new Student(s.sid,s.sname,s.ssex,s.sage,s.sdept) from Student s,Teacher t,Course c,Info i where s.sid=i.infoId.sid and t.tid=i.infoId.tid and c.cid=i.infoId.cid and t.tid=? and c.cname=?");

		query.setParameter(0, tid);

		query.setParameter(1, cname);

		List<Student> list = query.list();

		tx.commit();

		session.close();

		if (list != null && list.size() > 0) {

			return list;

		}

		return null;

	}



}