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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Replace data policy.
 */
public class ReplaceDataPolicySchema extends GenericModel {

  /**
   * data policy status.
   */
  public interface Status {
    /** active. */
    String ACTIVE = "active";
    /** inactive. */
    String INACTIVE = "inactive";
  }

  @SerializedName("catalog_name")
  protected String catalogName;
  @SerializedName("data_artifact")
  protected String dataArtifact;
  protected String description;
  protected List<Rule> rules;
  protected String status;

  /**
   * Builder.
   */
  public static class Builder {
    private String catalogName;
    private String dataArtifact;
    private String description;
    private List<Rule> rules;
    private String status;

    /**
     * Instantiates a new Builder from an existing ReplaceDataPolicySchema instance.
     *
     * @param replaceDataPolicySchema the instance to initialize the Builder with
     */
    private Builder(ReplaceDataPolicySchema replaceDataPolicySchema) {
      this.catalogName = replaceDataPolicySchema.catalogName;
      this.dataArtifact = replaceDataPolicySchema.dataArtifact;
      this.description = replaceDataPolicySchema.description;
      this.rules = replaceDataPolicySchema.rules;
      this.status = replaceDataPolicySchema.status;
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
     * @param dataArtifact the dataArtifact
     * @param rules the rules
     */
    public Builder(String catalogName, String dataArtifact, List<Rule> rules) {
      this.catalogName = catalogName;
      this.dataArtifact = dataArtifact;
      this.rules = rules;
    }

    /**
     * Builds a ReplaceDataPolicySchema.
     *
     * @return the new ReplaceDataPolicySchema instance
     */
    public ReplaceDataPolicySchema build() {
      return new ReplaceDataPolicySchema(this);
    }

    /**
     * Adds an rules to rules.
     *
     * @param rules the new rules
     * @return the ReplaceDataPolicySchema builder
     */
    public Builder addRules(Rule rules) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(rules,
        "rules cannot be null");
      if (this.rules == null) {
        this.rules = new ArrayList<Rule>();
      }
      this.rules.add(rules);
      return this;
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the ReplaceDataPolicySchema builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the dataArtifact.
     *
     * @param dataArtifact the dataArtifact
     * @return the ReplaceDataPolicySchema builder
     */
    public Builder dataArtifact(String dataArtifact) {
      this.dataArtifact = dataArtifact;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the ReplaceDataPolicySchema builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the rules.
     * Existing rules will be replaced.
     *
     * @param rules the rules
     * @return the ReplaceDataPolicySchema builder
     */
    public Builder rules(List<Rule> rules) {
      this.rules = rules;
      return this;
    }

    /**
     * Set the status.
     *
     * @param status the status
     * @return the ReplaceDataPolicySchema builder
     */
    public Builder status(String status) {
      this.status = status;
      return this;
    }
  }

  protected ReplaceDataPolicySchema() { }

  protected ReplaceDataPolicySchema(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.catalogName,
      "catalogName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.dataArtifact,
      "dataArtifact cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.rules,
      "rules cannot be null");
    catalogName = builder.catalogName;
    dataArtifact = builder.dataArtifact;
    description = builder.description;
    rules = builder.rules;
    status = builder.status;
  }

  /**
   * New builder.
   *
   * @return a ReplaceDataPolicySchema builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the catalogName.
   *
   * catalog name.
   *
   * @return the catalogName
   */
  public String catalogName() {
    return catalogName;
  }

  /**
   * Gets the dataArtifact.
   *
   * data artifact.
   *
   * @return the dataArtifact
   */
  public String dataArtifact() {
    return dataArtifact;
  }

  /**
   * Gets the description.
   *
   * a more detailed description of the policy.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the rules.
   *
   * rules.
   *
   * @return the rules
   */
  public List<Rule> rules() {
    return rules;
  }

  /**
   * Gets the status.
   *
   * data policy status.
   *
   * @return the status
   */
  public String status() {
    return status;
  }
}

