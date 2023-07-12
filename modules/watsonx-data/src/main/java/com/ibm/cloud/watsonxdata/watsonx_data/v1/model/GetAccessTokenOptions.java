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
 * The getAccessToken options.
 */
public class GetAccessTokenOptions extends GenericModel {

  protected String instanceName;
  protected String password;
  protected String username;
  protected String instanceId;
  protected String authInstanceId;
  protected Boolean setCookie;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceName;
    private String password;
    private String username;
    private String instanceId;
    private String authInstanceId;
    private Boolean setCookie;

    /**
     * Instantiates a new Builder from an existing GetAccessTokenOptions instance.
     *
     * @param getAccessTokenOptions the instance to initialize the Builder with
     */
    private Builder(GetAccessTokenOptions getAccessTokenOptions) {
      this.instanceName = getAccessTokenOptions.instanceName;
      this.password = getAccessTokenOptions.password;
      this.username = getAccessTokenOptions.username;
      this.instanceId = getAccessTokenOptions.instanceId;
      this.authInstanceId = getAccessTokenOptions.authInstanceId;
      this.setCookie = getAccessTokenOptions.setCookie;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GetAccessTokenOptions.
     *
     * @return the new GetAccessTokenOptions instance
     */
    public GetAccessTokenOptions build() {
      return new GetAccessTokenOptions(this);
    }

    /**
     * Set the instanceName.
     *
     * @param instanceName the instanceName
     * @return the GetAccessTokenOptions builder
     */
    public Builder instanceName(String instanceName) {
      this.instanceName = instanceName;
      return this;
    }

    /**
     * Set the password.
     *
     * @param password the password
     * @return the GetAccessTokenOptions builder
     */
    public Builder password(String password) {
      this.password = password;
      return this;
    }

    /**
     * Set the username.
     *
     * @param username the username
     * @return the GetAccessTokenOptions builder
     */
    public Builder username(String username) {
      this.username = username;
      return this;
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the GetAccessTokenOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the GetAccessTokenOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }

    /**
     * Set the setCookie.
     *
     * @param setCookie the setCookie
     * @return the GetAccessTokenOptions builder
     */
    public Builder setCookie(Boolean setCookie) {
      this.setCookie = setCookie;
      return this;
    }
  }

  protected GetAccessTokenOptions() { }

  protected GetAccessTokenOptions(Builder builder) {
    instanceName = builder.instanceName;
    password = builder.password;
    username = builder.username;
    instanceId = builder.instanceId;
    authInstanceId = builder.authInstanceId;
    setCookie = builder.setCookie;
  }

  /**
   * New builder.
   *
   * @return a GetAccessTokenOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the instanceName.
   *
   * Instance name.
   *
   * @return the instanceName
   */
  public String instanceName() {
    return instanceName;
  }

  /**
   * Gets the password.
   *
   * Password can be apikey or token or password. On sw_ent if username is ibmapikey, password is base64-encoded of
   * "username:apikey".
   *
   * @return the password
   */
  public String password() {
    return password;
  }

  /**
   * Gets the username.
   *
   * Format is usertype[_username].
   *
   * @return the username
   */
  public String username() {
    return username;
  }

  /**
   * Gets the instanceId.
   *
   * Instance id.
   *
   * @return the instanceId
   */
  public String instanceId() {
    return instanceId;
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
   * Gets the setCookie.
   *
   * If this is set to true, then cookie with that instance id is generated.
   *
   * @return the setCookie
   */
  public Boolean setCookie() {
    return setCookie;
  }
}

