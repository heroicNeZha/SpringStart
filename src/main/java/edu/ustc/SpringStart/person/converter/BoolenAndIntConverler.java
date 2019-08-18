package edu.ustc.SpringStart.person.converter;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoolenAndIntConverler extends BaseTypeHandler<Boolean> {

    //java(boolen) - db(number)
    /*
     * ps:PreparedStatement对象
     * index: PreparedStatement对象操作参数的位置
     * parameter：java值
     * jdbcType：jdbc操作数据库的值
     */
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int index, Boolean parameter, JdbcType jdbcType) throws SQLException {
        if (parameter) {
            preparedStatement.setInt(index, 1);
        } else {
            preparedStatement.setInt(index, 0);
        }
    }

    @Override
    public Boolean getNullableResult(ResultSet resultSet, String columnIndex) throws SQLException {
        return resultSet.getInt(columnIndex) == 1;
    }

    @Override
    public Boolean getNullableResult(ResultSet resultSet, int index) throws SQLException {
        return resultSet.getInt(index) == 1;
    }

    @Override
    public Boolean getNullableResult(CallableStatement callableStatement, int index) throws SQLException {

        return callableStatement.getInt(index) == 1;
    }
}
