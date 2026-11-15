package com.google.android.play.core.integrity;

import V5.A;
import V5.AbstractC0973j;
import V5.C0969f;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import p176r5.AbstractC7096m;
import p176r5.C7094k;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6697k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V5.E f39869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f39870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r f39871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Y f39872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final C0969f f39873e;

    C6697k(Context context, V5.E e10, r rVar, Y y9) {
        this.f39870b = context.getPackageName();
        this.f39869a = e10;
        this.f39871c = rVar;
        this.f39872d = y9;
        if (AbstractC0973j.b(context)) {
            this.f39873e = new C0969f(context, e10, "IntegrityService", AbstractC6698l.f39874a, new V5.L() { // from class: T5.b
                @Override // V5.L
                public final Object a(IBinder iBinder) {
                    return A.h0(iBinder);
                }
            }, null);
        } else {
            e10.a("Phonesky is not installed.", new Object[0]);
            this.f39873e = null;
        }
    }

    static /* bridge */ /* synthetic */ Bundle a(C6697k c6697k, byte[] bArr, Long l10, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", c6697k.f39870b);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l10 != null) {
            bundle.putLong("cloud.prj", l10.longValue());
        }
        ArrayList arrayList = new ArrayList();
        V5.r.b(3, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(V5.r.a(arrayList)));
        return bundle;
    }

    public final Task b(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f39873e == null) {
            return AbstractC7096m.e(new C6687a(-2, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(integrityTokenRequest.b(), 10);
            Long lA = integrityTokenRequest.a();
            if (integrityTokenRequest instanceof C6701o) {
            }
            this.f39869a.c("requestIntegrityToken(%s)", integrityTokenRequest);
            C7094k c7094k = new C7094k();
            this.f39873e.t(new C6694h(this, c7094k, bArrDecode, lA, null, c7094k, integrityTokenRequest), c7094k);
            return c7094k.a();
        } catch (IllegalArgumentException e10) {
            return AbstractC7096m.e(new C6687a(-13, e10));
        }
    }
}
