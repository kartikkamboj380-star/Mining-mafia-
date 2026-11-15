package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6104m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static UserManager f36118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f36119b = !b();

    /* JADX WARN: Code duplicated, block: B:33:0x0054 A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:9:0x000f, B:11:0x0013, B:18:0x001d, B:20:0x0021, B:21:0x002b, B:35:0x0058, B:36:0x005a, B:24:0x0031, B:26:0x0037, B:33:0x0054, B:31:0x0046), top: B:42:0x000f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0058 A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:9:0x000f, B:11:0x0013, B:18:0x001d, B:20:0x0021, B:21:0x002b, B:35:0x0058, B:36:0x005a, B:24:0x0031, B:26:0x0037, B:33:0x0054, B:31:0x0046), top: B:42:0x000f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x005d A[RETURN] */
    public static boolean a(Context context) {
        boolean z9;
        if (b() && !f36119b) {
            synchronized (AbstractC6104m.class) {
                try {
                    if (!f36119b) {
                        int i10 = 1;
                        while (true) {
                            if (i10 <= 2) {
                                if (f36118a == null) {
                                    f36118a = (UserManager) context.getSystemService(UserManager.class);
                                }
                                UserManager userManager = f36118a;
                                if (userManager == null) {
                                    z9 = true;
                                } else {
                                    try {
                                        if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
                                            z9 = true;
                                        }
                                        if (z9) {
                                            f36118a = null;
                                        }
                                    } catch (NullPointerException e10) {
                                        Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e10);
                                        f36118a = null;
                                        i10++;
                                    }
                                }
                                if (z9) {
                                    f36119b = true;
                                }
                                if (!z9) {
                                    return true;
                                }
                            }
                            z9 = false;
                            if (z9) {
                                f36118a = null;
                            }
                            if (z9) {
                                f36119b = true;
                            }
                            if (!z9) {
                                return true;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return false;
    }

    public static boolean b() {
        return true;
    }
}
