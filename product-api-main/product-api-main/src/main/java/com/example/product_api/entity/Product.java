package com.example.product_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "product")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column(name = "name")
  private String name;
  @Column(name = "description")
  private String description;
  @Column(name = "price")
    private Double price;
  @Column(name = "stock_quantity")
  private Integer stock_quantity;
  @Column(name = "store_id")
  private int store_id;
  @Column(name = "image_url")
  private String image_url;
  @Column(name = "merchant_card_number")
  private int merchant_card_number;
  @Column(name = "merchantcvv")
  private Integer merchantcvv ;







  @Override
  public String toString() {
    return "Product{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", description='" + description + '\'' +
      ", price=" + price +
      ", stock_quantity=" + stock_quantity +
      ", store_id=" + store_id +
      ", image_url='" + image_url + '\'' +
      ", merchantCardNumber=" + merchant_card_number +
      ", merchantCvv=" + merchantcvv +
      '}';
  }
}
