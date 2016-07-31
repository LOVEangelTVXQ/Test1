/*
 * Licensed to Elasticsearch under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.elasticsearch.test.rest.yaml.section;

import org.elasticsearch.test.rest.yaml.ClientYamlTestExecutionContext;

import java.io.IOException;

/**
 * Represents a test fragment that can be executed (e.g. api call, assertion)
 */
public interface ExecutableSection {

    /**
     * Executes the section passing in the execution context
     */
    void execute(ClientYamlTestExecutionContext executionContext) throws IOException;
}
