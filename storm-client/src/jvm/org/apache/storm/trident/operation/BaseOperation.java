/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.storm.trident.operation;

import java.util.Map;

/**
 * Convenience implementation of the {@link org.apache.storm.trident.operation.Operation} interface.
 *
 * Provides no-op implementations of the `prepare()` and `cleanup()` methods.
 */
public class BaseOperation implements Operation {

    /**
     * No-op implementation.
     * @param conf the Storm configuration map
     * @param context the operation context which provides information such as the number of partitions in the stream,
     *                and the current partition index. It also provides methods for registering operation-specific
     *                metrics.
     */
    @Override
    public void prepare(Map<String, Object> conf, TridentOperationContext context) {
    }

    /**
     * No-op implemnation.
     */
    @Override
    public void cleanup() {
    }
    
}
