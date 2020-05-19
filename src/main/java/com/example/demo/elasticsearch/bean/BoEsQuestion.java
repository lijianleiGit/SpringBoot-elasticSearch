package com.example.demo.elasticsearch.bean;

//import org.springframework.data.annotation.Id;
//import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;
import java.util.List;

/**
 *  该实体类不可轻易修改任意常数，
 *  否则检索功能会出现问题，若修改，
 *  则要在对es中的字段对应，且不能影响检索
 *
 *  ES 对接的 错题 bean
 *
 * @author ：lijianlei
 * @date ：Created in 2020/1/9 17:01
 * @description：
 * @modified By：
 * @version:
 */
//indexName 为索引       对应关系型数据库中的 数据库
//type 索引下的哪个类型  对应关系型数据库中的 表
//@Document(indexName = "little-mistake", type = "question")
public class BoEsQuestion {


    /**
     * 错题id 主键
     */
//    @Id
    private Long id;


    /**
     * 错题id
     */
    private Long questionId;

    /**
     * 用户id
     */
    private long accountId;


    /**
     * 错题title
     */
    private String title;



    /**
     * 题干图片
     */
    private String stemImg;


    /**
     * 科目id
     */
    private Integer subjectId;

    /**
     * 科目名称
     */
    private String subjectName;

    /**
     * 错题难度
     */
    private Integer difficultyId;

    /**
     * 错题难度
     */
    private String difficultyName;

    /**
     * 是否消化
     */
    private Boolean isDigest;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 修改时间
     */
    private Date updateDate;

    /**
     * 标签（章节 知识点）
     */
    private List<String> questLabel;


    /**
     * 某个错题和某些目标绑定的 目标id
     */
    private List<Long> targetIds;


    /**
     * 某个错题和某些章节绑定的章节Id
     */
    private List<String> chapter;


    /**
     * 某个错题和某些知识点绑定的知识点Id
     */
    private List<String> knowledge;

    /**
     * 建议查询的列表，内容包含错题标题，错题难度，错题学科，错题章节 和知识点
     */
    private List<String> suggest;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStemImg() {
        return stemImg;
    }

    public void setStemImg(String stemImg) {
        this.stemImg = stemImg;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Integer getDifficultyId() {
        return difficultyId;
    }

    public void setDifficultyId(Integer difficultyId) {
        this.difficultyId = difficultyId;
    }

    public String getDifficultyName() {
        return difficultyName;
    }

    public void setDifficultyName(String difficultyName) {
        this.difficultyName = difficultyName;
    }

    public Boolean getDigest() {
        return isDigest;
    }

    public void setDigest(Boolean digest) {
        isDigest = digest;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public List<String> getQuestLabel() {
        return questLabel;
    }

    public void setQuestLabel(List<String> questLabel) {
        this.questLabel = questLabel;
    }

    public List<Long> getTargetIds() {
        return targetIds;
    }

    public void setTargetIds(List<Long> targetIds) {
        this.targetIds = targetIds;
    }

    public List<String> getChapter() {
        return chapter;
    }

    public void setChapter(List<String> chapter) {
        this.chapter = chapter;
    }

    public List<String> getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(List<String> knowledge) {
        this.knowledge = knowledge;
    }

    public List<String> getSuggest() {
        return suggest;
    }

    public void setSuggest(List<String> suggest) {
        this.suggest = suggest;
    }

    @Override
    public String toString() {
        return "BoEsQuestion{" +
                "id=" + id +
                ", questionId=" + questionId +
                ", accountId=" + accountId +
                ", title='" + title + '\'' +
                ", stemImg='" + stemImg + '\'' +
                ", subjectId=" + subjectId +
                ", subjectName='" + subjectName + '\'' +
                ", difficultyId=" + difficultyId +
                ", difficultyName='" + difficultyName + '\'' +
                ", isDigest=" + isDigest +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", questLabel=" + questLabel +
                ", targetIds=" + targetIds +
                ", chapter=" + chapter +
                ", knowledge=" + knowledge +
                ", suggest=" + suggest +
                '}';
    }
}
