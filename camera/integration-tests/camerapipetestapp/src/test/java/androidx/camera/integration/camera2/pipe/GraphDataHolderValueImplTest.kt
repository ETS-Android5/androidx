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

package androidx.camera.integration.camera2.pipe

import androidx.camera.integration.camera2.pipe.visualization_data.graph.GraphDataHolderValueImpl
import androidx.camera.integration.camera2.pipe.visualization_data.graph.GraphDataSortedRingBuffer
import org.junit.Test
import com.google.common.truth.Truth.assertThat

class GraphDataHolderValueImplTest {
    @Test(expected = IllegalArgumentException::class)
    fun inputParams_minMaxDifferentTypes() {
        GraphDataHolderValueImpl(20f, 900, GraphDataSortedRingBuffer())
    }

    @Test(expected = IllegalArgumentException::class)
    fun inputParams_maxLessThanMin() {
        GraphDataHolderValueImpl(20f, 3f, GraphDataSortedRingBuffer())
    }

    @Test(expected = IllegalArgumentException::class)
    fun inputParams_maxEqualsMin() {
        GraphDataHolderValueImpl(700L, 700, GraphDataSortedRingBuffer())
    }

    @Test
    fun inputParams_positiveRange() {
        val graphDataHolderValueImpl = GraphDataHolderValueImpl(33,
            1000, GraphDataSortedRingBuffer())
        assertThat(graphDataHolderValueImpl.getRange()).isEqualTo(967)
    }
}