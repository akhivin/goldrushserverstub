package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * License for digging.
 */
@ApiModel(description = "License for digging.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-02-20T21:59:16.206Z")




public class License   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("digAllowed")
  private Integer digAllowed = null;

  @JsonProperty("digUsed")
  private Integer digUsed = null;

  public License id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public License digAllowed(Integer digAllowed) {
    this.digAllowed = digAllowed;
    return this;
  }

  /**
   * Get digAllowed
   * @return digAllowed
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getDigAllowed() {
    return digAllowed;
  }

  public void setDigAllowed(Integer digAllowed) {
    this.digAllowed = digAllowed;
  }

  public License digUsed(Integer digUsed) {
    this.digUsed = digUsed;
    return this;
  }

  /**
   * Get digUsed
   * @return digUsed
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getDigUsed() {
    return digUsed;
  }

  public void setDigUsed(Integer digUsed) {
    this.digUsed = digUsed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    License license = (License) o;
    return Objects.equals(this.id, license.id) &&
        Objects.equals(this.digAllowed, license.digAllowed) &&
        Objects.equals(this.digUsed, license.digUsed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, digAllowed, digUsed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class License {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    digAllowed: ").append(toIndentedString(digAllowed)).append("\n");
    sb.append("    digUsed: ").append(toIndentedString(digUsed)).append("\n");
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

