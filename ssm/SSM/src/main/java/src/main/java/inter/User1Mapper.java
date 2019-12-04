package src.main.java.inter;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import src.main.java.dean.User1;
import src.main.java.dean.User1Example;

public interface User1Mapper {
    long countByExample(User1Example example);

    int deleteByExample(User1Example example);

    int insert(User1 record);

    int insertSelective(User1 record);

    List<User1> selectByExample(User1Example example);

    int updateByExampleSelective(@Param("record") User1 record, @Param("example") User1Example example);

    int updateByExample(@Param("record") User1 record, @Param("example") User1Example example);
}