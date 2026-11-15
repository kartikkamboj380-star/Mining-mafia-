package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class M01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f20716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Uri f20717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2923b f20718c = new C2923b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f20719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AbstractC5931yu0 f20720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C4435n1 f20721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C4817q3 f20722g;

    public M01() {
        AbstractC5931yu0.l();
        this.f20719d = Collections.EMPTY_LIST;
        this.f20720e = AbstractC5931yu0.l();
        this.f20721f = new C4435n1();
        this.f20722g = C4817q3.f32551d;
    }

    public final M01 a(String str) {
        this.f20716a = str;
        return this;
    }

    public final M01 b(Uri uri) {
        this.f20717b = uri;
        return this;
    }

    public final C4819q4 c() {
        C4563o2 c4563o2;
        Uri uri = this.f20717b;
        byte[] bArr = null;
        if (uri != null) {
            c4563o2 = new C4563o2(uri, null, null, null, this.f20719d, null, this.f20720e, null, -9223372036854775807L, null);
        } else {
            c4563o2 = null;
        }
        String str = this.f20716a;
        if (str == null) {
            str = "";
        }
        return new C4819q4(str, new C3426f0(this.f20718c, null), c4563o2, new N1(this.f20721f, bArr), T5.f23382B, this.f20722g, null);
    }
}
