package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractAsyncTaskC4898qh0 extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C5023rh0 f32706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final C4142kh0 f32707b;

    public AbstractAsyncTaskC4898qh0(C4142kh0 c4142kh0) {
        this.f32707b = c4142kh0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        C5023rh0 c5023rh0 = this.f32706a;
        if (c5023rh0 != null) {
            c5023rh0.b(this);
        }
    }

    public final void b(C5023rh0 c5023rh0) {
        this.f32706a = c5023rh0;
    }
}
