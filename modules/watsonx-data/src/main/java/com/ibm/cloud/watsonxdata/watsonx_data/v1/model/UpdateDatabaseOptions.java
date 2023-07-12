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
 * The updateDatabase options.
 */
public class UpdateDatabaseOptions extends GenericModel {

  protected String databaseId;
  protected String accept;
  protected UpdateDatabaseBodyDatabaseDetails databaseDetails;
  protected String databaseDisplayName;
  protected String description;
  protected List<String> tags;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String databaseId;
    private String accept;
    private UpdateDatabaseBodyDatabaseDetails databaseDetails;
    private String databaseDisplayName;
    private String description;
    private List<String> tags;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing UpdateDatabaseOptions instance.
     *
     * @param updateDatabaseOptions the instance to initialize the Builder with
     */
    private Builder(UpdateDatabaseOptions updateDatabaseOptions) {
      this.databaseId = updateDatabaseOptions.databaseId;
      this.accept = updateDatabaseOptions.accept;
      this.databaseDetails = updateDatabaseOptions.databaseDetails;
      this.databaseDisplayName = updateDatabaseOptions.databaseDisplayName;
      this.description = updateDatabaseOptions.description;
      this.tags = updateDatabaseOptions.tags;
      this.authInstanceId = updateDatabaseOptions.authInstanceId;
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
     * Builds a UpdateDatabaseOptions.
     *
     * @return the new UpdateDatabaseOptions instance
     */
    public UpdateDatabaseOptions build() {
      return new UpdateDatabaseOptions(this);
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the UpdateDatabaseOptions builder
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
     * Set the databaseId.
     *
     * @param databaseId the databaseId
     * @return the UpdateDatabaseOptions builder
     */
    public Builder databaseId(String databaseId) {
      this.databaseId = databaseId;
      return this;
    }

    /**
     * Set the accept.
     *
     * @param accept the accept
     * @return the UpdateDatabaseOptions builder
     */
    public Builder accept(String accept) {
      this.accept = accept;
      return this;
    }

    /**
     * Set the databaseDetails.
     *
     * @param databaseDetails the databaseDetails
     * @return the UpdateDatabaseOptions builder
     */
    public Builder databaseDetails(UpdateDatabaseBodyDatabaseDetails databaseDetails) {
      this.databaseDetails = databaseDetails;
      return this;
    }

    /**
     * Set the databaseDisplayName.
     *
     * @param databaseDisplayName the databaseDisplayName
     * @return the UpdateDatabaseOptions builder
     */
    public Builder databaseDisplayName(String databaseDisplayName) {
      this.databaseDisplayName = databaseDisplayName;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the UpdateDatabaseOptions builder
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
     * @return the UpdateDatabaseOptions builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the UpdateDatabaseOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected UpdateDatabaseOptions() { }

  protected UpdateDatabaseOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.databaseId,
      "databaseId cannot be null");
    databaseId = builder.databaseId;
    accept = builder.accept;
    databaseDetails = builder.databaseDetails;
    databaseDisplayName = builder.databaseDisplayName;
    description = builder.description;
    tags = builder.tags;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a UpdateDatabaseOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the databaseId.
   *
   * Database ID.
   *
   * @return the databaseId
   */
  public String databaseId() {
    return databaseId;
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
  public UpdateDatabaseBodyDatabaseDetails databaseDetails() {
    return databaseDetails;
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

