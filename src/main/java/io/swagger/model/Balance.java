package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;


public class Balance   {
  @JsonProperty("balance")
  private Integer balance = null;

  @JsonProperty("wallet")
  private Wallet wallet = null;

  public Balance balance(Integer balance) {
    this.balance = balance;
    return this;
  }

  public Integer getBalance() {
    return balance;
  }

  public void setBalance(Integer balance) {
    this.balance = balance;
  }

  public Balance wallet(Wallet wallet) {
    this.wallet = wallet;
    return this;
  }

  public Wallet getWallet() {
    return wallet;
  }

  public void setWallet(Wallet wallet) {
    this.wallet = wallet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Balance balance = (Balance) o;
    return Objects.equals(this.balance, balance.balance) &&
        Objects.equals(this.wallet, balance.wallet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, wallet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Balance {\n");
    
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    wallet: ").append(toIndentedString(wallet)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

