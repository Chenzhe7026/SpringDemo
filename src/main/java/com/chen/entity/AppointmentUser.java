package com.chen.entity;

public class AppointmentUser {
    private String uuid;

    private String deptname;

    private String deptid;

    private String mattername;

    private String matterid;

    private String userName;

    private String userPhone;

    private String userContent;

    private String userOpenid;

    private String userTime;

    private String approverOpenid;

    private String approverName;

    private Integer state;

    private Integer isDelete;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid == null ? null : deptid.trim();
    }

    public String getMattername() {
        return mattername;
    }

    public void setMattername(String mattername) {
        this.mattername = mattername == null ? null : mattername.trim();
    }

    public String getMatterid() {
        return matterid;
    }

    public void setMatterid(String matterid) {
        this.matterid = matterid == null ? null : matterid.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserContent() {
        return userContent;
    }

    public void setUserContent(String userContent) {
        this.userContent = userContent == null ? null : userContent.trim();
    }

    public String getUserOpenid() {
        return userOpenid;
    }

    public void setUserOpenid(String userOpenid) {
        this.userOpenid = userOpenid == null ? null : userOpenid.trim();
    }

    public String getUserTime() {
        return userTime;
    }

    public void setUserTime(String userTime) {
        this.userTime = userTime == null ? null : userTime.trim();
    }

    public String getApproverOpenid() {
        return approverOpenid;
    }

    public void setApproverOpenid(String approverOpenid) {
        this.approverOpenid = approverOpenid == null ? null : approverOpenid.trim();
    }

    public String getApproverName() {
        return approverName;
    }

    public void setApproverName(String approverName) {
        this.approverName = approverName == null ? null : approverName.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}