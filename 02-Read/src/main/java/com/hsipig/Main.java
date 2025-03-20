package com.hsipig;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) throws IOException {
        //1.得到数据库连接
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.得到执行sql的对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //3.执行sql语句
        List<Map<String, Object>> list = sqlSession.selectList("selectStudentByStudentName","张三");
        //4.输出结果
        System.out.println("=====================");
        for (Map<String, Object> map : list) {
            System.out.println(map);
        }
        System.out.println("=====================");
        //5.关闭数据库
        sqlSession.close();
    }
}
