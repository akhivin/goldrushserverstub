package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


public class Area   {
  @JsonProperty("posX")
  private Integer posX = null;

  @JsonProperty("posY")
  private Integer posY = null;

  @JsonProperty("sizeX")
  private Integer sizeX = null;

  @JsonProperty("sizeY")
  private Integer sizeY = null;

  public Area posX(Integer posX) {
    this.posX = posX;
    return this;
  }


  public Integer getPosX() {
    return posX;
  }

  public void setPosX(Integer posX) {
    this.posX = posX;
  }

  public Area posY(Integer posY) {
    this.posY = posY;
    return this;
  }


  public Integer getPosY() {
    return posY;
  }

  public void setPosY(Integer posY) {
    this.posY = posY;
  }

  public Area sizeX(Integer sizeX) {
    this.sizeX = sizeX;
    return this;
  }


  public Integer getSizeX() {
    return sizeX;
  }

  public void setSizeX(Integer sizeX) {
    this.sizeX = sizeX;
  }

  public Area sizeY(Integer sizeY) {
    this.sizeY = sizeY;
    return this;
  }


  public Integer getSizeY() {
    return sizeY;
  }

  public void setSizeY(Integer sizeY) {
    this.sizeY = sizeY;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Area area = (Area) o;
    return Objects.equals(this.posX, area.posX) &&
        Objects.equals(this.posY, area.posY) &&
        Objects.equals(this.sizeX, area.sizeX) &&
        Objects.equals(this.sizeY, area.sizeY);
  }

  @Override
  public int hashCode() {
    return Objects.hash(posX, posY, sizeX, sizeY);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Area {\n");
    
    sb.append("    posX: ").append(toIndentedString(posX)).append("\n");
    sb.append("    posY: ").append(toIndentedString(posY)).append("\n");
    sb.append("    sizeX: ").append(toIndentedString(sizeX)).append("\n");
    sb.append("    sizeY: ").append(toIndentedString(sizeY)).append("\n");
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

