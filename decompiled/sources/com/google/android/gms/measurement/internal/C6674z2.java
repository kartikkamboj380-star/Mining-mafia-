package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.z2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6674z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f38567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f38568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f38569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ E2 f38570e;

    public C6674z2(E2 e10, String str, boolean z9) {
        Objects.requireNonNull(e10);
        this.f38570e = e10;
        Preconditions.checkNotEmpty(str);
        this.f38566a = str;
        this.f38567b = z9;
    }

    public final boolean a() {
        if (!this.f38568c) {
            this.f38568c = true;
            E2 e10 = this.f38570e;
            this.f38569d = e10.p().getBoolean(this.f38566a, this.f38567b);
        }
        return this.f38569d;
    }

    public final void b(boolean z9) {
        SharedPreferences.Editor editorEdit = this.f38570e.p().edit();
        editorEdit.putBoolean(this.f38566a, z9);
        editorEdit.apply();
        this.f38569d = z9;
    }
}
