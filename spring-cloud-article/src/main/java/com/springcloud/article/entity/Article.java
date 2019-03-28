package com.springcloud.article.entity;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {
  private String id;
  private String userId;
  private String title;
  private String createTime;
  private String balance;
  private String updateTime;
  private String type;
  private Boolean isOriginal;
  private String author;
  private String cover;
  private String summary;
  private Integer price;
  private Integer buyCount;
  private Boolean show;
  private String auditStatus;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }

  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Boolean getIsOriginal() {
    return isOriginal;
  }

  public void setIsOriginal(Boolean isOriginal) {
    this.isOriginal = isOriginal;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getCover() {
    return cover;
  }

  public void setCover(String cover) {
    this.cover = cover;
  }

  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public Integer getBuyCount() {
    return buyCount;
  }

  public void setBuyCount(Integer buyCount) {
    this.buyCount = buyCount;
  }

  public Boolean getShow() {
    return show;
  }

  public void setShow(Boolean show) {
    this.show = show;
  }

  public String getAuditStatus() {
    return auditStatus;
  }

  public void setAuditStatus(String auditStatus) {
    this.auditStatus = auditStatus;
  }

  @Override
  public String toString() {
    return "Article{" +
            "id='" + id + '\'' +
            ", userId='" + userId + '\'' +
            ", title='" + title + '\'' +
            ", createTime='" + createTime + '\'' +
            ", balance='" + balance + '\'' +
            ", updateTime='" + updateTime + '\'' +
            ", type='" + type + '\'' +
            ", isOriginal='" + isOriginal + '\'' +
            ", author='" + author + '\'' +
            ", cover='" + cover + '\'' +
            ", summary='" + summary + '\'' +
            ", price=" + price +
            ", buyCount=" + buyCount +
            ", show=" + show +
            ", auditStatus='" + auditStatus + '\'' +
            '}';
  }
}
