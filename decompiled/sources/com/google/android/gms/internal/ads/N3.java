package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class N3 implements InterfaceC5326u6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21013a;

    public N3(List list) {
        this.f21013a = list;
        boolean z9 = false;
        if (!list.isEmpty()) {
            long j10 = ((M3) list.get(0)).f20731b;
            for (int i10 = 1; i10 < list.size(); i10++) {
                if (((M3) list.get(i10)).f20730a < j10) {
                    z9 = true;
                    break;
                }
                j10 = ((M3) list.get(i10)).f20731b;
            }
        }
        AbstractC2418Ss0.a(!z9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || N3.class != obj.getClass()) {
            return false;
        }
        return this.f21013a.equals(((N3) obj).f21013a);
    }

    public final int hashCode() {
        return this.f21013a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.f21013a.toString());
    }
}
