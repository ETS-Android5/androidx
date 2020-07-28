/*
 * Copyright 2019 The Android Open Source Project
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

package androidx.compose.foundation.layout.samples

import androidx.annotation.Sampled
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.Box
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.preferredSize
import androidx.compose.foundation.layout.preferredWidth
import androidx.compose.ui.unit.dp

@Sampled
@Composable
fun SpacerExample() {
    Row {
        Box(Modifier.preferredSize(100.dp), backgroundColor = Color.Red)
        Spacer(Modifier.preferredWidth(20.dp))
        Box(Modifier.preferredSize(100.dp), backgroundColor = Color.Magenta)
        Spacer(Modifier.weight(1f))
        Box(Modifier.preferredSize(100.dp), backgroundColor = Color.Black)
    }
}