package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class M implements z0.d.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p251z0.d f10169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f10170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f10171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f10172d;

    static final class a extends kotlin.jvm.internal.m implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ W f10173a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(W w10) {
            super(0);
            this.f10173a = w10;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final N invoke() {
            return L.e(this.f10173a);
        }
    }

    public M(p251z0.d savedStateRegistry, W viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.f10169a = savedStateRegistry;
        this.f10172d = p129m8.g.a(new a(viewModelStoreOwner));
    }

    private final N c() {
        return (N) this.f10172d.getValue();
    }

    @Override // z0.d.c
    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f10171c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : c().e().entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((I) entry.getValue()).c().a();
            if (!Intrinsics.b(bundleA, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleA);
            }
        }
        this.f10170b = false;
        return bundle;
    }

    public final Bundle b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        d();
        Bundle bundle = this.f10171c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f10171c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f10171c;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.f10171c = null;
        }
        return bundle2;
    }

    public final void d() {
        if (this.f10170b) {
            return;
        }
        Bundle bundleB = this.f10169a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f10171c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleB != null) {
            bundle.putAll(bundleB);
        }
        this.f10171c = bundle;
        this.f10170b = true;
        c();
    }
}
