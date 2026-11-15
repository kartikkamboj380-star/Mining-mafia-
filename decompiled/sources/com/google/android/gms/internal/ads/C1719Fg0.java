package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Fg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1719Fg0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C1719Fg0 f18812c = new C1719Fg0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f18813a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f18814b = new ArrayList();

    private C1719Fg0() {
    }

    public static C1719Fg0 a() {
        return f18812c;
    }

    public final void b(C4266lg0 c4266lg0) {
        this.f18813a.add(c4266lg0);
    }

    public final void c(C4266lg0 c4266lg0) {
        ArrayList arrayList = this.f18814b;
        boolean zG = g();
        arrayList.add(c4266lg0);
        if (zG) {
            return;
        }
        C2134Ng0.a().c();
    }

    public final void d(C4266lg0 c4266lg0) {
        ArrayList arrayList = this.f18813a;
        boolean zG = g();
        arrayList.remove(c4266lg0);
        this.f18814b.remove(c4266lg0);
        if (!zG || g()) {
            return;
        }
        C2134Ng0.a().d();
    }

    public final Collection e() {
        return Collections.unmodifiableCollection(this.f18813a);
    }

    public final Collection f() {
        return Collections.unmodifiableCollection(this.f18814b);
    }

    public final boolean g() {
        return this.f18814b.size() > 0;
    }
}
