package com.google.android.gms.internal.ads;

import java.net.HttpURLConnection;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3141cj0 extends AbstractC2502Ui0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC4166kt0 f27187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC4166kt0 f27188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC2606Wi0 f27189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HttpURLConnection f27190d;

    C3141cj0(InterfaceC4166kt0 interfaceC4166kt0, InterfaceC4166kt0 interfaceC4166kt1, InterfaceC2606Wi0 interfaceC2606Wi0) {
        this.f27187a = interfaceC4166kt0;
        this.f27188b = interfaceC4166kt1;
        this.f27189c = interfaceC2606Wi0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer c() {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer h() {
        return -1;
    }

    public static void n(HttpURLConnection httpURLConnection) {
        AbstractC2554Vi0.b();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        n(this.f27190d);
    }

    public HttpURLConnection j(InterfaceC2606Wi0 interfaceC2606Wi0, final int i10, final int i11) {
        this.f27187a = new InterfaceC4166kt0() { // from class: com.google.android.gms.internal.ads.Zi0
            @Override // com.google.android.gms.internal.ads.InterfaceC4166kt0
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i10);
            }
        };
        this.f27188b = new InterfaceC4166kt0() { // from class: com.google.android.gms.internal.ads.aj0
            @Override // com.google.android.gms.internal.ads.InterfaceC4166kt0
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i11);
            }
        };
        this.f27189c = interfaceC2606Wi0;
        return v();
    }

    public HttpURLConnection v() {
        AbstractC2554Vi0.a(((Integer) this.f27187a.zza()).intValue(), ((Integer) this.f27188b.zza()).intValue());
        InterfaceC2606Wi0 interfaceC2606Wi0 = this.f27189c;
        interfaceC2606Wi0.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) interfaceC2606Wi0.zza();
        this.f27190d = httpURLConnection;
        return httpURLConnection;
    }

    C3141cj0() {
        this(C3016bj0.f26906a, C2710Yi0.f25693a, null);
    }
}
