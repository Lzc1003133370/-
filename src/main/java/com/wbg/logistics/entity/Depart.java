package com.wbg.logistics.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Depart {
    private Firm firm;

    private Dispatch dispatch;

    @Override
    public String toString() {
        return "Depart{" +
                "firm=" + firm +
                ", dispatch=" + dispatch +
                ", staffNo=" + staffNo +
                ", staffName='" + staffName + '\'' +
                ", gender='" + gender + '\'' +
                ", birthhday=" + birthhday +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", dedpartNo=" + dedpartNo +
                ", firmNo=" + firmNo +
                '}';
    }

    public Firm getFirm() {
        return firm;
    }

    public void setFirm(Firm firm) {
        this.firm = firm;
    }

    public Dispatch getDispatch() {
        return dispatch;
    }

    public void setDispatch(Dispatch dispatch) {
        this.dispatch = dispatch;
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column depart.staff_no
     *
     * @mbg.generated
     */
    private Integer staffNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column depart.staff_name
     *
     * @mbg.generated
     */
    private String staffName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column depart.gender
     *
     * @mbg.generated
     */
    private String gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column depart.birthhday
     *
     * @mbg.generated
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthhday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column depart.phone
     *
     * @mbg.generated
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column depart.password
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column depart.dedpart_no
     *
     * @mbg.generated
     */
    private Integer dedpartNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column depart.firm_no
     *
     * @mbg.generated
     */
    private Integer firmNo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column depart.staff_no
     *
     * @return the value of depart.staff_no
     *
     * @mbg.generated
     */
    public Integer getStaffNo() {
        return staffNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column depart.staff_no
     *
     * @param staffNo the value for depart.staff_no
     *
     * @mbg.generated
     */
    public void setStaffNo(Integer staffNo) {
        this.staffNo = staffNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column depart.staff_name
     *
     * @return the value of depart.staff_name
     *
     * @mbg.generated
     */
    public String getStaffName() {
        return staffName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column depart.staff_name
     *
     * @param staffName the value for depart.staff_name
     *
     * @mbg.generated
     */
    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column depart.gender
     *
     * @return the value of depart.gender
     *
     * @mbg.generated
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column depart.gender
     *
     * @param gender the value for depart.gender
     *
     * @mbg.generated
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column depart.birthhday
     *
     * @return the value of depart.birthhday
     *
     * @mbg.generated
     */
    public Date getBirthhday() {
        return birthhday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column depart.birthhday
     *
     * @param birthhday the value for depart.birthhday
     *
     * @mbg.generated
     */
    public void setBirthhday(Date birthhday) {
        this.birthhday = birthhday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column depart.phone
     *
     * @return the value of depart.phone
     *
     * @mbg.generated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column depart.phone
     *
     * @param phone the value for depart.phone
     *
     * @mbg.generated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column depart.password
     *
     * @return the value of depart.password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column depart.password
     *
     * @param password the value for depart.password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column depart.dedpart_no
     *
     * @return the value of depart.dedpart_no
     *
     * @mbg.generated
     */
    public Integer getDedpartNo() {
        return dedpartNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column depart.dedpart_no
     *
     * @param dedpartNo the value for depart.dedpart_no
     *
     * @mbg.generated
     */
    public void setDedpartNo(Integer dedpartNo) {
        this.dedpartNo = dedpartNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column depart.firm_no
     *
     * @return the value of depart.firm_no
     *
     * @mbg.generated
     */
    public Integer getFirmNo() {
        return firmNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column depart.firm_no
     *
     * @param firmNo the value for depart.firm_no
     *
     * @mbg.generated
     */
    public void setFirmNo(Integer firmNo) {
        this.firmNo = firmNo;
    }
}