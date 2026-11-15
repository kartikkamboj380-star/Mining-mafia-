package p251z0;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1164j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f50893d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f50894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f50895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f50896c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(f owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            return new e(owner, null);
        }

        private a() {
        }
    }

    public /* synthetic */ e(f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar);
    }

    public static final e a(f fVar) {
        return f50893d.a(fVar);
    }

    public final d b() {
        return this.f50895b;
    }

    public final void c() {
        AbstractC1164j lifecycle = this.f50894a.getLifecycle();
        if (lifecycle.b() != AbstractC1164j.b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.a(new b(this.f50894a));
        this.f50895b.e(lifecycle);
        this.f50896c = true;
    }

    public final void d(Bundle bundle) {
        if (!this.f50896c) {
            c();
        }
        AbstractC1164j lifecycle = this.f50894a.getLifecycle();
        if (!lifecycle.b().d(AbstractC1164j.b.STARTED)) {
            this.f50895b.f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.b()).toString());
    }

    public final void e(Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        this.f50895b.g(outBundle);
    }

    private e(f fVar) {
        this.f50894a = fVar;
        this.f50895b = new d();
    }
}
