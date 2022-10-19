package com.gbj.mybatis.test;

import com.gbj.mybatis.mapper.CarMapper;
import com.gbj.mybatis.pojo.Car;
import com.gbj.mybatis.utils.SqlSessionUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @program: mybatis
 * @ClassName: CarMapperTest
 * @Version 1.0
 * @author: 龚宝金
 * @create: 2022-10-18 23:02
 **/
public class CarMapperTest {
    @Test
    public void TestSelectAll(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        CarMapper mapper = sqlSession.getMapper(CarMapper.class);

        /*注意 在DQL语句执行之前使用分页插件*/
        PageHelper.startPage(2,3);

        List<Car> cars = mapper.selectAll();
        PageInfo<Object> pageInfo = new PageInfo<>(cars,10);
        System.out.println(pageInfo);
    }
}
