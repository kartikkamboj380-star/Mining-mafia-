package androidx.core.app;

import android.content.res.Configuration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f9141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Configuration f9142b;

    public k(boolean z9) {
        this.f9141a = z9;
    }

    public final boolean a() {
        return this.f9141a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(boolean z9, Configuration newConfig) {
        this(z9);
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.f9142b = newConfig;
    }
}
