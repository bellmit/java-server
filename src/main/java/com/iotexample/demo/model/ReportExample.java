package com.iotexample.demo.model;

import java.util.ArrayList;
import java.util.List;

public class ReportExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table report
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table report
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table report
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report
     *
     * @mbg.generated
     */
    public ReportExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table report
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andReportIdIsNull() {
            addCriterion("report_id is null");
            return (Criteria) this;
        }

        public Criteria andReportIdIsNotNull() {
            addCriterion("report_id is not null");
            return (Criteria) this;
        }

        public Criteria andReportIdEqualTo(Integer value) {
            addCriterion("report_id =", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotEqualTo(Integer value) {
            addCriterion("report_id <>", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdGreaterThan(Integer value) {
            addCriterion("report_id >", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("report_id >=", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdLessThan(Integer value) {
            addCriterion("report_id <", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdLessThanOrEqualTo(Integer value) {
            addCriterion("report_id <=", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdIn(List<Integer> values) {
            addCriterion("report_id in", values, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotIn(List<Integer> values) {
            addCriterion("report_id not in", values, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdBetween(Integer value1, Integer value2) {
            addCriterion("report_id between", value1, value2, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotBetween(Integer value1, Integer value2) {
            addCriterion("report_id not between", value1, value2, "reportId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andJianchaorderIdIsNull() {
            addCriterion("jianchaOrder_id is null");
            return (Criteria) this;
        }

        public Criteria andJianchaorderIdIsNotNull() {
            addCriterion("jianchaOrder_id is not null");
            return (Criteria) this;
        }

        public Criteria andJianchaorderIdEqualTo(Integer value) {
            addCriterion("jianchaOrder_id =", value, "jianchaorderId");
            return (Criteria) this;
        }

        public Criteria andJianchaorderIdNotEqualTo(Integer value) {
            addCriterion("jianchaOrder_id <>", value, "jianchaorderId");
            return (Criteria) this;
        }

        public Criteria andJianchaorderIdGreaterThan(Integer value) {
            addCriterion("jianchaOrder_id >", value, "jianchaorderId");
            return (Criteria) this;
        }

        public Criteria andJianchaorderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("jianchaOrder_id >=", value, "jianchaorderId");
            return (Criteria) this;
        }

        public Criteria andJianchaorderIdLessThan(Integer value) {
            addCriterion("jianchaOrder_id <", value, "jianchaorderId");
            return (Criteria) this;
        }

        public Criteria andJianchaorderIdLessThanOrEqualTo(Integer value) {
            addCriterion("jianchaOrder_id <=", value, "jianchaorderId");
            return (Criteria) this;
        }

        public Criteria andJianchaorderIdIn(List<Integer> values) {
            addCriterion("jianchaOrder_id in", values, "jianchaorderId");
            return (Criteria) this;
        }

        public Criteria andJianchaorderIdNotIn(List<Integer> values) {
            addCriterion("jianchaOrder_id not in", values, "jianchaorderId");
            return (Criteria) this;
        }

        public Criteria andJianchaorderIdBetween(Integer value1, Integer value2) {
            addCriterion("jianchaOrder_id between", value1, value2, "jianchaorderId");
            return (Criteria) this;
        }

        public Criteria andJianchaorderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("jianchaOrder_id not between", value1, value2, "jianchaorderId");
            return (Criteria) this;
        }

        public Criteria andReportContentIsNull() {
            addCriterion("report_content is null");
            return (Criteria) this;
        }

        public Criteria andReportContentIsNotNull() {
            addCriterion("report_content is not null");
            return (Criteria) this;
        }

        public Criteria andReportContentEqualTo(String value) {
            addCriterion("report_content =", value, "reportContent");
            return (Criteria) this;
        }

        public Criteria andReportContentNotEqualTo(String value) {
            addCriterion("report_content <>", value, "reportContent");
            return (Criteria) this;
        }

        public Criteria andReportContentGreaterThan(String value) {
            addCriterion("report_content >", value, "reportContent");
            return (Criteria) this;
        }

        public Criteria andReportContentGreaterThanOrEqualTo(String value) {
            addCriterion("report_content >=", value, "reportContent");
            return (Criteria) this;
        }

        public Criteria andReportContentLessThan(String value) {
            addCriterion("report_content <", value, "reportContent");
            return (Criteria) this;
        }

        public Criteria andReportContentLessThanOrEqualTo(String value) {
            addCriterion("report_content <=", value, "reportContent");
            return (Criteria) this;
        }

        public Criteria andReportContentLike(String value) {
            addCriterion("report_content like", value, "reportContent");
            return (Criteria) this;
        }

        public Criteria andReportContentNotLike(String value) {
            addCriterion("report_content not like", value, "reportContent");
            return (Criteria) this;
        }

        public Criteria andReportContentIn(List<String> values) {
            addCriterion("report_content in", values, "reportContent");
            return (Criteria) this;
        }

        public Criteria andReportContentNotIn(List<String> values) {
            addCriterion("report_content not in", values, "reportContent");
            return (Criteria) this;
        }

        public Criteria andReportContentBetween(String value1, String value2) {
            addCriterion("report_content between", value1, value2, "reportContent");
            return (Criteria) this;
        }

        public Criteria andReportContentNotBetween(String value1, String value2) {
            addCriterion("report_content not between", value1, value2, "reportContent");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table report
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table report
     *
     * @mbg.generated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}