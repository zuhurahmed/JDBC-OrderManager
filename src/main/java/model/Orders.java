package model;

public class Orders {

    private int id;
    private String orderNumber;
    private String orderClient;
    private String orderDeliveryAddress;
    private int orderDeliveryPostcode;
    private String orderDeliveryCity;
    private int isVatFree;
    private boolean isSend;
    private String date;

    public Orders(int id, String orderNumber, String orderClient, String orderDeliveryAddress, int orderDeliveryPostcode, String orderDeliveryCity, int isVatFree, boolean isSend, String date) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.orderClient = orderClient;
        this.orderDeliveryAddress = orderDeliveryAddress;
        this.orderDeliveryPostcode = orderDeliveryPostcode;
        this.orderDeliveryCity = orderDeliveryCity;
        this.isVatFree = isVatFree;
        this.isSend = isSend;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public boolean isSend() {
        return isSend;
    }

    public void setSend(boolean send) {
        isSend = send;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIsVatFree() {
        return isVatFree;
    }

    public String getOrderClient() {
        return orderClient;
    }

    public void setOrderClient(String orderClient) {
        this.orderClient = orderClient;
    }

    public void setIsVatFree(int isVatFree) {
        this.isVatFree = isVatFree;
    }

    public String getOrderDeliveryAddress() {
        return orderDeliveryAddress;
    }

    public void setOrderDeliveryAddress(String orderDeliveryAddress) {
        this.orderDeliveryAddress = orderDeliveryAddress;
    }

    public int getOrderDeliveryPostcode() {
        return orderDeliveryPostcode;
    }

    public void setOrderDeliveryPostcode(int orderDeliveryPostcode) {
        this.orderDeliveryPostcode = orderDeliveryPostcode;
    }

    public String getOrderDeliveryCity() {
        return orderDeliveryCity;
    }

    public void setOrderDeliveryCity(String orderDeliveryCity) {
        this.orderDeliveryCity = orderDeliveryCity;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", orderNumber='" + orderNumber + '\'' +
                ", orderClient='" + orderClient + '\'' +
                ", orderDeliveryAddress='" + orderDeliveryAddress + '\'' +
                ", orderDeliveryPostcode=" + orderDeliveryPostcode +
                ", orderDeliveryCity='" + orderDeliveryCity + '\'' +
                ", isVatFree=" + isVatFree +
                ", isSend=" + isSend +
                ", date='" + date + '\'' +
                '}';
    }
}