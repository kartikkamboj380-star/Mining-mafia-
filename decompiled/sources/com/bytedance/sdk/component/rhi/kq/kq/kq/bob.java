package com.bytedance.sdk.component.rhi.kq.kq.kq;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class bob {
    public static void kq(Context context, String str, ContentValues contentValues) {
        if (contentValues == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            kq.kq(context).kq().kq(str, (String) null, contentValues);
        } catch (Throwable unused) {
        }
    }

    public static void kq(Context context, String str, List<com.bytedance.sdk.component.rhi.kq.fou.kq> list) {
        if (list == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            kq.kq(context).kq().kq(str, (String) null, list);
        } catch (Throwable unused) {
        }
    }

    public static int kq(Context context, String str, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return kq.kq(context).kq().kq(str, str2, strArr);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int kq(Context context, String str, ContentValues contentValues, String str2, String[] strArr) {
        if (contentValues != null && !TextUtils.isEmpty(str)) {
            try {
                return kq.kq(context).kq().kq(str, contentValues, str2, strArr);
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    public static Cursor kq(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return kq.kq(context).kq().kq(str, strArr, str2, strArr2, null, null, str5);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void kq(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            kq.kq(context).kq().kq(Uri.decode(str));
        } catch (Throwable unused) {
        }
    }
}
