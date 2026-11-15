package com.google.android.play.core.integrity;

import V5.C0969f;
import V5.v;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import p176r5.C7094k;

/* JADX INFO: loaded from: classes2.dex */
final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V5.E f39808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f39809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C7094k f39810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r f39811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Y f39812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final C0969f f39813f;

    J(Context context, V5.E e10, r rVar, Y y9) {
        C7094k c7094k = new C7094k();
        this.f39810c = c7094k;
        this.f39809b = context.getPackageName();
        this.f39808a = e10;
        this.f39811d = rVar;
        this.f39812e = y9;
        C0969f c0969f = new C0969f(context, e10, "ExpressIntegrityService", K.f39814a, new V5.L() { // from class: T5.e
            @Override // V5.L
            public final Object a(IBinder iBinder) {
                return v.h0(iBinder);
            }
        }, null);
        this.f39813f = c0969f;
        c0969f.c().post(new B(this, c7094k, context));
    }

    static /* bridge */ /* synthetic */ Bundle a(J j10, String str, long j11, long j12, int i10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", j10.f39809b);
        bundle.putLong("cloud.prj", j11);
        bundle.putString("nonce", str);
        bundle.putLong("warm.up.sid", j12);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        V5.r.b(5, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(V5.r.a(arrayList)));
        return bundle;
    }

    static /* bridge */ /* synthetic */ Bundle b(J j10, long j11, int i10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", j10.f39809b);
        bundle.putLong("cloud.prj", j11);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        V5.r.b(4, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(V5.r.a(arrayList)));
        return bundle;
    }

    static /* bridge */ /* synthetic */ boolean i(J j10) {
        return j10.f39810c.a().isSuccessful() && ((Integer) j10.f39810c.a().getResult()).intValue() == 0;
    }

    public final Task c(String str, long j10, long j11, int i10) {
        this.f39808a.c("requestExpressIntegrityToken(%s)", Long.valueOf(j11));
        C7094k c7094k = new C7094k();
        this.f39813f.t(new D(this, c7094k, 0, str, j10, j11, c7094k), c7094k);
        return c7094k.a();
    }

    public final Task d(long j10, int i10) {
        this.f39808a.c("warmUpIntegrityToken(%s)", Long.valueOf(j10));
        C7094k c7094k = new C7094k();
        this.f39813f.t(new C(this, c7094k, 0, j10, c7094k), c7094k);
        return c7094k.a();
    }
}
