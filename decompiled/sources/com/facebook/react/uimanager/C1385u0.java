package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.react.uimanager.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1385u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReadableMap f15857a;

    public C1385u0(ReadableMap props) {
        Intrinsics.checkNotNullParameter(props, "props");
        this.f15857a = props;
    }

    public final boolean a(String name, boolean z9) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f15857a.isNull(name) ? z9 : this.f15857a.getBoolean(name);
    }

    public final String b(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f15857a.getString(name);
    }

    public final boolean c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f15857a.hasKey(name);
    }

    public final ReadableMap d() {
        return this.f15857a;
    }

    public String toString() {
        return "{ " + C1385u0.class.getSimpleName() + ": " + this.f15857a + " }";
    }
}
