package com.google.android.gms.internal.ads;

import Q4.AbstractC0928c;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ie0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC3886ie0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RunnableC4262le0 f29483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f29484c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f29486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C4886qb0 f29487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private H4.Z0 f29488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Future f29489h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f29482a = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f29490i = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private EnumC4514ne0 f29485d = EnumC4514ne0.SCAR_REQUEST_TYPE_UNSPECIFIED;

    RunnableC3886ie0(RunnableC4262le0 runnableC4262le0) {
        this.f29483b = runnableC4262le0;
    }

    public final synchronized RunnableC3886ie0 a(InterfaceC2700Yd0 interfaceC2700Yd0) {
        try {
            if (((Boolean) AbstractC3140cj.f27184c.e()).booleanValue()) {
                List list = this.f29482a;
                interfaceC2700Yd0.zzc();
                list.add(interfaceC2700Yd0);
                Future future = this.f29489h;
                if (future != null) {
                    future.cancel(false);
                }
                this.f29489h = AbstractC2315Qt.f22476d.schedule(this, ((Integer) H4.B.c().d(AbstractC3892ii.ea)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized RunnableC3886ie0 b(ArrayList arrayList) {
        try {
            if (((Boolean) AbstractC3140cj.f27184c.e()).booleanValue()) {
                if (arrayList.contains("banner") || arrayList.contains(B4.b.BANNER.name())) {
                    this.f29490i = 3;
                } else if (arrayList.contains("interstitial") || arrayList.contains(B4.b.INTERSTITIAL.name())) {
                    this.f29490i = 4;
                } else if (arrayList.contains("native") || arrayList.contains(B4.b.NATIVE.name())) {
                    this.f29490i = 8;
                } else if (arrayList.contains("rewarded") || arrayList.contains(B4.b.REWARDED.name())) {
                    this.f29490i = 5;
                } else if (arrayList.contains("app_open_ad")) {
                    this.f29490i = 7;
                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(B4.b.REWARDED_INTERSTITIAL.name())) {
                    this.f29490i = 6;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized RunnableC3886ie0 c(String str) {
        if (((Boolean) AbstractC3140cj.f27184c.e()).booleanValue() && AbstractC3760he0.a(str)) {
            this.f29484c = str;
        }
        return this;
    }

    public final synchronized RunnableC3886ie0 d(Bundle bundle) {
        if (((Boolean) AbstractC3140cj.f27184c.e()).booleanValue()) {
            this.f29485d = AbstractC0928c.d(bundle);
        }
        return this;
    }

    public final synchronized RunnableC3886ie0 e(C4886qb0 c4886qb0) {
        if (((Boolean) AbstractC3140cj.f27184c.e()).booleanValue()) {
            this.f29487f = c4886qb0;
        }
        return this;
    }

    public final synchronized RunnableC3886ie0 f(H4.Z0 z9) {
        if (((Boolean) AbstractC3140cj.f27184c.e()).booleanValue()) {
            this.f29488g = z9;
        }
        return this;
    }

    public final synchronized RunnableC3886ie0 g(String str) {
        if (((Boolean) AbstractC3140cj.f27184c.e()).booleanValue()) {
            this.f29486e = str;
        }
        return this;
    }

    public final synchronized void h() {
        try {
            if (((Boolean) AbstractC3140cj.f27184c.e()).booleanValue()) {
                Future future = this.f29489h;
                if (future != null) {
                    future.cancel(false);
                }
                List<InterfaceC2700Yd0> list = this.f29482a;
                for (InterfaceC2700Yd0 interfaceC2700Yd0 : list) {
                    int i10 = this.f29490i;
                    if (i10 != 2) {
                        interfaceC2700Yd0.h(i10);
                    }
                    if (!TextUtils.isEmpty(this.f29484c)) {
                        interfaceC2700Yd0.k(this.f29484c);
                    }
                    if (!TextUtils.isEmpty(this.f29486e) && !interfaceC2700Yd0.zzl()) {
                        interfaceC2700Yd0.M(this.f29486e);
                    }
                    C4886qb0 c4886qb0 = this.f29487f;
                    if (c4886qb0 != null) {
                        interfaceC2700Yd0.d(c4886qb0);
                    } else {
                        H4.Z0 z9 = this.f29488g;
                        if (z9 != null) {
                            interfaceC2700Yd0.c(z9);
                        }
                    }
                    interfaceC2700Yd0.b(this.f29485d);
                    this.f29483b.b(interfaceC2700Yd0.e());
                }
                list.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized RunnableC3886ie0 i(int i10) {
        if (((Boolean) AbstractC3140cj.f27184c.e()).booleanValue()) {
            this.f29490i = i10;
        }
        return this;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        h();
    }
}
