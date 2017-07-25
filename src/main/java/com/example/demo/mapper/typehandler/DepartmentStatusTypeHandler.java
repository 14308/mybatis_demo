package com.example.demo.mapper.typehandler;

import com.example.demo.domain.DepartmentStatus;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by 陆小凤 on 2017/7/21.
 */
public class DepartmentStatusTypeHandler extends BaseTypeHandler<DepartmentStatus>{
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, DepartmentStatus departmentStatus, JdbcType jdbcType) throws SQLException {
        preparedStatement.setInt(i,departmentStatus.getId());
    }

    @Override
    public DepartmentStatus getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return DepartmentStatus.parse(resultSet.getLong(s));
    }

    @Override
    public DepartmentStatus getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return DepartmentStatus.parse(resultSet.getLong(i));
    }

    @Override
    public DepartmentStatus getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return DepartmentStatus.parse(callableStatement.getLong(i));
    }
}
