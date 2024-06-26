package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.BillingPayment;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * Defines an billing payment response object..
 *
 */
@Schema(description = "Defines an billing payment response object.")

public class BillingPaymentResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("billingPayments")
  private java.util.List<BillingPayment> billingPayments = null;


  /**
   * billingPayments.
   *
   * @return BillingPaymentResponse
   **/
  public BillingPaymentResponse billingPayments(java.util.List<BillingPayment> billingPayments) {
    this.billingPayments = billingPayments;
    return this;
  }
  
  /**
   * addBillingPaymentsItem.
   *
   * @return BillingPaymentResponse
   **/
  public BillingPaymentResponse addBillingPaymentsItem(BillingPayment billingPaymentsItem) {
    if (this.billingPayments == null) {
      this.billingPayments = new java.util.ArrayList<>();
    }
    this.billingPayments.add(billingPaymentsItem);
    return this;
  }

  /**
   * Reserved: TBD.
   * @return billingPayments
   **/
  @Schema(description = "Reserved: TBD")
  public java.util.List<BillingPayment> getBillingPayments() {
    return billingPayments;
  }

  /**
   * setBillingPayments.
   **/
  public void setBillingPayments(java.util.List<BillingPayment> billingPayments) {
    this.billingPayments = billingPayments;
  }


  /**
   * Compares objects.
   *
   * @return true or false depending on comparison result.
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingPaymentResponse billingPaymentResponse = (BillingPaymentResponse) o;
    return Objects.equals(this.billingPayments, billingPaymentResponse.billingPayments);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(billingPayments);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingPaymentResponse {\n");
    
    sb.append("    billingPayments: ").append(toIndentedString(billingPayments)).append("\n");
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

