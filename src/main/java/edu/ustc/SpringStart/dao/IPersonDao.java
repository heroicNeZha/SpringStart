package edu.ustc.SpringStart.dao;

import edu.ustc.SpringStart.POJO.Person;
import org.apache.ibatis.annotations.Param;

public interface IPersonDao {
    Person selectPersonByName(@Param("name")String name) throws Exception;
}
