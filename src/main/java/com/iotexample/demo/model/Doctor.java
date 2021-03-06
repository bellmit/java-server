package com.iotexample.demo.model;

import java.io.Serializable;

public class Doctor implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor.doctor_id
     *
     * @mbg.generated
     */
    private Long doctorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor.doctor_name
     *
     * @mbg.generated
     */
    private String doctorName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor.department_id
     *
     * @mbg.generated
     */
    private Long departmentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table doctor
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor.doctor_id
     *
     * @return the value of doctor.doctor_id
     *
     * @mbg.generated
     */
    public Long getDoctorId() {
        return doctorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbg.generated
     */
    public Doctor withDoctorId(Long doctorId) {
        this.setDoctorId(doctorId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor.doctor_id
     *
     * @param doctorId the value for doctor.doctor_id
     *
     * @mbg.generated
     */
    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor.doctor_name
     *
     * @return the value of doctor.doctor_name
     *
     * @mbg.generated
     */
    public String getDoctorName() {
        return doctorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbg.generated
     */
    public Doctor withDoctorName(String doctorName) {
        this.setDoctorName(doctorName);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor.doctor_name
     *
     * @param doctorName the value for doctor.doctor_name
     *
     * @mbg.generated
     */
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName == null ? null : doctorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor.department_id
     *
     * @return the value of doctor.department_id
     *
     * @mbg.generated
     */
    public Long getDepartmentId() {
        return departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbg.generated
     */
    public Doctor withDepartmentId(Long departmentId) {
        this.setDepartmentId(departmentId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor.department_id
     *
     * @param departmentId the value for doctor.department_id
     *
     * @mbg.generated
     */
    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", doctorId=").append(doctorId);
        sb.append(", doctorName=").append(doctorName);
        sb.append(", departmentId=").append(departmentId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}