package com.test;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.util.ArrayList;
	import java.util.List;
	public class StudentDao {
	
		public static Connection getCon()
		{
			String driver="com.mysql.cj.jdbc.Driver";
			String url="jdbc:mysql://localhost:3306/mla";
			String user="root";
			String pas="root@39";
			Connection con=null;
			try
			{
				Class.forName(driver);
				con=DriverManager.getConnection(url,user,pas);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return con;
		}

	public void saveStudent(Student stu)
	 {
		 try {
		 String sql="insert into student (id,stu_name,college,city)values(?,?,?,?)";
		 Connection con=StudentDao.getCon();
		 PreparedStatement pst=con.prepareStatement(sql);
		 pst.setInt(1, stu.getId());
		 pst.setString(2, stu.getName());
		 pst.setString(3, stu.getClg());
		 pst.setString(4, stu.getCity());
		 pst.execute();
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	 public List<Student> getAllStudents()
	 {
		 List<Student> stuList=new ArrayList<>();
		 try
		 {
			 String sql="select * from student";
			 PreparedStatement pst=StudentDao.getCon().prepareStatement(sql);
			 ResultSet rs=pst.executeQuery();
			 while(rs.next()) {
				 Student stu=new Student();
				 stu.setId(rs.getInt(1));
				 stu.setName(rs.getString(2));
				 stu.setClg(rs.getString(3));
				 stu.setCity(rs.getString(4));
				 stuList.add(stu);
			 }
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 return stuList;
	 }
	 public void updateStudent(Student stu) {
		 try {
			 String sql="update student set stu_name=?,college=?,city=? where id=?";
			 PreparedStatement pst=StudentDao.getCon().prepareStatement(sql);
			 pst.setString(1, stu.getName());
			 pst.setString(2, stu.getClg());
			 pst.setString(3,stu.getCity());
			 pst.setInt(4, stu.getId());
			 pst.execute();
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
	 }
		 public void deleteStudent(int id)
		 {
			 try {
				 String sql="delete from student where id=?";
				 PreparedStatement pst=StudentDao.getCon().prepareStatement(sql);
				 pst.setInt(1, id);
				 pst.execute();
			 }
			 catch(Exception e)
			 {
				 e.printStackTrace();
			 }
		 }
	 
}