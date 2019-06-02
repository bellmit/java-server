package com.iotexample.demo.dao;

import com.iotexample.demo.model.Exsanguinate;
import com.iotexample.demo.model.ExsanguinateExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface ExsanguinateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exsanguinate
     *
     * @mbg.generated
     */
    long countByExample(ExsanguinateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exsanguinate
     *
     * @mbg.generated
     */
    int deleteByExample(ExsanguinateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exsanguinate
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long exsanguinateId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exsanguinate
     *
     * @mbg.generated
     */
    int insert(Exsanguinate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exsanguinate
     *
     * @mbg.generated
     */
    int insertSelective(Exsanguinate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exsanguinate
     *
     * @mbg.generated
     */
    List<Exsanguinate> selectByExampleWithRowbounds(ExsanguinateExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exsanguinate
     *
     * @mbg.generated
     */
    List<Exsanguinate> selectByExample(ExsanguinateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exsanguinate
     *
     * @mbg.generated
     */
    Exsanguinate selectByPrimaryKey(Long exsanguinateId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exsanguinate
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Exsanguinate record, @Param("example") ExsanguinateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exsanguinate
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Exsanguinate record, @Param("example") ExsanguinateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exsanguinate
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Exsanguinate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exsanguinate
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Exsanguinate record);
}