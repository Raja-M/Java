package core.classexamples;

public class CustAddr {

    private Long addrId;
    private String streetName;

    private String cityName;
    private String state;



    public CustAddr() {
    }

    public CustAddr(Long addrId, String streetName, String cityName, String state) {
        this.addrId = addrId;
        this.streetName = streetName;
        this.cityName = cityName;
        this.state = state;

    }


    public Long getAddrId() {
        return addrId;
    }

    public void setAddrId(Long addrId) {
        this.addrId = addrId;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "CustAddr{" +
                "addrId=" + addrId +
                ", streetName='" + streetName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", state='" + state + '\'' +

                '}';
    }
}
