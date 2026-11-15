package com.google.android.gms.internal.auth;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6101l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static HashMap f36110f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Object f36115k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static boolean f36116l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Uri f36105a = Uri.parse("content://com.google.android.gsf.gservices");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Uri f36106b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f36107c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f36108d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicBoolean f36109e = new AtomicBoolean();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final HashMap f36111g = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final HashMap f36112h = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final HashMap f36113i = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final HashMap f36114j = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final String[] f36117m = new String[0];

    public static String a(ContentResolver contentResolver, String str, String str2) {
        synchronized (AbstractC6101l.class) {
            try {
                String str3 = null;
                if (f36110f == null) {
                    f36109e.set(false);
                    f36110f = new HashMap(16, 1.0f);
                    f36115k = new Object();
                    f36116l = false;
                    contentResolver.registerContentObserver(f36105a, true, new C6098k(null));
                } else if (f36109e.getAndSet(false)) {
                    f36110f.clear();
                    f36111g.clear();
                    f36112h.clear();
                    f36113i.clear();
                    f36114j.clear();
                    f36115k = new Object();
                    f36116l = false;
                }
                Object obj = f36115k;
                if (f36110f.containsKey(str)) {
                    String str4 = (String) f36110f.get(str);
                    if (str4 != null) {
                        str3 = str4;
                    }
                    return str3;
                }
                int length = f36117m.length;
                Cursor cursorQuery = contentResolver.query(f36105a, null, null, new String[]{str}, null);
                if (cursorQuery == null) {
                    return null;
                }
                try {
                    if (!cursorQuery.moveToFirst()) {
                        c(obj, str, null);
                        cursorQuery.close();
                        return null;
                    }
                    String string = cursorQuery.getString(1);
                    cursorQuery.close();
                    if (string != null && string.equals(null)) {
                        string = null;
                    }
                    c(obj, str, string);
                    if (string != null) {
                        return string;
                    }
                    return null;
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void c(Object obj, String str, String str2) {
        synchronized (AbstractC6101l.class) {
            try {
                if (obj == f36115k) {
                    f36110f.put(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
