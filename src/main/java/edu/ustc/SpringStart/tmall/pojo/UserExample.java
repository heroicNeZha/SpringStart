package edu.ustc.SpringStart.tmall.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andHostIsNull() {
            addCriterion("Host is null");
            return (Criteria) this;
        }

        public Criteria andHostIsNotNull() {
            addCriterion("Host is not null");
            return (Criteria) this;
        }

        public Criteria andHostEqualTo(String value) {
            addCriterion("Host =", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotEqualTo(String value) {
            addCriterion("Host <>", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThan(String value) {
            addCriterion("Host >", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThanOrEqualTo(String value) {
            addCriterion("Host >=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThan(String value) {
            addCriterion("Host <", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThanOrEqualTo(String value) {
            addCriterion("Host <=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLike(String value) {
            addCriterion("Host like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotLike(String value) {
            addCriterion("Host not like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostIn(List<String> values) {
            addCriterion("Host in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotIn(List<String> values) {
            addCriterion("Host not in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostBetween(String value1, String value2) {
            addCriterion("Host between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotBetween(String value1, String value2) {
            addCriterion("Host not between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andUserIsNull() {
            addCriterion("User is null");
            return (Criteria) this;
        }

        public Criteria andUserIsNotNull() {
            addCriterion("User is not null");
            return (Criteria) this;
        }

        public Criteria andUserEqualTo(String value) {
            addCriterion("User =", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotEqualTo(String value) {
            addCriterion("User <>", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThan(String value) {
            addCriterion("User >", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThanOrEqualTo(String value) {
            addCriterion("User >=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThan(String value) {
            addCriterion("User <", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThanOrEqualTo(String value) {
            addCriterion("User <=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLike(String value) {
            addCriterion("User like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotLike(String value) {
            addCriterion("User not like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserIn(List<String> values) {
            addCriterion("User in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotIn(List<String> values) {
            addCriterion("User not in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserBetween(String value1, String value2) {
            addCriterion("User between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotBetween(String value1, String value2) {
            addCriterion("User not between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andSelect_privIsNull() {
            addCriterion("Select_priv is null");
            return (Criteria) this;
        }

        public Criteria andSelect_privIsNotNull() {
            addCriterion("Select_priv is not null");
            return (Criteria) this;
        }

        public Criteria andSelect_privEqualTo(String value) {
            addCriterion("Select_priv =", value, "select_priv");
            return (Criteria) this;
        }

        public Criteria andSelect_privNotEqualTo(String value) {
            addCriterion("Select_priv <>", value, "select_priv");
            return (Criteria) this;
        }

        public Criteria andSelect_privGreaterThan(String value) {
            addCriterion("Select_priv >", value, "select_priv");
            return (Criteria) this;
        }

        public Criteria andSelect_privGreaterThanOrEqualTo(String value) {
            addCriterion("Select_priv >=", value, "select_priv");
            return (Criteria) this;
        }

        public Criteria andSelect_privLessThan(String value) {
            addCriterion("Select_priv <", value, "select_priv");
            return (Criteria) this;
        }

        public Criteria andSelect_privLessThanOrEqualTo(String value) {
            addCriterion("Select_priv <=", value, "select_priv");
            return (Criteria) this;
        }

        public Criteria andSelect_privLike(String value) {
            addCriterion("Select_priv like", value, "select_priv");
            return (Criteria) this;
        }

        public Criteria andSelect_privNotLike(String value) {
            addCriterion("Select_priv not like", value, "select_priv");
            return (Criteria) this;
        }

        public Criteria andSelect_privIn(List<String> values) {
            addCriterion("Select_priv in", values, "select_priv");
            return (Criteria) this;
        }

        public Criteria andSelect_privNotIn(List<String> values) {
            addCriterion("Select_priv not in", values, "select_priv");
            return (Criteria) this;
        }

        public Criteria andSelect_privBetween(String value1, String value2) {
            addCriterion("Select_priv between", value1, value2, "select_priv");
            return (Criteria) this;
        }

        public Criteria andSelect_privNotBetween(String value1, String value2) {
            addCriterion("Select_priv not between", value1, value2, "select_priv");
            return (Criteria) this;
        }

        public Criteria andInsert_privIsNull() {
            addCriterion("Insert_priv is null");
            return (Criteria) this;
        }

        public Criteria andInsert_privIsNotNull() {
            addCriterion("Insert_priv is not null");
            return (Criteria) this;
        }

        public Criteria andInsert_privEqualTo(String value) {
            addCriterion("Insert_priv =", value, "insert_priv");
            return (Criteria) this;
        }

        public Criteria andInsert_privNotEqualTo(String value) {
            addCriterion("Insert_priv <>", value, "insert_priv");
            return (Criteria) this;
        }

        public Criteria andInsert_privGreaterThan(String value) {
            addCriterion("Insert_priv >", value, "insert_priv");
            return (Criteria) this;
        }

        public Criteria andInsert_privGreaterThanOrEqualTo(String value) {
            addCriterion("Insert_priv >=", value, "insert_priv");
            return (Criteria) this;
        }

        public Criteria andInsert_privLessThan(String value) {
            addCriterion("Insert_priv <", value, "insert_priv");
            return (Criteria) this;
        }

        public Criteria andInsert_privLessThanOrEqualTo(String value) {
            addCriterion("Insert_priv <=", value, "insert_priv");
            return (Criteria) this;
        }

        public Criteria andInsert_privLike(String value) {
            addCriterion("Insert_priv like", value, "insert_priv");
            return (Criteria) this;
        }

        public Criteria andInsert_privNotLike(String value) {
            addCriterion("Insert_priv not like", value, "insert_priv");
            return (Criteria) this;
        }

        public Criteria andInsert_privIn(List<String> values) {
            addCriterion("Insert_priv in", values, "insert_priv");
            return (Criteria) this;
        }

        public Criteria andInsert_privNotIn(List<String> values) {
            addCriterion("Insert_priv not in", values, "insert_priv");
            return (Criteria) this;
        }

        public Criteria andInsert_privBetween(String value1, String value2) {
            addCriterion("Insert_priv between", value1, value2, "insert_priv");
            return (Criteria) this;
        }

        public Criteria andInsert_privNotBetween(String value1, String value2) {
            addCriterion("Insert_priv not between", value1, value2, "insert_priv");
            return (Criteria) this;
        }

        public Criteria andUpdate_privIsNull() {
            addCriterion("Update_priv is null");
            return (Criteria) this;
        }

        public Criteria andUpdate_privIsNotNull() {
            addCriterion("Update_priv is not null");
            return (Criteria) this;
        }

        public Criteria andUpdate_privEqualTo(String value) {
            addCriterion("Update_priv =", value, "update_priv");
            return (Criteria) this;
        }

        public Criteria andUpdate_privNotEqualTo(String value) {
            addCriterion("Update_priv <>", value, "update_priv");
            return (Criteria) this;
        }

        public Criteria andUpdate_privGreaterThan(String value) {
            addCriterion("Update_priv >", value, "update_priv");
            return (Criteria) this;
        }

        public Criteria andUpdate_privGreaterThanOrEqualTo(String value) {
            addCriterion("Update_priv >=", value, "update_priv");
            return (Criteria) this;
        }

        public Criteria andUpdate_privLessThan(String value) {
            addCriterion("Update_priv <", value, "update_priv");
            return (Criteria) this;
        }

        public Criteria andUpdate_privLessThanOrEqualTo(String value) {
            addCriterion("Update_priv <=", value, "update_priv");
            return (Criteria) this;
        }

        public Criteria andUpdate_privLike(String value) {
            addCriterion("Update_priv like", value, "update_priv");
            return (Criteria) this;
        }

        public Criteria andUpdate_privNotLike(String value) {
            addCriterion("Update_priv not like", value, "update_priv");
            return (Criteria) this;
        }

        public Criteria andUpdate_privIn(List<String> values) {
            addCriterion("Update_priv in", values, "update_priv");
            return (Criteria) this;
        }

        public Criteria andUpdate_privNotIn(List<String> values) {
            addCriterion("Update_priv not in", values, "update_priv");
            return (Criteria) this;
        }

        public Criteria andUpdate_privBetween(String value1, String value2) {
            addCriterion("Update_priv between", value1, value2, "update_priv");
            return (Criteria) this;
        }

        public Criteria andUpdate_privNotBetween(String value1, String value2) {
            addCriterion("Update_priv not between", value1, value2, "update_priv");
            return (Criteria) this;
        }

        public Criteria andDelete_privIsNull() {
            addCriterion("Delete_priv is null");
            return (Criteria) this;
        }

        public Criteria andDelete_privIsNotNull() {
            addCriterion("Delete_priv is not null");
            return (Criteria) this;
        }

        public Criteria andDelete_privEqualTo(String value) {
            addCriterion("Delete_priv =", value, "delete_priv");
            return (Criteria) this;
        }

        public Criteria andDelete_privNotEqualTo(String value) {
            addCriterion("Delete_priv <>", value, "delete_priv");
            return (Criteria) this;
        }

        public Criteria andDelete_privGreaterThan(String value) {
            addCriterion("Delete_priv >", value, "delete_priv");
            return (Criteria) this;
        }

        public Criteria andDelete_privGreaterThanOrEqualTo(String value) {
            addCriterion("Delete_priv >=", value, "delete_priv");
            return (Criteria) this;
        }

        public Criteria andDelete_privLessThan(String value) {
            addCriterion("Delete_priv <", value, "delete_priv");
            return (Criteria) this;
        }

        public Criteria andDelete_privLessThanOrEqualTo(String value) {
            addCriterion("Delete_priv <=", value, "delete_priv");
            return (Criteria) this;
        }

        public Criteria andDelete_privLike(String value) {
            addCriterion("Delete_priv like", value, "delete_priv");
            return (Criteria) this;
        }

        public Criteria andDelete_privNotLike(String value) {
            addCriterion("Delete_priv not like", value, "delete_priv");
            return (Criteria) this;
        }

        public Criteria andDelete_privIn(List<String> values) {
            addCriterion("Delete_priv in", values, "delete_priv");
            return (Criteria) this;
        }

        public Criteria andDelete_privNotIn(List<String> values) {
            addCriterion("Delete_priv not in", values, "delete_priv");
            return (Criteria) this;
        }

        public Criteria andDelete_privBetween(String value1, String value2) {
            addCriterion("Delete_priv between", value1, value2, "delete_priv");
            return (Criteria) this;
        }

        public Criteria andDelete_privNotBetween(String value1, String value2) {
            addCriterion("Delete_priv not between", value1, value2, "delete_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_privIsNull() {
            addCriterion("Create_priv is null");
            return (Criteria) this;
        }

        public Criteria andCreate_privIsNotNull() {
            addCriterion("Create_priv is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_privEqualTo(String value) {
            addCriterion("Create_priv =", value, "create_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_privNotEqualTo(String value) {
            addCriterion("Create_priv <>", value, "create_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_privGreaterThan(String value) {
            addCriterion("Create_priv >", value, "create_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_privGreaterThanOrEqualTo(String value) {
            addCriterion("Create_priv >=", value, "create_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_privLessThan(String value) {
            addCriterion("Create_priv <", value, "create_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_privLessThanOrEqualTo(String value) {
            addCriterion("Create_priv <=", value, "create_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_privLike(String value) {
            addCriterion("Create_priv like", value, "create_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_privNotLike(String value) {
            addCriterion("Create_priv not like", value, "create_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_privIn(List<String> values) {
            addCriterion("Create_priv in", values, "create_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_privNotIn(List<String> values) {
            addCriterion("Create_priv not in", values, "create_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_privBetween(String value1, String value2) {
            addCriterion("Create_priv between", value1, value2, "create_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_privNotBetween(String value1, String value2) {
            addCriterion("Create_priv not between", value1, value2, "create_priv");
            return (Criteria) this;
        }

        public Criteria andDrop_privIsNull() {
            addCriterion("Drop_priv is null");
            return (Criteria) this;
        }

        public Criteria andDrop_privIsNotNull() {
            addCriterion("Drop_priv is not null");
            return (Criteria) this;
        }

        public Criteria andDrop_privEqualTo(String value) {
            addCriterion("Drop_priv =", value, "drop_priv");
            return (Criteria) this;
        }

        public Criteria andDrop_privNotEqualTo(String value) {
            addCriterion("Drop_priv <>", value, "drop_priv");
            return (Criteria) this;
        }

        public Criteria andDrop_privGreaterThan(String value) {
            addCriterion("Drop_priv >", value, "drop_priv");
            return (Criteria) this;
        }

        public Criteria andDrop_privGreaterThanOrEqualTo(String value) {
            addCriterion("Drop_priv >=", value, "drop_priv");
            return (Criteria) this;
        }

        public Criteria andDrop_privLessThan(String value) {
            addCriterion("Drop_priv <", value, "drop_priv");
            return (Criteria) this;
        }

        public Criteria andDrop_privLessThanOrEqualTo(String value) {
            addCriterion("Drop_priv <=", value, "drop_priv");
            return (Criteria) this;
        }

        public Criteria andDrop_privLike(String value) {
            addCriterion("Drop_priv like", value, "drop_priv");
            return (Criteria) this;
        }

        public Criteria andDrop_privNotLike(String value) {
            addCriterion("Drop_priv not like", value, "drop_priv");
            return (Criteria) this;
        }

        public Criteria andDrop_privIn(List<String> values) {
            addCriterion("Drop_priv in", values, "drop_priv");
            return (Criteria) this;
        }

        public Criteria andDrop_privNotIn(List<String> values) {
            addCriterion("Drop_priv not in", values, "drop_priv");
            return (Criteria) this;
        }

        public Criteria andDrop_privBetween(String value1, String value2) {
            addCriterion("Drop_priv between", value1, value2, "drop_priv");
            return (Criteria) this;
        }

        public Criteria andDrop_privNotBetween(String value1, String value2) {
            addCriterion("Drop_priv not between", value1, value2, "drop_priv");
            return (Criteria) this;
        }

        public Criteria andReload_privIsNull() {
            addCriterion("Reload_priv is null");
            return (Criteria) this;
        }

        public Criteria andReload_privIsNotNull() {
            addCriterion("Reload_priv is not null");
            return (Criteria) this;
        }

        public Criteria andReload_privEqualTo(String value) {
            addCriterion("Reload_priv =", value, "reload_priv");
            return (Criteria) this;
        }

        public Criteria andReload_privNotEqualTo(String value) {
            addCriterion("Reload_priv <>", value, "reload_priv");
            return (Criteria) this;
        }

        public Criteria andReload_privGreaterThan(String value) {
            addCriterion("Reload_priv >", value, "reload_priv");
            return (Criteria) this;
        }

        public Criteria andReload_privGreaterThanOrEqualTo(String value) {
            addCriterion("Reload_priv >=", value, "reload_priv");
            return (Criteria) this;
        }

        public Criteria andReload_privLessThan(String value) {
            addCriterion("Reload_priv <", value, "reload_priv");
            return (Criteria) this;
        }

        public Criteria andReload_privLessThanOrEqualTo(String value) {
            addCriterion("Reload_priv <=", value, "reload_priv");
            return (Criteria) this;
        }

        public Criteria andReload_privLike(String value) {
            addCriterion("Reload_priv like", value, "reload_priv");
            return (Criteria) this;
        }

        public Criteria andReload_privNotLike(String value) {
            addCriterion("Reload_priv not like", value, "reload_priv");
            return (Criteria) this;
        }

        public Criteria andReload_privIn(List<String> values) {
            addCriterion("Reload_priv in", values, "reload_priv");
            return (Criteria) this;
        }

        public Criteria andReload_privNotIn(List<String> values) {
            addCriterion("Reload_priv not in", values, "reload_priv");
            return (Criteria) this;
        }

        public Criteria andReload_privBetween(String value1, String value2) {
            addCriterion("Reload_priv between", value1, value2, "reload_priv");
            return (Criteria) this;
        }

        public Criteria andReload_privNotBetween(String value1, String value2) {
            addCriterion("Reload_priv not between", value1, value2, "reload_priv");
            return (Criteria) this;
        }

        public Criteria andShutdown_privIsNull() {
            addCriterion("Shutdown_priv is null");
            return (Criteria) this;
        }

        public Criteria andShutdown_privIsNotNull() {
            addCriterion("Shutdown_priv is not null");
            return (Criteria) this;
        }

        public Criteria andShutdown_privEqualTo(String value) {
            addCriterion("Shutdown_priv =", value, "shutdown_priv");
            return (Criteria) this;
        }

        public Criteria andShutdown_privNotEqualTo(String value) {
            addCriterion("Shutdown_priv <>", value, "shutdown_priv");
            return (Criteria) this;
        }

        public Criteria andShutdown_privGreaterThan(String value) {
            addCriterion("Shutdown_priv >", value, "shutdown_priv");
            return (Criteria) this;
        }

        public Criteria andShutdown_privGreaterThanOrEqualTo(String value) {
            addCriterion("Shutdown_priv >=", value, "shutdown_priv");
            return (Criteria) this;
        }

        public Criteria andShutdown_privLessThan(String value) {
            addCriterion("Shutdown_priv <", value, "shutdown_priv");
            return (Criteria) this;
        }

        public Criteria andShutdown_privLessThanOrEqualTo(String value) {
            addCriterion("Shutdown_priv <=", value, "shutdown_priv");
            return (Criteria) this;
        }

        public Criteria andShutdown_privLike(String value) {
            addCriterion("Shutdown_priv like", value, "shutdown_priv");
            return (Criteria) this;
        }

        public Criteria andShutdown_privNotLike(String value) {
            addCriterion("Shutdown_priv not like", value, "shutdown_priv");
            return (Criteria) this;
        }

        public Criteria andShutdown_privIn(List<String> values) {
            addCriterion("Shutdown_priv in", values, "shutdown_priv");
            return (Criteria) this;
        }

        public Criteria andShutdown_privNotIn(List<String> values) {
            addCriterion("Shutdown_priv not in", values, "shutdown_priv");
            return (Criteria) this;
        }

        public Criteria andShutdown_privBetween(String value1, String value2) {
            addCriterion("Shutdown_priv between", value1, value2, "shutdown_priv");
            return (Criteria) this;
        }

        public Criteria andShutdown_privNotBetween(String value1, String value2) {
            addCriterion("Shutdown_priv not between", value1, value2, "shutdown_priv");
            return (Criteria) this;
        }

        public Criteria andProcess_privIsNull() {
            addCriterion("Process_priv is null");
            return (Criteria) this;
        }

        public Criteria andProcess_privIsNotNull() {
            addCriterion("Process_priv is not null");
            return (Criteria) this;
        }

        public Criteria andProcess_privEqualTo(String value) {
            addCriterion("Process_priv =", value, "process_priv");
            return (Criteria) this;
        }

        public Criteria andProcess_privNotEqualTo(String value) {
            addCriterion("Process_priv <>", value, "process_priv");
            return (Criteria) this;
        }

        public Criteria andProcess_privGreaterThan(String value) {
            addCriterion("Process_priv >", value, "process_priv");
            return (Criteria) this;
        }

        public Criteria andProcess_privGreaterThanOrEqualTo(String value) {
            addCriterion("Process_priv >=", value, "process_priv");
            return (Criteria) this;
        }

        public Criteria andProcess_privLessThan(String value) {
            addCriterion("Process_priv <", value, "process_priv");
            return (Criteria) this;
        }

        public Criteria andProcess_privLessThanOrEqualTo(String value) {
            addCriterion("Process_priv <=", value, "process_priv");
            return (Criteria) this;
        }

        public Criteria andProcess_privLike(String value) {
            addCriterion("Process_priv like", value, "process_priv");
            return (Criteria) this;
        }

        public Criteria andProcess_privNotLike(String value) {
            addCriterion("Process_priv not like", value, "process_priv");
            return (Criteria) this;
        }

        public Criteria andProcess_privIn(List<String> values) {
            addCriterion("Process_priv in", values, "process_priv");
            return (Criteria) this;
        }

        public Criteria andProcess_privNotIn(List<String> values) {
            addCriterion("Process_priv not in", values, "process_priv");
            return (Criteria) this;
        }

        public Criteria andProcess_privBetween(String value1, String value2) {
            addCriterion("Process_priv between", value1, value2, "process_priv");
            return (Criteria) this;
        }

        public Criteria andProcess_privNotBetween(String value1, String value2) {
            addCriterion("Process_priv not between", value1, value2, "process_priv");
            return (Criteria) this;
        }

        public Criteria andFile_privIsNull() {
            addCriterion("File_priv is null");
            return (Criteria) this;
        }

        public Criteria andFile_privIsNotNull() {
            addCriterion("File_priv is not null");
            return (Criteria) this;
        }

        public Criteria andFile_privEqualTo(String value) {
            addCriterion("File_priv =", value, "file_priv");
            return (Criteria) this;
        }

        public Criteria andFile_privNotEqualTo(String value) {
            addCriterion("File_priv <>", value, "file_priv");
            return (Criteria) this;
        }

        public Criteria andFile_privGreaterThan(String value) {
            addCriterion("File_priv >", value, "file_priv");
            return (Criteria) this;
        }

        public Criteria andFile_privGreaterThanOrEqualTo(String value) {
            addCriterion("File_priv >=", value, "file_priv");
            return (Criteria) this;
        }

        public Criteria andFile_privLessThan(String value) {
            addCriterion("File_priv <", value, "file_priv");
            return (Criteria) this;
        }

        public Criteria andFile_privLessThanOrEqualTo(String value) {
            addCriterion("File_priv <=", value, "file_priv");
            return (Criteria) this;
        }

        public Criteria andFile_privLike(String value) {
            addCriterion("File_priv like", value, "file_priv");
            return (Criteria) this;
        }

        public Criteria andFile_privNotLike(String value) {
            addCriterion("File_priv not like", value, "file_priv");
            return (Criteria) this;
        }

        public Criteria andFile_privIn(List<String> values) {
            addCriterion("File_priv in", values, "file_priv");
            return (Criteria) this;
        }

        public Criteria andFile_privNotIn(List<String> values) {
            addCriterion("File_priv not in", values, "file_priv");
            return (Criteria) this;
        }

        public Criteria andFile_privBetween(String value1, String value2) {
            addCriterion("File_priv between", value1, value2, "file_priv");
            return (Criteria) this;
        }

        public Criteria andFile_privNotBetween(String value1, String value2) {
            addCriterion("File_priv not between", value1, value2, "file_priv");
            return (Criteria) this;
        }

        public Criteria andGrant_privIsNull() {
            addCriterion("Grant_priv is null");
            return (Criteria) this;
        }

        public Criteria andGrant_privIsNotNull() {
            addCriterion("Grant_priv is not null");
            return (Criteria) this;
        }

        public Criteria andGrant_privEqualTo(String value) {
            addCriterion("Grant_priv =", value, "grant_priv");
            return (Criteria) this;
        }

        public Criteria andGrant_privNotEqualTo(String value) {
            addCriterion("Grant_priv <>", value, "grant_priv");
            return (Criteria) this;
        }

        public Criteria andGrant_privGreaterThan(String value) {
            addCriterion("Grant_priv >", value, "grant_priv");
            return (Criteria) this;
        }

        public Criteria andGrant_privGreaterThanOrEqualTo(String value) {
            addCriterion("Grant_priv >=", value, "grant_priv");
            return (Criteria) this;
        }

        public Criteria andGrant_privLessThan(String value) {
            addCriterion("Grant_priv <", value, "grant_priv");
            return (Criteria) this;
        }

        public Criteria andGrant_privLessThanOrEqualTo(String value) {
            addCriterion("Grant_priv <=", value, "grant_priv");
            return (Criteria) this;
        }

        public Criteria andGrant_privLike(String value) {
            addCriterion("Grant_priv like", value, "grant_priv");
            return (Criteria) this;
        }

        public Criteria andGrant_privNotLike(String value) {
            addCriterion("Grant_priv not like", value, "grant_priv");
            return (Criteria) this;
        }

        public Criteria andGrant_privIn(List<String> values) {
            addCriterion("Grant_priv in", values, "grant_priv");
            return (Criteria) this;
        }

        public Criteria andGrant_privNotIn(List<String> values) {
            addCriterion("Grant_priv not in", values, "grant_priv");
            return (Criteria) this;
        }

        public Criteria andGrant_privBetween(String value1, String value2) {
            addCriterion("Grant_priv between", value1, value2, "grant_priv");
            return (Criteria) this;
        }

        public Criteria andGrant_privNotBetween(String value1, String value2) {
            addCriterion("Grant_priv not between", value1, value2, "grant_priv");
            return (Criteria) this;
        }

        public Criteria andReferences_privIsNull() {
            addCriterion("References_priv is null");
            return (Criteria) this;
        }

        public Criteria andReferences_privIsNotNull() {
            addCriterion("References_priv is not null");
            return (Criteria) this;
        }

        public Criteria andReferences_privEqualTo(String value) {
            addCriterion("References_priv =", value, "references_priv");
            return (Criteria) this;
        }

        public Criteria andReferences_privNotEqualTo(String value) {
            addCriterion("References_priv <>", value, "references_priv");
            return (Criteria) this;
        }

        public Criteria andReferences_privGreaterThan(String value) {
            addCriterion("References_priv >", value, "references_priv");
            return (Criteria) this;
        }

        public Criteria andReferences_privGreaterThanOrEqualTo(String value) {
            addCriterion("References_priv >=", value, "references_priv");
            return (Criteria) this;
        }

        public Criteria andReferences_privLessThan(String value) {
            addCriterion("References_priv <", value, "references_priv");
            return (Criteria) this;
        }

        public Criteria andReferences_privLessThanOrEqualTo(String value) {
            addCriterion("References_priv <=", value, "references_priv");
            return (Criteria) this;
        }

        public Criteria andReferences_privLike(String value) {
            addCriterion("References_priv like", value, "references_priv");
            return (Criteria) this;
        }

        public Criteria andReferences_privNotLike(String value) {
            addCriterion("References_priv not like", value, "references_priv");
            return (Criteria) this;
        }

        public Criteria andReferences_privIn(List<String> values) {
            addCriterion("References_priv in", values, "references_priv");
            return (Criteria) this;
        }

        public Criteria andReferences_privNotIn(List<String> values) {
            addCriterion("References_priv not in", values, "references_priv");
            return (Criteria) this;
        }

        public Criteria andReferences_privBetween(String value1, String value2) {
            addCriterion("References_priv between", value1, value2, "references_priv");
            return (Criteria) this;
        }

        public Criteria andReferences_privNotBetween(String value1, String value2) {
            addCriterion("References_priv not between", value1, value2, "references_priv");
            return (Criteria) this;
        }

        public Criteria andIndex_privIsNull() {
            addCriterion("Index_priv is null");
            return (Criteria) this;
        }

        public Criteria andIndex_privIsNotNull() {
            addCriterion("Index_priv is not null");
            return (Criteria) this;
        }

        public Criteria andIndex_privEqualTo(String value) {
            addCriterion("Index_priv =", value, "index_priv");
            return (Criteria) this;
        }

        public Criteria andIndex_privNotEqualTo(String value) {
            addCriterion("Index_priv <>", value, "index_priv");
            return (Criteria) this;
        }

        public Criteria andIndex_privGreaterThan(String value) {
            addCriterion("Index_priv >", value, "index_priv");
            return (Criteria) this;
        }

        public Criteria andIndex_privGreaterThanOrEqualTo(String value) {
            addCriterion("Index_priv >=", value, "index_priv");
            return (Criteria) this;
        }

        public Criteria andIndex_privLessThan(String value) {
            addCriterion("Index_priv <", value, "index_priv");
            return (Criteria) this;
        }

        public Criteria andIndex_privLessThanOrEqualTo(String value) {
            addCriterion("Index_priv <=", value, "index_priv");
            return (Criteria) this;
        }

        public Criteria andIndex_privLike(String value) {
            addCriterion("Index_priv like", value, "index_priv");
            return (Criteria) this;
        }

        public Criteria andIndex_privNotLike(String value) {
            addCriterion("Index_priv not like", value, "index_priv");
            return (Criteria) this;
        }

        public Criteria andIndex_privIn(List<String> values) {
            addCriterion("Index_priv in", values, "index_priv");
            return (Criteria) this;
        }

        public Criteria andIndex_privNotIn(List<String> values) {
            addCriterion("Index_priv not in", values, "index_priv");
            return (Criteria) this;
        }

        public Criteria andIndex_privBetween(String value1, String value2) {
            addCriterion("Index_priv between", value1, value2, "index_priv");
            return (Criteria) this;
        }

        public Criteria andIndex_privNotBetween(String value1, String value2) {
            addCriterion("Index_priv not between", value1, value2, "index_priv");
            return (Criteria) this;
        }

        public Criteria andAlter_privIsNull() {
            addCriterion("Alter_priv is null");
            return (Criteria) this;
        }

        public Criteria andAlter_privIsNotNull() {
            addCriterion("Alter_priv is not null");
            return (Criteria) this;
        }

        public Criteria andAlter_privEqualTo(String value) {
            addCriterion("Alter_priv =", value, "alter_priv");
            return (Criteria) this;
        }

        public Criteria andAlter_privNotEqualTo(String value) {
            addCriterion("Alter_priv <>", value, "alter_priv");
            return (Criteria) this;
        }

        public Criteria andAlter_privGreaterThan(String value) {
            addCriterion("Alter_priv >", value, "alter_priv");
            return (Criteria) this;
        }

        public Criteria andAlter_privGreaterThanOrEqualTo(String value) {
            addCriterion("Alter_priv >=", value, "alter_priv");
            return (Criteria) this;
        }

        public Criteria andAlter_privLessThan(String value) {
            addCriterion("Alter_priv <", value, "alter_priv");
            return (Criteria) this;
        }

        public Criteria andAlter_privLessThanOrEqualTo(String value) {
            addCriterion("Alter_priv <=", value, "alter_priv");
            return (Criteria) this;
        }

        public Criteria andAlter_privLike(String value) {
            addCriterion("Alter_priv like", value, "alter_priv");
            return (Criteria) this;
        }

        public Criteria andAlter_privNotLike(String value) {
            addCriterion("Alter_priv not like", value, "alter_priv");
            return (Criteria) this;
        }

        public Criteria andAlter_privIn(List<String> values) {
            addCriterion("Alter_priv in", values, "alter_priv");
            return (Criteria) this;
        }

        public Criteria andAlter_privNotIn(List<String> values) {
            addCriterion("Alter_priv not in", values, "alter_priv");
            return (Criteria) this;
        }

        public Criteria andAlter_privBetween(String value1, String value2) {
            addCriterion("Alter_priv between", value1, value2, "alter_priv");
            return (Criteria) this;
        }

        public Criteria andAlter_privNotBetween(String value1, String value2) {
            addCriterion("Alter_priv not between", value1, value2, "alter_priv");
            return (Criteria) this;
        }

        public Criteria andShow_db_privIsNull() {
            addCriterion("Show_db_priv is null");
            return (Criteria) this;
        }

        public Criteria andShow_db_privIsNotNull() {
            addCriterion("Show_db_priv is not null");
            return (Criteria) this;
        }

        public Criteria andShow_db_privEqualTo(String value) {
            addCriterion("Show_db_priv =", value, "show_db_priv");
            return (Criteria) this;
        }

        public Criteria andShow_db_privNotEqualTo(String value) {
            addCriterion("Show_db_priv <>", value, "show_db_priv");
            return (Criteria) this;
        }

        public Criteria andShow_db_privGreaterThan(String value) {
            addCriterion("Show_db_priv >", value, "show_db_priv");
            return (Criteria) this;
        }

        public Criteria andShow_db_privGreaterThanOrEqualTo(String value) {
            addCriterion("Show_db_priv >=", value, "show_db_priv");
            return (Criteria) this;
        }

        public Criteria andShow_db_privLessThan(String value) {
            addCriterion("Show_db_priv <", value, "show_db_priv");
            return (Criteria) this;
        }

        public Criteria andShow_db_privLessThanOrEqualTo(String value) {
            addCriterion("Show_db_priv <=", value, "show_db_priv");
            return (Criteria) this;
        }

        public Criteria andShow_db_privLike(String value) {
            addCriterion("Show_db_priv like", value, "show_db_priv");
            return (Criteria) this;
        }

        public Criteria andShow_db_privNotLike(String value) {
            addCriterion("Show_db_priv not like", value, "show_db_priv");
            return (Criteria) this;
        }

        public Criteria andShow_db_privIn(List<String> values) {
            addCriterion("Show_db_priv in", values, "show_db_priv");
            return (Criteria) this;
        }

        public Criteria andShow_db_privNotIn(List<String> values) {
            addCriterion("Show_db_priv not in", values, "show_db_priv");
            return (Criteria) this;
        }

        public Criteria andShow_db_privBetween(String value1, String value2) {
            addCriterion("Show_db_priv between", value1, value2, "show_db_priv");
            return (Criteria) this;
        }

        public Criteria andShow_db_privNotBetween(String value1, String value2) {
            addCriterion("Show_db_priv not between", value1, value2, "show_db_priv");
            return (Criteria) this;
        }

        public Criteria andSuper_privIsNull() {
            addCriterion("Super_priv is null");
            return (Criteria) this;
        }

        public Criteria andSuper_privIsNotNull() {
            addCriterion("Super_priv is not null");
            return (Criteria) this;
        }

        public Criteria andSuper_privEqualTo(String value) {
            addCriterion("Super_priv =", value, "super_priv");
            return (Criteria) this;
        }

        public Criteria andSuper_privNotEqualTo(String value) {
            addCriterion("Super_priv <>", value, "super_priv");
            return (Criteria) this;
        }

        public Criteria andSuper_privGreaterThan(String value) {
            addCriterion("Super_priv >", value, "super_priv");
            return (Criteria) this;
        }

        public Criteria andSuper_privGreaterThanOrEqualTo(String value) {
            addCriterion("Super_priv >=", value, "super_priv");
            return (Criteria) this;
        }

        public Criteria andSuper_privLessThan(String value) {
            addCriterion("Super_priv <", value, "super_priv");
            return (Criteria) this;
        }

        public Criteria andSuper_privLessThanOrEqualTo(String value) {
            addCriterion("Super_priv <=", value, "super_priv");
            return (Criteria) this;
        }

        public Criteria andSuper_privLike(String value) {
            addCriterion("Super_priv like", value, "super_priv");
            return (Criteria) this;
        }

        public Criteria andSuper_privNotLike(String value) {
            addCriterion("Super_priv not like", value, "super_priv");
            return (Criteria) this;
        }

        public Criteria andSuper_privIn(List<String> values) {
            addCriterion("Super_priv in", values, "super_priv");
            return (Criteria) this;
        }

        public Criteria andSuper_privNotIn(List<String> values) {
            addCriterion("Super_priv not in", values, "super_priv");
            return (Criteria) this;
        }

        public Criteria andSuper_privBetween(String value1, String value2) {
            addCriterion("Super_priv between", value1, value2, "super_priv");
            return (Criteria) this;
        }

        public Criteria andSuper_privNotBetween(String value1, String value2) {
            addCriterion("Super_priv not between", value1, value2, "super_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_tmp_table_privIsNull() {
            addCriterion("Create_tmp_table_priv is null");
            return (Criteria) this;
        }

        public Criteria andCreate_tmp_table_privIsNotNull() {
            addCriterion("Create_tmp_table_priv is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_tmp_table_privEqualTo(String value) {
            addCriterion("Create_tmp_table_priv =", value, "create_tmp_table_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_tmp_table_privNotEqualTo(String value) {
            addCriterion("Create_tmp_table_priv <>", value, "create_tmp_table_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_tmp_table_privGreaterThan(String value) {
            addCriterion("Create_tmp_table_priv >", value, "create_tmp_table_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_tmp_table_privGreaterThanOrEqualTo(String value) {
            addCriterion("Create_tmp_table_priv >=", value, "create_tmp_table_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_tmp_table_privLessThan(String value) {
            addCriterion("Create_tmp_table_priv <", value, "create_tmp_table_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_tmp_table_privLessThanOrEqualTo(String value) {
            addCriterion("Create_tmp_table_priv <=", value, "create_tmp_table_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_tmp_table_privLike(String value) {
            addCriterion("Create_tmp_table_priv like", value, "create_tmp_table_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_tmp_table_privNotLike(String value) {
            addCriterion("Create_tmp_table_priv not like", value, "create_tmp_table_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_tmp_table_privIn(List<String> values) {
            addCriterion("Create_tmp_table_priv in", values, "create_tmp_table_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_tmp_table_privNotIn(List<String> values) {
            addCriterion("Create_tmp_table_priv not in", values, "create_tmp_table_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_tmp_table_privBetween(String value1, String value2) {
            addCriterion("Create_tmp_table_priv between", value1, value2, "create_tmp_table_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_tmp_table_privNotBetween(String value1, String value2) {
            addCriterion("Create_tmp_table_priv not between", value1, value2, "create_tmp_table_priv");
            return (Criteria) this;
        }

        public Criteria andLock_tables_privIsNull() {
            addCriterion("Lock_tables_priv is null");
            return (Criteria) this;
        }

        public Criteria andLock_tables_privIsNotNull() {
            addCriterion("Lock_tables_priv is not null");
            return (Criteria) this;
        }

        public Criteria andLock_tables_privEqualTo(String value) {
            addCriterion("Lock_tables_priv =", value, "lock_tables_priv");
            return (Criteria) this;
        }

        public Criteria andLock_tables_privNotEqualTo(String value) {
            addCriterion("Lock_tables_priv <>", value, "lock_tables_priv");
            return (Criteria) this;
        }

        public Criteria andLock_tables_privGreaterThan(String value) {
            addCriterion("Lock_tables_priv >", value, "lock_tables_priv");
            return (Criteria) this;
        }

        public Criteria andLock_tables_privGreaterThanOrEqualTo(String value) {
            addCriterion("Lock_tables_priv >=", value, "lock_tables_priv");
            return (Criteria) this;
        }

        public Criteria andLock_tables_privLessThan(String value) {
            addCriterion("Lock_tables_priv <", value, "lock_tables_priv");
            return (Criteria) this;
        }

        public Criteria andLock_tables_privLessThanOrEqualTo(String value) {
            addCriterion("Lock_tables_priv <=", value, "lock_tables_priv");
            return (Criteria) this;
        }

        public Criteria andLock_tables_privLike(String value) {
            addCriterion("Lock_tables_priv like", value, "lock_tables_priv");
            return (Criteria) this;
        }

        public Criteria andLock_tables_privNotLike(String value) {
            addCriterion("Lock_tables_priv not like", value, "lock_tables_priv");
            return (Criteria) this;
        }

        public Criteria andLock_tables_privIn(List<String> values) {
            addCriterion("Lock_tables_priv in", values, "lock_tables_priv");
            return (Criteria) this;
        }

        public Criteria andLock_tables_privNotIn(List<String> values) {
            addCriterion("Lock_tables_priv not in", values, "lock_tables_priv");
            return (Criteria) this;
        }

        public Criteria andLock_tables_privBetween(String value1, String value2) {
            addCriterion("Lock_tables_priv between", value1, value2, "lock_tables_priv");
            return (Criteria) this;
        }

        public Criteria andLock_tables_privNotBetween(String value1, String value2) {
            addCriterion("Lock_tables_priv not between", value1, value2, "lock_tables_priv");
            return (Criteria) this;
        }

        public Criteria andExecute_privIsNull() {
            addCriterion("Execute_priv is null");
            return (Criteria) this;
        }

        public Criteria andExecute_privIsNotNull() {
            addCriterion("Execute_priv is not null");
            return (Criteria) this;
        }

        public Criteria andExecute_privEqualTo(String value) {
            addCriterion("Execute_priv =", value, "execute_priv");
            return (Criteria) this;
        }

        public Criteria andExecute_privNotEqualTo(String value) {
            addCriterion("Execute_priv <>", value, "execute_priv");
            return (Criteria) this;
        }

        public Criteria andExecute_privGreaterThan(String value) {
            addCriterion("Execute_priv >", value, "execute_priv");
            return (Criteria) this;
        }

        public Criteria andExecute_privGreaterThanOrEqualTo(String value) {
            addCriterion("Execute_priv >=", value, "execute_priv");
            return (Criteria) this;
        }

        public Criteria andExecute_privLessThan(String value) {
            addCriterion("Execute_priv <", value, "execute_priv");
            return (Criteria) this;
        }

        public Criteria andExecute_privLessThanOrEqualTo(String value) {
            addCriterion("Execute_priv <=", value, "execute_priv");
            return (Criteria) this;
        }

        public Criteria andExecute_privLike(String value) {
            addCriterion("Execute_priv like", value, "execute_priv");
            return (Criteria) this;
        }

        public Criteria andExecute_privNotLike(String value) {
            addCriterion("Execute_priv not like", value, "execute_priv");
            return (Criteria) this;
        }

        public Criteria andExecute_privIn(List<String> values) {
            addCriterion("Execute_priv in", values, "execute_priv");
            return (Criteria) this;
        }

        public Criteria andExecute_privNotIn(List<String> values) {
            addCriterion("Execute_priv not in", values, "execute_priv");
            return (Criteria) this;
        }

        public Criteria andExecute_privBetween(String value1, String value2) {
            addCriterion("Execute_priv between", value1, value2, "execute_priv");
            return (Criteria) this;
        }

        public Criteria andExecute_privNotBetween(String value1, String value2) {
            addCriterion("Execute_priv not between", value1, value2, "execute_priv");
            return (Criteria) this;
        }

        public Criteria andRepl_slave_privIsNull() {
            addCriterion("Repl_slave_priv is null");
            return (Criteria) this;
        }

        public Criteria andRepl_slave_privIsNotNull() {
            addCriterion("Repl_slave_priv is not null");
            return (Criteria) this;
        }

        public Criteria andRepl_slave_privEqualTo(String value) {
            addCriterion("Repl_slave_priv =", value, "repl_slave_priv");
            return (Criteria) this;
        }

        public Criteria andRepl_slave_privNotEqualTo(String value) {
            addCriterion("Repl_slave_priv <>", value, "repl_slave_priv");
            return (Criteria) this;
        }

        public Criteria andRepl_slave_privGreaterThan(String value) {
            addCriterion("Repl_slave_priv >", value, "repl_slave_priv");
            return (Criteria) this;
        }

        public Criteria andRepl_slave_privGreaterThanOrEqualTo(String value) {
            addCriterion("Repl_slave_priv >=", value, "repl_slave_priv");
            return (Criteria) this;
        }

        public Criteria andRepl_slave_privLessThan(String value) {
            addCriterion("Repl_slave_priv <", value, "repl_slave_priv");
            return (Criteria) this;
        }

        public Criteria andRepl_slave_privLessThanOrEqualTo(String value) {
            addCriterion("Repl_slave_priv <=", value, "repl_slave_priv");
            return (Criteria) this;
        }

        public Criteria andRepl_slave_privLike(String value) {
            addCriterion("Repl_slave_priv like", value, "repl_slave_priv");
            return (Criteria) this;
        }

        public Criteria andRepl_slave_privNotLike(String value) {
            addCriterion("Repl_slave_priv not like", value, "repl_slave_priv");
            return (Criteria) this;
        }

        public Criteria andRepl_slave_privIn(List<String> values) {
            addCriterion("Repl_slave_priv in", values, "repl_slave_priv");
            return (Criteria) this;
        }

        public Criteria andRepl_slave_privNotIn(List<String> values) {
            addCriterion("Repl_slave_priv not in", values, "repl_slave_priv");
            return (Criteria) this;
        }

        public Criteria andRepl_slave_privBetween(String value1, String value2) {
            addCriterion("Repl_slave_priv between", value1, value2, "repl_slave_priv");
            return (Criteria) this;
        }

        public Criteria andRepl_slave_privNotBetween(String value1, String value2) {
            addCriterion("Repl_slave_priv not between", value1, value2, "repl_slave_priv");
            return (Criteria) this;
        }

        public Criteria andRepl_client_privIsNull() {
            addCriterion("Repl_client_priv is null");
            return (Criteria) this;
        }

        public Criteria andRepl_client_privIsNotNull() {
            addCriterion("Repl_client_priv is not null");
            return (Criteria) this;
        }

        public Criteria andRepl_client_privEqualTo(String value) {
            addCriterion("Repl_client_priv =", value, "repl_client_priv");
            return (Criteria) this;
        }

        public Criteria andRepl_client_privNotEqualTo(String value) {
            addCriterion("Repl_client_priv <>", value, "repl_client_priv");
            return (Criteria) this;
        }

        public Criteria andRepl_client_privGreaterThan(String value) {
            addCriterion("Repl_client_priv >", value, "repl_client_priv");
            return (Criteria) this;
        }

        public Criteria andRepl_client_privGreaterThanOrEqualTo(String value) {
            addCriterion("Repl_client_priv >=", value, "repl_client_priv");
            return (Criteria) this;
        }

        public Criteria andRepl_client_privLessThan(String value) {
            addCriterion("Repl_client_priv <", value, "repl_client_priv");
            return (Criteria) this;
        }

        public Criteria andRepl_client_privLessThanOrEqualTo(String value) {
            addCriterion("Repl_client_priv <=", value, "repl_client_priv");
            return (Criteria) this;
        }

        public Criteria andRepl_client_privLike(String value) {
            addCriterion("Repl_client_priv like", value, "repl_client_priv");
            return (Criteria) this;
        }

        public Criteria andRepl_client_privNotLike(String value) {
            addCriterion("Repl_client_priv not like", value, "repl_client_priv");
            return (Criteria) this;
        }

        public Criteria andRepl_client_privIn(List<String> values) {
            addCriterion("Repl_client_priv in", values, "repl_client_priv");
            return (Criteria) this;
        }

        public Criteria andRepl_client_privNotIn(List<String> values) {
            addCriterion("Repl_client_priv not in", values, "repl_client_priv");
            return (Criteria) this;
        }

        public Criteria andRepl_client_privBetween(String value1, String value2) {
            addCriterion("Repl_client_priv between", value1, value2, "repl_client_priv");
            return (Criteria) this;
        }

        public Criteria andRepl_client_privNotBetween(String value1, String value2) {
            addCriterion("Repl_client_priv not between", value1, value2, "repl_client_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_view_privIsNull() {
            addCriterion("Create_view_priv is null");
            return (Criteria) this;
        }

        public Criteria andCreate_view_privIsNotNull() {
            addCriterion("Create_view_priv is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_view_privEqualTo(String value) {
            addCriterion("Create_view_priv =", value, "create_view_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_view_privNotEqualTo(String value) {
            addCriterion("Create_view_priv <>", value, "create_view_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_view_privGreaterThan(String value) {
            addCriterion("Create_view_priv >", value, "create_view_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_view_privGreaterThanOrEqualTo(String value) {
            addCriterion("Create_view_priv >=", value, "create_view_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_view_privLessThan(String value) {
            addCriterion("Create_view_priv <", value, "create_view_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_view_privLessThanOrEqualTo(String value) {
            addCriterion("Create_view_priv <=", value, "create_view_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_view_privLike(String value) {
            addCriterion("Create_view_priv like", value, "create_view_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_view_privNotLike(String value) {
            addCriterion("Create_view_priv not like", value, "create_view_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_view_privIn(List<String> values) {
            addCriterion("Create_view_priv in", values, "create_view_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_view_privNotIn(List<String> values) {
            addCriterion("Create_view_priv not in", values, "create_view_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_view_privBetween(String value1, String value2) {
            addCriterion("Create_view_priv between", value1, value2, "create_view_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_view_privNotBetween(String value1, String value2) {
            addCriterion("Create_view_priv not between", value1, value2, "create_view_priv");
            return (Criteria) this;
        }

        public Criteria andShow_view_privIsNull() {
            addCriterion("Show_view_priv is null");
            return (Criteria) this;
        }

        public Criteria andShow_view_privIsNotNull() {
            addCriterion("Show_view_priv is not null");
            return (Criteria) this;
        }

        public Criteria andShow_view_privEqualTo(String value) {
            addCriterion("Show_view_priv =", value, "show_view_priv");
            return (Criteria) this;
        }

        public Criteria andShow_view_privNotEqualTo(String value) {
            addCriterion("Show_view_priv <>", value, "show_view_priv");
            return (Criteria) this;
        }

        public Criteria andShow_view_privGreaterThan(String value) {
            addCriterion("Show_view_priv >", value, "show_view_priv");
            return (Criteria) this;
        }

        public Criteria andShow_view_privGreaterThanOrEqualTo(String value) {
            addCriterion("Show_view_priv >=", value, "show_view_priv");
            return (Criteria) this;
        }

        public Criteria andShow_view_privLessThan(String value) {
            addCriterion("Show_view_priv <", value, "show_view_priv");
            return (Criteria) this;
        }

        public Criteria andShow_view_privLessThanOrEqualTo(String value) {
            addCriterion("Show_view_priv <=", value, "show_view_priv");
            return (Criteria) this;
        }

        public Criteria andShow_view_privLike(String value) {
            addCriterion("Show_view_priv like", value, "show_view_priv");
            return (Criteria) this;
        }

        public Criteria andShow_view_privNotLike(String value) {
            addCriterion("Show_view_priv not like", value, "show_view_priv");
            return (Criteria) this;
        }

        public Criteria andShow_view_privIn(List<String> values) {
            addCriterion("Show_view_priv in", values, "show_view_priv");
            return (Criteria) this;
        }

        public Criteria andShow_view_privNotIn(List<String> values) {
            addCriterion("Show_view_priv not in", values, "show_view_priv");
            return (Criteria) this;
        }

        public Criteria andShow_view_privBetween(String value1, String value2) {
            addCriterion("Show_view_priv between", value1, value2, "show_view_priv");
            return (Criteria) this;
        }

        public Criteria andShow_view_privNotBetween(String value1, String value2) {
            addCriterion("Show_view_priv not between", value1, value2, "show_view_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_routine_privIsNull() {
            addCriterion("Create_routine_priv is null");
            return (Criteria) this;
        }

        public Criteria andCreate_routine_privIsNotNull() {
            addCriterion("Create_routine_priv is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_routine_privEqualTo(String value) {
            addCriterion("Create_routine_priv =", value, "create_routine_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_routine_privNotEqualTo(String value) {
            addCriterion("Create_routine_priv <>", value, "create_routine_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_routine_privGreaterThan(String value) {
            addCriterion("Create_routine_priv >", value, "create_routine_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_routine_privGreaterThanOrEqualTo(String value) {
            addCriterion("Create_routine_priv >=", value, "create_routine_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_routine_privLessThan(String value) {
            addCriterion("Create_routine_priv <", value, "create_routine_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_routine_privLessThanOrEqualTo(String value) {
            addCriterion("Create_routine_priv <=", value, "create_routine_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_routine_privLike(String value) {
            addCriterion("Create_routine_priv like", value, "create_routine_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_routine_privNotLike(String value) {
            addCriterion("Create_routine_priv not like", value, "create_routine_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_routine_privIn(List<String> values) {
            addCriterion("Create_routine_priv in", values, "create_routine_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_routine_privNotIn(List<String> values) {
            addCriterion("Create_routine_priv not in", values, "create_routine_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_routine_privBetween(String value1, String value2) {
            addCriterion("Create_routine_priv between", value1, value2, "create_routine_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_routine_privNotBetween(String value1, String value2) {
            addCriterion("Create_routine_priv not between", value1, value2, "create_routine_priv");
            return (Criteria) this;
        }

        public Criteria andAlter_routine_privIsNull() {
            addCriterion("Alter_routine_priv is null");
            return (Criteria) this;
        }

        public Criteria andAlter_routine_privIsNotNull() {
            addCriterion("Alter_routine_priv is not null");
            return (Criteria) this;
        }

        public Criteria andAlter_routine_privEqualTo(String value) {
            addCriterion("Alter_routine_priv =", value, "alter_routine_priv");
            return (Criteria) this;
        }

        public Criteria andAlter_routine_privNotEqualTo(String value) {
            addCriterion("Alter_routine_priv <>", value, "alter_routine_priv");
            return (Criteria) this;
        }

        public Criteria andAlter_routine_privGreaterThan(String value) {
            addCriterion("Alter_routine_priv >", value, "alter_routine_priv");
            return (Criteria) this;
        }

        public Criteria andAlter_routine_privGreaterThanOrEqualTo(String value) {
            addCriterion("Alter_routine_priv >=", value, "alter_routine_priv");
            return (Criteria) this;
        }

        public Criteria andAlter_routine_privLessThan(String value) {
            addCriterion("Alter_routine_priv <", value, "alter_routine_priv");
            return (Criteria) this;
        }

        public Criteria andAlter_routine_privLessThanOrEqualTo(String value) {
            addCriterion("Alter_routine_priv <=", value, "alter_routine_priv");
            return (Criteria) this;
        }

        public Criteria andAlter_routine_privLike(String value) {
            addCriterion("Alter_routine_priv like", value, "alter_routine_priv");
            return (Criteria) this;
        }

        public Criteria andAlter_routine_privNotLike(String value) {
            addCriterion("Alter_routine_priv not like", value, "alter_routine_priv");
            return (Criteria) this;
        }

        public Criteria andAlter_routine_privIn(List<String> values) {
            addCriterion("Alter_routine_priv in", values, "alter_routine_priv");
            return (Criteria) this;
        }

        public Criteria andAlter_routine_privNotIn(List<String> values) {
            addCriterion("Alter_routine_priv not in", values, "alter_routine_priv");
            return (Criteria) this;
        }

        public Criteria andAlter_routine_privBetween(String value1, String value2) {
            addCriterion("Alter_routine_priv between", value1, value2, "alter_routine_priv");
            return (Criteria) this;
        }

        public Criteria andAlter_routine_privNotBetween(String value1, String value2) {
            addCriterion("Alter_routine_priv not between", value1, value2, "alter_routine_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_user_privIsNull() {
            addCriterion("Create_user_priv is null");
            return (Criteria) this;
        }

        public Criteria andCreate_user_privIsNotNull() {
            addCriterion("Create_user_priv is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_user_privEqualTo(String value) {
            addCriterion("Create_user_priv =", value, "create_user_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_user_privNotEqualTo(String value) {
            addCriterion("Create_user_priv <>", value, "create_user_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_user_privGreaterThan(String value) {
            addCriterion("Create_user_priv >", value, "create_user_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_user_privGreaterThanOrEqualTo(String value) {
            addCriterion("Create_user_priv >=", value, "create_user_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_user_privLessThan(String value) {
            addCriterion("Create_user_priv <", value, "create_user_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_user_privLessThanOrEqualTo(String value) {
            addCriterion("Create_user_priv <=", value, "create_user_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_user_privLike(String value) {
            addCriterion("Create_user_priv like", value, "create_user_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_user_privNotLike(String value) {
            addCriterion("Create_user_priv not like", value, "create_user_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_user_privIn(List<String> values) {
            addCriterion("Create_user_priv in", values, "create_user_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_user_privNotIn(List<String> values) {
            addCriterion("Create_user_priv not in", values, "create_user_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_user_privBetween(String value1, String value2) {
            addCriterion("Create_user_priv between", value1, value2, "create_user_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_user_privNotBetween(String value1, String value2) {
            addCriterion("Create_user_priv not between", value1, value2, "create_user_priv");
            return (Criteria) this;
        }

        public Criteria andEvent_privIsNull() {
            addCriterion("Event_priv is null");
            return (Criteria) this;
        }

        public Criteria andEvent_privIsNotNull() {
            addCriterion("Event_priv is not null");
            return (Criteria) this;
        }

        public Criteria andEvent_privEqualTo(String value) {
            addCriterion("Event_priv =", value, "event_priv");
            return (Criteria) this;
        }

        public Criteria andEvent_privNotEqualTo(String value) {
            addCriterion("Event_priv <>", value, "event_priv");
            return (Criteria) this;
        }

        public Criteria andEvent_privGreaterThan(String value) {
            addCriterion("Event_priv >", value, "event_priv");
            return (Criteria) this;
        }

        public Criteria andEvent_privGreaterThanOrEqualTo(String value) {
            addCriterion("Event_priv >=", value, "event_priv");
            return (Criteria) this;
        }

        public Criteria andEvent_privLessThan(String value) {
            addCriterion("Event_priv <", value, "event_priv");
            return (Criteria) this;
        }

        public Criteria andEvent_privLessThanOrEqualTo(String value) {
            addCriterion("Event_priv <=", value, "event_priv");
            return (Criteria) this;
        }

        public Criteria andEvent_privLike(String value) {
            addCriterion("Event_priv like", value, "event_priv");
            return (Criteria) this;
        }

        public Criteria andEvent_privNotLike(String value) {
            addCriterion("Event_priv not like", value, "event_priv");
            return (Criteria) this;
        }

        public Criteria andEvent_privIn(List<String> values) {
            addCriterion("Event_priv in", values, "event_priv");
            return (Criteria) this;
        }

        public Criteria andEvent_privNotIn(List<String> values) {
            addCriterion("Event_priv not in", values, "event_priv");
            return (Criteria) this;
        }

        public Criteria andEvent_privBetween(String value1, String value2) {
            addCriterion("Event_priv between", value1, value2, "event_priv");
            return (Criteria) this;
        }

        public Criteria andEvent_privNotBetween(String value1, String value2) {
            addCriterion("Event_priv not between", value1, value2, "event_priv");
            return (Criteria) this;
        }

        public Criteria andTrigger_privIsNull() {
            addCriterion("Trigger_priv is null");
            return (Criteria) this;
        }

        public Criteria andTrigger_privIsNotNull() {
            addCriterion("Trigger_priv is not null");
            return (Criteria) this;
        }

        public Criteria andTrigger_privEqualTo(String value) {
            addCriterion("Trigger_priv =", value, "trigger_priv");
            return (Criteria) this;
        }

        public Criteria andTrigger_privNotEqualTo(String value) {
            addCriterion("Trigger_priv <>", value, "trigger_priv");
            return (Criteria) this;
        }

        public Criteria andTrigger_privGreaterThan(String value) {
            addCriterion("Trigger_priv >", value, "trigger_priv");
            return (Criteria) this;
        }

        public Criteria andTrigger_privGreaterThanOrEqualTo(String value) {
            addCriterion("Trigger_priv >=", value, "trigger_priv");
            return (Criteria) this;
        }

        public Criteria andTrigger_privLessThan(String value) {
            addCriterion("Trigger_priv <", value, "trigger_priv");
            return (Criteria) this;
        }

        public Criteria andTrigger_privLessThanOrEqualTo(String value) {
            addCriterion("Trigger_priv <=", value, "trigger_priv");
            return (Criteria) this;
        }

        public Criteria andTrigger_privLike(String value) {
            addCriterion("Trigger_priv like", value, "trigger_priv");
            return (Criteria) this;
        }

        public Criteria andTrigger_privNotLike(String value) {
            addCriterion("Trigger_priv not like", value, "trigger_priv");
            return (Criteria) this;
        }

        public Criteria andTrigger_privIn(List<String> values) {
            addCriterion("Trigger_priv in", values, "trigger_priv");
            return (Criteria) this;
        }

        public Criteria andTrigger_privNotIn(List<String> values) {
            addCriterion("Trigger_priv not in", values, "trigger_priv");
            return (Criteria) this;
        }

        public Criteria andTrigger_privBetween(String value1, String value2) {
            addCriterion("Trigger_priv between", value1, value2, "trigger_priv");
            return (Criteria) this;
        }

        public Criteria andTrigger_privNotBetween(String value1, String value2) {
            addCriterion("Trigger_priv not between", value1, value2, "trigger_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_tablespace_privIsNull() {
            addCriterion("Create_tablespace_priv is null");
            return (Criteria) this;
        }

        public Criteria andCreate_tablespace_privIsNotNull() {
            addCriterion("Create_tablespace_priv is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_tablespace_privEqualTo(String value) {
            addCriterion("Create_tablespace_priv =", value, "create_tablespace_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_tablespace_privNotEqualTo(String value) {
            addCriterion("Create_tablespace_priv <>", value, "create_tablespace_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_tablespace_privGreaterThan(String value) {
            addCriterion("Create_tablespace_priv >", value, "create_tablespace_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_tablespace_privGreaterThanOrEqualTo(String value) {
            addCriterion("Create_tablespace_priv >=", value, "create_tablespace_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_tablespace_privLessThan(String value) {
            addCriterion("Create_tablespace_priv <", value, "create_tablespace_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_tablespace_privLessThanOrEqualTo(String value) {
            addCriterion("Create_tablespace_priv <=", value, "create_tablespace_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_tablespace_privLike(String value) {
            addCriterion("Create_tablespace_priv like", value, "create_tablespace_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_tablespace_privNotLike(String value) {
            addCriterion("Create_tablespace_priv not like", value, "create_tablespace_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_tablespace_privIn(List<String> values) {
            addCriterion("Create_tablespace_priv in", values, "create_tablespace_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_tablespace_privNotIn(List<String> values) {
            addCriterion("Create_tablespace_priv not in", values, "create_tablespace_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_tablespace_privBetween(String value1, String value2) {
            addCriterion("Create_tablespace_priv between", value1, value2, "create_tablespace_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_tablespace_privNotBetween(String value1, String value2) {
            addCriterion("Create_tablespace_priv not between", value1, value2, "create_tablespace_priv");
            return (Criteria) this;
        }

        public Criteria andSsl_typeIsNull() {
            addCriterion("ssl_type is null");
            return (Criteria) this;
        }

        public Criteria andSsl_typeIsNotNull() {
            addCriterion("ssl_type is not null");
            return (Criteria) this;
        }

        public Criteria andSsl_typeEqualTo(String value) {
            addCriterion("ssl_type =", value, "ssl_type");
            return (Criteria) this;
        }

        public Criteria andSsl_typeNotEqualTo(String value) {
            addCriterion("ssl_type <>", value, "ssl_type");
            return (Criteria) this;
        }

        public Criteria andSsl_typeGreaterThan(String value) {
            addCriterion("ssl_type >", value, "ssl_type");
            return (Criteria) this;
        }

        public Criteria andSsl_typeGreaterThanOrEqualTo(String value) {
            addCriterion("ssl_type >=", value, "ssl_type");
            return (Criteria) this;
        }

        public Criteria andSsl_typeLessThan(String value) {
            addCriterion("ssl_type <", value, "ssl_type");
            return (Criteria) this;
        }

        public Criteria andSsl_typeLessThanOrEqualTo(String value) {
            addCriterion("ssl_type <=", value, "ssl_type");
            return (Criteria) this;
        }

        public Criteria andSsl_typeLike(String value) {
            addCriterion("ssl_type like", value, "ssl_type");
            return (Criteria) this;
        }

        public Criteria andSsl_typeNotLike(String value) {
            addCriterion("ssl_type not like", value, "ssl_type");
            return (Criteria) this;
        }

        public Criteria andSsl_typeIn(List<String> values) {
            addCriterion("ssl_type in", values, "ssl_type");
            return (Criteria) this;
        }

        public Criteria andSsl_typeNotIn(List<String> values) {
            addCriterion("ssl_type not in", values, "ssl_type");
            return (Criteria) this;
        }

        public Criteria andSsl_typeBetween(String value1, String value2) {
            addCriterion("ssl_type between", value1, value2, "ssl_type");
            return (Criteria) this;
        }

        public Criteria andSsl_typeNotBetween(String value1, String value2) {
            addCriterion("ssl_type not between", value1, value2, "ssl_type");
            return (Criteria) this;
        }

        public Criteria andMax_questionsIsNull() {
            addCriterion("max_questions is null");
            return (Criteria) this;
        }

        public Criteria andMax_questionsIsNotNull() {
            addCriterion("max_questions is not null");
            return (Criteria) this;
        }

        public Criteria andMax_questionsEqualTo(Integer value) {
            addCriterion("max_questions =", value, "max_questions");
            return (Criteria) this;
        }

        public Criteria andMax_questionsNotEqualTo(Integer value) {
            addCriterion("max_questions <>", value, "max_questions");
            return (Criteria) this;
        }

        public Criteria andMax_questionsGreaterThan(Integer value) {
            addCriterion("max_questions >", value, "max_questions");
            return (Criteria) this;
        }

        public Criteria andMax_questionsGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_questions >=", value, "max_questions");
            return (Criteria) this;
        }

        public Criteria andMax_questionsLessThan(Integer value) {
            addCriterion("max_questions <", value, "max_questions");
            return (Criteria) this;
        }

        public Criteria andMax_questionsLessThanOrEqualTo(Integer value) {
            addCriterion("max_questions <=", value, "max_questions");
            return (Criteria) this;
        }

        public Criteria andMax_questionsIn(List<Integer> values) {
            addCriterion("max_questions in", values, "max_questions");
            return (Criteria) this;
        }

        public Criteria andMax_questionsNotIn(List<Integer> values) {
            addCriterion("max_questions not in", values, "max_questions");
            return (Criteria) this;
        }

        public Criteria andMax_questionsBetween(Integer value1, Integer value2) {
            addCriterion("max_questions between", value1, value2, "max_questions");
            return (Criteria) this;
        }

        public Criteria andMax_questionsNotBetween(Integer value1, Integer value2) {
            addCriterion("max_questions not between", value1, value2, "max_questions");
            return (Criteria) this;
        }

        public Criteria andMax_updatesIsNull() {
            addCriterion("max_updates is null");
            return (Criteria) this;
        }

        public Criteria andMax_updatesIsNotNull() {
            addCriterion("max_updates is not null");
            return (Criteria) this;
        }

        public Criteria andMax_updatesEqualTo(Integer value) {
            addCriterion("max_updates =", value, "max_updates");
            return (Criteria) this;
        }

        public Criteria andMax_updatesNotEqualTo(Integer value) {
            addCriterion("max_updates <>", value, "max_updates");
            return (Criteria) this;
        }

        public Criteria andMax_updatesGreaterThan(Integer value) {
            addCriterion("max_updates >", value, "max_updates");
            return (Criteria) this;
        }

        public Criteria andMax_updatesGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_updates >=", value, "max_updates");
            return (Criteria) this;
        }

        public Criteria andMax_updatesLessThan(Integer value) {
            addCriterion("max_updates <", value, "max_updates");
            return (Criteria) this;
        }

        public Criteria andMax_updatesLessThanOrEqualTo(Integer value) {
            addCriterion("max_updates <=", value, "max_updates");
            return (Criteria) this;
        }

        public Criteria andMax_updatesIn(List<Integer> values) {
            addCriterion("max_updates in", values, "max_updates");
            return (Criteria) this;
        }

        public Criteria andMax_updatesNotIn(List<Integer> values) {
            addCriterion("max_updates not in", values, "max_updates");
            return (Criteria) this;
        }

        public Criteria andMax_updatesBetween(Integer value1, Integer value2) {
            addCriterion("max_updates between", value1, value2, "max_updates");
            return (Criteria) this;
        }

        public Criteria andMax_updatesNotBetween(Integer value1, Integer value2) {
            addCriterion("max_updates not between", value1, value2, "max_updates");
            return (Criteria) this;
        }

        public Criteria andMax_connectionsIsNull() {
            addCriterion("max_connections is null");
            return (Criteria) this;
        }

        public Criteria andMax_connectionsIsNotNull() {
            addCriterion("max_connections is not null");
            return (Criteria) this;
        }

        public Criteria andMax_connectionsEqualTo(Integer value) {
            addCriterion("max_connections =", value, "max_connections");
            return (Criteria) this;
        }

        public Criteria andMax_connectionsNotEqualTo(Integer value) {
            addCriterion("max_connections <>", value, "max_connections");
            return (Criteria) this;
        }

        public Criteria andMax_connectionsGreaterThan(Integer value) {
            addCriterion("max_connections >", value, "max_connections");
            return (Criteria) this;
        }

        public Criteria andMax_connectionsGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_connections >=", value, "max_connections");
            return (Criteria) this;
        }

        public Criteria andMax_connectionsLessThan(Integer value) {
            addCriterion("max_connections <", value, "max_connections");
            return (Criteria) this;
        }

        public Criteria andMax_connectionsLessThanOrEqualTo(Integer value) {
            addCriterion("max_connections <=", value, "max_connections");
            return (Criteria) this;
        }

        public Criteria andMax_connectionsIn(List<Integer> values) {
            addCriterion("max_connections in", values, "max_connections");
            return (Criteria) this;
        }

        public Criteria andMax_connectionsNotIn(List<Integer> values) {
            addCriterion("max_connections not in", values, "max_connections");
            return (Criteria) this;
        }

        public Criteria andMax_connectionsBetween(Integer value1, Integer value2) {
            addCriterion("max_connections between", value1, value2, "max_connections");
            return (Criteria) this;
        }

        public Criteria andMax_connectionsNotBetween(Integer value1, Integer value2) {
            addCriterion("max_connections not between", value1, value2, "max_connections");
            return (Criteria) this;
        }

        public Criteria andMax_user_connectionsIsNull() {
            addCriterion("max_user_connections is null");
            return (Criteria) this;
        }

        public Criteria andMax_user_connectionsIsNotNull() {
            addCriterion("max_user_connections is not null");
            return (Criteria) this;
        }

        public Criteria andMax_user_connectionsEqualTo(Integer value) {
            addCriterion("max_user_connections =", value, "max_user_connections");
            return (Criteria) this;
        }

        public Criteria andMax_user_connectionsNotEqualTo(Integer value) {
            addCriterion("max_user_connections <>", value, "max_user_connections");
            return (Criteria) this;
        }

        public Criteria andMax_user_connectionsGreaterThan(Integer value) {
            addCriterion("max_user_connections >", value, "max_user_connections");
            return (Criteria) this;
        }

        public Criteria andMax_user_connectionsGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_user_connections >=", value, "max_user_connections");
            return (Criteria) this;
        }

        public Criteria andMax_user_connectionsLessThan(Integer value) {
            addCriterion("max_user_connections <", value, "max_user_connections");
            return (Criteria) this;
        }

        public Criteria andMax_user_connectionsLessThanOrEqualTo(Integer value) {
            addCriterion("max_user_connections <=", value, "max_user_connections");
            return (Criteria) this;
        }

        public Criteria andMax_user_connectionsIn(List<Integer> values) {
            addCriterion("max_user_connections in", values, "max_user_connections");
            return (Criteria) this;
        }

        public Criteria andMax_user_connectionsNotIn(List<Integer> values) {
            addCriterion("max_user_connections not in", values, "max_user_connections");
            return (Criteria) this;
        }

        public Criteria andMax_user_connectionsBetween(Integer value1, Integer value2) {
            addCriterion("max_user_connections between", value1, value2, "max_user_connections");
            return (Criteria) this;
        }

        public Criteria andMax_user_connectionsNotBetween(Integer value1, Integer value2) {
            addCriterion("max_user_connections not between", value1, value2, "max_user_connections");
            return (Criteria) this;
        }

        public Criteria andPluginIsNull() {
            addCriterion("plugin is null");
            return (Criteria) this;
        }

        public Criteria andPluginIsNotNull() {
            addCriterion("plugin is not null");
            return (Criteria) this;
        }

        public Criteria andPluginEqualTo(String value) {
            addCriterion("plugin =", value, "plugin");
            return (Criteria) this;
        }

        public Criteria andPluginNotEqualTo(String value) {
            addCriterion("plugin <>", value, "plugin");
            return (Criteria) this;
        }

        public Criteria andPluginGreaterThan(String value) {
            addCriterion("plugin >", value, "plugin");
            return (Criteria) this;
        }

        public Criteria andPluginGreaterThanOrEqualTo(String value) {
            addCriterion("plugin >=", value, "plugin");
            return (Criteria) this;
        }

        public Criteria andPluginLessThan(String value) {
            addCriterion("plugin <", value, "plugin");
            return (Criteria) this;
        }

        public Criteria andPluginLessThanOrEqualTo(String value) {
            addCriterion("plugin <=", value, "plugin");
            return (Criteria) this;
        }

        public Criteria andPluginLike(String value) {
            addCriterion("plugin like", value, "plugin");
            return (Criteria) this;
        }

        public Criteria andPluginNotLike(String value) {
            addCriterion("plugin not like", value, "plugin");
            return (Criteria) this;
        }

        public Criteria andPluginIn(List<String> values) {
            addCriterion("plugin in", values, "plugin");
            return (Criteria) this;
        }

        public Criteria andPluginNotIn(List<String> values) {
            addCriterion("plugin not in", values, "plugin");
            return (Criteria) this;
        }

        public Criteria andPluginBetween(String value1, String value2) {
            addCriterion("plugin between", value1, value2, "plugin");
            return (Criteria) this;
        }

        public Criteria andPluginNotBetween(String value1, String value2) {
            addCriterion("plugin not between", value1, value2, "plugin");
            return (Criteria) this;
        }

        public Criteria andPassword_expiredIsNull() {
            addCriterion("password_expired is null");
            return (Criteria) this;
        }

        public Criteria andPassword_expiredIsNotNull() {
            addCriterion("password_expired is not null");
            return (Criteria) this;
        }

        public Criteria andPassword_expiredEqualTo(String value) {
            addCriterion("password_expired =", value, "password_expired");
            return (Criteria) this;
        }

        public Criteria andPassword_expiredNotEqualTo(String value) {
            addCriterion("password_expired <>", value, "password_expired");
            return (Criteria) this;
        }

        public Criteria andPassword_expiredGreaterThan(String value) {
            addCriterion("password_expired >", value, "password_expired");
            return (Criteria) this;
        }

        public Criteria andPassword_expiredGreaterThanOrEqualTo(String value) {
            addCriterion("password_expired >=", value, "password_expired");
            return (Criteria) this;
        }

        public Criteria andPassword_expiredLessThan(String value) {
            addCriterion("password_expired <", value, "password_expired");
            return (Criteria) this;
        }

        public Criteria andPassword_expiredLessThanOrEqualTo(String value) {
            addCriterion("password_expired <=", value, "password_expired");
            return (Criteria) this;
        }

        public Criteria andPassword_expiredLike(String value) {
            addCriterion("password_expired like", value, "password_expired");
            return (Criteria) this;
        }

        public Criteria andPassword_expiredNotLike(String value) {
            addCriterion("password_expired not like", value, "password_expired");
            return (Criteria) this;
        }

        public Criteria andPassword_expiredIn(List<String> values) {
            addCriterion("password_expired in", values, "password_expired");
            return (Criteria) this;
        }

        public Criteria andPassword_expiredNotIn(List<String> values) {
            addCriterion("password_expired not in", values, "password_expired");
            return (Criteria) this;
        }

        public Criteria andPassword_expiredBetween(String value1, String value2) {
            addCriterion("password_expired between", value1, value2, "password_expired");
            return (Criteria) this;
        }

        public Criteria andPassword_expiredNotBetween(String value1, String value2) {
            addCriterion("password_expired not between", value1, value2, "password_expired");
            return (Criteria) this;
        }

        public Criteria andPassword_last_changedIsNull() {
            addCriterion("password_last_changed is null");
            return (Criteria) this;
        }

        public Criteria andPassword_last_changedIsNotNull() {
            addCriterion("password_last_changed is not null");
            return (Criteria) this;
        }

        public Criteria andPassword_last_changedEqualTo(Date value) {
            addCriterion("password_last_changed =", value, "password_last_changed");
            return (Criteria) this;
        }

        public Criteria andPassword_last_changedNotEqualTo(Date value) {
            addCriterion("password_last_changed <>", value, "password_last_changed");
            return (Criteria) this;
        }

        public Criteria andPassword_last_changedGreaterThan(Date value) {
            addCriterion("password_last_changed >", value, "password_last_changed");
            return (Criteria) this;
        }

        public Criteria andPassword_last_changedGreaterThanOrEqualTo(Date value) {
            addCriterion("password_last_changed >=", value, "password_last_changed");
            return (Criteria) this;
        }

        public Criteria andPassword_last_changedLessThan(Date value) {
            addCriterion("password_last_changed <", value, "password_last_changed");
            return (Criteria) this;
        }

        public Criteria andPassword_last_changedLessThanOrEqualTo(Date value) {
            addCriterion("password_last_changed <=", value, "password_last_changed");
            return (Criteria) this;
        }

        public Criteria andPassword_last_changedIn(List<Date> values) {
            addCriterion("password_last_changed in", values, "password_last_changed");
            return (Criteria) this;
        }

        public Criteria andPassword_last_changedNotIn(List<Date> values) {
            addCriterion("password_last_changed not in", values, "password_last_changed");
            return (Criteria) this;
        }

        public Criteria andPassword_last_changedBetween(Date value1, Date value2) {
            addCriterion("password_last_changed between", value1, value2, "password_last_changed");
            return (Criteria) this;
        }

        public Criteria andPassword_last_changedNotBetween(Date value1, Date value2) {
            addCriterion("password_last_changed not between", value1, value2, "password_last_changed");
            return (Criteria) this;
        }

        public Criteria andPassword_lifetimeIsNull() {
            addCriterion("password_lifetime is null");
            return (Criteria) this;
        }

        public Criteria andPassword_lifetimeIsNotNull() {
            addCriterion("password_lifetime is not null");
            return (Criteria) this;
        }

        public Criteria andPassword_lifetimeEqualTo(Short value) {
            addCriterion("password_lifetime =", value, "password_lifetime");
            return (Criteria) this;
        }

        public Criteria andPassword_lifetimeNotEqualTo(Short value) {
            addCriterion("password_lifetime <>", value, "password_lifetime");
            return (Criteria) this;
        }

        public Criteria andPassword_lifetimeGreaterThan(Short value) {
            addCriterion("password_lifetime >", value, "password_lifetime");
            return (Criteria) this;
        }

        public Criteria andPassword_lifetimeGreaterThanOrEqualTo(Short value) {
            addCriterion("password_lifetime >=", value, "password_lifetime");
            return (Criteria) this;
        }

        public Criteria andPassword_lifetimeLessThan(Short value) {
            addCriterion("password_lifetime <", value, "password_lifetime");
            return (Criteria) this;
        }

        public Criteria andPassword_lifetimeLessThanOrEqualTo(Short value) {
            addCriterion("password_lifetime <=", value, "password_lifetime");
            return (Criteria) this;
        }

        public Criteria andPassword_lifetimeIn(List<Short> values) {
            addCriterion("password_lifetime in", values, "password_lifetime");
            return (Criteria) this;
        }

        public Criteria andPassword_lifetimeNotIn(List<Short> values) {
            addCriterion("password_lifetime not in", values, "password_lifetime");
            return (Criteria) this;
        }

        public Criteria andPassword_lifetimeBetween(Short value1, Short value2) {
            addCriterion("password_lifetime between", value1, value2, "password_lifetime");
            return (Criteria) this;
        }

        public Criteria andPassword_lifetimeNotBetween(Short value1, Short value2) {
            addCriterion("password_lifetime not between", value1, value2, "password_lifetime");
            return (Criteria) this;
        }

        public Criteria andAccount_lockedIsNull() {
            addCriterion("account_locked is null");
            return (Criteria) this;
        }

        public Criteria andAccount_lockedIsNotNull() {
            addCriterion("account_locked is not null");
            return (Criteria) this;
        }

        public Criteria andAccount_lockedEqualTo(String value) {
            addCriterion("account_locked =", value, "account_locked");
            return (Criteria) this;
        }

        public Criteria andAccount_lockedNotEqualTo(String value) {
            addCriterion("account_locked <>", value, "account_locked");
            return (Criteria) this;
        }

        public Criteria andAccount_lockedGreaterThan(String value) {
            addCriterion("account_locked >", value, "account_locked");
            return (Criteria) this;
        }

        public Criteria andAccount_lockedGreaterThanOrEqualTo(String value) {
            addCriterion("account_locked >=", value, "account_locked");
            return (Criteria) this;
        }

        public Criteria andAccount_lockedLessThan(String value) {
            addCriterion("account_locked <", value, "account_locked");
            return (Criteria) this;
        }

        public Criteria andAccount_lockedLessThanOrEqualTo(String value) {
            addCriterion("account_locked <=", value, "account_locked");
            return (Criteria) this;
        }

        public Criteria andAccount_lockedLike(String value) {
            addCriterion("account_locked like", value, "account_locked");
            return (Criteria) this;
        }

        public Criteria andAccount_lockedNotLike(String value) {
            addCriterion("account_locked not like", value, "account_locked");
            return (Criteria) this;
        }

        public Criteria andAccount_lockedIn(List<String> values) {
            addCriterion("account_locked in", values, "account_locked");
            return (Criteria) this;
        }

        public Criteria andAccount_lockedNotIn(List<String> values) {
            addCriterion("account_locked not in", values, "account_locked");
            return (Criteria) this;
        }

        public Criteria andAccount_lockedBetween(String value1, String value2) {
            addCriterion("account_locked between", value1, value2, "account_locked");
            return (Criteria) this;
        }

        public Criteria andAccount_lockedNotBetween(String value1, String value2) {
            addCriterion("account_locked not between", value1, value2, "account_locked");
            return (Criteria) this;
        }

        public Criteria andCreate_role_privIsNull() {
            addCriterion("Create_role_priv is null");
            return (Criteria) this;
        }

        public Criteria andCreate_role_privIsNotNull() {
            addCriterion("Create_role_priv is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_role_privEqualTo(String value) {
            addCriterion("Create_role_priv =", value, "create_role_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_role_privNotEqualTo(String value) {
            addCriterion("Create_role_priv <>", value, "create_role_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_role_privGreaterThan(String value) {
            addCriterion("Create_role_priv >", value, "create_role_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_role_privGreaterThanOrEqualTo(String value) {
            addCriterion("Create_role_priv >=", value, "create_role_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_role_privLessThan(String value) {
            addCriterion("Create_role_priv <", value, "create_role_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_role_privLessThanOrEqualTo(String value) {
            addCriterion("Create_role_priv <=", value, "create_role_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_role_privLike(String value) {
            addCriterion("Create_role_priv like", value, "create_role_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_role_privNotLike(String value) {
            addCriterion("Create_role_priv not like", value, "create_role_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_role_privIn(List<String> values) {
            addCriterion("Create_role_priv in", values, "create_role_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_role_privNotIn(List<String> values) {
            addCriterion("Create_role_priv not in", values, "create_role_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_role_privBetween(String value1, String value2) {
            addCriterion("Create_role_priv between", value1, value2, "create_role_priv");
            return (Criteria) this;
        }

        public Criteria andCreate_role_privNotBetween(String value1, String value2) {
            addCriterion("Create_role_priv not between", value1, value2, "create_role_priv");
            return (Criteria) this;
        }

        public Criteria andDrop_role_privIsNull() {
            addCriterion("Drop_role_priv is null");
            return (Criteria) this;
        }

        public Criteria andDrop_role_privIsNotNull() {
            addCriterion("Drop_role_priv is not null");
            return (Criteria) this;
        }

        public Criteria andDrop_role_privEqualTo(String value) {
            addCriterion("Drop_role_priv =", value, "drop_role_priv");
            return (Criteria) this;
        }

        public Criteria andDrop_role_privNotEqualTo(String value) {
            addCriterion("Drop_role_priv <>", value, "drop_role_priv");
            return (Criteria) this;
        }

        public Criteria andDrop_role_privGreaterThan(String value) {
            addCriterion("Drop_role_priv >", value, "drop_role_priv");
            return (Criteria) this;
        }

        public Criteria andDrop_role_privGreaterThanOrEqualTo(String value) {
            addCriterion("Drop_role_priv >=", value, "drop_role_priv");
            return (Criteria) this;
        }

        public Criteria andDrop_role_privLessThan(String value) {
            addCriterion("Drop_role_priv <", value, "drop_role_priv");
            return (Criteria) this;
        }

        public Criteria andDrop_role_privLessThanOrEqualTo(String value) {
            addCriterion("Drop_role_priv <=", value, "drop_role_priv");
            return (Criteria) this;
        }

        public Criteria andDrop_role_privLike(String value) {
            addCriterion("Drop_role_priv like", value, "drop_role_priv");
            return (Criteria) this;
        }

        public Criteria andDrop_role_privNotLike(String value) {
            addCriterion("Drop_role_priv not like", value, "drop_role_priv");
            return (Criteria) this;
        }

        public Criteria andDrop_role_privIn(List<String> values) {
            addCriterion("Drop_role_priv in", values, "drop_role_priv");
            return (Criteria) this;
        }

        public Criteria andDrop_role_privNotIn(List<String> values) {
            addCriterion("Drop_role_priv not in", values, "drop_role_priv");
            return (Criteria) this;
        }

        public Criteria andDrop_role_privBetween(String value1, String value2) {
            addCriterion("Drop_role_priv between", value1, value2, "drop_role_priv");
            return (Criteria) this;
        }

        public Criteria andDrop_role_privNotBetween(String value1, String value2) {
            addCriterion("Drop_role_priv not between", value1, value2, "drop_role_priv");
            return (Criteria) this;
        }

        public Criteria andPassword_reuse_historyIsNull() {
            addCriterion("Password_reuse_history is null");
            return (Criteria) this;
        }

        public Criteria andPassword_reuse_historyIsNotNull() {
            addCriterion("Password_reuse_history is not null");
            return (Criteria) this;
        }

        public Criteria andPassword_reuse_historyEqualTo(Short value) {
            addCriterion("Password_reuse_history =", value, "password_reuse_history");
            return (Criteria) this;
        }

        public Criteria andPassword_reuse_historyNotEqualTo(Short value) {
            addCriterion("Password_reuse_history <>", value, "password_reuse_history");
            return (Criteria) this;
        }

        public Criteria andPassword_reuse_historyGreaterThan(Short value) {
            addCriterion("Password_reuse_history >", value, "password_reuse_history");
            return (Criteria) this;
        }

        public Criteria andPassword_reuse_historyGreaterThanOrEqualTo(Short value) {
            addCriterion("Password_reuse_history >=", value, "password_reuse_history");
            return (Criteria) this;
        }

        public Criteria andPassword_reuse_historyLessThan(Short value) {
            addCriterion("Password_reuse_history <", value, "password_reuse_history");
            return (Criteria) this;
        }

        public Criteria andPassword_reuse_historyLessThanOrEqualTo(Short value) {
            addCriterion("Password_reuse_history <=", value, "password_reuse_history");
            return (Criteria) this;
        }

        public Criteria andPassword_reuse_historyIn(List<Short> values) {
            addCriterion("Password_reuse_history in", values, "password_reuse_history");
            return (Criteria) this;
        }

        public Criteria andPassword_reuse_historyNotIn(List<Short> values) {
            addCriterion("Password_reuse_history not in", values, "password_reuse_history");
            return (Criteria) this;
        }

        public Criteria andPassword_reuse_historyBetween(Short value1, Short value2) {
            addCriterion("Password_reuse_history between", value1, value2, "password_reuse_history");
            return (Criteria) this;
        }

        public Criteria andPassword_reuse_historyNotBetween(Short value1, Short value2) {
            addCriterion("Password_reuse_history not between", value1, value2, "password_reuse_history");
            return (Criteria) this;
        }

        public Criteria andPassword_reuse_timeIsNull() {
            addCriterion("Password_reuse_time is null");
            return (Criteria) this;
        }

        public Criteria andPassword_reuse_timeIsNotNull() {
            addCriterion("Password_reuse_time is not null");
            return (Criteria) this;
        }

        public Criteria andPassword_reuse_timeEqualTo(Short value) {
            addCriterion("Password_reuse_time =", value, "password_reuse_time");
            return (Criteria) this;
        }

        public Criteria andPassword_reuse_timeNotEqualTo(Short value) {
            addCriterion("Password_reuse_time <>", value, "password_reuse_time");
            return (Criteria) this;
        }

        public Criteria andPassword_reuse_timeGreaterThan(Short value) {
            addCriterion("Password_reuse_time >", value, "password_reuse_time");
            return (Criteria) this;
        }

        public Criteria andPassword_reuse_timeGreaterThanOrEqualTo(Short value) {
            addCriterion("Password_reuse_time >=", value, "password_reuse_time");
            return (Criteria) this;
        }

        public Criteria andPassword_reuse_timeLessThan(Short value) {
            addCriterion("Password_reuse_time <", value, "password_reuse_time");
            return (Criteria) this;
        }

        public Criteria andPassword_reuse_timeLessThanOrEqualTo(Short value) {
            addCriterion("Password_reuse_time <=", value, "password_reuse_time");
            return (Criteria) this;
        }

        public Criteria andPassword_reuse_timeIn(List<Short> values) {
            addCriterion("Password_reuse_time in", values, "password_reuse_time");
            return (Criteria) this;
        }

        public Criteria andPassword_reuse_timeNotIn(List<Short> values) {
            addCriterion("Password_reuse_time not in", values, "password_reuse_time");
            return (Criteria) this;
        }

        public Criteria andPassword_reuse_timeBetween(Short value1, Short value2) {
            addCriterion("Password_reuse_time between", value1, value2, "password_reuse_time");
            return (Criteria) this;
        }

        public Criteria andPassword_reuse_timeNotBetween(Short value1, Short value2) {
            addCriterion("Password_reuse_time not between", value1, value2, "password_reuse_time");
            return (Criteria) this;
        }

        public Criteria andPassword_require_currentIsNull() {
            addCriterion("Password_require_current is null");
            return (Criteria) this;
        }

        public Criteria andPassword_require_currentIsNotNull() {
            addCriterion("Password_require_current is not null");
            return (Criteria) this;
        }

        public Criteria andPassword_require_currentEqualTo(String value) {
            addCriterion("Password_require_current =", value, "password_require_current");
            return (Criteria) this;
        }

        public Criteria andPassword_require_currentNotEqualTo(String value) {
            addCriterion("Password_require_current <>", value, "password_require_current");
            return (Criteria) this;
        }

        public Criteria andPassword_require_currentGreaterThan(String value) {
            addCriterion("Password_require_current >", value, "password_require_current");
            return (Criteria) this;
        }

        public Criteria andPassword_require_currentGreaterThanOrEqualTo(String value) {
            addCriterion("Password_require_current >=", value, "password_require_current");
            return (Criteria) this;
        }

        public Criteria andPassword_require_currentLessThan(String value) {
            addCriterion("Password_require_current <", value, "password_require_current");
            return (Criteria) this;
        }

        public Criteria andPassword_require_currentLessThanOrEqualTo(String value) {
            addCriterion("Password_require_current <=", value, "password_require_current");
            return (Criteria) this;
        }

        public Criteria andPassword_require_currentLike(String value) {
            addCriterion("Password_require_current like", value, "password_require_current");
            return (Criteria) this;
        }

        public Criteria andPassword_require_currentNotLike(String value) {
            addCriterion("Password_require_current not like", value, "password_require_current");
            return (Criteria) this;
        }

        public Criteria andPassword_require_currentIn(List<String> values) {
            addCriterion("Password_require_current in", values, "password_require_current");
            return (Criteria) this;
        }

        public Criteria andPassword_require_currentNotIn(List<String> values) {
            addCriterion("Password_require_current not in", values, "password_require_current");
            return (Criteria) this;
        }

        public Criteria andPassword_require_currentBetween(String value1, String value2) {
            addCriterion("Password_require_current between", value1, value2, "password_require_current");
            return (Criteria) this;
        }

        public Criteria andPassword_require_currentNotBetween(String value1, String value2) {
            addCriterion("Password_require_current not between", value1, value2, "password_require_current");
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