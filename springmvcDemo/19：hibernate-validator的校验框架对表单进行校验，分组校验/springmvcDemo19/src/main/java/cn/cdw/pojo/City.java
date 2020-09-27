package cn.cdw.pojo;

import javax.validation.constraints.NotBlank;

/**
 * @author DW-CHEN
 */
public class City {
    @NotBlank(message = "地址不能为空")
    private String address;

    @NotBlank(message = "工作不能为空")
    private String job;

    public City() {

    }

    public City(String address, String job) {
        this.address = address;
        this.job = job;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "City{" +
                "address='" + address + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
