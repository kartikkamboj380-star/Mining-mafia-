package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Dg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1615Dg0 implements InterfaceC1771Gg0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final C1615Dg0 f18269e = new C1615Dg0(new C1823Hg0());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Date f18270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f18271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1823Hg0 f18272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f18273d;

    private C1615Dg0(C1823Hg0 c1823Hg0) {
        this.f18272c = c1823Hg0;
    }

    public static C1615Dg0 a() {
        return f18269e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Gg0
    public final void N(boolean z9) {
        if (!this.f18273d && z9) {
            Date date = new Date();
            Date date2 = this.f18270a;
            if (date2 == null || date.after(date2)) {
                this.f18270a = date;
                if (this.f18271b) {
                    Iterator it = C1719Fg0.a().f().iterator();
                    while (it.hasNext()) {
                        ((C4266lg0) it.next()).g().n(b());
                    }
                }
            }
        }
        this.f18273d = z9;
    }

    public final Date b() {
        Date date = this.f18270a;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public final void c(Context context) {
        if (this.f18271b) {
            return;
        }
        C1823Hg0 c1823Hg0 = this.f18272c;
        c1823Hg0.d(context);
        c1823Hg0.g(this);
        c1823Hg0.e();
        this.f18273d = c1823Hg0.f19365b;
        this.f18271b = true;
    }
}
