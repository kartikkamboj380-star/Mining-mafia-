package com.bytedance.sdk.openadsdk.multipro.fou;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.sns;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class bob implements com.bytedance.sdk.openadsdk.multipro.kq {
    private Context kq;

    private Context oq() {
        Context context = this.kq;
        return context == null ? sns.kq() : context;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.kq
    @NonNull
    public String kq() {
        return "t_sp";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.kq
    public Cursor kq(@NonNull Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Map<String, ?> mapBob;
        if (!uri.getPath().split("/")[2].equals("get_all") || (mapBob = oq.bob(oq(), uri.getQueryParameter("sp_file_name"))) == null) {
            return null;
        }
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"cursor_name", "cursor_type", "cursor_value"});
        for (String str3 : mapBob.keySet()) {
            Object[] objArr = new Object[3];
            objArr[0] = str3;
            Object obj = mapBob.get(str3);
            objArr[2] = obj;
            if (obj instanceof Boolean) {
                objArr[1] = "boolean";
            } else if (obj instanceof String) {
                objArr[1] = "string";
            } else if (obj instanceof Integer) {
                objArr[1] = "int";
            } else if (obj instanceof Long) {
                objArr[1] = "long";
            } else if (obj instanceof Float) {
                objArr[1] = "float";
            }
            matrixCursor.addRow(objArr);
        }
        return matrixCursor;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.kq
    public String kq(@NonNull Uri uri) {
        String[] strArrSplit = uri.getPath().split("/");
        String str = strArrSplit[2];
        String str2 = strArrSplit[3];
        if (str.equals("contain")) {
            return String.valueOf(oq.kq(sns.kq(), uri.getQueryParameter("sp_file_name"), str2));
        }
        return oq.kq(oq(), uri.getQueryParameter("sp_file_name"), str2, str);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.kq
    public Uri kq(@NonNull Uri uri, ContentValues contentValues) {
        if (contentValues == null) {
            return null;
        }
        String str = uri.getPath().split("/")[3];
        Object obj = contentValues.get("value");
        if (obj != null) {
            oq.kq(oq(), uri.getQueryParameter("sp_file_name"), str, obj);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.kq
    public int kq(@NonNull Uri uri, String str, String[] strArr) {
        String[] strArrSplit = uri.getPath().split("/");
        if (strArrSplit[2].equals("clean")) {
            oq.oq(oq(), uri.getQueryParameter("sp_file_name"));
            return 0;
        }
        String str2 = strArrSplit[3];
        if (oq.kq(oq(), uri.getQueryParameter("sp_file_name"), str2)) {
            oq.oq(oq(), uri.getQueryParameter("sp_file_name"), str2);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.kq
    public int kq(@NonNull Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (contentValues == null) {
            return 0;
        }
        kq(uri, contentValues);
        return 0;
    }
}
