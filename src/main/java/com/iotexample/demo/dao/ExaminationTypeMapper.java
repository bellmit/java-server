package com.iotexample.demo.dao;

import com.iotexample.demo.model.ExaminationType;
import com.iotexample.demo.model.ExaminationTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface ExaminationTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examination_type
     *
     * @mbg.generated
     */
    long countByExample(ExaminationTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examination_type
     *
     * @mbg.generated
     */
    int deleteByExample(ExaminationTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examination_type
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long examinationTypeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examination_type
     *
     * @mbg.generated
     */
    int insert(ExaminationType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examination_type
     *
     * @mbg.generated
     */
    int insertSelective(ExaminationType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examination_type
     *
     * @mbg.generated
     */
    List<ExaminationType> selectByExampleWithRowbounds(ExaminationTypeExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examination_type
     *
     * @mbg.generated
     */
    List<ExaminationType> selectByExample(ExaminationTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examination_type
     *
     * @mbg.generated
     */
    ExaminationType selectByPrimaryKey(Long examinationTypeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examination_type
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ExaminationType record, @Param("example") ExaminationTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examination_type
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ExaminationType record, @Param("example") ExaminationTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examination_type
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ExaminationType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table examination_type
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ExaminationType record);
}