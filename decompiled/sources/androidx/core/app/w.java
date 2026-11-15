package androidx.core.app;

import android.content.res.Configuration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f9281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Configuration f9282b;

    public w(boolean z9) {
        this.f9281a = z9;
    }

    public final boolean a() {
        return this.f9281a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w(boolean z9, Configuration newConfig) {
        this(z9);
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.f9282b = newConfig;
    }
}
