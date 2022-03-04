package model;

public class OrderProduct {
    private String orderNumber;
    private String productName;
    private int amount;
    private double pricePerUnit;
    private String orderClient;
    private String deliveryStreet;
    private int postalCode;
    private String deliveryCity;
    private int isVatFree;
    private int isSend;
    private String orderDate;

    public OrderProduct(String orderNumber, String productName, int amount, double pricePerUnit, String orderClient, String deliveryStreet, int postalCode, String deliveryCity, int isVatFree, int isSend, String orderDate) {
        this.orderNumber = orderNumber;
        this.productName = productName;
        this.amount = amount;
        this.pricePerUnit = pricePerUnit;
        this.orderClient = orderClient;
        this.deliveryStreet = deliveryStreet;
        this.postalCode = postalCode;
        this.deliveryCity = deliveryCity;
        this.isVatFree = isVatFree;
        this.isSend = isSend;
        this.orderDate = orderDate;
    }



    @Override
    public String toString() {
        return "OrderProduct{" +
                "orderNumber='" + orderNumber + '\'' +
                ", productName='" + productName + '\'' +
                ", amount=" + amount +
                ", pricePerUnit=" + pricePerUnit +
                ", orderClient='" + orderClient + '\'' +
                ", deliveryStreet='" + deliveryStreet + '\'' +
                ", postalCode=" + postalCode +
                ", deliveryCity='" + deliveryCity + '\'' +
                ", isVatFree=" + isVatFree +
                ", isSend=" + isSend +
                ", orderDate='" + orderDate + '\'' +
                '}';
    }
}