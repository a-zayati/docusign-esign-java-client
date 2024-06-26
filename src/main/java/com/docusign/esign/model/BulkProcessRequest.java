package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * BulkProcessRequest.
 *
 */

public class BulkProcessRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("batchName")
  private String batchName = null;

  @JsonProperty("envelopeOrTemplateId")
  private String envelopeOrTemplateId = null;


  /**
   * batchName.
   *
   * @return BulkProcessRequest
   **/
  public BulkProcessRequest batchName(String batchName) {
    this.batchName = batchName;
    return this;
  }

  /**
   * .
   * @return batchName
   **/
  @Schema(description = "")
  public String getBatchName() {
    return batchName;
  }

  /**
   * setBatchName.
   **/
  public void setBatchName(String batchName) {
    this.batchName = batchName;
  }


  /**
   * envelopeOrTemplateId.
   *
   * @return BulkProcessRequest
   **/
  public BulkProcessRequest envelopeOrTemplateId(String envelopeOrTemplateId) {
    this.envelopeOrTemplateId = envelopeOrTemplateId;
    return this;
  }

  /**
   * .
   * @return envelopeOrTemplateId
   **/
  @Schema(description = "")
  public String getEnvelopeOrTemplateId() {
    return envelopeOrTemplateId;
  }

  /**
   * setEnvelopeOrTemplateId.
   **/
  public void setEnvelopeOrTemplateId(String envelopeOrTemplateId) {
    this.envelopeOrTemplateId = envelopeOrTemplateId;
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
    BulkProcessRequest bulkProcessRequest = (BulkProcessRequest) o;
    return Objects.equals(this.batchName, bulkProcessRequest.batchName) &&
        Objects.equals(this.envelopeOrTemplateId, bulkProcessRequest.envelopeOrTemplateId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(batchName, envelopeOrTemplateId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkProcessRequest {\n");
    
    sb.append("    batchName: ").append(toIndentedString(batchName)).append("\n");
    sb.append("    envelopeOrTemplateId: ").append(toIndentedString(envelopeOrTemplateId)).append("\n");
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

