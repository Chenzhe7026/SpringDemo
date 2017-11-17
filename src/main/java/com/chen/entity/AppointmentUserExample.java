package com.chen.entity;

import java.util.ArrayList;
import java.util.List;

public class AppointmentUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppointmentUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("uuid like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("uuid not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andDeptnameIsNull() {
            addCriterion("deptName is null");
            return (Criteria) this;
        }

        public Criteria andDeptnameIsNotNull() {
            addCriterion("deptName is not null");
            return (Criteria) this;
        }

        public Criteria andDeptnameEqualTo(String value) {
            addCriterion("deptName =", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotEqualTo(String value) {
            addCriterion("deptName <>", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameGreaterThan(String value) {
            addCriterion("deptName >", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameGreaterThanOrEqualTo(String value) {
            addCriterion("deptName >=", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLessThan(String value) {
            addCriterion("deptName <", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLessThanOrEqualTo(String value) {
            addCriterion("deptName <=", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLike(String value) {
            addCriterion("deptName like", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotLike(String value) {
            addCriterion("deptName not like", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameIn(List<String> values) {
            addCriterion("deptName in", values, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotIn(List<String> values) {
            addCriterion("deptName not in", values, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameBetween(String value1, String value2) {
            addCriterion("deptName between", value1, value2, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotBetween(String value1, String value2) {
            addCriterion("deptName not between", value1, value2, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNull() {
            addCriterion("deptId is null");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNotNull() {
            addCriterion("deptId is not null");
            return (Criteria) this;
        }

        public Criteria andDeptidEqualTo(String value) {
            addCriterion("deptId =", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotEqualTo(String value) {
            addCriterion("deptId <>", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThan(String value) {
            addCriterion("deptId >", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThanOrEqualTo(String value) {
            addCriterion("deptId >=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThan(String value) {
            addCriterion("deptId <", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThanOrEqualTo(String value) {
            addCriterion("deptId <=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLike(String value) {
            addCriterion("deptId like", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotLike(String value) {
            addCriterion("deptId not like", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidIn(List<String> values) {
            addCriterion("deptId in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotIn(List<String> values) {
            addCriterion("deptId not in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidBetween(String value1, String value2) {
            addCriterion("deptId between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotBetween(String value1, String value2) {
            addCriterion("deptId not between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andMatternameIsNull() {
            addCriterion("matterName is null");
            return (Criteria) this;
        }

        public Criteria andMatternameIsNotNull() {
            addCriterion("matterName is not null");
            return (Criteria) this;
        }

        public Criteria andMatternameEqualTo(String value) {
            addCriterion("matterName =", value, "mattername");
            return (Criteria) this;
        }

        public Criteria andMatternameNotEqualTo(String value) {
            addCriterion("matterName <>", value, "mattername");
            return (Criteria) this;
        }

        public Criteria andMatternameGreaterThan(String value) {
            addCriterion("matterName >", value, "mattername");
            return (Criteria) this;
        }

        public Criteria andMatternameGreaterThanOrEqualTo(String value) {
            addCriterion("matterName >=", value, "mattername");
            return (Criteria) this;
        }

        public Criteria andMatternameLessThan(String value) {
            addCriterion("matterName <", value, "mattername");
            return (Criteria) this;
        }

        public Criteria andMatternameLessThanOrEqualTo(String value) {
            addCriterion("matterName <=", value, "mattername");
            return (Criteria) this;
        }

        public Criteria andMatternameLike(String value) {
            addCriterion("matterName like", value, "mattername");
            return (Criteria) this;
        }

        public Criteria andMatternameNotLike(String value) {
            addCriterion("matterName not like", value, "mattername");
            return (Criteria) this;
        }

        public Criteria andMatternameIn(List<String> values) {
            addCriterion("matterName in", values, "mattername");
            return (Criteria) this;
        }

        public Criteria andMatternameNotIn(List<String> values) {
            addCriterion("matterName not in", values, "mattername");
            return (Criteria) this;
        }

        public Criteria andMatternameBetween(String value1, String value2) {
            addCriterion("matterName between", value1, value2, "mattername");
            return (Criteria) this;
        }

        public Criteria andMatternameNotBetween(String value1, String value2) {
            addCriterion("matterName not between", value1, value2, "mattername");
            return (Criteria) this;
        }

        public Criteria andMatteridIsNull() {
            addCriterion("matterId is null");
            return (Criteria) this;
        }

        public Criteria andMatteridIsNotNull() {
            addCriterion("matterId is not null");
            return (Criteria) this;
        }

        public Criteria andMatteridEqualTo(String value) {
            addCriterion("matterId =", value, "matterid");
            return (Criteria) this;
        }

        public Criteria andMatteridNotEqualTo(String value) {
            addCriterion("matterId <>", value, "matterid");
            return (Criteria) this;
        }

        public Criteria andMatteridGreaterThan(String value) {
            addCriterion("matterId >", value, "matterid");
            return (Criteria) this;
        }

        public Criteria andMatteridGreaterThanOrEqualTo(String value) {
            addCriterion("matterId >=", value, "matterid");
            return (Criteria) this;
        }

        public Criteria andMatteridLessThan(String value) {
            addCriterion("matterId <", value, "matterid");
            return (Criteria) this;
        }

        public Criteria andMatteridLessThanOrEqualTo(String value) {
            addCriterion("matterId <=", value, "matterid");
            return (Criteria) this;
        }

        public Criteria andMatteridLike(String value) {
            addCriterion("matterId like", value, "matterid");
            return (Criteria) this;
        }

        public Criteria andMatteridNotLike(String value) {
            addCriterion("matterId not like", value, "matterid");
            return (Criteria) this;
        }

        public Criteria andMatteridIn(List<String> values) {
            addCriterion("matterId in", values, "matterid");
            return (Criteria) this;
        }

        public Criteria andMatteridNotIn(List<String> values) {
            addCriterion("matterId not in", values, "matterid");
            return (Criteria) this;
        }

        public Criteria andMatteridBetween(String value1, String value2) {
            addCriterion("matterId between", value1, value2, "matterid");
            return (Criteria) this;
        }

        public Criteria andMatteridNotBetween(String value1, String value2) {
            addCriterion("matterId not between", value1, value2, "matterid");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserContentIsNull() {
            addCriterion("user_content is null");
            return (Criteria) this;
        }

        public Criteria andUserContentIsNotNull() {
            addCriterion("user_content is not null");
            return (Criteria) this;
        }

        public Criteria andUserContentEqualTo(String value) {
            addCriterion("user_content =", value, "userContent");
            return (Criteria) this;
        }

        public Criteria andUserContentNotEqualTo(String value) {
            addCriterion("user_content <>", value, "userContent");
            return (Criteria) this;
        }

        public Criteria andUserContentGreaterThan(String value) {
            addCriterion("user_content >", value, "userContent");
            return (Criteria) this;
        }

        public Criteria andUserContentGreaterThanOrEqualTo(String value) {
            addCriterion("user_content >=", value, "userContent");
            return (Criteria) this;
        }

        public Criteria andUserContentLessThan(String value) {
            addCriterion("user_content <", value, "userContent");
            return (Criteria) this;
        }

        public Criteria andUserContentLessThanOrEqualTo(String value) {
            addCriterion("user_content <=", value, "userContent");
            return (Criteria) this;
        }

        public Criteria andUserContentLike(String value) {
            addCriterion("user_content like", value, "userContent");
            return (Criteria) this;
        }

        public Criteria andUserContentNotLike(String value) {
            addCriterion("user_content not like", value, "userContent");
            return (Criteria) this;
        }

        public Criteria andUserContentIn(List<String> values) {
            addCriterion("user_content in", values, "userContent");
            return (Criteria) this;
        }

        public Criteria andUserContentNotIn(List<String> values) {
            addCriterion("user_content not in", values, "userContent");
            return (Criteria) this;
        }

        public Criteria andUserContentBetween(String value1, String value2) {
            addCriterion("user_content between", value1, value2, "userContent");
            return (Criteria) this;
        }

        public Criteria andUserContentNotBetween(String value1, String value2) {
            addCriterion("user_content not between", value1, value2, "userContent");
            return (Criteria) this;
        }

        public Criteria andUserOpenidIsNull() {
            addCriterion("user_openid is null");
            return (Criteria) this;
        }

        public Criteria andUserOpenidIsNotNull() {
            addCriterion("user_openid is not null");
            return (Criteria) this;
        }

        public Criteria andUserOpenidEqualTo(String value) {
            addCriterion("user_openid =", value, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidNotEqualTo(String value) {
            addCriterion("user_openid <>", value, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidGreaterThan(String value) {
            addCriterion("user_openid >", value, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("user_openid >=", value, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidLessThan(String value) {
            addCriterion("user_openid <", value, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidLessThanOrEqualTo(String value) {
            addCriterion("user_openid <=", value, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidLike(String value) {
            addCriterion("user_openid like", value, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidNotLike(String value) {
            addCriterion("user_openid not like", value, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidIn(List<String> values) {
            addCriterion("user_openid in", values, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidNotIn(List<String> values) {
            addCriterion("user_openid not in", values, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidBetween(String value1, String value2) {
            addCriterion("user_openid between", value1, value2, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidNotBetween(String value1, String value2) {
            addCriterion("user_openid not between", value1, value2, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserTimeIsNull() {
            addCriterion("user_time is null");
            return (Criteria) this;
        }

        public Criteria andUserTimeIsNotNull() {
            addCriterion("user_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserTimeEqualTo(String value) {
            addCriterion("user_time =", value, "userTime");
            return (Criteria) this;
        }

        public Criteria andUserTimeNotEqualTo(String value) {
            addCriterion("user_time <>", value, "userTime");
            return (Criteria) this;
        }

        public Criteria andUserTimeGreaterThan(String value) {
            addCriterion("user_time >", value, "userTime");
            return (Criteria) this;
        }

        public Criteria andUserTimeGreaterThanOrEqualTo(String value) {
            addCriterion("user_time >=", value, "userTime");
            return (Criteria) this;
        }

        public Criteria andUserTimeLessThan(String value) {
            addCriterion("user_time <", value, "userTime");
            return (Criteria) this;
        }

        public Criteria andUserTimeLessThanOrEqualTo(String value) {
            addCriterion("user_time <=", value, "userTime");
            return (Criteria) this;
        }

        public Criteria andUserTimeLike(String value) {
            addCriterion("user_time like", value, "userTime");
            return (Criteria) this;
        }

        public Criteria andUserTimeNotLike(String value) {
            addCriterion("user_time not like", value, "userTime");
            return (Criteria) this;
        }

        public Criteria andUserTimeIn(List<String> values) {
            addCriterion("user_time in", values, "userTime");
            return (Criteria) this;
        }

        public Criteria andUserTimeNotIn(List<String> values) {
            addCriterion("user_time not in", values, "userTime");
            return (Criteria) this;
        }

        public Criteria andUserTimeBetween(String value1, String value2) {
            addCriterion("user_time between", value1, value2, "userTime");
            return (Criteria) this;
        }

        public Criteria andUserTimeNotBetween(String value1, String value2) {
            addCriterion("user_time not between", value1, value2, "userTime");
            return (Criteria) this;
        }

        public Criteria andApproverOpenidIsNull() {
            addCriterion("approver_openid is null");
            return (Criteria) this;
        }

        public Criteria andApproverOpenidIsNotNull() {
            addCriterion("approver_openid is not null");
            return (Criteria) this;
        }

        public Criteria andApproverOpenidEqualTo(String value) {
            addCriterion("approver_openid =", value, "approverOpenid");
            return (Criteria) this;
        }

        public Criteria andApproverOpenidNotEqualTo(String value) {
            addCriterion("approver_openid <>", value, "approverOpenid");
            return (Criteria) this;
        }

        public Criteria andApproverOpenidGreaterThan(String value) {
            addCriterion("approver_openid >", value, "approverOpenid");
            return (Criteria) this;
        }

        public Criteria andApproverOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("approver_openid >=", value, "approverOpenid");
            return (Criteria) this;
        }

        public Criteria andApproverOpenidLessThan(String value) {
            addCriterion("approver_openid <", value, "approverOpenid");
            return (Criteria) this;
        }

        public Criteria andApproverOpenidLessThanOrEqualTo(String value) {
            addCriterion("approver_openid <=", value, "approverOpenid");
            return (Criteria) this;
        }

        public Criteria andApproverOpenidLike(String value) {
            addCriterion("approver_openid like", value, "approverOpenid");
            return (Criteria) this;
        }

        public Criteria andApproverOpenidNotLike(String value) {
            addCriterion("approver_openid not like", value, "approverOpenid");
            return (Criteria) this;
        }

        public Criteria andApproverOpenidIn(List<String> values) {
            addCriterion("approver_openid in", values, "approverOpenid");
            return (Criteria) this;
        }

        public Criteria andApproverOpenidNotIn(List<String> values) {
            addCriterion("approver_openid not in", values, "approverOpenid");
            return (Criteria) this;
        }

        public Criteria andApproverOpenidBetween(String value1, String value2) {
            addCriterion("approver_openid between", value1, value2, "approverOpenid");
            return (Criteria) this;
        }

        public Criteria andApproverOpenidNotBetween(String value1, String value2) {
            addCriterion("approver_openid not between", value1, value2, "approverOpenid");
            return (Criteria) this;
        }

        public Criteria andApproverNameIsNull() {
            addCriterion("approver_name is null");
            return (Criteria) this;
        }

        public Criteria andApproverNameIsNotNull() {
            addCriterion("approver_name is not null");
            return (Criteria) this;
        }

        public Criteria andApproverNameEqualTo(String value) {
            addCriterion("approver_name =", value, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameNotEqualTo(String value) {
            addCriterion("approver_name <>", value, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameGreaterThan(String value) {
            addCriterion("approver_name >", value, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameGreaterThanOrEqualTo(String value) {
            addCriterion("approver_name >=", value, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameLessThan(String value) {
            addCriterion("approver_name <", value, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameLessThanOrEqualTo(String value) {
            addCriterion("approver_name <=", value, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameLike(String value) {
            addCriterion("approver_name like", value, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameNotLike(String value) {
            addCriterion("approver_name not like", value, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameIn(List<String> values) {
            addCriterion("approver_name in", values, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameNotIn(List<String> values) {
            addCriterion("approver_name not in", values, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameBetween(String value1, String value2) {
            addCriterion("approver_name between", value1, value2, "approverName");
            return (Criteria) this;
        }

        public Criteria andApproverNameNotBetween(String value1, String value2) {
            addCriterion("approver_name not between", value1, value2, "approverName");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Integer value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Integer value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Integer> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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