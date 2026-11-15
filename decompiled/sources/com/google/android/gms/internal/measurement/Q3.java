package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Q3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static UserManager f36470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f36471b = !a();

    public static boolean a() {
        return true;
    }

    public static boolean b(Context context) {
        return a() && !d(context);
    }

    public static boolean c(Context context) {
        return !a() || d(context);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0050 A[Catch: all -> 0x000f, TryCatch #1 {all -> 0x000f, blocks: (B:7:0x0009, B:9:0x000d, B:16:0x0017, B:18:0x001b, B:19:0x0025, B:32:0x0050, B:33:0x0052, B:22:0x002b, B:24:0x0031, B:28:0x003e, B:30:0x004c), top: B:39:0x0009, inners: #0 }] */
    private static boolean d(Context context) {
        if (f36471b) {
            return true;
        }
        synchronized (Q3.class) {
            try {
                if (f36471b) {
                    return true;
                }
                int i10 = 1;
                while (true) {
                    boolean z9 = false;
                    if (i10 <= 2) {
                        if (f36470a == null) {
                            f36470a = (UserManager) context.getSystemService(UserManager.class);
                        }
                        UserManager userManager = f36470a;
                        if (userManager == null) {
                            z9 = true;
                        } else {
                            try {
                                if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
                                    z9 = true;
                                }
                            } catch (NullPointerException e10) {
                                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e10);
                                f36470a = null;
                                i10++;
                            }
                        }
                        if (z9) {
                            f36471b = true;
                        }
                        return z9;
                    }
                    if (z9) {
                        f36470a = null;
                    }
                    if (z9) {
                        f36471b = true;
                    }
                    return z9;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
