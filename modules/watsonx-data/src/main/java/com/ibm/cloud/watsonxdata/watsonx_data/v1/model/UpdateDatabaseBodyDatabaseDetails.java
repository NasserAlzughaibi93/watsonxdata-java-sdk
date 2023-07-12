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
 * database details.
 */
public class UpdateDatabaseBodyDatabaseDetails extends GenericModel {

  protected String password;
  protected String username;

  /**
   * Builder.
   */
  public static class Builder {
    private String password;
    private String username;

    /**
     * Instantiates a new Builder from an existing UpdateDatabaseBodyDatabaseDetails instance.
     *
     * @param updateDatabaseBodyDatabaseDetails the instance to initialize the Builder with
     */
    private Builder(UpdateDatabaseBodyDatabaseDetails updateDatabaseBodyDatabaseDetails) {
      this.password = updateDatabaseBodyDatabaseDetails.password;
      this.username = updateDatabaseBodyDatabaseDetails.username;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdateDatabaseBodyDatabaseDetails.
     *
     * @return the new UpdateDatabaseBodyDatabaseDetails instance
     */
    public UpdateDatabaseBodyDatabaseDetails build() {
      return new UpdateDatabaseBodyDatabaseDetails(this);
    }

    /**
     * Set the password.
     *
     * @param password the password
     * @return the UpdateDatabaseBodyDatabaseDetails builder
     */
    public Builder password(String password) {
      this.password = password;
      return this;
    }

    /**
     * Set the username.
     *
     * @param username the username
     * @return the UpdateDatabaseBodyDatabaseDetails builder
     */
    public Builder username(String username) {
      this.username = username;
      return this;
    }
  }

  protected UpdateDatabaseBodyDatabaseDetails() { }

  protected UpdateDatabaseBodyDatabaseDetails(Builder builder) {
    password = builder.password;
    username = builder.username;
  }

  /**
   * New builder.
   *
   * @return a UpdateDatabaseBodyDatabaseDetails builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the password.
   *
   * Password.
   *
   * @return the password
   */
  public String password() {
    return password;
  }

  /**
   * Gets the username.
   *
   * Username.
   *
   * @return the username
   */
  public String username() {
    return username;
  }
}

