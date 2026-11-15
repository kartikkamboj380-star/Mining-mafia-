package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.z8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5960z8 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final J8 f35648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f35649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f35650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f35651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f35652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C8 f35653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Integer f35654g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private B8 f35655h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f35656i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private C3821i8 f35657j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private InterfaceC5834y8 f35658k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C4449n8 f35659l;

    public AbstractC5960z8(int i10, String str, C8 c10) {
        Uri uri;
        String host;
        this.f35648a = J8.f19766c ? new J8() : null;
        this.f35652e = new Object();
        int iHashCode = 0;
        this.f35656i = false;
        this.f35657j = null;
        this.f35649b = i10;
        this.f35650c = str;
        this.f35653f = c10;
        this.f35659l = new C4449n8();
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.f35651d = iHashCode;
    }

    public final int c() {
        return this.f35651d;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f35654g.intValue() - ((AbstractC5960z8) obj).f35654g.intValue();
    }

    public final void d(String str) {
        if (J8.f19766c) {
            this.f35648a.a(str, Thread.currentThread().getId());
        }
    }

    final void e(String str) {
        B8 b10 = this.f35655h;
        if (b10 != null) {
            b10.c(this);
        }
        if (J8.f19766c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new RunnableC5708x8(this, str, id));
                return;
            }
            J8 j10 = this.f35648a;
            j10.a(str, id);
            j10.b(toString());
        }
    }

    final void f(int i10) {
        B8 b10 = this.f35655h;
        if (b10 != null) {
            b10.d(this, i10);
        }
    }

    public final AbstractC5960z8 g(B8 b10) {
        this.f35655h = b10;
        return this;
    }

    public final AbstractC5960z8 h(int i10) {
        this.f35654g = Integer.valueOf(i10);
        return this;
    }

    public final String i() {
        return this.f35650c;
    }

    public final String j() {
        int i10 = this.f35649b;
        String str = this.f35650c;
        if (i10 == 0) {
            return str;
        }
        String string = Integer.toString(1);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(str).length());
        sb.append(string);
        sb.append("-");
        sb.append(str);
        return sb.toString();
    }

    public final AbstractC5960z8 k(C3821i8 c3821i8) {
        this.f35657j = c3821i8;
        return this;
    }

    public final C3821i8 l() {
        return this.f35657j;
    }

    public final boolean m() {
        synchronized (this.f35652e) {
        }
        return false;
    }

    public Map n() {
        return Collections.EMPTY_MAP;
    }

    public byte[] o() {
        return null;
    }

    public final int p() {
        return this.f35659l.a();
    }

    public final void q() {
        synchronized (this.f35652e) {
            this.f35656i = true;
        }
    }

    public final boolean r() {
        boolean z9;
        synchronized (this.f35652e) {
            z9 = this.f35656i;
        }
        return z9;
    }

    protected abstract E8 s(C5456v8 c5456v8);

    protected abstract void t(Object obj);

    public final String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.f35651d));
        m();
        Integer num = this.f35654g;
        String str = this.f35650c;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(num).length();
        String strConcat = "0x".concat(strValueOf);
        StringBuilder sb = new StringBuilder(length + 5 + strConcat.length() + 8 + length2);
        sb.append("[ ] ");
        sb.append(str);
        sb.append(" ");
        sb.append(strConcat);
        sb.append(" NORMAL ");
        sb.append(num);
        return sb.toString();
    }

    public final void u(H8 h10) {
        C8 c10;
        synchronized (this.f35652e) {
            c10 = this.f35653f;
        }
        c10.a(h10);
    }

    final void v(InterfaceC5834y8 interfaceC5834y8) {
        synchronized (this.f35652e) {
            this.f35658k = interfaceC5834y8;
        }
    }

    final void w(E8 e10) {
        InterfaceC5834y8 interfaceC5834y8;
        synchronized (this.f35652e) {
            interfaceC5834y8 = this.f35658k;
        }
        if (interfaceC5834y8 != null) {
            interfaceC5834y8.b(this, e10);
        }
    }

    final void x() {
        InterfaceC5834y8 interfaceC5834y8;
        synchronized (this.f35652e) {
            interfaceC5834y8 = this.f35658k;
        }
        if (interfaceC5834y8 != null) {
            interfaceC5834y8.a(this);
        }
    }

    final /* synthetic */ J8 y() {
        return this.f35648a;
    }

    public final C4449n8 z() {
        return this.f35659l;
    }

    public final int zza() {
        return this.f35649b;
    }
}
