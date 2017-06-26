package com.gt.pojo;

public class TElectronMain {
    private Integer tId;

    private String tName;										//公司名称

    private String tNumber;										//缴费号码

    private String tBusinessNumber;								//办理业务号码

    private String tSite;										//地址

    private String tProject;									//办理项目

    private String tContent;									//业务内容

    private String tManager;									//客户经理

    private String tPhone;										//联系方式

    private String tService;									//客服电话

    private String tIdentityCard;								//身份证照片

    private String tIdentityCard2;							    //身份证照片2

    private String tBusiness;									//营业执照

    private String tSign;										//签字

    private Integer tAgreement;									//协议（1已办理 ，2未办理，9已完成）

    private Integer tDelete;									//信息是否显示（1显示，2不显示）

    private Integer tShow;		//显示添加那些图片（1签字照片；2签字照片和营业执照；3签字照片和身份证照片；  4签字照片和营业执照和身份证照片 ）
    
    private Integer tRegisterId;									//用户ID

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    public String gettNumber() {
        return tNumber;
    }

    public void settNumber(String tNumber) {
        this.tNumber = tNumber == null ? null : tNumber.trim();
    }

    public String gettBusinessNumber() {
        return tBusinessNumber;
    }

    public void settBusinessNumber(String tBusinessNumber) {
        this.tBusinessNumber = tBusinessNumber == null ? null : tBusinessNumber.trim();
    }

    public String gettSite() {
        return tSite;
    }

    public void settSite(String tSite) {
        this.tSite = tSite == null ? null : tSite.trim();
    }

    public String gettProject() {
        return tProject;
    }

    public void settProject(String tProject) {
        this.tProject = tProject == null ? null : tProject.trim();
    }

    public String gettContent() {
        return tContent;
    }

    public void settContent(String tContent) {
        this.tContent = tContent == null ? null : tContent.trim();
    }

    public String gettManager() {
        return tManager;
    }

    public void settManager(String tManager) {
        this.tManager = tManager == null ? null : tManager.trim();
    }

    public String gettPhone() {
        return tPhone;
    }

    public void settPhone(String tPhone) {
        this.tPhone = tPhone == null ? null : tPhone.trim();
    }

    public String gettService() {
        return tService;
    }

    public void settService(String tService) {
        this.tService = tService == null ? null : tService.trim();
    }

    public String gettIdentityCard() {
        return tIdentityCard;
    }

    public void settIdentityCard(String tIdentityCard) {
        this.tIdentityCard = tIdentityCard == null ? null : tIdentityCard.trim();
    }

    public String gettIdentityCard2() {
        return tIdentityCard2;
    }

    public void settIdentityCard2(String tIdentityCard2) {
        this.tIdentityCard2 = tIdentityCard2 == null ? null : tIdentityCard2.trim();
    }

    public String gettBusiness() {
        return tBusiness;
    }

    public void settBusiness(String tBusiness) {
        this.tBusiness = tBusiness == null ? null : tBusiness.trim();
    }

    public String gettSign() {
        return tSign;
    }

    public void settSign(String tSign) {
        this.tSign = tSign == null ? null : tSign.trim();
    }

    public Integer gettAgreement() {
        return tAgreement;
    }

    public void settAgreement(Integer tAgreement) {
        this.tAgreement = tAgreement;
    }

    public Integer gettDelete() {
        return tDelete;
    }

    public void settDelete(Integer tDelete) {
        this.tDelete = tDelete;
    }

    public Integer gettShow() {
        return tShow;
    }

    public void settShow(Integer tShow) {
        this.tShow = tShow;
    }

    public Integer gettRegisterId() {
        return tRegisterId;
    }

    public void settRegisterId(Integer tRegisterId) {
        this.tRegisterId = tRegisterId;
    }
}