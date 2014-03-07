/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hypoport.caching.rest;

/**
 *
 * @author steffen.kaempke
 */
public class User {

  private String imei;

  private long coins;

  public User(String imei) {
    this.imei = imei;
  }

  public User() {

  }

  @Override
  public int hashCode() {
    int hash = 3;
    hash = 89 * hash + (this.imei != null ? this.imei.hashCode() : 0);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final User other = (User) obj;
    if ((this.imei == null) ? (other.imei != null) : !this.imei.equals(other.imei)) {
      return false;
    }
    return true;
  }

  public String getImei() {
    return imei;
  }

  public void setImei(String imei) {
    this.imei = imei;
  }

  public long getCoins() {
    return coins;
  }

  public void setCoins(long coins) {
    this.coins = coins;
  }

}
