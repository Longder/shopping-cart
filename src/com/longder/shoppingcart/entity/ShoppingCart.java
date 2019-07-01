package com.longder.shoppingcart.entity;

/**
 * 购物车实体
 */
public class ShoppingCart extends BaseIdEntity{

    /**
     * 书本id
     */
    private Long bookId;
    /**
     * 数量
     */
    private Integer count;

    /**
     * 价格
     */
    private Double price;

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
