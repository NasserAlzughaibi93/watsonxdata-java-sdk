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
 * The replaceDataPolicy options.
 */
public class ReplaceDataPolicyOptions extends GenericModel {

  /**
   * data policy status.
   */
  public interface Status {
    /** active. */
    String ACTIVE = "active";
    /** inactive. */
    String INACTIVE = "inactive";
  }

  protected String policyName;
  protected String catalogName;
  protected String dataArtifact;
  protected List<Rule> rules;
  protected String description;
  protected String status;
  protected String lhInstanceId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String policyName;
    private String catalogName;
    private String dataArtifact;
    private List<Rule> rules;
    private String description;
    private String status;
    private String lhInstanceId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing ReplaceDataPolicyOptions instance.
     *
     * @param replaceDataPolicyOptions the instance to initialize the Builder with
     */
    private Builder(ReplaceDataPolicyOptions replaceDataPolicyOptions) {
      this.policyName = replaceDataPolicyOptions.policyName;
      this.catalogName = replaceDataPolicyOptions.catalogName;
      this.dataArtifact = replaceDataPolicyOptions.dataArtifact;
      this.rules = replaceDataPolicyOptions.rules;
      this.description = replaceDataPolicyOptions.description;
      this.status = replaceDataPolicyOptions.status;
      this.lhInstanceId = replaceDataPolicyOptions.lhInstanceId;
      this.authInstanceId = replaceDataPolicyOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param policyName the policyName
     * @param catalogName the catalogName
     * @param dataArtifact the dataArtifact
     * @param rules the rules
     */
    public Builder(String policyName, String catalogName, String dataArtifact, List<Rule> rules) {
      this.policyName = policyName;
      this.catalogName = catalogName;
      this.dataArtifact = dataArtifact;
      this.rules = rules;
    }

    /**
     * Builds a ReplaceDataPolicyOptions.
     *
     * @return the new ReplaceDataPolicyOptions instance
     */
    public ReplaceDataPolicyOptions build() {
      return new ReplaceDataPolicyOptions(this);
    }

    /**
     * Adds an rules to rules.
     *
     * @param rules the new rules
     * @return the ReplaceDataPolicyOptions builder
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
     * Set the policyName.
     *
     * @param policyName the policyName
     * @return the ReplaceDataPolicyOptions builder
     */
    public Builder policyName(String policyName) {
      this.policyName = policyName;
      return this;
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the ReplaceDataPolicyOptions builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the dataArtifact.
     *
     * @param dataArtifact the dataArtifact
     * @return the ReplaceDataPolicyOptions builder
     */
    public Builder dataArtifact(String dataArtifact) {
      this.dataArtifact = dataArtifact;
      return this;
    }

    /**
     * Set the rules.
     * Existing rules will be replaced.
     *
     * @param rules the rules
     * @return the ReplaceDataPolicyOptions builder
     */
    public Builder rules(List<Rule> rules) {
      this.rules = rules;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the ReplaceDataPolicyOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the status.
     *
     * @param status the status
     * @return the ReplaceDataPolicyOptions builder
     */
    public Builder status(String status) {
      this.status = status;
      return this;
    }

    /**
     * Set the lhInstanceId.
     *
     * @param lhInstanceId the lhInstanceId
     * @return the ReplaceDataPolicyOptions builder
     */
    public Builder lhInstanceId(String lhInstanceId) {
      this.lhInstanceId = lhInstanceId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the ReplaceDataPolicyOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }

    /**
     * Set the replaceDataPolicySchema.
     *
     * @param replaceDataPolicySchema the replaceDataPolicySchema
     * @return the ReplaceDataPolicyOptions builder
     */
    public Builder replaceDataPolicySchema(ReplaceDataPolicySchema replaceDataPolicySchema) {
      this.catalogName = replaceDataPolicySchema.catalogName();
      this.dataArtifact = replaceDataPolicySchema.dataArtifact();
      this.rules = replaceDataPolicySchema.rules();
      this.description = replaceDataPolicySchema.description();
      this.status = replaceDataPolicySchema.status();
      return this;
    }
  }

  protected ReplaceDataPolicyOptions() { }

  protected ReplaceDataPolicyOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.policyName,
      "policyName cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.catalogName,
      "catalogName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.dataArtifact,
      "dataArtifact cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.rules,
      "rules cannot be null");
    policyName = builder.policyName;
    catalogName = builder.catalogName;
    dataArtifact = builder.dataArtifact;
    rules = builder.rules;
    description = builder.description;
    status = builder.status;
    lhInstanceId = builder.lhInstanceId;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a ReplaceDataPolicyOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the policyName.
   *
   * Policy name for PATCH.
   *
   * @return the policyName
   */
  public String policyName() {
    return policyName;
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
   * Gets the status.
   *
   * data policy status.
   *
   * @return the status
   */
  public String status() {
    return status;
  }

  /**
   * Gets the lhInstanceId.
   *
   * Lake House Instance ID.
   *
   * @return the lhInstanceId
   */
  public String lhInstanceId() {
    return lhInstanceId;
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

