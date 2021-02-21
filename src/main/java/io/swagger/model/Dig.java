package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


public class Dig   {
  @JsonProperty("licenseID")
  private Integer licenseID = null;

  @JsonProperty("posX")
  private Integer posX = null;

  @JsonProperty("posY")
  private Integer posY = null;

  @JsonProperty("depth")
  private Integer depth = null;

  public Dig licenseID(Integer licenseID) {
    this.licenseID = licenseID;
    return this;
  }

  public Integer getLicenseID() {
    return licenseID;
  }

  public void setLicenseID(Integer licenseID) {
    this.licenseID = licenseID;
  }

  public Dig posX(Integer posX) {
    this.posX = posX;
    return this;
  }

  public Integer getPosX() {
    return posX;
  }

  public void setPosX(Integer posX) {
    this.posX = posX;
  }

  public Dig posY(Integer posY) {
    this.posY = posY;
    return this;
  }


  public Integer getPosY() {
    return posY;
  }

  public void setPosY(Integer posY) {
    this.posY = posY;
  }

  public Dig depth(Integer depth) {
    this.depth = depth;
    return this;
  }


  public Integer getDepth() {
    return depth;
  }

  public void setDepth(Integer depth) {
    this.depth = depth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dig dig = (Dig) o;
    return Objects.equals(this.licenseID, dig.licenseID) &&
        Objects.equals(this.posX, dig.posX) &&
        Objects.equals(this.posY, dig.posY) &&
        Objects.equals(this.depth, dig.depth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(licenseID, posX, posY, depth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dig {\n");
    
    sb.append("    licenseID: ").append(toIndentedString(licenseID)).append("\n");
    sb.append("    posX: ").append(toIndentedString(posX)).append("\n");
    sb.append("    posY: ").append(toIndentedString(posY)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
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

