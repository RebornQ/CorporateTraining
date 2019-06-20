package pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * @author Reborn
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1560997169852L;


    /**
     * 主键
     * 用户ID
     * isNullAble:0
     */
    private Integer id;

    /**
     * 用户名
     * isNullAble:0
     */
    private String username;

    /**
     * 密码
     * isNullAble:0
     */
    private String password;

    /**
     * isNullAble:1
     */
    private String email;

    /**
     * isNullAble:1
     */
    private String phone;

    /**
     * 找回问题
     * isNullAble:1
     */
    private String question;

    /**
     * 找回答案
     * isNullAble:1
     */
    private String answer;

    /**
     * 0-管理员，1-普通用户
     * isNullAble:0
     */
    private Integer role;

    /**
     * 创建时间
     * isNullAble:0
     */
    private java.time.LocalDateTime createTime;

    /**
     * 最后一次更新时间
     * isNullAble:0
     */
    private java.time.LocalDateTime updateTime;


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return this.question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return this.answer;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Integer getRole() {
        return this.role;
    }

    public void setCreateTime(java.time.LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public java.time.LocalDateTime getCreateTime() {
        return this.createTime;
    }

    public void setUpdateTime(java.time.LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public java.time.LocalDateTime getUpdateTime() {
        return this.updateTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                "username='" + username + '\'' +
                "password='" + password + '\'' +
                "email='" + email + '\'' +
                "phone='" + phone + '\'' +
                "question='" + question + '\'' +
                "answer='" + answer + '\'' +
                "role='" + role + '\'' +
                "createTime='" + createTime + '\'' +
                "updateTime='" + updateTime + '\'' +
                '}';
    }

    public static Builder Build() {
        return new Builder();
    }

    public static ConditionBuilder ConditionBuild() {
        return new ConditionBuilder();
    }

    public static UpdateBuilder UpdateBuild() {
        return new UpdateBuilder();
    }

    public static QueryBuilder QueryBuild() {
        return new QueryBuilder();
    }

    public static class UpdateBuilder {

        private User set;

        private ConditionBuilder where;

        public UpdateBuilder set(User set) {
            this.set = set;
            return this;
        }

        public User getSet() {
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where) {
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere() {
            return this.where;
        }

        public UpdateBuilder build() {
            return this;
        }
    }

    public static class QueryBuilder extends User {
        /**
         * 需要返回的列
         */
        private Map<String, Object> fetchFields;

        public Map<String, Object> getFetchFields() {
            return this.fetchFields;
        }

        private List<Integer> idList;

        public List<Integer> getIdList() {
            return this.idList;
        }

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt() {
            return this.idSt;
        }

        public Integer getIdEd() {
            return this.idEd;
        }

        private List<String> usernameList;

        public List<String> getUsernameList() {
            return this.usernameList;
        }


        private List<String> fuzzyUsername;

        public List<String> getFuzzyUsername() {
            return this.fuzzyUsername;
        }

        private List<String> rightFuzzyUsername;

        public List<String> getRightFuzzyUsername() {
            return this.rightFuzzyUsername;
        }

        private List<String> passwordList;

        public List<String> getPasswordList() {
            return this.passwordList;
        }


        private List<String> fuzzyPassword;

        public List<String> getFuzzyPassword() {
            return this.fuzzyPassword;
        }

        private List<String> rightFuzzyPassword;

        public List<String> getRightFuzzyPassword() {
            return this.rightFuzzyPassword;
        }

        private List<String> emailList;

        public List<String> getEmailList() {
            return this.emailList;
        }


        private List<String> fuzzyEmail;

        public List<String> getFuzzyEmail() {
            return this.fuzzyEmail;
        }

        private List<String> rightFuzzyEmail;

        public List<String> getRightFuzzyEmail() {
            return this.rightFuzzyEmail;
        }

        private List<String> phoneList;

        public List<String> getPhoneList() {
            return this.phoneList;
        }


        private List<String> fuzzyPhone;

        public List<String> getFuzzyPhone() {
            return this.fuzzyPhone;
        }

        private List<String> rightFuzzyPhone;

        public List<String> getRightFuzzyPhone() {
            return this.rightFuzzyPhone;
        }

        private List<String> questionList;

        public List<String> getQuestionList() {
            return this.questionList;
        }


        private List<String> fuzzyQuestion;

        public List<String> getFuzzyQuestion() {
            return this.fuzzyQuestion;
        }

        private List<String> rightFuzzyQuestion;

        public List<String> getRightFuzzyQuestion() {
            return this.rightFuzzyQuestion;
        }

        private List<String> answerList;

        public List<String> getAnswerList() {
            return this.answerList;
        }


        private List<String> fuzzyAnswer;

        public List<String> getFuzzyAnswer() {
            return this.fuzzyAnswer;
        }

        private List<String> rightFuzzyAnswer;

        public List<String> getRightFuzzyAnswer() {
            return this.rightFuzzyAnswer;
        }

        private List<Integer> roleList;

        public List<Integer> getRoleList() {
            return this.roleList;
        }

        private Integer roleSt;

        private Integer roleEd;

        public Integer getRoleSt() {
            return this.roleSt;
        }

        public Integer getRoleEd() {
            return this.roleEd;
        }

        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList() {
            return this.createTimeList;
        }

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt() {
            return this.createTimeSt;
        }

        public java.time.LocalDateTime getCreateTimeEd() {
            return this.createTimeEd;
        }

        private List<java.time.LocalDateTime> updateTimeList;

        public List<java.time.LocalDateTime> getUpdateTimeList() {
            return this.updateTimeList;
        }

        private java.time.LocalDateTime updateTimeSt;

        private java.time.LocalDateTime updateTimeEd;

        public java.time.LocalDateTime getUpdateTimeSt() {
            return this.updateTimeSt;
        }

        public java.time.LocalDateTime getUpdateTimeEd() {
            return this.updateTimeEd;
        }

        private QueryBuilder() {
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder idBetWeen(Integer idSt, Integer idEd) {
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Integer idSt) {
            this.idSt = idSt;
            return this;
        }

        public QueryBuilder idLessEqThan(Integer idEd) {
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Integer id) {
            setId(id);
            return this;
        }

        public QueryBuilder idList(Integer... id) {
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<Integer> id) {
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId() {
            setFetchFields("fetchFields", "id");
            return this;
        }

        public QueryBuilder excludeId() {
            setFetchFields("excludeFields", "id");
            return this;
        }

        public QueryBuilder fuzzyUsername(List<String> fuzzyUsername) {
            this.fuzzyUsername = fuzzyUsername;
            return this;
        }

        public QueryBuilder fuzzyUsername(String... fuzzyUsername) {
            this.fuzzyUsername = solveNullList(fuzzyUsername);
            return this;
        }

        public QueryBuilder rightFuzzyUsername(List<String> rightFuzzyUsername) {
            this.rightFuzzyUsername = rightFuzzyUsername;
            return this;
        }

        public QueryBuilder rightFuzzyUsername(String... rightFuzzyUsername) {
            this.rightFuzzyUsername = solveNullList(rightFuzzyUsername);
            return this;
        }

        public QueryBuilder username(String username) {
            setUsername(username);
            return this;
        }

        public QueryBuilder usernameList(String... username) {
            this.usernameList = solveNullList(username);
            return this;
        }

        public QueryBuilder usernameList(List<String> username) {
            this.usernameList = username;
            return this;
        }

        public QueryBuilder fetchUsername() {
            setFetchFields("fetchFields", "username");
            return this;
        }

        public QueryBuilder excludeUsername() {
            setFetchFields("excludeFields", "username");
            return this;
        }

        public QueryBuilder fuzzyPassword(List<String> fuzzyPassword) {
            this.fuzzyPassword = fuzzyPassword;
            return this;
        }

        public QueryBuilder fuzzyPassword(String... fuzzyPassword) {
            this.fuzzyPassword = solveNullList(fuzzyPassword);
            return this;
        }

        public QueryBuilder rightFuzzyPassword(List<String> rightFuzzyPassword) {
            this.rightFuzzyPassword = rightFuzzyPassword;
            return this;
        }

        public QueryBuilder rightFuzzyPassword(String... rightFuzzyPassword) {
            this.rightFuzzyPassword = solveNullList(rightFuzzyPassword);
            return this;
        }

        public QueryBuilder password(String password) {
            setPassword(password);
            return this;
        }

        public QueryBuilder passwordList(String... password) {
            this.passwordList = solveNullList(password);
            return this;
        }

        public QueryBuilder passwordList(List<String> password) {
            this.passwordList = password;
            return this;
        }

        public QueryBuilder fetchPassword() {
            setFetchFields("fetchFields", "password");
            return this;
        }

        public QueryBuilder excludePassword() {
            setFetchFields("excludeFields", "password");
            return this;
        }

        public QueryBuilder fuzzyEmail(List<String> fuzzyEmail) {
            this.fuzzyEmail = fuzzyEmail;
            return this;
        }

        public QueryBuilder fuzzyEmail(String... fuzzyEmail) {
            this.fuzzyEmail = solveNullList(fuzzyEmail);
            return this;
        }

        public QueryBuilder rightFuzzyEmail(List<String> rightFuzzyEmail) {
            this.rightFuzzyEmail = rightFuzzyEmail;
            return this;
        }

        public QueryBuilder rightFuzzyEmail(String... rightFuzzyEmail) {
            this.rightFuzzyEmail = solveNullList(rightFuzzyEmail);
            return this;
        }

        public QueryBuilder email(String email) {
            setEmail(email);
            return this;
        }

        public QueryBuilder emailList(String... email) {
            this.emailList = solveNullList(email);
            return this;
        }

        public QueryBuilder emailList(List<String> email) {
            this.emailList = email;
            return this;
        }

        public QueryBuilder fetchEmail() {
            setFetchFields("fetchFields", "email");
            return this;
        }

        public QueryBuilder excludeEmail() {
            setFetchFields("excludeFields", "email");
            return this;
        }

        public QueryBuilder fuzzyPhone(List<String> fuzzyPhone) {
            this.fuzzyPhone = fuzzyPhone;
            return this;
        }

        public QueryBuilder fuzzyPhone(String... fuzzyPhone) {
            this.fuzzyPhone = solveNullList(fuzzyPhone);
            return this;
        }

        public QueryBuilder rightFuzzyPhone(List<String> rightFuzzyPhone) {
            this.rightFuzzyPhone = rightFuzzyPhone;
            return this;
        }

        public QueryBuilder rightFuzzyPhone(String... rightFuzzyPhone) {
            this.rightFuzzyPhone = solveNullList(rightFuzzyPhone);
            return this;
        }

        public QueryBuilder phone(String phone) {
            setPhone(phone);
            return this;
        }

        public QueryBuilder phoneList(String... phone) {
            this.phoneList = solveNullList(phone);
            return this;
        }

        public QueryBuilder phoneList(List<String> phone) {
            this.phoneList = phone;
            return this;
        }

        public QueryBuilder fetchPhone() {
            setFetchFields("fetchFields", "phone");
            return this;
        }

        public QueryBuilder excludePhone() {
            setFetchFields("excludeFields", "phone");
            return this;
        }

        public QueryBuilder fuzzyQuestion(List<String> fuzzyQuestion) {
            this.fuzzyQuestion = fuzzyQuestion;
            return this;
        }

        public QueryBuilder fuzzyQuestion(String... fuzzyQuestion) {
            this.fuzzyQuestion = solveNullList(fuzzyQuestion);
            return this;
        }

        public QueryBuilder rightFuzzyQuestion(List<String> rightFuzzyQuestion) {
            this.rightFuzzyQuestion = rightFuzzyQuestion;
            return this;
        }

        public QueryBuilder rightFuzzyQuestion(String... rightFuzzyQuestion) {
            this.rightFuzzyQuestion = solveNullList(rightFuzzyQuestion);
            return this;
        }

        public QueryBuilder question(String question) {
            setQuestion(question);
            return this;
        }

        public QueryBuilder questionList(String... question) {
            this.questionList = solveNullList(question);
            return this;
        }

        public QueryBuilder questionList(List<String> question) {
            this.questionList = question;
            return this;
        }

        public QueryBuilder fetchQuestion() {
            setFetchFields("fetchFields", "question");
            return this;
        }

        public QueryBuilder excludeQuestion() {
            setFetchFields("excludeFields", "question");
            return this;
        }

        public QueryBuilder fuzzyAnswer(List<String> fuzzyAnswer) {
            this.fuzzyAnswer = fuzzyAnswer;
            return this;
        }

        public QueryBuilder fuzzyAnswer(String... fuzzyAnswer) {
            this.fuzzyAnswer = solveNullList(fuzzyAnswer);
            return this;
        }

        public QueryBuilder rightFuzzyAnswer(List<String> rightFuzzyAnswer) {
            this.rightFuzzyAnswer = rightFuzzyAnswer;
            return this;
        }

        public QueryBuilder rightFuzzyAnswer(String... rightFuzzyAnswer) {
            this.rightFuzzyAnswer = solveNullList(rightFuzzyAnswer);
            return this;
        }

        public QueryBuilder answer(String answer) {
            setAnswer(answer);
            return this;
        }

        public QueryBuilder answerList(String... answer) {
            this.answerList = solveNullList(answer);
            return this;
        }

        public QueryBuilder answerList(List<String> answer) {
            this.answerList = answer;
            return this;
        }

        public QueryBuilder fetchAnswer() {
            setFetchFields("fetchFields", "answer");
            return this;
        }

        public QueryBuilder excludeAnswer() {
            setFetchFields("excludeFields", "answer");
            return this;
        }

        public QueryBuilder roleBetWeen(Integer roleSt, Integer roleEd) {
            this.roleSt = roleSt;
            this.roleEd = roleEd;
            return this;
        }

        public QueryBuilder roleGreaterEqThan(Integer roleSt) {
            this.roleSt = roleSt;
            return this;
        }

        public QueryBuilder roleLessEqThan(Integer roleEd) {
            this.roleEd = roleEd;
            return this;
        }


        public QueryBuilder role(Integer role) {
            setRole(role);
            return this;
        }

        public QueryBuilder roleList(Integer... role) {
            this.roleList = solveNullList(role);
            return this;
        }

        public QueryBuilder roleList(List<Integer> role) {
            this.roleList = role;
            return this;
        }

        public QueryBuilder fetchRole() {
            setFetchFields("fetchFields", "role");
            return this;
        }

        public QueryBuilder excludeRole() {
            setFetchFields("excludeFields", "role");
            return this;
        }

        public QueryBuilder createTimeBetWeen(java.time.LocalDateTime createTimeSt, java.time.LocalDateTime createTimeEd) {
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public QueryBuilder createTimeGreaterEqThan(java.time.LocalDateTime createTimeSt) {
            this.createTimeSt = createTimeSt;
            return this;
        }

        public QueryBuilder createTimeLessEqThan(java.time.LocalDateTime createTimeEd) {
            this.createTimeEd = createTimeEd;
            return this;
        }


        public QueryBuilder createTime(java.time.LocalDateTime createTime) {
            setCreateTime(createTime);
            return this;
        }

        public QueryBuilder createTimeList(java.time.LocalDateTime... createTime) {
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public QueryBuilder createTimeList(List<java.time.LocalDateTime> createTime) {
            this.createTimeList = createTime;
            return this;
        }

        public QueryBuilder fetchCreateTime() {
            setFetchFields("fetchFields", "createTime");
            return this;
        }

        public QueryBuilder excludeCreateTime() {
            setFetchFields("excludeFields", "createTime");
            return this;
        }

        public QueryBuilder updateTimeBetWeen(java.time.LocalDateTime updateTimeSt, java.time.LocalDateTime updateTimeEd) {
            this.updateTimeSt = updateTimeSt;
            this.updateTimeEd = updateTimeEd;
            return this;
        }

        public QueryBuilder updateTimeGreaterEqThan(java.time.LocalDateTime updateTimeSt) {
            this.updateTimeSt = updateTimeSt;
            return this;
        }

        public QueryBuilder updateTimeLessEqThan(java.time.LocalDateTime updateTimeEd) {
            this.updateTimeEd = updateTimeEd;
            return this;
        }


        public QueryBuilder updateTime(java.time.LocalDateTime updateTime) {
            setUpdateTime(updateTime);
            return this;
        }

        public QueryBuilder updateTimeList(java.time.LocalDateTime... updateTime) {
            this.updateTimeList = solveNullList(updateTime);
            return this;
        }

        public QueryBuilder updateTimeList(List<java.time.LocalDateTime> updateTime) {
            this.updateTimeList = updateTime;
            return this;
        }

        public QueryBuilder fetchUpdateTime() {
            setFetchFields("fetchFields", "updateTime");
            return this;
        }

        public QueryBuilder excludeUpdateTime() {
            setFetchFields("excludeFields", "updateTime");
            return this;
        }

        private <T> List<T> solveNullList(T... objs) {
            if (objs != null) {
                List<T> list = new ArrayList<>();
                for (T item : objs) {
                    if (item != null) {
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll() {
            this.fetchFields.put("AllFields", true);
            return this;
        }

        public QueryBuilder addField(String... fields) {
            List<String> list = new ArrayList<>();
            if (fields != null) {
                for (String field : fields) {
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields", list);
            return this;
        }

        @SuppressWarnings("unchecked")
        private void setFetchFields(String key, String val) {
            Map<String, Boolean> fields = (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null) {
                fields = new HashMap<>();
            }
            fields.put(val, true);
            this.fetchFields.put(key, fields);
        }

        public User build() {
            return this;
        }
    }


    public static class ConditionBuilder {
        private List<Integer> idList;

        public List<Integer> getIdList() {
            return this.idList;
        }

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt() {
            return this.idSt;
        }

        public Integer getIdEd() {
            return this.idEd;
        }

        private List<String> usernameList;

        public List<String> getUsernameList() {
            return this.usernameList;
        }


        private List<String> fuzzyUsername;

        public List<String> getFuzzyUsername() {
            return this.fuzzyUsername;
        }

        private List<String> rightFuzzyUsername;

        public List<String> getRightFuzzyUsername() {
            return this.rightFuzzyUsername;
        }

        private List<String> passwordList;

        public List<String> getPasswordList() {
            return this.passwordList;
        }


        private List<String> fuzzyPassword;

        public List<String> getFuzzyPassword() {
            return this.fuzzyPassword;
        }

        private List<String> rightFuzzyPassword;

        public List<String> getRightFuzzyPassword() {
            return this.rightFuzzyPassword;
        }

        private List<String> emailList;

        public List<String> getEmailList() {
            return this.emailList;
        }


        private List<String> fuzzyEmail;

        public List<String> getFuzzyEmail() {
            return this.fuzzyEmail;
        }

        private List<String> rightFuzzyEmail;

        public List<String> getRightFuzzyEmail() {
            return this.rightFuzzyEmail;
        }

        private List<String> phoneList;

        public List<String> getPhoneList() {
            return this.phoneList;
        }


        private List<String> fuzzyPhone;

        public List<String> getFuzzyPhone() {
            return this.fuzzyPhone;
        }

        private List<String> rightFuzzyPhone;

        public List<String> getRightFuzzyPhone() {
            return this.rightFuzzyPhone;
        }

        private List<String> questionList;

        public List<String> getQuestionList() {
            return this.questionList;
        }


        private List<String> fuzzyQuestion;

        public List<String> getFuzzyQuestion() {
            return this.fuzzyQuestion;
        }

        private List<String> rightFuzzyQuestion;

        public List<String> getRightFuzzyQuestion() {
            return this.rightFuzzyQuestion;
        }

        private List<String> answerList;

        public List<String> getAnswerList() {
            return this.answerList;
        }


        private List<String> fuzzyAnswer;

        public List<String> getFuzzyAnswer() {
            return this.fuzzyAnswer;
        }

        private List<String> rightFuzzyAnswer;

        public List<String> getRightFuzzyAnswer() {
            return this.rightFuzzyAnswer;
        }

        private List<Integer> roleList;

        public List<Integer> getRoleList() {
            return this.roleList;
        }

        private Integer roleSt;

        private Integer roleEd;

        public Integer getRoleSt() {
            return this.roleSt;
        }

        public Integer getRoleEd() {
            return this.roleEd;
        }

        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList() {
            return this.createTimeList;
        }

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt() {
            return this.createTimeSt;
        }

        public java.time.LocalDateTime getCreateTimeEd() {
            return this.createTimeEd;
        }

        private List<java.time.LocalDateTime> updateTimeList;

        public List<java.time.LocalDateTime> getUpdateTimeList() {
            return this.updateTimeList;
        }

        private java.time.LocalDateTime updateTimeSt;

        private java.time.LocalDateTime updateTimeEd;

        public java.time.LocalDateTime getUpdateTimeSt() {
            return this.updateTimeSt;
        }

        public java.time.LocalDateTime getUpdateTimeEd() {
            return this.updateTimeEd;
        }


        public ConditionBuilder idBetWeen(Integer idSt, Integer idEd) {
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public ConditionBuilder idGreaterEqThan(Integer idSt) {
            this.idSt = idSt;
            return this;
        }

        public ConditionBuilder idLessEqThan(Integer idEd) {
            this.idEd = idEd;
            return this;
        }


        public ConditionBuilder idList(Integer... id) {
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<Integer> id) {
            this.idList = id;
            return this;
        }

        public ConditionBuilder fuzzyUsername(List<String> fuzzyUsername) {
            this.fuzzyUsername = fuzzyUsername;
            return this;
        }

        public ConditionBuilder fuzzyUsername(String... fuzzyUsername) {
            this.fuzzyUsername = solveNullList(fuzzyUsername);
            return this;
        }

        public ConditionBuilder rightFuzzyUsername(List<String> rightFuzzyUsername) {
            this.rightFuzzyUsername = rightFuzzyUsername;
            return this;
        }

        public ConditionBuilder rightFuzzyUsername(String... rightFuzzyUsername) {
            this.rightFuzzyUsername = solveNullList(rightFuzzyUsername);
            return this;
        }

        public ConditionBuilder usernameList(String... username) {
            this.usernameList = solveNullList(username);
            return this;
        }

        public ConditionBuilder usernameList(List<String> username) {
            this.usernameList = username;
            return this;
        }

        public ConditionBuilder fuzzyPassword(List<String> fuzzyPassword) {
            this.fuzzyPassword = fuzzyPassword;
            return this;
        }

        public ConditionBuilder fuzzyPassword(String... fuzzyPassword) {
            this.fuzzyPassword = solveNullList(fuzzyPassword);
            return this;
        }

        public ConditionBuilder rightFuzzyPassword(List<String> rightFuzzyPassword) {
            this.rightFuzzyPassword = rightFuzzyPassword;
            return this;
        }

        public ConditionBuilder rightFuzzyPassword(String... rightFuzzyPassword) {
            this.rightFuzzyPassword = solveNullList(rightFuzzyPassword);
            return this;
        }

        public ConditionBuilder passwordList(String... password) {
            this.passwordList = solveNullList(password);
            return this;
        }

        public ConditionBuilder passwordList(List<String> password) {
            this.passwordList = password;
            return this;
        }

        public ConditionBuilder fuzzyEmail(List<String> fuzzyEmail) {
            this.fuzzyEmail = fuzzyEmail;
            return this;
        }

        public ConditionBuilder fuzzyEmail(String... fuzzyEmail) {
            this.fuzzyEmail = solveNullList(fuzzyEmail);
            return this;
        }

        public ConditionBuilder rightFuzzyEmail(List<String> rightFuzzyEmail) {
            this.rightFuzzyEmail = rightFuzzyEmail;
            return this;
        }

        public ConditionBuilder rightFuzzyEmail(String... rightFuzzyEmail) {
            this.rightFuzzyEmail = solveNullList(rightFuzzyEmail);
            return this;
        }

        public ConditionBuilder emailList(String... email) {
            this.emailList = solveNullList(email);
            return this;
        }

        public ConditionBuilder emailList(List<String> email) {
            this.emailList = email;
            return this;
        }

        public ConditionBuilder fuzzyPhone(List<String> fuzzyPhone) {
            this.fuzzyPhone = fuzzyPhone;
            return this;
        }

        public ConditionBuilder fuzzyPhone(String... fuzzyPhone) {
            this.fuzzyPhone = solveNullList(fuzzyPhone);
            return this;
        }

        public ConditionBuilder rightFuzzyPhone(List<String> rightFuzzyPhone) {
            this.rightFuzzyPhone = rightFuzzyPhone;
            return this;
        }

        public ConditionBuilder rightFuzzyPhone(String... rightFuzzyPhone) {
            this.rightFuzzyPhone = solveNullList(rightFuzzyPhone);
            return this;
        }

        public ConditionBuilder phoneList(String... phone) {
            this.phoneList = solveNullList(phone);
            return this;
        }

        public ConditionBuilder phoneList(List<String> phone) {
            this.phoneList = phone;
            return this;
        }

        public ConditionBuilder fuzzyQuestion(List<String> fuzzyQuestion) {
            this.fuzzyQuestion = fuzzyQuestion;
            return this;
        }

        public ConditionBuilder fuzzyQuestion(String... fuzzyQuestion) {
            this.fuzzyQuestion = solveNullList(fuzzyQuestion);
            return this;
        }

        public ConditionBuilder rightFuzzyQuestion(List<String> rightFuzzyQuestion) {
            this.rightFuzzyQuestion = rightFuzzyQuestion;
            return this;
        }

        public ConditionBuilder rightFuzzyQuestion(String... rightFuzzyQuestion) {
            this.rightFuzzyQuestion = solveNullList(rightFuzzyQuestion);
            return this;
        }

        public ConditionBuilder questionList(String... question) {
            this.questionList = solveNullList(question);
            return this;
        }

        public ConditionBuilder questionList(List<String> question) {
            this.questionList = question;
            return this;
        }

        public ConditionBuilder fuzzyAnswer(List<String> fuzzyAnswer) {
            this.fuzzyAnswer = fuzzyAnswer;
            return this;
        }

        public ConditionBuilder fuzzyAnswer(String... fuzzyAnswer) {
            this.fuzzyAnswer = solveNullList(fuzzyAnswer);
            return this;
        }

        public ConditionBuilder rightFuzzyAnswer(List<String> rightFuzzyAnswer) {
            this.rightFuzzyAnswer = rightFuzzyAnswer;
            return this;
        }

        public ConditionBuilder rightFuzzyAnswer(String... rightFuzzyAnswer) {
            this.rightFuzzyAnswer = solveNullList(rightFuzzyAnswer);
            return this;
        }

        public ConditionBuilder answerList(String... answer) {
            this.answerList = solveNullList(answer);
            return this;
        }

        public ConditionBuilder answerList(List<String> answer) {
            this.answerList = answer;
            return this;
        }

        public ConditionBuilder roleBetWeen(Integer roleSt, Integer roleEd) {
            this.roleSt = roleSt;
            this.roleEd = roleEd;
            return this;
        }

        public ConditionBuilder roleGreaterEqThan(Integer roleSt) {
            this.roleSt = roleSt;
            return this;
        }

        public ConditionBuilder roleLessEqThan(Integer roleEd) {
            this.roleEd = roleEd;
            return this;
        }


        public ConditionBuilder roleList(Integer... role) {
            this.roleList = solveNullList(role);
            return this;
        }

        public ConditionBuilder roleList(List<Integer> role) {
            this.roleList = role;
            return this;
        }

        public ConditionBuilder createTimeBetWeen(java.time.LocalDateTime createTimeSt, java.time.LocalDateTime createTimeEd) {
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public ConditionBuilder createTimeGreaterEqThan(java.time.LocalDateTime createTimeSt) {
            this.createTimeSt = createTimeSt;
            return this;
        }

        public ConditionBuilder createTimeLessEqThan(java.time.LocalDateTime createTimeEd) {
            this.createTimeEd = createTimeEd;
            return this;
        }


        public ConditionBuilder createTimeList(java.time.LocalDateTime... createTime) {
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public ConditionBuilder createTimeList(List<java.time.LocalDateTime> createTime) {
            this.createTimeList = createTime;
            return this;
        }

        public ConditionBuilder updateTimeBetWeen(java.time.LocalDateTime updateTimeSt, java.time.LocalDateTime updateTimeEd) {
            this.updateTimeSt = updateTimeSt;
            this.updateTimeEd = updateTimeEd;
            return this;
        }

        public ConditionBuilder updateTimeGreaterEqThan(java.time.LocalDateTime updateTimeSt) {
            this.updateTimeSt = updateTimeSt;
            return this;
        }

        public ConditionBuilder updateTimeLessEqThan(java.time.LocalDateTime updateTimeEd) {
            this.updateTimeEd = updateTimeEd;
            return this;
        }


        public ConditionBuilder updateTimeList(java.time.LocalDateTime... updateTime) {
            this.updateTimeList = solveNullList(updateTime);
            return this;
        }

        public ConditionBuilder updateTimeList(List<java.time.LocalDateTime> updateTime) {
            this.updateTimeList = updateTime;
            return this;
        }

        private <T> List<T> solveNullList(T... objs) {
            if (objs != null) {
                List<T> list = new ArrayList<>();
                for (T item : objs) {
                    if (item != null) {
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build() {
            return this;
        }
    }

    public static class Builder {

        private User obj;

        public Builder() {
            this.obj = new User();
        }

        public Builder id(Integer id) {
            this.obj.setId(id);
            return this;
        }

        public Builder username(String username) {
            this.obj.setUsername(username);
            return this;
        }

        public Builder password(String password) {
            this.obj.setPassword(password);
            return this;
        }

        public Builder email(String email) {
            this.obj.setEmail(email);
            return this;
        }

        public Builder phone(String phone) {
            this.obj.setPhone(phone);
            return this;
        }

        public Builder question(String question) {
            this.obj.setQuestion(question);
            return this;
        }

        public Builder answer(String answer) {
            this.obj.setAnswer(answer);
            return this;
        }

        public Builder role(Integer role) {
            this.obj.setRole(role);
            return this;
        }

        public Builder createTime(java.time.LocalDateTime createTime) {
            this.obj.setCreateTime(createTime);
            return this;
        }

        public Builder updateTime(java.time.LocalDateTime updateTime) {
            this.obj.setUpdateTime(updateTime);
            return this;
        }

        public User build() {
            return obj;
        }
    }

}
