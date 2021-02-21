package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Report   {
  @JsonProperty("area")
  private Area area = null;

  @JsonProperty("amount")
  private Integer amount = null;

  public Report area(Area area) {
    this.area = area;
    return this;
  }

  public Area getArea() {
    return area;
  }

  public void setArea(Area area) {
    this.area = area;
  }

  public Report amount(Integer amount) {
    this.amount = amount;
    return this;
  }

  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Report report = (Report) o;
    return Objects.equals(this.area, report.area) &&
        Objects.equals(this.amount, report.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(area, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Report {\n");
    
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

