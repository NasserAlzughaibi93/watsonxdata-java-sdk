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
 * The refreshToken options.
 */
public class RefreshTokenOptions extends GenericModel {

  protected Boolean setCookie;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean setCookie;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing RefreshTokenOptions instance.
     *
     * @param refreshTokenOptions the instance to initialize the Builder with
     */
    private Builder(RefreshTokenOptions refreshTokenOptions) {
      this.setCookie = refreshTokenOptions.setCookie;
      this.authInstanceId = refreshTokenOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a RefreshTokenOptions.
     *
     * @return the new RefreshTokenOptions instance
     */
    public RefreshTokenOptions build() {
      return new RefreshTokenOptions(this);
    }

    /**
     * Set the setCookie.
     *
     * @param setCookie the setCookie
     * @return the RefreshTokenOptions builder
     */
    public Builder setCookie(Boolean setCookie) {
      this.setCookie = setCookie;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the RefreshTokenOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected RefreshTokenOptions() { }

  protected RefreshTokenOptions(Builder builder) {
    setCookie = builder.setCookie;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a RefreshTokenOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the setCookie.
   *
   * If this is set to true, then cookie with that instance id is generated.
   *
   * @return the setCookie
   */
  public Boolean setCookie() {
    return setCookie;
  }

  /**
   * Gets the authInstanceId.
   *
   * AuthInstanceId or instanceID.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

