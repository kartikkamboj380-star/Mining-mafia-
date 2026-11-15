package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Lx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2063Lx extends MutableContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Activity f20694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f20695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f20696c;

    public C2063Lx(Context context) {
        super(context);
        setBaseContext(context);
    }

    public final void a(Intent intent, int i10) {
        if (this.f20694a == null) {
            intent.setFlags(268435456);
            this.f20695b.startActivity(intent);
            return;
        }
        String strValueOf = String.valueOf(intent.getData());
        StringBuilder sb = new StringBuilder(strValueOf.length() + 63);
        sb.append("Starting activity for result with intent: ");
        sb.append(strValueOf);
        sb.append(" and requestCode: 236");
        AbstractC0786o0.k(sb.toString());
        this.f20694a.startActivityForResult(intent, 236);
    }

    public final Activity b() {
        return this.f20694a;
    }

    public final Context c() {
        return this.f20696c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.f20696c.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f20695b = applicationContext;
        this.f20694a = context instanceof Activity ? (Activity) context : null;
        this.f20696c = context;
        super.setBaseContext(applicationContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.f20694a;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            this.f20695b.startActivity(intent);
        }
    }
}
