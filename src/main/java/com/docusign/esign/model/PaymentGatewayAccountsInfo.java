package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.PaymentGatewayAccount;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * Holds information about connected payment accounts..
 *
 */
@Schema(description = "Holds information about connected payment accounts.")

public class PaymentGatewayAccountsInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("paymentGatewayAccounts")
  private java.util.List<PaymentGatewayAccount> paymentGatewayAccounts = null;


  /**
   * paymentGatewayAccounts.
   *
   * @return PaymentGatewayAccountsInfo
   **/
  public PaymentGatewayAccountsInfo paymentGatewayAccounts(java.util.List<PaymentGatewayAccount> paymentGatewayAccounts) {
    this.paymentGatewayAccounts = paymentGatewayAccounts;
    return this;
  }
  
  /**
   * addPaymentGatewayAccountsItem.
   *
   * @return PaymentGatewayAccountsInfo
   **/
  public PaymentGatewayAccountsInfo addPaymentGatewayAccountsItem(PaymentGatewayAccount paymentGatewayAccountsItem) {
    if (this.paymentGatewayAccounts == null) {
      this.paymentGatewayAccounts = new java.util.ArrayList<>();
    }
    this.paymentGatewayAccounts.add(paymentGatewayAccountsItem);
    return this;
  }

  /**
   * .
   * @return paymentGatewayAccounts
   **/
  @Schema(description = "")
  public java.util.List<PaymentGatewayAccount> getPaymentGatewayAccounts() {
    return paymentGatewayAccounts;
  }

  /**
   * setPaymentGatewayAccounts.
   **/
  public void setPaymentGatewayAccounts(java.util.List<PaymentGatewayAccount> paymentGatewayAccounts) {
    this.paymentGatewayAccounts = paymentGatewayAccounts;
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
    PaymentGatewayAccountsInfo paymentGatewayAccountsInfo = (PaymentGatewayAccountsInfo) o;
    return Objects.equals(this.paymentGatewayAccounts, paymentGatewayAccountsInfo.paymentGatewayAccounts);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(paymentGatewayAccounts);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentGatewayAccountsInfo {\n");
    
    sb.append("    paymentGatewayAccounts: ").append(toIndentedString(paymentGatewayAccounts)).append("\n");
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

