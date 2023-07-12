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
 * The getHMS options.
 */
public class GetHMSOptions extends GenericModel {

  protected String accept;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String accept;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing GetHMSOptions instance.
     *
     * @param getHmsOptions the instance to initialize the Builder with
     */
    private Builder(GetHMSOptions getHmsOptions) {
      this.accept = getHmsOptions.accept;
      this.authInstanceId = getHmsOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GetHMSOptions.
     *
     * @return the new GetHMSOptions instance
     */
    public GetHMSOptions build() {
      return new GetHMSOptions(this);
    }

    /**
     * Set the accept.
     *
     * @param accept the accept
     * @return the GetHMSOptions builder
     */
    public Builder accept(String accept) {
      this.accept = accept;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the GetHMSOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected GetHMSOptions() { }

  protected GetHMSOptions(Builder builder) {
    accept = builder.accept;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a GetHMSOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the accept.
   *
   * The type of the response:  or *_/_*.
   *
   * @return the accept
   */
  public String accept() {
    return accept;
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

