package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class D2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f37464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f37465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ E2 f37466d;

    public D2(E2 e10, String str, String str2) {
        Objects.requireNonNull(e10);
        this.f37466d = e10;
        Preconditions.checkNotEmpty(str);
        this.f37463a = str;
    }

    public final String a() {
        if (!this.f37464b) {
            this.f37464b = true;
            E2 e10 = this.f37466d;
            this.f37465c = e10.p().getString(this.f37463a, null);
        }
        return this.f37465c;
    }

    public final void b(String str) {
        SharedPreferences.Editor editorEdit = this.f37466d.p().edit();
        editorEdit.putString(this.f37463a, str);
        editorEdit.apply();
        this.f37465c = str;
    }
}
