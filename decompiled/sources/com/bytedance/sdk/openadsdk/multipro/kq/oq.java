package com.bytedance.sdk.openadsdk.multipro.kq;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.csi;
import com.bytedance.sdk.openadsdk.core.sns;

/* JADX INFO: loaded from: classes.dex */
public class oq implements com.bytedance.sdk.openadsdk.multipro.kq {
    private static final Object oq = new Object();
    private Context kq;

    private boolean oq(Uri uri) {
        return uri == null || TextUtils.isEmpty(uri.getPath());
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.kq
    @NonNull
    public String kq() {
        return "t_db";
    }

    private Context oq() {
        Context context = this.kq;
        return context == null ? sns.kq() : context;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.kq
    public Cursor kq(@NonNull Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        synchronized (oq) {
            try {
                if (oq(uri)) {
                    return null;
                }
                String[] strArrSplit = uri.getPath().split("/");
                if (strArrSplit != null && strArrSplit.length >= 4) {
                    String str3 = strArrSplit[2];
                    String str4 = strArrSplit[3];
                    if (!"ttopensdk.db".equals(str3)) {
                        return null;
                    }
                    return csi.kq(oq()).kq().kq(str4, strArr, str, strArr2, null, null, str2);
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.kq
    public String kq(@NonNull Uri uri) {
        synchronized (oq) {
            try {
                if (oq(uri)) {
                    return null;
                }
                String[] strArrSplit = uri.getPath().split("/");
                if (strArrSplit != null && strArrSplit.length >= 5) {
                    String str = strArrSplit[2];
                    String str2 = strArrSplit[4];
                    if ("ttopensdk.db".equals(str)) {
                        if ("execSQL".equals(str2)) {
                            String queryParameter = uri.getQueryParameter("sql");
                            if (!TextUtils.isEmpty(queryParameter)) {
                                csi.kq(oq()).kq().kq(Uri.decode(queryParameter));
                            }
                        } else if ("transactionBegin".equals(str2)) {
                            csi.kq(oq()).kq().oq();
                        } else if ("transactionSetSuccess".equals(str2)) {
                            csi.kq(oq()).kq().bob();
                        } else if ("transactionEnd".equals(str2)) {
                            csi.kq(oq()).kq().fou();
                        }
                    }
                    return null;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.kq
    public Uri kq(@NonNull Uri uri, ContentValues contentValues) {
        synchronized (oq) {
            try {
                if (oq(uri)) {
                    return null;
                }
                String[] strArrSplit = uri.getPath().split("/");
                if (strArrSplit != null && strArrSplit.length >= 4) {
                    String str = strArrSplit[2];
                    String str2 = strArrSplit[3];
                    if ("ttopensdk.db".equals(str)) {
                        csi.kq(oq()).kq().kq(str2, (String) null, contentValues);
                    }
                    return null;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.kq
    public int kq(@NonNull Uri uri, String str, String[] strArr) {
        synchronized (oq) {
            try {
                if (oq(uri)) {
                    return 0;
                }
                String[] strArrSplit = uri.getPath().split("/");
                if (strArrSplit != null && strArrSplit.length >= 4) {
                    String str2 = strArrSplit[2];
                    String str3 = strArrSplit[3];
                    if (!"ttopensdk.db".equals(str2)) {
                        return 0;
                    }
                    return csi.kq(oq()).kq().kq(str3, str, strArr);
                }
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.kq
    public int kq(@NonNull Uri uri, ContentValues contentValues, String str, String[] strArr) {
        synchronized (oq) {
            try {
                if (oq(uri)) {
                    return 0;
                }
                String[] strArrSplit = uri.getPath().split("/");
                if (strArrSplit != null && strArrSplit.length >= 4) {
                    String str2 = strArrSplit[2];
                    String str3 = strArrSplit[3];
                    if (!"ttopensdk.db".equals(str2)) {
                        return 0;
                    }
                    return csi.kq(oq()).kq().kq(str3, contentValues, str, strArr);
                }
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
