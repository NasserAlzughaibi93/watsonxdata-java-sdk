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
 * The deleteDataPolicy options.
 */
public class DeleteDataPolicyOptions extends GenericModel {

  protected String policyName;
  protected String lhInstanceId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String policyName;
    private String lhInstanceId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing DeleteDataPolicyOptions instance.
     *
     * @param deleteDataPolicyOptions the instance to initialize the Builder with
     */
    private Builder(DeleteDataPolicyOptions deleteDataPolicyOptions) {
      this.policyName = deleteDataPolicyOptions.policyName;
      this.lhInstanceId = deleteDataPolicyOptions.lhInstanceId;
      this.authInstanceId = deleteDataPolicyOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param policyName the policyName
     */
    public Builder(String policyName) {
      this.policyName = policyName;
    }

    /**
     * Builds a DeleteDataPolicyOptions.
     *
     * @return the new DeleteDataPolicyOptions instance
     */
    public DeleteDataPolicyOptions build() {
      return new DeleteDataPolicyOptions(this);
    }

    /**
     * Set the policyName.
     *
     * @param policyName the policyName
     * @return the DeleteDataPolicyOptions builder
     */
    public Builder policyName(String policyName) {
      this.policyName = policyName;
      return this;
    }

    /**
     * Set the lhInstanceId.
     *
     * @param lhInstanceId the lhInstanceId
     * @return the DeleteDataPolicyOptions builder
     */
    public Builder lhInstanceId(String lhInstanceId) {
      this.lhInstanceId = lhInstanceId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the DeleteDataPolicyOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected DeleteDataPolicyOptions() { }

  protected DeleteDataPolicyOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.policyName,
      "policyName cannot be empty");
    policyName = builder.policyName;
    lhInstanceId = builder.lhInstanceId;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a DeleteDataPolicyOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the policyName.
   *
   * Policy name for DELETE.
   *
   * @return the policyName
   */
  public String policyName() {
    return policyName;
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
}

