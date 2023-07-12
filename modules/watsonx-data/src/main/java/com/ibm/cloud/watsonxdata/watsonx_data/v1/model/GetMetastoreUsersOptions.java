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
 * The getMetastoreUsers options.
 */
public class GetMetastoreUsersOptions extends GenericModel {

  protected String metastoreName;
  protected String lhInstanceId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String metastoreName;
    private String lhInstanceId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing GetMetastoreUsersOptions instance.
     *
     * @param getMetastoreUsersOptions the instance to initialize the Builder with
     */
    private Builder(GetMetastoreUsersOptions getMetastoreUsersOptions) {
      this.metastoreName = getMetastoreUsersOptions.metastoreName;
      this.lhInstanceId = getMetastoreUsersOptions.lhInstanceId;
      this.authInstanceId = getMetastoreUsersOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param metastoreName the metastoreName
     */
    public Builder(String metastoreName) {
      this.metastoreName = metastoreName;
    }

    /**
     * Builds a GetMetastoreUsersOptions.
     *
     * @return the new GetMetastoreUsersOptions instance
     */
    public GetMetastoreUsersOptions build() {
      return new GetMetastoreUsersOptions(this);
    }

    /**
     * Set the metastoreName.
     *
     * @param metastoreName the metastoreName
     * @return the GetMetastoreUsersOptions builder
     */
    public Builder metastoreName(String metastoreName) {
      this.metastoreName = metastoreName;
      return this;
    }

    /**
     * Set the lhInstanceId.
     *
     * @param lhInstanceId the lhInstanceId
     * @return the GetMetastoreUsersOptions builder
     */
    public Builder lhInstanceId(String lhInstanceId) {
      this.lhInstanceId = lhInstanceId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the GetMetastoreUsersOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected GetMetastoreUsersOptions() { }

  protected GetMetastoreUsersOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.metastoreName,
      "metastoreName cannot be empty");
    metastoreName = builder.metastoreName;
    lhInstanceId = builder.lhInstanceId;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a GetMetastoreUsersOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the metastoreName.
   *
   * Metastore name for GET.
   *
   * @return the metastoreName
   */
  public String metastoreName() {
    return metastoreName;
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

