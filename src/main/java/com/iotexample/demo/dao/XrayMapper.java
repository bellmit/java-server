package com.iotexample.demo.dao;

import com.iotexample.demo.model.Xray;
import com.iotexample.demo.model.XrayExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface XrayMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xray
     *
     * @mbg.generated
     */
    long countByExample(XrayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xray
     *
     * @mbg.generated
     */
    int deleteByExample(XrayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xray
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long xrayId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xray
     *
     * @mbg.generated
     */
    int insert(Xray record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xray
     *
     * @mbg.generated
     */
    int insertSelective(Xray record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xray
     *
     * @mbg.generated
     */
    List<Xray> selectByExampleWithRowbounds(XrayExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xray
     *
     * @mbg.generated
     */
    List<Xray> selectByExample(XrayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xray
     *
     * @mbg.generated
     */
    Xray selectByPrimaryKey(Long xrayId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xray
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Xray record, @Param("example") XrayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xray
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Xray record, @Param("example") XrayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xray
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Xray record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xray
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Xray record);
}