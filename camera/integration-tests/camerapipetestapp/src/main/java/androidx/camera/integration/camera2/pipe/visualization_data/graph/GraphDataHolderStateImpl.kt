/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package androidx.camera.integration.camera2.pipe.visualization_data.graph

/** Data source for state (discrete value) graph visualizations. */
data class GraphDataHolderStateImpl(
    /** Maps integer representing state to its string description */
    private val stateMap: HashMap<Int, String>,
    override var graphData: GraphDataSortedRingBuffer
) : GraphDataHolder {

    init {
        if (stateMap.size == 0) throw IllegalArgumentException("Must have at least 1 state")
        stateMap.forEach {
            if (it.value == "") throw IllegalArgumentException("State description must not be" +
                    " empty string")
        }
    }

    fun getNumStates() = stateMap.size

    fun getStrings(): List<String> = stateMap.values.toList()
}