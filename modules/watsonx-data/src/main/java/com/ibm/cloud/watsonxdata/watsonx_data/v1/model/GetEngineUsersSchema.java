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
 * Get engine users schema.
 */
public class GetEngineUsersSchema extends GenericModel {

  @SerializedName("engine_id")
  protected String engineId;
  protected List<EngineGroupsMetadata> groups;
  @SerializedName("total_count")
  protected Long totalCount;
  protected List<EngineUsersMetadata> users;

  protected GetEngineUsersSchema() { }

  /**
   * Gets the engineId.
   *
   * The engine id.
   *
   * @return the engineId
   */
  public String getEngineId() {
    return engineId;
  }

  /**
   * Gets the groups.
   *
   * The group list.
   *
   * @return the groups
   */
  public List<EngineGroupsMetadata> getGroups() {
    return groups;
  }

  /**
   * Gets the totalCount.
   *
   * Total number of users and groups.
   *
   * @return the totalCount
   */
  public Long getTotalCount() {
    return totalCount;
  }

  /**
   * Gets the users.
   *
   * The user list.
   *
   * @return the users
   */
  public List<EngineUsersMetadata> getUsers() {
    return users;
  }
}

