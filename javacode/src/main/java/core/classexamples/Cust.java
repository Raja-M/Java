package core.classexamples;

import java.util.List;

public class Cust {

    private Long custID;
    private String custName;

    private String custType;

    private List<CustAddr> custAddrList;
    public Cust() {
        
    }

    public Cust(Long custID, String custName, String custType, List<CustAddr> custAddrList) {
        this.custID = custID;
        this.custName = custName;
        this.custType = custType;
        this.custAddrList = custAddrList;
    }

    public Long getCustID() {
        return custID;
    }

    public void setCustID(Long custID) {
        this.custID = custID;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }

    public List<CustAddr> getCustAddrList() {
        return custAddrList;
    }

    public void setCustAddrList(List<CustAddr> custAddrList) {
        this.custAddrList = custAddrList;
    }

    @Override
    public String toString() {
        return "Cust{" +
                "custID=" + custID +
                ", custName='" + custName + '\'' +
                ", custType='" + custType + '\'' +
                ", custAddrList=" + custAddrList +
                '}';
    }
}
