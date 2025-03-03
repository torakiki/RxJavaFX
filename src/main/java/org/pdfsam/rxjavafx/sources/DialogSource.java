/**
 * Copyright 2017 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.pdfsam.rxjavafx.sources;

import java.util.Optional;

import org.pdfsam.rxjavafx.schedulers.JavaFxScheduler;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;
import javafx.scene.control.Dialog;

public final class DialogSource {
    private DialogSource() {}

    public static <T> Maybe<T> fromDialogSource(final Dialog<T> dialog) {
        return Single.fromCallable(dialog::showAndWait)
                .subscribeOn(JavaFxScheduler.platform())
                .filter(Optional::isPresent)
                .map(Optional::get);
    }

}
