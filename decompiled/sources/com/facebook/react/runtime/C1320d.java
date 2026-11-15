package com.facebook.react.runtime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.react.runtime.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1320d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f15231c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f15232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f15233b = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: com.facebook.react.runtime.d$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C1320d(boolean z9) {
        this.f15232a = z9;
    }

    public final void a(String state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Z1.a.I("BridgelessReact", state);
        if (this.f15232a) {
            this.f15233b.add(state);
        }
    }
}
