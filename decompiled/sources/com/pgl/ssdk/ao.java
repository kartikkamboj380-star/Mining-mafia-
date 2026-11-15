package com.pgl.ssdk;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class ao implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f41958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f41960c;

    public ao(Context context, int i10, Object[] objArr) {
        this.f41958a = context;
        this.f41959b = i10;
        this.f41960c = objArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f41959b == 222) {
                ak.a(this.f41958a).a();
            }
            byte[] bArr = (byte[]) com.pgl.ssdk.ces.a.meta(this.f41959b, this.f41958a, this.f41960c);
            if (bArr == null || bArr.length <= 0) {
                return;
            }
            new ap(this.f41958a, this.f41959b).a(1, 2, bArr);
        } catch (Throwable unused) {
        }
    }
}
