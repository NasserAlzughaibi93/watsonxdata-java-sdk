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
 * The getPoliciesList options.
 */
public class GetPoliciesListOptions extends GenericModel {

  protected String lhInstanceId;
  protected String authInstanceId;
  protected List<String> catalogList;
  protected List<String> engineList;
  protected List<String> dataPoliciesList;
  protected Boolean includeDataPolicies;

  /**
   * Builder.
   */
  public static class Builder {
    private String lhInstanceId;
    private String authInstanceId;
    private List<String> catalogList;
    private List<String> engineList;
    private List<String> dataPoliciesList;
    private Boolean includeDataPolicies;

    /**
     * Instantiates a new Builder from an existing GetPoliciesListOptions instance.
     *
     * @param getPoliciesListOptions the instance to initialize the Builder with
     */
    private Builder(GetPoliciesListOptions getPoliciesListOptions) {
      this.lhInstanceId = getPoliciesListOptions.lhInstanceId;
      this.authInstanceId = getPoliciesListOptions.authInstanceId;
      this.catalogList = getPoliciesListOptions.catalogList;
      this.engineList = getPoliciesListOptions.engineList;
      this.dataPoliciesList = getPoliciesListOptions.dataPoliciesList;
      this.includeDataPolicies = getPoliciesListOptions.includeDataPolicies;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GetPoliciesListOptions.
     *
     * @return the new GetPoliciesListOptions instance
     */
    public GetPoliciesListOptions build() {
      return new GetPoliciesListOptions(this);
    }

    /**
     * Adds an catalogList to catalogList.
     *
     * @param catalogList the new catalogList
     * @return the GetPoliciesListOptions builder
     */
    public Builder addCatalogList(String catalogList) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(catalogList,
        "catalogList cannot be null");
      if (this.catalogList == null) {
        this.catalogList = new ArrayList<String>();
      }
      this.catalogList.add(catalogList);
      return this;
    }

    /**
     * Adds an engineList to engineList.
     *
     * @param engineList the new engineList
     * @return the GetPoliciesListOptions builder
     */
    public Builder addEngineList(String engineList) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(engineList,
        "engineList cannot be null");
      if (this.engineList == null) {
        this.engineList = new ArrayList<String>();
      }
      this.engineList.add(engineList);
      return this;
    }

    /**
     * Adds an dataPoliciesList to dataPoliciesList.
     *
     * @param dataPoliciesList the new dataPoliciesList
     * @return the GetPoliciesListOptions builder
     */
    public Builder addDataPoliciesList(String dataPoliciesList) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(dataPoliciesList,
        "dataPoliciesList cannot be null");
      if (this.dataPoliciesList == null) {
        this.dataPoliciesList = new ArrayList<String>();
      }
      this.dataPoliciesList.add(dataPoliciesList);
      return this;
    }

    /**
     * Set the lhInstanceId.
     *
     * @param lhInstanceId the lhInstanceId
     * @return the GetPoliciesListOptions builder
     */
    public Builder lhInstanceId(String lhInstanceId) {
      this.lhInstanceId = lhInstanceId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the GetPoliciesListOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }

    /**
     * Set the catalogList.
     * Existing catalogList will be replaced.
     *
     * @param catalogList the catalogList
     * @return the GetPoliciesListOptions builder
     */
    public Builder catalogList(List<String> catalogList) {
      this.catalogList = catalogList;
      return this;
    }

    /**
     * Set the engineList.
     * Existing engineList will be replaced.
     *
     * @param engineList the engineList
     * @return the GetPoliciesListOptions builder
     */
    public Builder engineList(List<String> engineList) {
      this.engineList = engineList;
      return this;
    }

    /**
     * Set the dataPoliciesList.
     * Existing dataPoliciesList will be replaced.
     *
     * @param dataPoliciesList the dataPoliciesList
     * @return the GetPoliciesListOptions builder
     */
    public Builder dataPoliciesList(List<String> dataPoliciesList) {
      this.dataPoliciesList = dataPoliciesList;
      return this;
    }

    /**
     * Set the includeDataPolicies.
     *
     * @param includeDataPolicies the includeDataPolicies
     * @return the GetPoliciesListOptions builder
     */
    public Builder includeDataPolicies(Boolean includeDataPolicies) {
      this.includeDataPolicies = includeDataPolicies;
      return this;
    }
  }

  protected GetPoliciesListOptions() { }

  protected GetPoliciesListOptions(Builder builder) {
    lhInstanceId = builder.lhInstanceId;
    authInstanceId = builder.authInstanceId;
    catalogList = builder.catalogList;
    engineList = builder.engineList;
    dataPoliciesList = builder.dataPoliciesList;
    includeDataPolicies = builder.includeDataPolicies;
  }

  /**
   * New builder.
   *
   * @return a GetPoliciesListOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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

  /**
   * Gets the catalogList.
   *
   * policies for specific catalogs list.
   *
   * @return the catalogList
   */
  public List<String> catalogList() {
    return catalogList;
  }

  /**
   * Gets the engineList.
   *
   * policies for specific engines list.
   *
   * @return the engineList
   */
  public List<String> engineList() {
    return engineList;
  }

  /**
   * Gets the dataPoliciesList.
   *
   * policies for specific Data Polices list.
   *
   * @return the dataPoliciesList
   */
  public List<String> dataPoliciesList() {
    return dataPoliciesList;
  }

  /**
   * Gets the includeDataPolicies.
   *
   * include policies for specific catalogs or not.
   *
   * @return the includeDataPolicies
   */
  public Boolean includeDataPolicies() {
    return includeDataPolicies;
  }
}

