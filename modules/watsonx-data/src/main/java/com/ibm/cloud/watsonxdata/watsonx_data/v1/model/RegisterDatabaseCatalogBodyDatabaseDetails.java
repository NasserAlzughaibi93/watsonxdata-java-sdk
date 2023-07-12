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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * database details.
 */
public class RegisterDatabaseCatalogBodyDatabaseDetails extends GenericModel {

  protected String password;
  protected String port;
  protected Boolean ssl;
  protected String tables;
  protected String username;
  @SerializedName("database_name")
  protected String databaseName;
  protected String hostname;

  /**
   * Builder.
   */
  public static class Builder {
    private String password;
    private String port;
    private Boolean ssl;
    private String tables;
    private String username;
    private String databaseName;
    private String hostname;

    /**
     * Instantiates a new Builder from an existing RegisterDatabaseCatalogBodyDatabaseDetails instance.
     *
     * @param registerDatabaseCatalogBodyDatabaseDetails the instance to initialize the Builder with
     */
    private Builder(RegisterDatabaseCatalogBodyDatabaseDetails registerDatabaseCatalogBodyDatabaseDetails) {
      this.password = registerDatabaseCatalogBodyDatabaseDetails.password;
      this.port = registerDatabaseCatalogBodyDatabaseDetails.port;
      this.ssl = registerDatabaseCatalogBodyDatabaseDetails.ssl;
      this.tables = registerDatabaseCatalogBodyDatabaseDetails.tables;
      this.username = registerDatabaseCatalogBodyDatabaseDetails.username;
      this.databaseName = registerDatabaseCatalogBodyDatabaseDetails.databaseName;
      this.hostname = registerDatabaseCatalogBodyDatabaseDetails.hostname;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a RegisterDatabaseCatalogBodyDatabaseDetails.
     *
     * @return the new RegisterDatabaseCatalogBodyDatabaseDetails instance
     */
    public RegisterDatabaseCatalogBodyDatabaseDetails build() {
      return new RegisterDatabaseCatalogBodyDatabaseDetails(this);
    }

    /**
     * Set the password.
     *
     * @param password the password
     * @return the RegisterDatabaseCatalogBodyDatabaseDetails builder
     */
    public Builder password(String password) {
      this.password = password;
      return this;
    }

    /**
     * Set the port.
     *
     * @param port the port
     * @return the RegisterDatabaseCatalogBodyDatabaseDetails builder
     */
    public Builder port(String port) {
      this.port = port;
      return this;
    }

    /**
     * Set the ssl.
     *
     * @param ssl the ssl
     * @return the RegisterDatabaseCatalogBodyDatabaseDetails builder
     */
    public Builder ssl(Boolean ssl) {
      this.ssl = ssl;
      return this;
    }

    /**
     * Set the tables.
     *
     * @param tables the tables
     * @return the RegisterDatabaseCatalogBodyDatabaseDetails builder
     */
    public Builder tables(String tables) {
      this.tables = tables;
      return this;
    }

    /**
     * Set the username.
     *
     * @param username the username
     * @return the RegisterDatabaseCatalogBodyDatabaseDetails builder
     */
    public Builder username(String username) {
      this.username = username;
      return this;
    }

    /**
     * Set the databaseName.
     *
     * @param databaseName the databaseName
     * @return the RegisterDatabaseCatalogBodyDatabaseDetails builder
     */
    public Builder databaseName(String databaseName) {
      this.databaseName = databaseName;
      return this;
    }

    /**
     * Set the hostname.
     *
     * @param hostname the hostname
     * @return the RegisterDatabaseCatalogBodyDatabaseDetails builder
     */
    public Builder hostname(String hostname) {
      this.hostname = hostname;
      return this;
    }
  }

  protected RegisterDatabaseCatalogBodyDatabaseDetails() { }

  protected RegisterDatabaseCatalogBodyDatabaseDetails(Builder builder) {
    password = builder.password;
    port = builder.port;
    ssl = builder.ssl;
    tables = builder.tables;
    username = builder.username;
    databaseName = builder.databaseName;
    hostname = builder.hostname;
  }

  /**
   * New builder.
   *
   * @return a RegisterDatabaseCatalogBodyDatabaseDetails builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the password.
   *
   * Psssword.
   *
   * @return the password
   */
  public String password() {
    return password;
  }

  /**
   * Gets the port.
   *
   * Port.
   *
   * @return the port
   */
  public String port() {
    return port;
  }

  /**
   * Gets the ssl.
   *
   * SSL Mode.
   *
   * @return the ssl
   */
  public Boolean ssl() {
    return ssl;
  }

  /**
   * Gets the tables.
   *
   * Only for Kafka - Add kafka tables.
   *
   * @return the tables
   */
  public String tables() {
    return tables;
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

  /**
   * Gets the databaseName.
   *
   * Database name.
   *
   * @return the databaseName
   */
  public String databaseName() {
    return databaseName;
  }

  /**
   * Gets the hostname.
   *
   * Host name.
   *
   * @return the hostname
   */
  public String hostname() {
    return hostname;
  }
}

