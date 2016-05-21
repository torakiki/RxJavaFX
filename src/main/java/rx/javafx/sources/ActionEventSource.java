/**
 * Copyright 2016 Netflix, Inc.
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
package rx.javafx.sources;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import rx.Observable;
import rx.schedulers.JavaFxScheduler;
import rx.subscriptions.JavaFxSubscriptions;

public final class ActionEventSource {
    private ActionEventSource() {}

    public static Observable<ActionEvent> fromActionEvents(final Node node) {
        return NodeEventSource.fromNodeEvents(node, ActionEvent.ACTION);
    }
    public static Observable<ActionEvent> fromActionEvents(final ContextMenu source) {
        return Observable.create((Observable.OnSubscribe<ActionEvent>) subscriber -> {
            final EventHandler<ActionEvent> handler = subscriber::onNext;

            source.addEventHandler(ActionEvent.ANY, handler);

            subscriber.add(JavaFxSubscriptions.unsubscribeInEventDispatchThread(() -> source.removeEventHandler(ActionEvent.ANY, handler)));
        }).subscribeOn(JavaFxScheduler.getInstance());
    }
    public static Observable<ActionEvent> fromActionEvents(final MenuItem source) {
        return Observable.create((Observable.OnSubscribe<ActionEvent>) subscriber -> {
            final EventHandler<ActionEvent> handler = subscriber::onNext;

            source.addEventHandler(ActionEvent.ANY, handler);

            subscriber.add(JavaFxSubscriptions.unsubscribeInEventDispatchThread(() -> source.removeEventHandler(ActionEvent.ANY, handler)));
        }).subscribeOn(JavaFxScheduler.getInstance());
    }

}
