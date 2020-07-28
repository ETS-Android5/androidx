/*
 * Copyright 2018 The Android Open Source Project
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

package androidx.compose.ui.graphics

// Styles to use for line endings.
//
// See [Paint.strokeCap].
// These enum values must be kept in sync with SkPaint::Cap.
enum class StrokeCap {
    // Begin and end contours with a flat edge and no extension.
    butt,

    // Begin and end contours with a semi-circle extension.
    round,

    // Begin and end contours with a half square extension. This is
    // similar to extending each contour by half the stroke width (as
    // given by [Paint.strokeWidth]).
    square
}
