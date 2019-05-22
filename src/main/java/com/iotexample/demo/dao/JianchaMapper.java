package com.iotexample.demo.dao;

import com.iotexample.demo.model.Jiancha;
import com.iotexample.demo.model.JianchaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JianchaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiancha
     *
     * @mbg.generated
     */
    long countByExample(JianchaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiancha
     *
     * @mbg.generated
     */
    int deleteByExample(JianchaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiancha
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer jianchaId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiancha
     *
     * @mbg.generated
     */
    int insert(Jiancha record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiancha
     *
     * @mbg.generated
     */
    int insertSelective(Jiancha record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiancha
     *
     * @mbg.generated
     */
    List<Jiancha> selectByExample(JianchaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiancha
     *
     * @mbg.generated
     */
    Jiancha selectByPrimaryKey(Integer jianchaId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiancha
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Jiancha record, @Param("example") JianchaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiancha
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Jiancha record, @Param("example") JianchaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiancha
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Jiancha record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiancha
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Jiancha record);
}