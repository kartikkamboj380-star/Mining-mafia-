package com.apm.insight.i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.apm.insight.runtime.o;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile UUID f12944a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f12945b = "";

    @SuppressLint({"MissingPermission", "HardwareIds"})
    private a(Context context) {
        String string;
        if (f12944a == null) {
            synchronized (a.class) {
                if (f12944a == null) {
                    String strC = o.a().c();
                    if (strC != null) {
                        f12944a = UUID.fromString(strC);
                    } else {
                        try {
                            string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                        } catch (Throwable unused) {
                            string = null;
                        }
                        try {
                            if (string != null) {
                                f12944a = UUID.nameUUIDFromBytes(string.getBytes("utf8"));
                            } else {
                                f12944a = UUID.randomUUID();
                            }
                        } catch (Throwable unused2) {
                        }
                        try {
                            o.a().b(f12944a.toString());
                        } catch (Throwable unused3) {
                        }
                    }
                }
            }
        }
    }

    public static synchronized String a(Context context) {
        try {
            if (TextUtils.isEmpty(f12945b)) {
                new a(context);
                UUID uuid = f12944a;
                if (uuid != null) {
                    f12945b = uuid.toString();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return f12945b;
    }
}
