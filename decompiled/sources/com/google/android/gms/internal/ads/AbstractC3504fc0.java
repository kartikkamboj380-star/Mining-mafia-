package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import p176r5.AbstractC7096m;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3504fc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static Task f28447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static W4.b f28448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f28449c = new Object();

    public static void a(Context context, boolean z9) {
        synchronized (f28449c) {
            try {
                if (f28448b == null) {
                    f28448b = W4.a.a(context);
                }
                Task task = f28447a;
                if (task == null || ((task.n() && !f28447a.isSuccessful()) || (z9 && f28447a.n()))) {
                    try {
                        f28447a = ((W4.b) Preconditions.checkNotNull(f28448b, "the appSetIdClient shouldn't be null")).b();
                    } catch (ArrayIndexOutOfBoundsException e10) {
                        String message = e10.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 31);
                        sb.append("Failed to get app set ID info: ");
                        sb.append(message);
                        AbstractC0786o0.k(sb.toString());
                        f28447a = AbstractC7096m.e(e10);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Task b(Context context) {
        Task task;
        a(context, false);
        synchronized (f28449c) {
            task = f28447a;
        }
        return task;
    }
}
