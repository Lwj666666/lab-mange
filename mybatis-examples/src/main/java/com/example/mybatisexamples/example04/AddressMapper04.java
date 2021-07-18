package com.example.mybatisexamples.example04;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybatisexamples.entity.Address;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AddressMapper04 extends BaseMapper<Address> {
    @Select("select *," +
            "a.create_time addressCrestTime," +
            "u.create_time userCreatTime," +
            "a.id id " +
            "from address a join user u " +
            "on u.id = a.user_id" +
            " where a.detail=#{detail}")
    List<AddressDTO04> list(String detail);
}
