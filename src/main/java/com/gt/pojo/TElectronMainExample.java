package com.gt.pojo;

import java.util.ArrayList;
import java.util.List;

public class TElectronMainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TElectronMainExample() {
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

        public Criteria andTIdIsNull() {
            addCriterion("t_id is null");
            return (Criteria) this;
        }

        public Criteria andTIdIsNotNull() {
            addCriterion("t_id is not null");
            return (Criteria) this;
        }

        public Criteria andTIdEqualTo(Integer value) {
            addCriterion("t_id =", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotEqualTo(Integer value) {
            addCriterion("t_id <>", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThan(Integer value) {
            addCriterion("t_id >", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_id >=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThan(Integer value) {
            addCriterion("t_id <", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThanOrEqualTo(Integer value) {
            addCriterion("t_id <=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdIn(List<Integer> values) {
            addCriterion("t_id in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotIn(List<Integer> values) {
            addCriterion("t_id not in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdBetween(Integer value1, Integer value2) {
            addCriterion("t_id between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotBetween(Integer value1, Integer value2) {
            addCriterion("t_id not between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTNameIsNull() {
            addCriterion("t_name is null");
            return (Criteria) this;
        }

        public Criteria andTNameIsNotNull() {
            addCriterion("t_name is not null");
            return (Criteria) this;
        }

        public Criteria andTNameEqualTo(String value) {
            addCriterion("t_name =", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotEqualTo(String value) {
            addCriterion("t_name <>", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameGreaterThan(String value) {
            addCriterion("t_name >", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameGreaterThanOrEqualTo(String value) {
            addCriterion("t_name >=", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLessThan(String value) {
            addCriterion("t_name <", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLessThanOrEqualTo(String value) {
            addCriterion("t_name <=", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLike(String value) {
            addCriterion("t_name like", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotLike(String value) {
            addCriterion("t_name not like", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameIn(List<String> values) {
            addCriterion("t_name in", values, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotIn(List<String> values) {
            addCriterion("t_name not in", values, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameBetween(String value1, String value2) {
            addCriterion("t_name between", value1, value2, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotBetween(String value1, String value2) {
            addCriterion("t_name not between", value1, value2, "tName");
            return (Criteria) this;
        }

        public Criteria andTNumberIsNull() {
            addCriterion("t_number is null");
            return (Criteria) this;
        }

        public Criteria andTNumberIsNotNull() {
            addCriterion("t_number is not null");
            return (Criteria) this;
        }

        public Criteria andTNumberEqualTo(String value) {
            addCriterion("t_number =", value, "tNumber");
            return (Criteria) this;
        }

        public Criteria andTNumberNotEqualTo(String value) {
            addCriterion("t_number <>", value, "tNumber");
            return (Criteria) this;
        }

        public Criteria andTNumberGreaterThan(String value) {
            addCriterion("t_number >", value, "tNumber");
            return (Criteria) this;
        }

        public Criteria andTNumberGreaterThanOrEqualTo(String value) {
            addCriterion("t_number >=", value, "tNumber");
            return (Criteria) this;
        }

        public Criteria andTNumberLessThan(String value) {
            addCriterion("t_number <", value, "tNumber");
            return (Criteria) this;
        }

        public Criteria andTNumberLessThanOrEqualTo(String value) {
            addCriterion("t_number <=", value, "tNumber");
            return (Criteria) this;
        }

        public Criteria andTNumberLike(String value) {
            addCriterion("t_number like", value, "tNumber");
            return (Criteria) this;
        }

        public Criteria andTNumberNotLike(String value) {
            addCriterion("t_number not like", value, "tNumber");
            return (Criteria) this;
        }

        public Criteria andTNumberIn(List<String> values) {
            addCriterion("t_number in", values, "tNumber");
            return (Criteria) this;
        }

        public Criteria andTNumberNotIn(List<String> values) {
            addCriterion("t_number not in", values, "tNumber");
            return (Criteria) this;
        }

        public Criteria andTNumberBetween(String value1, String value2) {
            addCriterion("t_number between", value1, value2, "tNumber");
            return (Criteria) this;
        }

        public Criteria andTNumberNotBetween(String value1, String value2) {
            addCriterion("t_number not between", value1, value2, "tNumber");
            return (Criteria) this;
        }

        public Criteria andTBusinessNumberIsNull() {
            addCriterion("t_business_number is null");
            return (Criteria) this;
        }

        public Criteria andTBusinessNumberIsNotNull() {
            addCriterion("t_business_number is not null");
            return (Criteria) this;
        }

        public Criteria andTBusinessNumberEqualTo(String value) {
            addCriterion("t_business_number =", value, "tBusinessNumber");
            return (Criteria) this;
        }

        public Criteria andTBusinessNumberNotEqualTo(String value) {
            addCriterion("t_business_number <>", value, "tBusinessNumber");
            return (Criteria) this;
        }

        public Criteria andTBusinessNumberGreaterThan(String value) {
            addCriterion("t_business_number >", value, "tBusinessNumber");
            return (Criteria) this;
        }

        public Criteria andTBusinessNumberGreaterThanOrEqualTo(String value) {
            addCriterion("t_business_number >=", value, "tBusinessNumber");
            return (Criteria) this;
        }

        public Criteria andTBusinessNumberLessThan(String value) {
            addCriterion("t_business_number <", value, "tBusinessNumber");
            return (Criteria) this;
        }

        public Criteria andTBusinessNumberLessThanOrEqualTo(String value) {
            addCriterion("t_business_number <=", value, "tBusinessNumber");
            return (Criteria) this;
        }

        public Criteria andTBusinessNumberLike(String value) {
            addCriterion("t_business_number like", value, "tBusinessNumber");
            return (Criteria) this;
        }

        public Criteria andTBusinessNumberNotLike(String value) {
            addCriterion("t_business_number not like", value, "tBusinessNumber");
            return (Criteria) this;
        }

        public Criteria andTBusinessNumberIn(List<String> values) {
            addCriterion("t_business_number in", values, "tBusinessNumber");
            return (Criteria) this;
        }

        public Criteria andTBusinessNumberNotIn(List<String> values) {
            addCriterion("t_business_number not in", values, "tBusinessNumber");
            return (Criteria) this;
        }

        public Criteria andTBusinessNumberBetween(String value1, String value2) {
            addCriterion("t_business_number between", value1, value2, "tBusinessNumber");
            return (Criteria) this;
        }

        public Criteria andTBusinessNumberNotBetween(String value1, String value2) {
            addCriterion("t_business_number not between", value1, value2, "tBusinessNumber");
            return (Criteria) this;
        }

        public Criteria andTSiteIsNull() {
            addCriterion("t_site is null");
            return (Criteria) this;
        }

        public Criteria andTSiteIsNotNull() {
            addCriterion("t_site is not null");
            return (Criteria) this;
        }

        public Criteria andTSiteEqualTo(String value) {
            addCriterion("t_site =", value, "tSite");
            return (Criteria) this;
        }

        public Criteria andTSiteNotEqualTo(String value) {
            addCriterion("t_site <>", value, "tSite");
            return (Criteria) this;
        }

        public Criteria andTSiteGreaterThan(String value) {
            addCriterion("t_site >", value, "tSite");
            return (Criteria) this;
        }

        public Criteria andTSiteGreaterThanOrEqualTo(String value) {
            addCriterion("t_site >=", value, "tSite");
            return (Criteria) this;
        }

        public Criteria andTSiteLessThan(String value) {
            addCriterion("t_site <", value, "tSite");
            return (Criteria) this;
        }

        public Criteria andTSiteLessThanOrEqualTo(String value) {
            addCriterion("t_site <=", value, "tSite");
            return (Criteria) this;
        }

        public Criteria andTSiteLike(String value) {
            addCriterion("t_site like", value, "tSite");
            return (Criteria) this;
        }

        public Criteria andTSiteNotLike(String value) {
            addCriterion("t_site not like", value, "tSite");
            return (Criteria) this;
        }

        public Criteria andTSiteIn(List<String> values) {
            addCriterion("t_site in", values, "tSite");
            return (Criteria) this;
        }

        public Criteria andTSiteNotIn(List<String> values) {
            addCriterion("t_site not in", values, "tSite");
            return (Criteria) this;
        }

        public Criteria andTSiteBetween(String value1, String value2) {
            addCriterion("t_site between", value1, value2, "tSite");
            return (Criteria) this;
        }

        public Criteria andTSiteNotBetween(String value1, String value2) {
            addCriterion("t_site not between", value1, value2, "tSite");
            return (Criteria) this;
        }

        public Criteria andTProjectIsNull() {
            addCriterion("t_project is null");
            return (Criteria) this;
        }

        public Criteria andTProjectIsNotNull() {
            addCriterion("t_project is not null");
            return (Criteria) this;
        }

        public Criteria andTProjectEqualTo(String value) {
            addCriterion("t_project =", value, "tProject");
            return (Criteria) this;
        }

        public Criteria andTProjectNotEqualTo(String value) {
            addCriterion("t_project <>", value, "tProject");
            return (Criteria) this;
        }

        public Criteria andTProjectGreaterThan(String value) {
            addCriterion("t_project >", value, "tProject");
            return (Criteria) this;
        }

        public Criteria andTProjectGreaterThanOrEqualTo(String value) {
            addCriterion("t_project >=", value, "tProject");
            return (Criteria) this;
        }

        public Criteria andTProjectLessThan(String value) {
            addCriterion("t_project <", value, "tProject");
            return (Criteria) this;
        }

        public Criteria andTProjectLessThanOrEqualTo(String value) {
            addCriterion("t_project <=", value, "tProject");
            return (Criteria) this;
        }

        public Criteria andTProjectLike(String value) {
            addCriterion("t_project like", value, "tProject");
            return (Criteria) this;
        }

        public Criteria andTProjectNotLike(String value) {
            addCriterion("t_project not like", value, "tProject");
            return (Criteria) this;
        }

        public Criteria andTProjectIn(List<String> values) {
            addCriterion("t_project in", values, "tProject");
            return (Criteria) this;
        }

        public Criteria andTProjectNotIn(List<String> values) {
            addCriterion("t_project not in", values, "tProject");
            return (Criteria) this;
        }

        public Criteria andTProjectBetween(String value1, String value2) {
            addCriterion("t_project between", value1, value2, "tProject");
            return (Criteria) this;
        }

        public Criteria andTProjectNotBetween(String value1, String value2) {
            addCriterion("t_project not between", value1, value2, "tProject");
            return (Criteria) this;
        }

        public Criteria andTContentIsNull() {
            addCriterion("t_content is null");
            return (Criteria) this;
        }

        public Criteria andTContentIsNotNull() {
            addCriterion("t_content is not null");
            return (Criteria) this;
        }

        public Criteria andTContentEqualTo(String value) {
            addCriterion("t_content =", value, "tContent");
            return (Criteria) this;
        }

        public Criteria andTContentNotEqualTo(String value) {
            addCriterion("t_content <>", value, "tContent");
            return (Criteria) this;
        }

        public Criteria andTContentGreaterThan(String value) {
            addCriterion("t_content >", value, "tContent");
            return (Criteria) this;
        }

        public Criteria andTContentGreaterThanOrEqualTo(String value) {
            addCriterion("t_content >=", value, "tContent");
            return (Criteria) this;
        }

        public Criteria andTContentLessThan(String value) {
            addCriterion("t_content <", value, "tContent");
            return (Criteria) this;
        }

        public Criteria andTContentLessThanOrEqualTo(String value) {
            addCriterion("t_content <=", value, "tContent");
            return (Criteria) this;
        }

        public Criteria andTContentLike(String value) {
            addCriterion("t_content like", value, "tContent");
            return (Criteria) this;
        }

        public Criteria andTContentNotLike(String value) {
            addCriterion("t_content not like", value, "tContent");
            return (Criteria) this;
        }

        public Criteria andTContentIn(List<String> values) {
            addCriterion("t_content in", values, "tContent");
            return (Criteria) this;
        }

        public Criteria andTContentNotIn(List<String> values) {
            addCriterion("t_content not in", values, "tContent");
            return (Criteria) this;
        }

        public Criteria andTContentBetween(String value1, String value2) {
            addCriterion("t_content between", value1, value2, "tContent");
            return (Criteria) this;
        }

        public Criteria andTContentNotBetween(String value1, String value2) {
            addCriterion("t_content not between", value1, value2, "tContent");
            return (Criteria) this;
        }

        public Criteria andTManagerIsNull() {
            addCriterion("t_manager is null");
            return (Criteria) this;
        }

        public Criteria andTManagerIsNotNull() {
            addCriterion("t_manager is not null");
            return (Criteria) this;
        }

        public Criteria andTManagerEqualTo(String value) {
            addCriterion("t_manager =", value, "tManager");
            return (Criteria) this;
        }

        public Criteria andTManagerNotEqualTo(String value) {
            addCriterion("t_manager <>", value, "tManager");
            return (Criteria) this;
        }

        public Criteria andTManagerGreaterThan(String value) {
            addCriterion("t_manager >", value, "tManager");
            return (Criteria) this;
        }

        public Criteria andTManagerGreaterThanOrEqualTo(String value) {
            addCriterion("t_manager >=", value, "tManager");
            return (Criteria) this;
        }

        public Criteria andTManagerLessThan(String value) {
            addCriterion("t_manager <", value, "tManager");
            return (Criteria) this;
        }

        public Criteria andTManagerLessThanOrEqualTo(String value) {
            addCriterion("t_manager <=", value, "tManager");
            return (Criteria) this;
        }

        public Criteria andTManagerLike(String value) {
            addCriterion("t_manager like", value, "tManager");
            return (Criteria) this;
        }

        public Criteria andTManagerNotLike(String value) {
            addCriterion("t_manager not like", value, "tManager");
            return (Criteria) this;
        }

        public Criteria andTManagerIn(List<String> values) {
            addCriterion("t_manager in", values, "tManager");
            return (Criteria) this;
        }

        public Criteria andTManagerNotIn(List<String> values) {
            addCriterion("t_manager not in", values, "tManager");
            return (Criteria) this;
        }

        public Criteria andTManagerBetween(String value1, String value2) {
            addCriterion("t_manager between", value1, value2, "tManager");
            return (Criteria) this;
        }

        public Criteria andTManagerNotBetween(String value1, String value2) {
            addCriterion("t_manager not between", value1, value2, "tManager");
            return (Criteria) this;
        }

        public Criteria andTPhoneIsNull() {
            addCriterion("t_phone is null");
            return (Criteria) this;
        }

        public Criteria andTPhoneIsNotNull() {
            addCriterion("t_phone is not null");
            return (Criteria) this;
        }

        public Criteria andTPhoneEqualTo(String value) {
            addCriterion("t_phone =", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneNotEqualTo(String value) {
            addCriterion("t_phone <>", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneGreaterThan(String value) {
            addCriterion("t_phone >", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("t_phone >=", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneLessThan(String value) {
            addCriterion("t_phone <", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneLessThanOrEqualTo(String value) {
            addCriterion("t_phone <=", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneLike(String value) {
            addCriterion("t_phone like", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneNotLike(String value) {
            addCriterion("t_phone not like", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneIn(List<String> values) {
            addCriterion("t_phone in", values, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneNotIn(List<String> values) {
            addCriterion("t_phone not in", values, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneBetween(String value1, String value2) {
            addCriterion("t_phone between", value1, value2, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneNotBetween(String value1, String value2) {
            addCriterion("t_phone not between", value1, value2, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTServiceIsNull() {
            addCriterion("t_service is null");
            return (Criteria) this;
        }

        public Criteria andTServiceIsNotNull() {
            addCriterion("t_service is not null");
            return (Criteria) this;
        }

        public Criteria andTServiceEqualTo(String value) {
            addCriterion("t_service =", value, "tService");
            return (Criteria) this;
        }

        public Criteria andTServiceNotEqualTo(String value) {
            addCriterion("t_service <>", value, "tService");
            return (Criteria) this;
        }

        public Criteria andTServiceGreaterThan(String value) {
            addCriterion("t_service >", value, "tService");
            return (Criteria) this;
        }

        public Criteria andTServiceGreaterThanOrEqualTo(String value) {
            addCriterion("t_service >=", value, "tService");
            return (Criteria) this;
        }

        public Criteria andTServiceLessThan(String value) {
            addCriterion("t_service <", value, "tService");
            return (Criteria) this;
        }

        public Criteria andTServiceLessThanOrEqualTo(String value) {
            addCriterion("t_service <=", value, "tService");
            return (Criteria) this;
        }

        public Criteria andTServiceLike(String value) {
            addCriterion("t_service like", value, "tService");
            return (Criteria) this;
        }

        public Criteria andTServiceNotLike(String value) {
            addCriterion("t_service not like", value, "tService");
            return (Criteria) this;
        }

        public Criteria andTServiceIn(List<String> values) {
            addCriterion("t_service in", values, "tService");
            return (Criteria) this;
        }

        public Criteria andTServiceNotIn(List<String> values) {
            addCriterion("t_service not in", values, "tService");
            return (Criteria) this;
        }

        public Criteria andTServiceBetween(String value1, String value2) {
            addCriterion("t_service between", value1, value2, "tService");
            return (Criteria) this;
        }

        public Criteria andTServiceNotBetween(String value1, String value2) {
            addCriterion("t_service not between", value1, value2, "tService");
            return (Criteria) this;
        }

        public Criteria andTIdentityCardIsNull() {
            addCriterion("t_identity_card is null");
            return (Criteria) this;
        }

        public Criteria andTIdentityCardIsNotNull() {
            addCriterion("t_identity_card is not null");
            return (Criteria) this;
        }

        public Criteria andTIdentityCardEqualTo(String value) {
            addCriterion("t_identity_card =", value, "tIdentityCard");
            return (Criteria) this;
        }

        public Criteria andTIdentityCardNotEqualTo(String value) {
            addCriterion("t_identity_card <>", value, "tIdentityCard");
            return (Criteria) this;
        }

        public Criteria andTIdentityCardGreaterThan(String value) {
            addCriterion("t_identity_card >", value, "tIdentityCard");
            return (Criteria) this;
        }

        public Criteria andTIdentityCardGreaterThanOrEqualTo(String value) {
            addCriterion("t_identity_card >=", value, "tIdentityCard");
            return (Criteria) this;
        }

        public Criteria andTIdentityCardLessThan(String value) {
            addCriterion("t_identity_card <", value, "tIdentityCard");
            return (Criteria) this;
        }

        public Criteria andTIdentityCardLessThanOrEqualTo(String value) {
            addCriterion("t_identity_card <=", value, "tIdentityCard");
            return (Criteria) this;
        }

        public Criteria andTIdentityCardLike(String value) {
            addCriterion("t_identity_card like", value, "tIdentityCard");
            return (Criteria) this;
        }

        public Criteria andTIdentityCardNotLike(String value) {
            addCriterion("t_identity_card not like", value, "tIdentityCard");
            return (Criteria) this;
        }

        public Criteria andTIdentityCardIn(List<String> values) {
            addCriterion("t_identity_card in", values, "tIdentityCard");
            return (Criteria) this;
        }

        public Criteria andTIdentityCardNotIn(List<String> values) {
            addCriterion("t_identity_card not in", values, "tIdentityCard");
            return (Criteria) this;
        }

        public Criteria andTIdentityCardBetween(String value1, String value2) {
            addCriterion("t_identity_card between", value1, value2, "tIdentityCard");
            return (Criteria) this;
        }

        public Criteria andTIdentityCardNotBetween(String value1, String value2) {
            addCriterion("t_identity_card not between", value1, value2, "tIdentityCard");
            return (Criteria) this;
        }

        public Criteria andTIdentityCardTwoIsNull() {
            addCriterion("t_identity_card_two is null");
            return (Criteria) this;
        }

        public Criteria andTIdentityCardTwoIsNotNull() {
            addCriterion("t_identity_card_two is not null");
            return (Criteria) this;
        }

        public Criteria andTIdentityCardTwoEqualTo(String value) {
            addCriterion("t_identity_card_two =", value, "tIdentityCardTwo");
            return (Criteria) this;
        }

        public Criteria andTIdentityCardTwoNotEqualTo(String value) {
            addCriterion("t_identity_card_two <>", value, "tIdentityCardTwo");
            return (Criteria) this;
        }

        public Criteria andTIdentityCardTwoGreaterThan(String value) {
            addCriterion("t_identity_card_two >", value, "tIdentityCardTwo");
            return (Criteria) this;
        }

        public Criteria andTIdentityCardTwoGreaterThanOrEqualTo(String value) {
            addCriterion("t_identity_card_two >=", value, "tIdentityCardTwo");
            return (Criteria) this;
        }

        public Criteria andTIdentityCardTwoLessThan(String value) {
            addCriterion("t_identity_card_two <", value, "tIdentityCardTwo");
            return (Criteria) this;
        }

        public Criteria andTIdentityCardTwoLessThanOrEqualTo(String value) {
            addCriterion("t_identity_card_two <=", value, "tIdentityCardTwo");
            return (Criteria) this;
        }

        public Criteria andTIdentityCardTwoLike(String value) {
            addCriterion("t_identity_card_two like", value, "tIdentityCardTwo");
            return (Criteria) this;
        }

        public Criteria andTIdentityCardTwoNotLike(String value) {
            addCriterion("t_identity_card_two not like", value, "tIdentityCardTwo");
            return (Criteria) this;
        }

        public Criteria andTIdentityCardTwoIn(List<String> values) {
            addCriterion("t_identity_card_two in", values, "tIdentityCardTwo");
            return (Criteria) this;
        }

        public Criteria andTIdentityCardTwoNotIn(List<String> values) {
            addCriterion("t_identity_card_two not in", values, "tIdentityCardTwo");
            return (Criteria) this;
        }

        public Criteria andTIdentityCardTwoBetween(String value1, String value2) {
            addCriterion("t_identity_card_two between", value1, value2, "tIdentityCardTwo");
            return (Criteria) this;
        }

        public Criteria andTIdentityCardTwoNotBetween(String value1, String value2) {
            addCriterion("t_identity_card_two not between", value1, value2, "tIdentityCardTwo");
            return (Criteria) this;
        }

        public Criteria andTBusinessIsNull() {
            addCriterion("t_business is null");
            return (Criteria) this;
        }

        public Criteria andTBusinessIsNotNull() {
            addCriterion("t_business is not null");
            return (Criteria) this;
        }

        public Criteria andTBusinessEqualTo(String value) {
            addCriterion("t_business =", value, "tBusiness");
            return (Criteria) this;
        }

        public Criteria andTBusinessNotEqualTo(String value) {
            addCriterion("t_business <>", value, "tBusiness");
            return (Criteria) this;
        }

        public Criteria andTBusinessGreaterThan(String value) {
            addCriterion("t_business >", value, "tBusiness");
            return (Criteria) this;
        }

        public Criteria andTBusinessGreaterThanOrEqualTo(String value) {
            addCriterion("t_business >=", value, "tBusiness");
            return (Criteria) this;
        }

        public Criteria andTBusinessLessThan(String value) {
            addCriterion("t_business <", value, "tBusiness");
            return (Criteria) this;
        }

        public Criteria andTBusinessLessThanOrEqualTo(String value) {
            addCriterion("t_business <=", value, "tBusiness");
            return (Criteria) this;
        }

        public Criteria andTBusinessLike(String value) {
            addCriterion("t_business like", value, "tBusiness");
            return (Criteria) this;
        }

        public Criteria andTBusinessNotLike(String value) {
            addCriterion("t_business not like", value, "tBusiness");
            return (Criteria) this;
        }

        public Criteria andTBusinessIn(List<String> values) {
            addCriterion("t_business in", values, "tBusiness");
            return (Criteria) this;
        }

        public Criteria andTBusinessNotIn(List<String> values) {
            addCriterion("t_business not in", values, "tBusiness");
            return (Criteria) this;
        }

        public Criteria andTBusinessBetween(String value1, String value2) {
            addCriterion("t_business between", value1, value2, "tBusiness");
            return (Criteria) this;
        }

        public Criteria andTBusinessNotBetween(String value1, String value2) {
            addCriterion("t_business not between", value1, value2, "tBusiness");
            return (Criteria) this;
        }

        public Criteria andTSignIsNull() {
            addCriterion("t_sign is null");
            return (Criteria) this;
        }

        public Criteria andTSignIsNotNull() {
            addCriterion("t_sign is not null");
            return (Criteria) this;
        }

        public Criteria andTSignEqualTo(String value) {
            addCriterion("t_sign =", value, "tSign");
            return (Criteria) this;
        }

        public Criteria andTSignNotEqualTo(String value) {
            addCriterion("t_sign <>", value, "tSign");
            return (Criteria) this;
        }

        public Criteria andTSignGreaterThan(String value) {
            addCriterion("t_sign >", value, "tSign");
            return (Criteria) this;
        }

        public Criteria andTSignGreaterThanOrEqualTo(String value) {
            addCriterion("t_sign >=", value, "tSign");
            return (Criteria) this;
        }

        public Criteria andTSignLessThan(String value) {
            addCriterion("t_sign <", value, "tSign");
            return (Criteria) this;
        }

        public Criteria andTSignLessThanOrEqualTo(String value) {
            addCriterion("t_sign <=", value, "tSign");
            return (Criteria) this;
        }

        public Criteria andTSignLike(String value) {
            addCriterion("t_sign like", value, "tSign");
            return (Criteria) this;
        }

        public Criteria andTSignNotLike(String value) {
            addCriterion("t_sign not like", value, "tSign");
            return (Criteria) this;
        }

        public Criteria andTSignIn(List<String> values) {
            addCriterion("t_sign in", values, "tSign");
            return (Criteria) this;
        }

        public Criteria andTSignNotIn(List<String> values) {
            addCriterion("t_sign not in", values, "tSign");
            return (Criteria) this;
        }

        public Criteria andTSignBetween(String value1, String value2) {
            addCriterion("t_sign between", value1, value2, "tSign");
            return (Criteria) this;
        }

        public Criteria andTSignNotBetween(String value1, String value2) {
            addCriterion("t_sign not between", value1, value2, "tSign");
            return (Criteria) this;
        }

        public Criteria andTAgreementIsNull() {
            addCriterion("t_agreement is null");
            return (Criteria) this;
        }

        public Criteria andTAgreementIsNotNull() {
            addCriterion("t_agreement is not null");
            return (Criteria) this;
        }

        public Criteria andTAgreementEqualTo(Integer value) {
            addCriterion("t_agreement =", value, "tAgreement");
            return (Criteria) this;
        }

        public Criteria andTAgreementNotEqualTo(Integer value) {
            addCriterion("t_agreement <>", value, "tAgreement");
            return (Criteria) this;
        }

        public Criteria andTAgreementGreaterThan(Integer value) {
            addCriterion("t_agreement >", value, "tAgreement");
            return (Criteria) this;
        }

        public Criteria andTAgreementGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_agreement >=", value, "tAgreement");
            return (Criteria) this;
        }

        public Criteria andTAgreementLessThan(Integer value) {
            addCriterion("t_agreement <", value, "tAgreement");
            return (Criteria) this;
        }

        public Criteria andTAgreementLessThanOrEqualTo(Integer value) {
            addCriterion("t_agreement <=", value, "tAgreement");
            return (Criteria) this;
        }

        public Criteria andTAgreementIn(List<Integer> values) {
            addCriterion("t_agreement in", values, "tAgreement");
            return (Criteria) this;
        }

        public Criteria andTAgreementNotIn(List<Integer> values) {
            addCriterion("t_agreement not in", values, "tAgreement");
            return (Criteria) this;
        }

        public Criteria andTAgreementBetween(Integer value1, Integer value2) {
            addCriterion("t_agreement between", value1, value2, "tAgreement");
            return (Criteria) this;
        }

        public Criteria andTAgreementNotBetween(Integer value1, Integer value2) {
            addCriterion("t_agreement not between", value1, value2, "tAgreement");
            return (Criteria) this;
        }

        public Criteria andTDeleteIsNull() {
            addCriterion("t_delete is null");
            return (Criteria) this;
        }

        public Criteria andTDeleteIsNotNull() {
            addCriterion("t_delete is not null");
            return (Criteria) this;
        }

        public Criteria andTDeleteEqualTo(Integer value) {
            addCriterion("t_delete =", value, "tDelete");
            return (Criteria) this;
        }

        public Criteria andTDeleteNotEqualTo(Integer value) {
            addCriterion("t_delete <>", value, "tDelete");
            return (Criteria) this;
        }

        public Criteria andTDeleteGreaterThan(Integer value) {
            addCriterion("t_delete >", value, "tDelete");
            return (Criteria) this;
        }

        public Criteria andTDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_delete >=", value, "tDelete");
            return (Criteria) this;
        }

        public Criteria andTDeleteLessThan(Integer value) {
            addCriterion("t_delete <", value, "tDelete");
            return (Criteria) this;
        }

        public Criteria andTDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("t_delete <=", value, "tDelete");
            return (Criteria) this;
        }

        public Criteria andTDeleteIn(List<Integer> values) {
            addCriterion("t_delete in", values, "tDelete");
            return (Criteria) this;
        }

        public Criteria andTDeleteNotIn(List<Integer> values) {
            addCriterion("t_delete not in", values, "tDelete");
            return (Criteria) this;
        }

        public Criteria andTDeleteBetween(Integer value1, Integer value2) {
            addCriterion("t_delete between", value1, value2, "tDelete");
            return (Criteria) this;
        }

        public Criteria andTDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("t_delete not between", value1, value2, "tDelete");
            return (Criteria) this;
        }

        public Criteria andTShowIsNull() {
            addCriterion("t_show is null");
            return (Criteria) this;
        }

        public Criteria andTShowIsNotNull() {
            addCriterion("t_show is not null");
            return (Criteria) this;
        }

        public Criteria andTShowEqualTo(Integer value) {
            addCriterion("t_show =", value, "tShow");
            return (Criteria) this;
        }

        public Criteria andTShowNotEqualTo(Integer value) {
            addCriterion("t_show <>", value, "tShow");
            return (Criteria) this;
        }

        public Criteria andTShowGreaterThan(Integer value) {
            addCriterion("t_show >", value, "tShow");
            return (Criteria) this;
        }

        public Criteria andTShowGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_show >=", value, "tShow");
            return (Criteria) this;
        }

        public Criteria andTShowLessThan(Integer value) {
            addCriterion("t_show <", value, "tShow");
            return (Criteria) this;
        }

        public Criteria andTShowLessThanOrEqualTo(Integer value) {
            addCriterion("t_show <=", value, "tShow");
            return (Criteria) this;
        }

        public Criteria andTShowIn(List<Integer> values) {
            addCriterion("t_show in", values, "tShow");
            return (Criteria) this;
        }

        public Criteria andTShowNotIn(List<Integer> values) {
            addCriterion("t_show not in", values, "tShow");
            return (Criteria) this;
        }

        public Criteria andTShowBetween(Integer value1, Integer value2) {
            addCriterion("t_show between", value1, value2, "tShow");
            return (Criteria) this;
        }

        public Criteria andTShowNotBetween(Integer value1, Integer value2) {
            addCriterion("t_show not between", value1, value2, "tShow");
            return (Criteria) this;
        }

        public Criteria andTRegisterIdIsNull() {
            addCriterion("t_register_id is null");
            return (Criteria) this;
        }

        public Criteria andTRegisterIdIsNotNull() {
            addCriterion("t_register_id is not null");
            return (Criteria) this;
        }

        public Criteria andTRegisterIdEqualTo(Integer value) {
            addCriterion("t_register_id =", value, "tRegisterId");
            return (Criteria) this;
        }

        public Criteria andTRegisterIdNotEqualTo(Integer value) {
            addCriterion("t_register_id <>", value, "tRegisterId");
            return (Criteria) this;
        }

        public Criteria andTRegisterIdGreaterThan(Integer value) {
            addCriterion("t_register_id >", value, "tRegisterId");
            return (Criteria) this;
        }

        public Criteria andTRegisterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_register_id >=", value, "tRegisterId");
            return (Criteria) this;
        }

        public Criteria andTRegisterIdLessThan(Integer value) {
            addCriterion("t_register_id <", value, "tRegisterId");
            return (Criteria) this;
        }

        public Criteria andTRegisterIdLessThanOrEqualTo(Integer value) {
            addCriterion("t_register_id <=", value, "tRegisterId");
            return (Criteria) this;
        }

        public Criteria andTRegisterIdIn(List<Integer> values) {
            addCriterion("t_register_id in", values, "tRegisterId");
            return (Criteria) this;
        }

        public Criteria andTRegisterIdNotIn(List<Integer> values) {
            addCriterion("t_register_id not in", values, "tRegisterId");
            return (Criteria) this;
        }

        public Criteria andTRegisterIdBetween(Integer value1, Integer value2) {
            addCriterion("t_register_id between", value1, value2, "tRegisterId");
            return (Criteria) this;
        }

        public Criteria andTRegisterIdNotBetween(String value1, String value2) {
            addCriterion("t_register_id not between", value1, value2, "tRegisterId");
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