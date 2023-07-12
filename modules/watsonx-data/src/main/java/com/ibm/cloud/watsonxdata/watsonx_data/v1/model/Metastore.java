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
 * Metastore.
 */
public class Metastore extends GenericModel {

  /**
   * Managed by.
   */
  public interface ManagedBy {
    /** ibm. */
    String IBM = "ibm";
    /** customer. */
    String CUSTOMER = "customer";
  }

  @SerializedName("catalog_name")
  protected String catalogName;
  protected String hostname;
  @SerializedName("managed_by")
  protected String managedBy;
  protected String status;
  protected List<String> tags;
  protected List<String> actions;
  @SerializedName("associated_buckets")
  protected List<String> associatedBuckets;
  @SerializedName("created_by")
  protected String createdBy;
  @SerializedName("thrift_uri")
  protected String thriftUri;
  @SerializedName("catalog_type")
  protected String catalogType;
  protected String description;
  @SerializedName("associated_databases")
  protected List<String> associatedDatabases;
  @SerializedName("associated_engines")
  protected List<String> associatedEngines;
  @SerializedName("created_on")
  protected String createdOn;
  protected String port;

  protected Metastore() { }

  /**
   * Gets the catalogName.
   *
   * Name for the metastore.
   *
   * @return the catalogName
   */
  public String getCatalogName() {
    return catalogName;
  }

  /**
   * Gets the hostname.
   *
   * IBM thrift uri hostname.
   *
   * @return the hostname
   */
  public String getHostname() {
    return hostname;
  }

  /**
   * Gets the managedBy.
   *
   * Managed by.
   *
   * @return the managedBy
   */
  public String getManagedBy() {
    return managedBy;
  }

  /**
   * Gets the status.
   *
   * Metastore status.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the tags.
   *
   * Tags.
   *
   * @return the tags
   */
  public List<String> getTags() {
    return tags;
  }

  /**
   * Gets the actions.
   *
   * @return the actions
   */
  public List<String> getActions() {
    return actions;
  }

  /**
   * Gets the associatedBuckets.
   *
   * Associated buckets items.
   *
   * @return the associatedBuckets
   */
  public List<String> getAssociatedBuckets() {
    return associatedBuckets;
  }

  /**
   * Gets the createdBy.
   *
   * Created by.
   *
   * @return the createdBy
   */
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * Gets the thriftUri.
   *
   * Customer thrift uri.
   *
   * @return the thriftUri
   */
  public String getThriftUri() {
    return thriftUri;
  }

  /**
   * Gets the catalogType.
   *
   * Table type.
   *
   * @return the catalogType
   */
  public String getCatalogType() {
    return catalogType;
  }

  /**
   * Gets the description.
   *
   * Description.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the associatedDatabases.
   *
   * Associated databases items.
   *
   * @return the associatedDatabases
   */
  public List<String> getAssociatedDatabases() {
    return associatedDatabases;
  }

  /**
   * Gets the associatedEngines.
   *
   * Associated engines items.
   *
   * @return the associatedEngines
   */
  public List<String> getAssociatedEngines() {
    return associatedEngines;
  }

  /**
   * Gets the createdOn.
   *
   * Created on.
   *
   * @return the createdOn
   */
  public String getCreatedOn() {
    return createdOn;
  }

  /**
   * Gets the port.
   *
   * IBM thrift uri port.
   *
   * @return the port
   */
  public String getPort() {
    return port;
  }
}

