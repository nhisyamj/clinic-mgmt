package com.nhisyamj.clinic.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import com.nhisyamj.clinic.model.Drug;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 *<h1>Order</h1>
 * Class description
 * <p>
 ***
 * @author: Hisyam Johan
 * @since: 16/08/2018
 * @version: 1.0
 * Time: 10:50 PM
 * Email: nhisyamj@gmail.com
 ***
 */
@Validated

public class Order   {
  @JsonProperty("orderId")
  private Long orderId = null;

  @JsonProperty("drugs")
  private Drug drugs = null;

  @JsonProperty("createdBy")
  private String createdBy = null;

  @JsonProperty("createdDate")
  private OffsetDateTime createdDate = null;

  @JsonProperty("updatedBy")
  private String updatedBy = null;

  @JsonProperty("updatedDate")
  private OffsetDateTime updatedDate = null;

  @JsonProperty("isActive")
  private Boolean isActive = false;

  public Order orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Get orderId
   * @return orderId
  **/
  @ApiModelProperty(value = "")


  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public Order drugs(Drug drugs) {
    this.drugs = drugs;
    return this;
  }

  /**
   * Get drugs
   * @return drugs
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Drug getDrugs() {
    return drugs;
  }

  public void setDrugs(Drug drugs) {
    this.drugs = drugs;
  }

  public Order createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(value = "")


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public Order createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public Order updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  /**
   * Get updatedBy
   * @return updatedBy
  **/
  @ApiModelProperty(value = "")


  public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }

  public Order updatedDate(OffsetDateTime updatedDate) {
    this.updatedDate = updatedDate;
    return this;
  }

  /**
   * Get updatedDate
   * @return updatedDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(OffsetDateTime updatedDate) {
    this.updatedDate = updatedDate;
  }

  public Order isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Get isActive
   * @return isActive
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.orderId, order.orderId) &&
        Objects.equals(this.drugs, order.drugs) &&
        Objects.equals(this.createdBy, order.createdBy) &&
        Objects.equals(this.createdDate, order.createdDate) &&
        Objects.equals(this.updatedBy, order.updatedBy) &&
        Objects.equals(this.updatedDate, order.updatedDate) &&
        Objects.equals(this.isActive, order.isActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, drugs, createdBy, createdDate, updatedBy, updatedDate, isActive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    drugs: ").append(toIndentedString(drugs)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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

