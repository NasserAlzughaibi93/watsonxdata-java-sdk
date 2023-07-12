/*
 * (C) Copyright IBM Corp. 2023.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.watsonxdata.watsonx_data.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listDataPolicies options.
 */
public class ListDataPoliciesOptions extends GenericModel {

  protected String lhInstanceId;
  protected String authInstanceId;
  protected String catalogName;
  protected String status;
  protected Boolean includeMetadata;
  protected Boolean includeRules;

  /**
   * Builder.
   */
  public static class Builder {
    private String lhInstanceId;
    private String authInstanceId;
    private String catalogName;
    private String status;
    private Boolean includeMetadata;
    private Boolean includeRules;

    /**
     * Instantiates a new Builder from an existing ListDataPoliciesOptions instance.
     *
     * @param listDataPoliciesOptions the instance to initialize the Builder with
     */
    private Builder(ListDataPoliciesOptions listDataPoliciesOptions) {
      this.lhInstanceId = listDataPoliciesOptions.lhInstanceId;
      this.authInstanceId = listDataPoliciesOptions.authInstanceId;
      this.catalogName = listDataPoliciesOptions.catalogName;
      this.status = listDataPoliciesOptions.status;
      this.includeMetadata = listDataPoliciesOptions.includeMetadata;
      this.includeRules = listDataPoliciesOptions.includeRules;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListDataPoliciesOptions.
     *
     * @return the new ListDataPoliciesOptions instance
     */
    public ListDataPoliciesOptions build() {
      return new ListDataPoliciesOptions(this);
    }

    /**
     * Set the lhInstanceId.
     *
     * @param lhInstanceId the lhInstanceId
     * @return the ListDataPoliciesOptions builder
     */
    public Builder lhInstanceId(String lhInstanceId) {
      this.lhInstanceId = lhInstanceId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the ListDataPoliciesOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the ListDataPoliciesOptions builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the status.
     *
     * @param status the status
     * @return the ListDataPoliciesOptions builder
     */
    public Builder status(String status) {
      this.status = status;
      return this;
    }

    /**
     * Set the includeMetadata.
     *
     * @param includeMetadata the includeMetadata
     * @return the ListDataPoliciesOptions builder
     */
    public Builder includeMetadata(Boolean includeMetadata) {
      this.includeMetadata = includeMetadata;
      return this;
    }

    /**
     * Set the includeRules.
     *
     * @param includeRules the includeRules
     * @return the ListDataPoliciesOptions builder
     */
    public Builder includeRules(Boolean includeRules) {
      this.includeRules = includeRules;
      return this;
    }
  }

  protected ListDataPoliciesOptions() { }

  protected ListDataPoliciesOptions(Builder builder) {
    lhInstanceId = builder.lhInstanceId;
    authInstanceId = builder.authInstanceId;
    catalogName = builder.catalogName;
    status = builder.status;
    includeMetadata = builder.includeMetadata;
    includeRules = builder.includeRules;
  }

  /**
   * New builder.
   *
   * @return a ListDataPoliciesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the lhInstanceId.
   *
   * Lake House Instance ID.
   *
   * @return the lhInstanceId
   */
  public String lhInstanceId() {
    return lhInstanceId;
  }

  /**
   * Gets the authInstanceId.
   *
   * Instance ID.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }

  /**
   * Gets the catalogName.
   *
   * catalog name to filter.
   *
   * @return the catalogName
   */
  public String catalogName() {
    return catalogName;
  }

  /**
   * Gets the status.
   *
   * policy status to filter.
   *
   * @return the status
   */
  public String status() {
    return status;
  }

  /**
   * Gets the includeMetadata.
   *
   * response will include data policy meta data or not.
   *
   * @return the includeMetadata
   */
  public Boolean includeMetadata() {
    return includeMetadata;
  }

  /**
   * Gets the includeRules.
   *
   * response will include data policy rules or not.
   *
   * @return the includeRules
   */
  public Boolean includeRules() {
    return includeRules;
  }
}

