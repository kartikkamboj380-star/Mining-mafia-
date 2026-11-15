package com.facebook.react.uimanager.events;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements EventDispatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f15570a = new b();

    private b() {
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void a() {
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void b(j listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void c(e event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Z1.a.b("BlackHoleEventDispatcher", "Trying to emit event to JS, but the React instance isn't ready. Event: " + event.getEventName());
    }
}
