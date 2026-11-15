package com.bytedance.sdk.openadsdk.multipro;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface kq {
    int kq(@NonNull Uri uri, ContentValues contentValues, String str, String[] strArr);

    int kq(@NonNull Uri uri, String str, String[] strArr);

    Cursor kq(@NonNull Uri uri, String[] strArr, String str, String[] strArr2, String str2);

    Uri kq(@NonNull Uri uri, ContentValues contentValues);

    @NonNull
    String kq();

    String kq(@NonNull Uri uri);
}
