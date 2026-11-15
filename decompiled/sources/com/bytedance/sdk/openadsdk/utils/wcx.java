package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import com.google.protobuf.CodedOutputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class wcx {
    public static void kq() {
        Context contextKq = com.bytedance.sdk.openadsdk.core.sns.kq();
        if (contextKq != null && com.bytedance.sdk.component.utils.nze.fou()) {
            String packageName = contextKq.getPackageName();
            int i10 = contextKq.getApplicationInfo().targetSdkVersion;
            try {
                String[] strArr = contextKq.getPackageManager().getPackageInfo(packageName, CodedOutputStream.DEFAULT_BUFFER_SIZE).requestedPermissions;
                if (strArr == null || strArr.length <= 0) {
                    return;
                }
                List<String> listOq = oq();
                for (String str : strArr) {
                    if (str != null) {
                        listOq.remove(str);
                    }
                }
                if (listOq.isEmpty()) {
                    return;
                }
                for (String str2 : listOq) {
                }
            } catch (Throwable unused) {
            }
        }
    }

    private static List<String> oq() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.INTERNET");
        arrayList.add("android.permission.ACCESS_NETWORK_STATE");
        arrayList.add("android.permission.WAKE_LOCK");
        return arrayList;
    }
}
