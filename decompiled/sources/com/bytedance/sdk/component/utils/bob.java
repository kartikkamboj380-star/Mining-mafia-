package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.pm.Signature;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class bob {
    private static HashMap<String, ArrayList<String>> kq = new HashMap<>();

    public static ArrayList<String> kq(Context context, String str) {
        ArrayList<String> arrayList = null;
        if (context != null && str != null) {
            String packageName = context.getPackageName();
            if (packageName == null) {
                return null;
            }
            if (kq.get(str) != null) {
                return kq.get(str);
            }
            arrayList = new ArrayList<>();
            try {
                for (Signature signature : oq(context, packageName)) {
                    String strKq = "error!";
                    if ("MD5".equals(str)) {
                        strKq = kq(signature, "MD5");
                    } else if ("SHA1".equals(str)) {
                        strKq = kq(signature, "SHA1");
                    } else if ("SHA256".equals(str)) {
                        strKq = kq(signature, "SHA256");
                    }
                    arrayList.add(strKq);
                }
            } catch (Exception unused) {
            }
            kq.put(str, arrayList);
        }
        return arrayList;
    }

    private static Signature[] oq(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64).signatures;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String kq(Context context) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arrayListKq = kq(context, "SHA1");
        if (arrayListKq != null && arrayListKq.size() != 0) {
            for (int i10 = 0; i10 < arrayListKq.size(); i10++) {
                sb.append(arrayListKq.get(i10));
                if (i10 < arrayListKq.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    private static String kq(Signature signature, String str) {
        byte[] byteArray = signature.toByteArray();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            if (messageDigest != null) {
                byte[] bArrDigest = messageDigest.digest(byteArray);
                StringBuilder sb = new StringBuilder();
                for (byte b10 : bArrDigest) {
                    sb.append(Integer.toHexString((b10 & 255) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER).substring(1, 3).toUpperCase());
                    sb.append(":");
                }
                return sb.substring(0, sb.length() - 1).toString();
            }
            return "error!";
        } catch (Exception unused) {
            return "error!";
        }
    }
}
