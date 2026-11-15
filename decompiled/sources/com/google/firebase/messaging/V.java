package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.PlatformVersion;
import p176r5.InterfaceC7090g;

/* JADX INFO: loaded from: classes3.dex */
abstract class V {
    private static SharedPreferences b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    static boolean c(Context context) {
        return b(context).getBoolean("proxy_notification_initialized", false);
    }

    static boolean d(SharedPreferences sharedPreferences, boolean z9) {
        return sharedPreferences.contains("proxy_retention") && sharedPreferences.getBoolean("proxy_retention", false) == z9;
    }

    static void e(Context context, boolean z9) {
        SharedPreferences.Editor editorEdit = b(context).edit();
        editorEdit.putBoolean("proxy_notification_initialized", z9);
        editorEdit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(final Context context, H h10, final boolean z9) {
        if (PlatformVersion.isAtLeastQ() && !d(b(context), z9)) {
            h10.k(z9).f(new p191t0.j(), new InterfaceC7090g() { // from class: com.google.firebase.messaging.U
                @Override // p176r5.InterfaceC7090g
                public final void onSuccess(Object obj) {
                    V.g(context, z9);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(Context context, boolean z9) {
        SharedPreferences.Editor editorEdit = b(context).edit();
        editorEdit.putBoolean("proxy_retention", z9);
        editorEdit.apply();
    }
}
