package com.cxh.mybatis.mapper;



import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cxh.mybatis.bean.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * UserMapper
 *
 * @author cxh
 * @version v1.0
 * @since 2019/6/11
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
