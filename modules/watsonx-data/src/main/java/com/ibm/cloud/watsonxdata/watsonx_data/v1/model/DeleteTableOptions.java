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
 * The deleteTable options.
 */
public class DeleteTableOptions extends GenericModel {

  protected List<DeleteTableBodyDeleteTablesItems> deleteTables;
  protected String engineId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private List<DeleteTableBodyDeleteTablesItems> deleteTables;
    private String engineId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing DeleteTableOptions instance.
     *
     * @param deleteTableOptions the instance to initialize the Builder with
     */
    private Builder(DeleteTableOptions deleteTableOptions) {
      this.deleteTables = deleteTableOptions.deleteTables;
      this.engineId = deleteTableOptions.engineId;
      this.authInstanceId = deleteTableOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param deleteTables the deleteTables
     * @param engineId the engineId
     */
    public Builder(List<DeleteTableBodyDeleteTablesItems> deleteTables, String engineId) {
      this.deleteTables = deleteTables;
      this.engineId = engineId;
    }

    /**
     * Builds a DeleteTableOptions.
     *
     * @return the new DeleteTableOptions instance
     */
    public DeleteTableOptions build() {
      return new DeleteTableOptions(this);
    }

    /**
     * Adds an deleteTables to deleteTables.
     *
     * @param deleteTables the new deleteTables
     * @return the DeleteTableOptions builder
     */
    public Builder addDeleteTables(DeleteTableBodyDeleteTablesItems deleteTables) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(deleteTables,
        "deleteTables cannot be null");
      if (this.deleteTables == null) {
        this.deleteTables = new ArrayList<DeleteTableBodyDeleteTablesItems>();
      }
      this.deleteTables.add(deleteTables);
      return this;
    }

    /**
     * Set the deleteTables.
     * Existing deleteTables will be replaced.
     *
     * @param deleteTables the deleteTables
     * @return the DeleteTableOptions builder
     */
    public Builder deleteTables(List<DeleteTableBodyDeleteTablesItems> deleteTables) {
      this.deleteTables = deleteTables;
      return this;
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the DeleteTableOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the DeleteTableOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected DeleteTableOptions() { }

  protected DeleteTableOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.deleteTables,
      "deleteTables cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.engineId,
      "engineId cannot be null");
    deleteTables = builder.deleteTables;
    engineId = builder.engineId;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a DeleteTableOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the deleteTables.
   *
   * Delete table list.
   *
   * @return the deleteTables
   */
  public List<DeleteTableBodyDeleteTablesItems> deleteTables() {
    return deleteTables;
  }

  /**
   * Gets the engineId.
   *
   * Engine ID.
   *
   * @return the engineId
   */
  public String engineId() {
    return engineId;
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

