package com.swmansion.rnscreens.utils;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0397a f42604c = new C0397a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f42605d = new a(new b(LinearLayoutManager.INVALID_OFFSET, false), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f42606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f42607b;

    /* JADX INFO: renamed from: com.swmansion.rnscreens.utils.a$a, reason: collision with other inner class name */
    public static final class C0397a {
        public /* synthetic */ C0397a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            return a.f42605d;
        }

        private C0397a() {
        }
    }

    public a(b cacheKey, float f10) {
        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
        this.f42606a = cacheKey;
        this.f42607b = f10;
    }

    public final float b() {
        return this.f42607b;
    }

    public final boolean c(b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f42606a.a() != Integer.MIN_VALUE && Intrinsics.b(this.f42606a, key);
    }
}
