package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class CV0 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ContentResolver f17890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f17891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ FV0 f17892c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CV0(FV0 fv0, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        Objects.requireNonNull(fv0);
        this.f17892c = fv0;
        this.f17890a = contentResolver;
        this.f17891b = uri;
    }

    public final void a() {
        this.f17890a.registerContentObserver(this.f17891b, false, this);
    }

    public final void b() {
        this.f17890a.unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z9) {
        FV0 fv0 = this.f17892c;
        fv0.f(AV0.a(fv0.g(), fv0.j(), fv0.h()));
    }
}
