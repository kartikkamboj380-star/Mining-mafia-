package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class RF extends H4.Y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f22762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f22763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f22764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f22765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f22766g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C5004rY f22767h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Bundle f22768i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final double f22769j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f22770k;

    public RF(C3502fb0 c3502fb0, String str, C5004rY c5004rY, C3880ib0 c3880ib0, String str2) {
        String string = null;
        this.f22761b = c3502fb0 == null ? null : c3502fb0.f28398b0;
        this.f22762c = str2;
        this.f22763d = c3880ib0 == null ? null : c3880ib0.f29455b;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && c3502fb0 != null) {
            try {
                string = c3502fb0.f28437v.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.f22760a = string != null ? string : str;
        this.f22764e = c5004rY.h();
        this.f22767h = c5004rY;
        this.f22769j = c3502fb0 == null ? 0.0d : c3502fb0.f28446z0;
        this.f22770k = c3502fb0 == null ? 2 : c3502fb0.f28376H0;
        this.f22765f = G4.t.o().currentTimeMillis() / 1000;
        if (!((Boolean) H4.B.c().d(AbstractC3892ii.f29587I7)).booleanValue() || c3880ib0 == null) {
            this.f22768i = new Bundle();
        } else {
            this.f22768i = c3880ib0.f29464k;
        }
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29597J7)).booleanValue() && c3502fb0 != null) {
            Bundle bundle = c3502fb0.f28372F0;
            Bundle bundle2 = this.f22768i;
            if (bundle2 != null) {
                bundle2.putAll(bundle);
            }
        }
        this.f22766g = (!((Boolean) H4.B.c().d(AbstractC3892ii.Ia)).booleanValue() || c3880ib0 == null || TextUtils.isEmpty(c3880ib0.f29462i)) ? "" : c3880ib0.f29462i;
    }

    public final String A6() {
        return this.f22766g;
    }

    public final String B6() {
        return this.f22763d;
    }

    public final double C6() {
        return this.f22769j;
    }

    public final int D6() {
        return this.f22770k;
    }

    @Override // H4.InterfaceC0582a1
    public final String b() {
        return this.f22761b;
    }

    @Override // H4.InterfaceC0582a1
    public final H4.q2 c() {
        C5004rY c5004rY = this.f22767h;
        if (c5004rY != null) {
            return c5004rY.g();
        }
        return null;
    }

    @Override // H4.InterfaceC0582a1
    public final String d() {
        return this.f22762c;
    }

    public final long z6() {
        return this.f22765f;
    }

    @Override // H4.InterfaceC0582a1
    public final String zze() {
        return this.f22760a;
    }

    @Override // H4.InterfaceC0582a1
    public final List zzg() {
        return this.f22764e;
    }

    @Override // H4.InterfaceC0582a1
    public final Bundle zzi() {
        return this.f22768i;
    }
}
