package com.hsipig;

import domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;


public class Main {
    public static void main(String[] args) throws IOException {
        //1.得到数据库连接
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.得到执行sql的对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.执行sql语句
        Student student=new Student();
        student.setName("赵六");
        student.setNo("004");
        sqlSession.insert("insertStudent", student);
        sqlSession.commit();
        //4.结果输出
        System.out.println("=======INSERT========");
        System.out.println(student.getNo());
        System.out.println("=====================");

        //3.执行sql语句
        student.setNo("006");
        sqlSession.update("updateStudent", student);
        sqlSession.commit();
        //4.结果输出
        System.out.println("=======UPDATE========");
        System.out.println(student.getNo());
        System.out.println("=====================");

        //3.执行sql语句
        sqlSession.delete("deleteStudent", "赵六");
        sqlSession.commit();
        //4.结果输出
        System.out.println("=======DELETE========");
        System.out.println(student.getNo());
        System.out.println("=====================");

        //5.关闭数据库
        sqlSession.close();
    }
}
