package org.ssm.pojo;

import java.io.Serializable;
import java.util.Date;

public class TitlesKey implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column titles.emp_no
     *
     * @mbg.generated Mon Oct 28 11:00:15 CST 2019
     */
    private Integer empNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column titles.title
     *
     * @mbg.generated Mon Oct 28 11:00:15 CST 2019
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column titles.from_date
     *
     * @mbg.generated Mon Oct 28 11:00:15 CST 2019
     */
    private Date fromDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table titles
     *
     * @mbg.generated Mon Oct 28 11:00:15 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column titles.emp_no
     *
     * @return the value of titles.emp_no
     *
     * @mbg.generated Mon Oct 28 11:00:15 CST 2019
     */
    public Integer getEmpNo() {
        return empNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column titles.emp_no
     *
     * @param empNo the value for titles.emp_no
     *
     * @mbg.generated Mon Oct 28 11:00:15 CST 2019
     */
    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column titles.title
     *
     * @return the value of titles.title
     *
     * @mbg.generated Mon Oct 28 11:00:15 CST 2019
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column titles.title
     *
     * @param title the value for titles.title
     *
     * @mbg.generated Mon Oct 28 11:00:15 CST 2019
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column titles.from_date
     *
     * @return the value of titles.from_date
     *
     * @mbg.generated Mon Oct 28 11:00:15 CST 2019
     */
    public Date getFromDate() {
        return fromDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column titles.from_date
     *
     * @param fromDate the value for titles.from_date
     *
     * @mbg.generated Mon Oct 28 11:00:15 CST 2019
     */
    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table titles
     *
     * @mbg.generated Mon Oct 28 11:00:15 CST 2019
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TitlesKey other = (TitlesKey) that;
        return (this.getEmpNo() == null ? other.getEmpNo() == null : this.getEmpNo().equals(other.getEmpNo()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getFromDate() == null ? other.getFromDate() == null : this.getFromDate().equals(other.getFromDate()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table titles
     *
     * @mbg.generated Mon Oct 28 11:00:15 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEmpNo() == null) ? 0 : getEmpNo().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getFromDate() == null) ? 0 : getFromDate().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table titles
     *
     * @mbg.generated Mon Oct 28 11:00:15 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", empNo=").append(empNo);
        sb.append(", title=").append(title);
        sb.append(", fromDate=").append(fromDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}