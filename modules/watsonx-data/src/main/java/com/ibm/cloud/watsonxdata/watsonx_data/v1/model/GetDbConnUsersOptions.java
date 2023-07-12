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
 * The getDbConnUsers options.
 */
public class GetDbConnUsersOptions extends GenericModel {

  protected String databaseId;
  protected String lhInstanceId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String databaseId;
    private String lhInstanceId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing GetDbConnUsersOptions instance.
     *
     * @param getDbConnUsersOptions the instance to initialize the Builder with
     */
    private Builder(GetDbConnUsersOptions getDbConnUsersOptions) {
      this.databaseId = getDbConnUsersOptions.databaseId;
      this.lhInstanceId = getDbConnUsersOptions.lhInstanceId;
      this.authInstanceId = getDbConnUsersOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param databaseId the databaseId
     */
    public Builder(String databaseId) {
      this.databaseId = databaseId;
    }

    /**
     * Builds a GetDbConnUsersOptions.
     *
     * @return the new GetDbConnUsersOptions instance
     */
    public GetDbConnUsersOptions build() {
      return new GetDbConnUsersOptions(this);
    }

    /**
     * Set the databaseId.
     *
     * @param databaseId the databaseId
     * @return the GetDbConnUsersOptions builder
     */
    public Builder databaseId(String databaseId) {
      this.databaseId = databaseId;
      return this;
    }

    /**
     * Set the lhInstanceId.
     *
     * @param lhInstanceId the lhInstanceId
     * @return the GetDbConnUsersOptions builder
     */
    public Builder lhInstanceId(String lhInstanceId) {
      this.lhInstanceId = lhInstanceId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the GetDbConnUsersOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected GetDbConnUsersOptions() { }

  protected GetDbConnUsersOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.databaseId,
      "databaseId cannot be empty");
    databaseId = builder.databaseId;
    lhInstanceId = builder.lhInstanceId;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a GetDbConnUsersOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the databaseId.
   *
   * Db connection id for GET.
   *
   * @return the databaseId
   */
  public String databaseId() {
    return databaseId;
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

