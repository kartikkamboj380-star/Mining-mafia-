package com.google.android.gms.internal.ads;

import K4.AbstractC0768f0;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ph, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2239Ph {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22148a;

    public C2239Ph(Context context) {
        Preconditions.checkNotNull(context, "Context can not be null");
        this.f22148a = context;
    }

    public final boolean a() {
        Context context = this.f22148a;
        return ((Boolean) AbstractC0768f0.a(context, CallableC2187Oh.f21631a)).booleanValue() && Wrappers.packageManager(context).checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public final boolean b() {
        return c(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    public final boolean c(Intent intent) {
        Preconditions.checkNotNull(intent, "Intent can not be null");
        return !this.f22148a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }
}
