package com.hsipig;

import domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        //1.得到数据库连接
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.得到执行sql的对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.执行sql语句
//        1. 单个参数查询
//        List<Map<String, Object>> list = sqlSession.selectList("selectStudentByStudentName","张三")

//        2. 多个参数查询
//        Map<String,Object> cnd=new HashMap<>();
//        cnd.put("studentName", "张三");
//        cnd.put("studentNo", "1");
//        List<Map<String, Object>> list = sqlSession.selectList("selectStudentByMap", cnd);

//        3. 实体类 hashmap 查询
//        Student student = new Student();
//        student.setStudentName("张三");
//        student.setStudentNo("1");
//        List<Map<String, Object>> list = sqlSession.selectList("selectStudentByNameAndNo", student);

//        //4.输出结果
//        System.out.println("=====================");
//        for (Map<String, Object> map : list) {
//            System.out.println(map);
//        }
//        System.out.println("=====================");

//        --------------------------------------------------------------------------------------------------

//        4. 实体类查询
//        Student student = new Student();
//        student.setName("张三");
//        student.setNo("1");
//        List<Student> list = sqlSession.selectList("selectNameByStudentInfo", student);
//
//        System.out.println("=====================");
//        for (Student student1 : list) {
//            System.out.println(student1.getName());
//        }
//        System.out.println("=====================");

//        --------------------------------------------------------------------------------------------------

//        5. 实体类查询单条记录
        Student student = new Student();
        student.setName("张三");
        student.setNo("1");
        Student student1 = sqlSession.selectOne("selectNameByStudentInfo", student);

        System.out.println("=====================");
        System.out.println(student1.getName());
        System.out.println("=====================");

        //5.关闭数据库
        sqlSession.close();
    }
}
