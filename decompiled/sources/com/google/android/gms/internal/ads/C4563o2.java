package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.o2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4563o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f31932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f31933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f31934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f31935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC5931yu0 f31936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f31937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f31938g;

    static {
        String str = AbstractC4634ob0.f32117a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    /* synthetic */ C4563o2(Uri uri, String str, M0 m10, AbstractC4434n01 abstractC4434n01, List list, String str2, AbstractC5931yu0 abstractC5931yu0, Object obj, long j10, byte[] bArr) {
        this.f31932a = uri;
        int i10 = A8.f17255c;
        this.f31933b = null;
        this.f31934c = list;
        this.f31935d = null;
        this.f31936e = abstractC5931yu0;
        int i11 = AbstractC5931yu0.f35482c;
        C5553vu0 c5553vu0 = new C5553vu0();
        if (abstractC5931yu0.size() > 0) {
            p070h.w.a(abstractC5931yu0.get(0));
            throw null;
        }
        c5553vu0.j();
        this.f31937f = null;
        this.f31938g = -9223372036854775807L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4563o2)) {
            return false;
        }
        C4563o2 c4563o2 = (C4563o2) obj;
        return this.f31932a.equals(c4563o2.f31932a) && this.f31934c.equals(c4563o2.f31934c) && this.f31936e.equals(c4563o2.f31936e);
    }

    public final int hashCode() {
        return (int) ((((long) (((((this.f31932a.hashCode() * 923521) + this.f31934c.hashCode()) * 961) + this.f31936e.hashCode()) * 31)) * 31) - Long.MAX_VALUE);
    }
}
