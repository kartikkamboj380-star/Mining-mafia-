package com.bytedance.sdk.component.rhi.kq.oq.oq;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.rhi.kq.fou;
import com.bytedance.sdk.component.rhi.kq.kq.kq.rjo;
import com.bytedance.sdk.component.rhi.kq.rhi;
import com.bytedance.sdk.component.rhi.kq.syt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class oq {
    public static rhi kq;

    private static String fou() {
        return rjo.oq + "/ad_log_event/";
    }

    public static void oq() {
        if (syt.rjo().rhi() == null) {
            return;
        }
        try {
            rhi rhiVarKq = kq(syt.rjo().rhi());
            if (rhiVarKq != null) {
                rhiVarKq.kq(Uri.parse(fou() + "adLogStop"));
            }
        } catch (Throwable unused) {
        }
    }

    public String bob() {
        return "ad_log_event";
    }

    public int kq(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public int kq(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public Cursor kq(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public Uri kq(Uri uri, ContentValues contentValues) {
        return null;
    }

    public static rhi kq(Context context) {
        try {
            if (kq == null) {
                kq = syt.rjo().mxq().ubx();
            }
        } catch (Exception unused) {
        }
        return kq;
    }

    public static void kq() {
        if (syt.rjo().rhi() == null) {
            return;
        }
        try {
            rhi rhiVarKq = kq(syt.rjo().rhi());
            if (rhiVarKq != null) {
                rhiVarKq.kq(Uri.parse(fou() + "adLogStart"));
            }
        } catch (Throwable unused) {
        }
    }

    public static void kq(com.bytedance.sdk.component.rhi.kq.fou.kq kqVar) {
        if (kqVar == null) {
            return;
        }
        try {
            rhi rhiVarKq = kq(syt.rjo().rhi());
            if (rhiVarKq != null) {
                rhiVarKq.kq(Uri.parse(fou() + "adLogDispatch?event=" + com.bytedance.sdk.component.rhi.kq.kq.kq.rhi.kq(kqVar.rhi())));
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    public static void kq(String str, List<String> list, boolean z9, int i10, String str2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                sb.append(com.bytedance.sdk.component.rhi.kq.kq.kq.rhi.kq(it.next()));
                sb.append(",");
            }
            String str3 = "?did=" + String.valueOf(str) + "&track=" + String.valueOf(com.bytedance.sdk.component.rhi.kq.kq.kq.rhi.kq(sb.toString())) + "&replace=" + String.valueOf(z9) + "&urlType=" + String.valueOf(i10) + "&adId=" + str2;
            rhi rhiVarKq = kq(syt.rjo().rhi());
            if (rhiVarKq != null) {
                rhiVarKq.kq(Uri.parse(fou() + "trackAdUrl" + str3));
            }
        } catch (Throwable unused) {
        }
    }

    public static void kq(String str, boolean z9) {
        if (syt.rjo().mxq().rhi() == 0 && TextUtils.isEmpty(str)) {
            return;
        }
        try {
            rhi rhiVarKq = kq(syt.rjo().rhi());
            if (rhiVarKq != null) {
                rhiVarKq.kq(Uri.parse(fou() + "trackAdFailed?did=" + String.valueOf(str) + "&triggerOnInit=" + z9));
            }
        } catch (Throwable unused) {
        }
    }

    public String kq(Uri uri) {
        com.bytedance.sdk.component.rhi.kq.fou.kq kqVarBob;
        byte b10 = 2;
        String str = uri.getPath().split("/")[2];
        str.getClass();
        int i10 = 0;
        switch (str.hashCode()) {
            case -482705237:
                b10 = str.equals("trackAdFailed") ? (byte) 0 : (byte) -1;
                break;
            case -171493183:
                b10 = str.equals("adLogStart") ? (byte) 1 : (byte) -1;
                break;
            case 964299715:
                if (!str.equals("adLogStop")) {
                    b10 = -1;
                }
                break;
            case 1025736635:
                b10 = str.equals("adLogDispatch") ? (byte) 3 : (byte) -1;
                break;
            case 1131732929:
                b10 = str.equals("trackAdUrl") ? (byte) 4 : (byte) -1;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                com.bytedance.sdk.component.rhi.kq.rhi.kq.kq().kq(uri.getQueryParameter("did"), uri.getBooleanQueryParameter("triggerOnInit", false));
                break;
            case 1:
                syt.rjo().dgq();
                break;
            case 2:
                syt.rjo().ubx();
                break;
            case 3:
                String queryParameter = uri.getQueryParameter("event");
                if (!TextUtils.isEmpty(queryParameter) && (kqVarBob = com.bytedance.sdk.component.rhi.kq.fou.kq.kq.bob(com.bytedance.sdk.component.rhi.kq.kq.kq.rhi.oq(queryParameter))) != null) {
                    fou.kq.kq(kqVarBob);
                    break;
                }
                break;
            case 4:
                try {
                    String queryParameter2 = uri.getQueryParameter("did");
                    boolean zBooleanValue = Boolean.valueOf(uri.getQueryParameter("replace")).booleanValue();
                    String queryParameter3 = uri.getQueryParameter("track");
                    String queryParameter4 = uri.getQueryParameter("urlType");
                    String queryParameter5 = uri.getQueryParameter("adId");
                    String[] strArrSplit = com.bytedance.sdk.component.rhi.kq.kq.kq.rhi.oq(queryParameter3).split(",");
                    if (strArrSplit.length > 0) {
                        ArrayList arrayList = new ArrayList();
                        for (String str2 : strArrSplit) {
                            String strOq = com.bytedance.sdk.component.rhi.kq.kq.kq.rhi.oq(str2);
                            if (!TextUtils.isEmpty(strOq)) {
                                arrayList.add(strOq);
                            }
                        }
                        try {
                            if (!TextUtils.isEmpty(queryParameter4)) {
                                i10 = Integer.parseInt(queryParameter4);
                            }
                            break;
                        } catch (Exception unused) {
                        }
                        com.bytedance.sdk.component.rhi.kq.rhi.kq.kq().kq(queryParameter2, arrayList, zBooleanValue, null, i10, queryParameter5);
                    }
                } catch (Throwable unused2) {
                    return null;
                }
                break;
        }
        return null;
    }
}
