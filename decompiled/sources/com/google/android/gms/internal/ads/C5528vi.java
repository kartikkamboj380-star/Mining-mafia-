package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5528vi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f34148a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5780xi f34149b;

    public C5528vi(C5780xi c5780xi) {
        this.f34149b = c5780xi;
    }

    public final void a(String str, C5402ui c5402ui) {
        this.f34148a.put(str, c5402ui);
    }

    public final void b(String str, String str2, long j10) {
        Map map = this.f34148a;
        C5402ui c5402ui = (C5402ui) map.get(str2);
        String[] strArr = {str};
        if (c5402ui != null) {
            this.f34149b.b(c5402ui, j10, strArr);
        }
        map.put(str, new C5402ui(j10, null, null));
    }

    public final C5780xi c() {
        return this.f34149b;
    }
}
