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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * data policy.
 */
public class PolicySchema extends GenericModel {

  /**
   * data policy status.
   */
  public interface Status {
    /** active. */
    String ACTIVE = "active";
    /** inactive. */
    String INACTIVE = "inactive";
  }

  @SerializedName("rule_count")
  protected Long ruleCount;
  protected List<Rule> rules;
  protected String status;
  @SerializedName("catalog_name")
  protected String catalogName;
  @SerializedName("data_artifact")
  protected String dataArtifact;
  protected DataPolicyMetadata metadata;
  @SerializedName("policy_name")
  protected String policyName;

  protected PolicySchema() { }

  /**
   * Gets the ruleCount.
   *
   * Total number of rules.
   *
   * @return the ruleCount
   */
  public Long getRuleCount() {
    return ruleCount;
  }

  /**
   * Gets the rules.
   *
   * rules.
   *
   * @return the rules
   */
  public List<Rule> getRules() {
    return rules;
  }

  /**
   * Gets the status.
   *
   * data policy status.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the catalogName.
   *
   * catalog name.
   *
   * @return the catalogName
   */
  public String getCatalogName() {
    return catalogName;
  }

  /**
   * Gets the dataArtifact.
   *
   * data artifact.
   *
   * @return the dataArtifact
   */
  public String getDataArtifact() {
    return dataArtifact;
  }

  /**
   * Gets the metadata.
   *
   * @return the metadata
   */
  public DataPolicyMetadata getMetadata() {
    return metadata;
  }

  /**
   * Gets the policyName.
   *
   * the displayed name for the policy.
   *
   * @return the policyName
   */
  public String getPolicyName() {
    return policyName;
  }
}

