package edu.ustc.SpringStart.tmall.mapper;

import edu.ustc.SpringStart.tmall.pojo.User;
import edu.ustc.SpringStart.tmall.pojo.UserExample;
import edu.ustc.SpringStart.tmall.pojo.UserKey;
import edu.ustc.SpringStart.tmall.pojo.UserWithBLOBs;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(UserKey key);

    int insert(UserWithBLOBs record);

    int insertSelective(UserWithBLOBs record);

    List<UserWithBLOBs> selectByExampleWithBLOBs(UserExample example);

    List<User> selectByExample(UserExample example);

    UserWithBLOBs selectByPrimaryKey(UserKey key);

    int updateByPrimaryKeySelective(UserWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(UserWithBLOBs record);

    int updateByPrimaryKey(User record);
}