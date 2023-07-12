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
 * The createDatabaseCatalog options.
 */
public class CreateDatabaseCatalogOptions extends GenericModel {

  /**
   * Connector type.
   */
  public interface DatabaseType {
    /** mysql. */
    String MYSQL = "mysql";
    /** postgresql. */
    String POSTGRESQL = "postgresql";
    /** netezza. */
    String NETEZZA = "netezza";
    /** db2. */
    String DB2 = "db2";
    /** mongodb. */
    String MONGODB = "mongodb";
    /** kafka. */
    String KAFKA = "kafka";
    /** tpcds. */
    String TPCDS = "tpcds";
    /** tpch. */
    String TPCH = "tpch";
    /** system. */
    String SYSTEM = "system";
    /** jmx. */
    String JMX = "jmx";
    /** memory. */
    String MEMORY = "memory";
  }

  protected String databaseDisplayName;
  protected String databaseType;
  protected String catalogName;
  protected String accept;
  protected RegisterDatabaseCatalogBodyDatabaseDetails databaseDetails;
  protected String description;
  protected List<String> tags;
  protected String createdBy;
  protected Long createdOn;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String databaseDisplayName;
    private String databaseType;
    private String catalogName;
    private String accept;
    private RegisterDatabaseCatalogBodyDatabaseDetails databaseDetails;
    private String description;
    private List<String> tags;
    private String createdBy;
    private Long createdOn;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateDatabaseCatalogOptions instance.
     *
     * @param createDatabaseCatalogOptions the instance to initialize the Builder with
     */
    private Builder(CreateDatabaseCatalogOptions createDatabaseCatalogOptions) {
      this.databaseDisplayName = createDatabaseCatalogOptions.databaseDisplayName;
      this.databaseType = createDatabaseCatalogOptions.databaseType;
      this.catalogName = createDatabaseCatalogOptions.catalogName;
      this.accept = createDatabaseCatalogOptions.accept;
      this.databaseDetails = createDatabaseCatalogOptions.databaseDetails;
      this.description = createDatabaseCatalogOptions.description;
      this.tags = createDatabaseCatalogOptions.tags;
      this.createdBy = createDatabaseCatalogOptions.createdBy;
      this.createdOn = createDatabaseCatalogOptions.createdOn;
      this.authInstanceId = createDatabaseCatalogOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param databaseDisplayName the databaseDisplayName
     * @param databaseType the databaseType
     * @param catalogName the catalogName
     */
    public Builder(String databaseDisplayName, String databaseType, String catalogName) {
      this.databaseDisplayName = databaseDisplayName;
      this.databaseType = databaseType;
      this.catalogName = catalogName;
    }

    /**
     * Builds a CreateDatabaseCatalogOptions.
     *
     * @return the new CreateDatabaseCatalogOptions instance
     */
    public CreateDatabaseCatalogOptions build() {
      return new CreateDatabaseCatalogOptions(this);
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the CreateDatabaseCatalogOptions builder
     */
    public Builder addTags(String tags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tags,
        "tags cannot be null");
      if (this.tags == null) {
        this.tags = new ArrayList<String>();
      }
      this.tags.add(tags);
      return this;
    }

    /**
     * Set the databaseDisplayName.
     *
     * @param databaseDisplayName the databaseDisplayName
     * @return the CreateDatabaseCatalogOptions builder
     */
    public Builder databaseDisplayName(String databaseDisplayName) {
      this.databaseDisplayName = databaseDisplayName;
      return this;
    }

    /**
     * Set the databaseType.
     *
     * @param databaseType the databaseType
     * @return the CreateDatabaseCatalogOptions builder
     */
    public Builder databaseType(String databaseType) {
      this.databaseType = databaseType;
      return this;
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the CreateDatabaseCatalogOptions builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the accept.
     *
     * @param accept the accept
     * @return the CreateDatabaseCatalogOptions builder
     */
    public Builder accept(String accept) {
      this.accept = accept;
      return this;
    }

    /**
     * Set the databaseDetails.
     *
     * @param databaseDetails the databaseDetails
     * @return the CreateDatabaseCatalogOptions builder
     */
    public Builder databaseDetails(RegisterDatabaseCatalogBodyDatabaseDetails databaseDetails) {
      this.databaseDetails = databaseDetails;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateDatabaseCatalogOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the CreateDatabaseCatalogOptions builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the createdBy.
     *
     * @param createdBy the createdBy
     * @return the CreateDatabaseCatalogOptions builder
     */
    public Builder createdBy(String createdBy) {
      this.createdBy = createdBy;
      return this;
    }

    /**
     * Set the createdOn.
     *
     * @param createdOn the createdOn
     * @return the CreateDatabaseCatalogOptions builder
     */
    public Builder createdOn(long createdOn) {
      this.createdOn = createdOn;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreateDatabaseCatalogOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected CreateDatabaseCatalogOptions() { }

  protected CreateDatabaseCatalogOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.databaseDisplayName,
      "databaseDisplayName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.databaseType,
      "databaseType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.catalogName,
      "catalogName cannot be null");
    databaseDisplayName = builder.databaseDisplayName;
    databaseType = builder.databaseType;
    catalogName = builder.catalogName;
    accept = builder.accept;
    databaseDetails = builder.databaseDetails;
    description = builder.description;
    tags = builder.tags;
    createdBy = builder.createdBy;
    createdOn = builder.createdOn;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a CreateDatabaseCatalogOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the databaseDisplayName.
   *
   * Database display name.
   *
   * @return the databaseDisplayName
   */
  public String databaseDisplayName() {
    return databaseDisplayName;
  }

  /**
   * Gets the databaseType.
   *
   * Connector type.
   *
   * @return the databaseType
   */
  public String databaseType() {
    return databaseType;
  }

  /**
   * Gets the catalogName.
   *
   * Catalog name of the new catalog to be created with database.
   *
   * @return the catalogName
   */
  public String catalogName() {
    return catalogName;
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
   * Gets the databaseDetails.
   *
   * database details.
   *
   * @return the databaseDetails
   */
  public RegisterDatabaseCatalogBodyDatabaseDetails databaseDetails() {
    return databaseDetails;
  }

  /**
   * Gets the description.
   *
   * Database description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the tags.
   *
   * tags.
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
  }

  /**
   * Gets the createdBy.
   *
   * Created by.
   *
   * @return the createdBy
   */
  public String createdBy() {
    return createdBy;
  }

  /**
   * Gets the createdOn.
   *
   * Created on.
   *
   * @return the createdOn
   */
  public Long createdOn() {
    return createdOn;
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

