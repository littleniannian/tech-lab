package com.jarvis.techlab.redis.entity.cache;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

public class BaseEntity implements Serializable {

    private static final long serialVersionUID = -3568845663259710894L;

    protected Long id;

    protected Timestamp updateTime;

    protected Timestamp createTime;

    public BaseEntity() {
    }

    public BaseEntity(Long id, Timestamp updateTime, Timestamp createTime) {
        this.id = id;
        this.updateTime = updateTime;
        this.createTime = createTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseEntity that = (BaseEntity) o;
        return Objects.equals(updateTime, that.updateTime) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(updateTime, createTime);
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "id=" + id +
                ", updateTime=" + updateTime +
                ", createTime=" + createTime +
                '}';
    }
}