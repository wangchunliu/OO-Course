package lib.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TeacherDAO {
    public String getCource() throws SQLException{
        Statement stmt = null;
        Dbutil dbutil = new Dbutil();
        Connection con = null;
        ResultSet rs = null;
        String str = "<table class=\"table table-bordered\" id=\"outside\">" +
                "<tr><th>�γ̺�</th><th>�γ�����</th><th>�ڿν�ʦ</th><th>����</th><th>�Ͽ�ʱ��</th></tr>";
        try{
            con = dbutil.getCon();
            stmt = con.createStatement();
            String sql = "select cource_id, cource_name, name, location, schooltime from cource, user, classroom where teacher=user_id and classroom=classroom_id" + ";";
            rs = stmt.executeQuery(sql);
            while(rs.next()) {
                str = str + "<tr>" + "<td>" + rs.getInt("cource_id") + "</td>" + "<td>" + rs.getString("cource_name") + "</td>" + "<td>" + rs.getString("name") + "</td>" + "<td>" + rs.getString("location") + "</td>" + "<td>" + rs.getString("schooltime") + "</td>" + "</tr>";
            }
            return str + "</table>";
        }catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    public String getScource() throws SQLException{
        Statement stmt = null;
        Dbutil dbutil = new Dbutil();
        Connection con = null;
        ResultSet rs = null;
        String str = "<table class=\"table table-bordered\" id=\"outside\">" +
                "<tr><th>�γ̺�</th><th>�γ�����</th><th>ѧ��</th><th>ѧ��</th><th>ѧ������</th><th>�Ͽ�ʱ��</th><th>�Ͽεص�</th></tr>";
        try{
            con = dbutil.getCon();
            stmt = con.createStatement();
            String sql = "select cource_id, cource_name, credit, school_num, name, schooltime, location from score, user, cource, classroom where student=user_id and cource=cource_id and classroom=classroom_id" + ";";
            rs = stmt.executeQuery(sql);
            while(rs.next()) {
                str = str + "<tr>" + "<td>" + rs.getInt("cource_id") + "</td>" + "<td>" + rs.getString("cource_name") + "</td>" + "<td>" + rs.getString("credit") + "</td>" + "<td>" + rs.getString("school_num") + "</td>" + "<td>" + rs.getString("name") + "</td>" + "<td>" + rs.getString("schooltime") + "</td>" + "<td>" + rs.getString("location") + "</td>" + "</tr>";
            }
            return str + "</table>";
        }catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    public String getUser(String email) throws SQLException {
        Statement stmt = null;
        Dbutil dbutil = new Dbutil();
        Connection con = null;
        ResultSet rs = null;
        String str = "<table class=\"table table-bordered\" id=\"outside\">" +
                "<tr><th>����</th><th>����</th><th>�Ա�</th><th>ѧԺ</th><th>QQ</th><th>�绰</th><th>����</th><th>��ַ</th><th>��ɫ</th></tr>";
        try{
            con = dbutil.getCon();
            stmt = con.createStatement();
            String sql = "select * from user WHERE email='" + email + "';";
            rs = stmt.executeQuery(sql);
            while(rs.next()) {
                str = str + "<tr>" + "<td>" + rs.getString("school_num") + "</td>" + "<td>" + rs.getString("name") + "</td>" + "<td>" + rs.getString("sex") + "</td>" + "<td>" + rs.getString("school") + "</td>" + "<td>" + rs.getString("qq") + "</td>" + "<td>" + rs.getString("phone") + "</td>" + "<td>" + rs.getString("email") + "</td>" + "<td>" + rs.getString("adress") + "</td>" + "<td>" + rs.getString("role") + "</td>" +
                        "<td><button type=\"button\" class=\"btn btn-success\">�༭</button></td>" + "</tr>";;
            }
            return str + "</table>";
        }catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }
}
