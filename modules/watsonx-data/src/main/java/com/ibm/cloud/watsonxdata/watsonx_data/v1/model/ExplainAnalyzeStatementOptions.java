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
 * The explainAnalyzeStatement options.
 */
public class ExplainAnalyzeStatementOptions extends GenericModel {

  protected String catalogName;
  protected String engineId;
  protected String schemaName;
  protected String statement;
  protected Boolean verbose;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String catalogName;
    private String engineId;
    private String schemaName;
    private String statement;
    private Boolean verbose;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing ExplainAnalyzeStatementOptions instance.
     *
     * @param explainAnalyzeStatementOptions the instance to initialize the Builder with
     */
    private Builder(ExplainAnalyzeStatementOptions explainAnalyzeStatementOptions) {
      this.catalogName = explainAnalyzeStatementOptions.catalogName;
      this.engineId = explainAnalyzeStatementOptions.engineId;
      this.schemaName = explainAnalyzeStatementOptions.schemaName;
      this.statement = explainAnalyzeStatementOptions.statement;
      this.verbose = explainAnalyzeStatementOptions.verbose;
      this.authInstanceId = explainAnalyzeStatementOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param catalogName the catalogName
     * @param engineId the engineId
     * @param schemaName the schemaName
     * @param statement the statement
     */
    public Builder(String catalogName, String engineId, String schemaName, String statement) {
      this.catalogName = catalogName;
      this.engineId = engineId;
      this.schemaName = schemaName;
      this.statement = statement;
    }

    /**
     * Builds a ExplainAnalyzeStatementOptions.
     *
     * @return the new ExplainAnalyzeStatementOptions instance
     */
    public ExplainAnalyzeStatementOptions build() {
      return new ExplainAnalyzeStatementOptions(this);
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the ExplainAnalyzeStatementOptions builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the ExplainAnalyzeStatementOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the schemaName.
     *
     * @param schemaName the schemaName
     * @return the ExplainAnalyzeStatementOptions builder
     */
    public Builder schemaName(String schemaName) {
      this.schemaName = schemaName;
      return this;
    }

    /**
     * Set the statement.
     *
     * @param statement the statement
     * @return the ExplainAnalyzeStatementOptions builder
     */
    public Builder statement(String statement) {
      this.statement = statement;
      return this;
    }

    /**
     * Set the verbose.
     *
     * @param verbose the verbose
     * @return the ExplainAnalyzeStatementOptions builder
     */
    public Builder verbose(Boolean verbose) {
      this.verbose = verbose;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the ExplainAnalyzeStatementOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected ExplainAnalyzeStatementOptions() { }

  protected ExplainAnalyzeStatementOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.catalogName,
      "catalogName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.engineId,
      "engineId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.schemaName,
      "schemaName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.statement,
      "statement cannot be null");
    catalogName = builder.catalogName;
    engineId = builder.engineId;
    schemaName = builder.schemaName;
    statement = builder.statement;
    verbose = builder.verbose;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a ExplainAnalyzeStatementOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the catalogName.
   *
   * Catalog name.
   *
   * @return the catalogName
   */
  public String catalogName() {
    return catalogName;
  }

  /**
   * Gets the engineId.
   *
   * Engine name.
   *
   * @return the engineId
   */
  public String engineId() {
    return engineId;
  }

  /**
   * Gets the schemaName.
   *
   * Schema name.
   *
   * @return the schemaName
   */
  public String schemaName() {
    return schemaName;
  }

  /**
   * Gets the statement.
   *
   * Statement.
   *
   * @return the statement
   */
  public String statement() {
    return statement;
  }

  /**
   * Gets the verbose.
   *
   * Verbose.
   *
   * @return the verbose
   */
  public Boolean verbose() {
    return verbose;
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

