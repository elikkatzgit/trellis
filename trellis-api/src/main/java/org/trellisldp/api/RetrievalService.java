/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.trellisldp.api;

import java.time.Instant;
import java.util.Optional;

/**
 * A service that can retrieve resources of some type, featuring optional
 * retrieval by time.
 * 
 * @author ajs6f
 * @param <T> the type of identifier used by this service
 * @param <U> the type of resource available from this service
 */
public interface RetrievalService<T, U> {

    /**
     * Get a resource by the given identifier.
     *
     * @param identifier the resource identifier
     * @return the resource
     */
    Optional<? extends U> get(T identifier);

    /**
     * Get a resource by the given identifier and time.
     *
     * @param identifier the resource identifier
     * @param time the time
     * @return the resource
     */
    default Optional<? extends U> get(T identifier, Instant time) {
        return get(identifier);
    }
}
