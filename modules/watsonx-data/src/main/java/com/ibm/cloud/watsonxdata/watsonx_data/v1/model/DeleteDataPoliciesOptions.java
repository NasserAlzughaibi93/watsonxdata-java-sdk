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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The deleteDataPolicies options.
 */
public class DeleteDataPoliciesOptions extends GenericModel {

  protected List<String> dataPolicies;
  protected String lhInstanceId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> dataPolicies;
    private String lhInstanceId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing DeleteDataPoliciesOptions instance.
     *
     * @param deleteDataPoliciesOptions the instance to initialize the Builder with
     */
    private Builder(DeleteDataPoliciesOptions deleteDataPoliciesOptions) {
      this.dataPolicies = deleteDataPoliciesOptions.dataPolicies;
      this.lhInstanceId = deleteDataPoliciesOptions.lhInstanceId;
      this.authInstanceId = deleteDataPoliciesOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DeleteDataPoliciesOptions.
     *
     * @return the new DeleteDataPoliciesOptions instance
     */
    public DeleteDataPoliciesOptions build() {
      return new DeleteDataPoliciesOptions(this);
    }

    /**
     * Adds an dataPolicies to dataPolicies.
     *
     * @param dataPolicies the new dataPolicies
     * @return the DeleteDataPoliciesOptions builder
     */
    public Builder addDataPolicies(String dataPolicies) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(dataPolicies,
        "dataPolicies cannot be null");
      if (this.dataPolicies == null) {
        this.dataPolicies = new ArrayList<String>();
      }
      this.dataPolicies.add(dataPolicies);
      return this;
    }

    /**
     * Set the dataPolicies.
     * Existing dataPolicies will be replaced.
     *
     * @param dataPolicies the dataPolicies
     * @return the DeleteDataPoliciesOptions builder
     */
    public Builder dataPolicies(List<String> dataPolicies) {
      this.dataPolicies = dataPolicies;
      return this;
    }

    /**
     * Set the lhInstanceId.
     *
     * @param lhInstanceId the lhInstanceId
     * @return the DeleteDataPoliciesOptions builder
     */
    public Builder lhInstanceId(String lhInstanceId) {
      this.lhInstanceId = lhInstanceId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the DeleteDataPoliciesOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected DeleteDataPoliciesOptions() { }

  protected DeleteDataPoliciesOptions(Builder builder) {
    dataPolicies = builder.dataPolicies;
    lhInstanceId = builder.lhInstanceId;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a DeleteDataPoliciesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the dataPolicies.
   *
   * data policy names array to be deleted.
   *
   * @return the dataPolicies
   */
  public List<String> dataPolicies() {
    return dataPolicies;
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

