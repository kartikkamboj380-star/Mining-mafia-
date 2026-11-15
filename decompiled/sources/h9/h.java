package h9;

import c9.F;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f44959a = new LinkedHashSet();

    public final synchronized void a(F route) {
        Intrinsics.checkNotNullParameter(route, "route");
        this.f44959a.remove(route);
    }

    public final synchronized void b(F failedRoute) {
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        this.f44959a.add(failedRoute);
    }

    public final synchronized boolean c(F route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.f44959a.contains(route);
    }
}
