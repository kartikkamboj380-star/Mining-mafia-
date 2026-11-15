package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class B2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f37397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f37398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f37399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ E2 f37400e;

    public B2(E2 e10, String str, long j10) {
        Objects.requireNonNull(e10);
        this.f37400e = e10;
        Preconditions.checkNotEmpty(str);
        this.f37396a = str;
        this.f37397b = j10;
    }

    public final long a() {
        if (!this.f37398c) {
            this.f37398c = true;
            E2 e10 = this.f37400e;
            this.f37399d = e10.p().getLong(this.f37396a, this.f37397b);
        }
        return this.f37399d;
    }

    public final void b(long j10) {
        SharedPreferences.Editor editorEdit = this.f37400e.p().edit();
        editorEdit.putLong(this.f37396a, j10);
        editorEdit.apply();
        this.f37399d = j10;
    }
}
