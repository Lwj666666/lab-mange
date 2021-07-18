package com.example.mybatisexamples.example05;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybatisexamples.entity.Address;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface AddressMapper05 extends BaseMapper<Address> {
    List<AddressDTO05> listAddressDTOs(@Param("detail") String detail);
}