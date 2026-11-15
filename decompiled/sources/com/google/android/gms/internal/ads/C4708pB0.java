package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4708pB0 implements InterfaceC4176ky0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f32323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f32324b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4176ky0 f32325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC4176ky0 f32326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC4176ky0 f32327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InterfaceC4176ky0 f32328f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InterfaceC4176ky0 f32329g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterfaceC4176ky0 f32330h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private InterfaceC4176ky0 f32331i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private InterfaceC4176ky0 f32332j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private InterfaceC4176ky0 f32333k;

    public C4708pB0(Context context, InterfaceC4176ky0 interfaceC4176ky0) {
        this.f32323a = context.getApplicationContext();
        this.f32325c = interfaceC4176ky0;
    }

    private final InterfaceC4176ky0 c() {
        if (this.f32327e == null) {
            C4922qt0 c4922qt0 = new C4922qt0(this.f32323a);
            this.f32327e = c4922qt0;
            f(c4922qt0);
        }
        return this.f32327e;
    }

    private final void f(InterfaceC4176ky0 interfaceC4176ky0) {
        int i10 = 0;
        while (true) {
            List list = this.f32324b;
            if (i10 >= list.size()) {
                return;
            }
            interfaceC4176ky0.b((GK0) list.get(i10));
            i10++;
        }
    }

    private static final void g(InterfaceC4176ky0 interfaceC4176ky0, GK0 gk0) {
        if (interfaceC4176ky0 != null) {
            interfaceC4176ky0.b(gk0);
        }
    }

    @Override // com.google.android.gms.internal.ads.PQ0
    public final int F(byte[] bArr, int i10, int i11) {
        InterfaceC4176ky0 interfaceC4176ky0 = this.f32333k;
        interfaceC4176ky0.getClass();
        return interfaceC4176ky0.F(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final long a(C4454nA0 c4454nA0) {
        InterfaceC4176ky0 interfaceC4176ky0;
        AbstractC2418Ss0.i(this.f32333k == null);
        Uri uri = c4454nA0.f31730a;
        String scheme = uri.getScheme();
        String str = AbstractC4634ob0.f32117a;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || Objects.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f32326d == null) {
                    WE0 we0 = new WE0();
                    this.f32326d = we0;
                    f(we0);
                }
                this.f32333k = this.f32326d;
            } else {
                this.f32333k = c();
            }
        } else if ("asset".equals(scheme)) {
            this.f32333k = c();
        } else if (HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equals(scheme)) {
            if (this.f32328f == null) {
                C5431uw0 c5431uw0 = new C5431uw0(this.f32323a);
                this.f32328f = c5431uw0;
                f(c5431uw0);
            }
            this.f32333k = this.f32328f;
        } else if ("rtmp".equals(scheme)) {
            if (this.f32329g == null) {
                try {
                    InterfaceC4176ky0 interfaceC4176ky1 = (InterfaceC4176ky0) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                    this.f32329g = interfaceC4176ky1;
                    f(interfaceC4176ky1);
                } catch (ClassNotFoundException unused) {
                    YU.c("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating RTMP extension", e10);
                }
                if (this.f32329g == null) {
                    this.f32329g = this.f32325c;
                }
            }
            this.f32333k = this.f32329g;
        } else if ("udp".equals(scheme)) {
            if (this.f32330h == null) {
                FL0 fl0 = new FL0(2000);
                this.f32330h = fl0;
                f(fl0);
            }
            this.f32333k = this.f32330h;
        } else if (JsonStorageKeyNames.DATA_KEY.equals(scheme)) {
            if (this.f32331i == null) {
                C3798hx0 c3798hx0 = new C3798hx0();
                this.f32331i = c3798hx0;
                f(c3798hx0);
            }
            this.f32333k = this.f32331i;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f32332j == null) {
                    EJ0 ej0 = new EJ0(this.f32323a);
                    this.f32332j = ej0;
                    f(ej0);
                }
                interfaceC4176ky0 = this.f32332j;
            } else {
                interfaceC4176ky0 = this.f32325c;
            }
            this.f32333k = interfaceC4176ky0;
        }
        return this.f32333k.a(c4454nA0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final void b(GK0 gk0) {
        gk0.getClass();
        this.f32325c.b(gk0);
        this.f32324b.add(gk0);
        g(this.f32326d, gk0);
        g(this.f32327e, gk0);
        g(this.f32328f, gk0);
        g(this.f32329g, gk0);
        g(this.f32330h, gk0);
        g(this.f32331i, gk0);
        g(this.f32332j, gk0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0, com.google.android.gms.internal.ads.InterfaceC2962bI0
    public final Map d() {
        InterfaceC4176ky0 interfaceC4176ky0 = this.f32333k;
        return interfaceC4176ky0 == null ? Collections.EMPTY_MAP : interfaceC4176ky0.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final Uri zzc() {
        InterfaceC4176ky0 interfaceC4176ky0 = this.f32333k;
        if (interfaceC4176ky0 == null) {
            return null;
        }
        return interfaceC4176ky0.zzc();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final void zzd() {
        InterfaceC4176ky0 interfaceC4176ky0 = this.f32333k;
        if (interfaceC4176ky0 != null) {
            try {
                interfaceC4176ky0.zzd();
            } finally {
                this.f32333k = null;
            }
        }
    }
}
