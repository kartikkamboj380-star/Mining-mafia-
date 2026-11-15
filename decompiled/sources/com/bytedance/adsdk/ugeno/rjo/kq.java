package com.bytedance.adsdk.ugeno.rjo;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.Log;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class kq {

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.rjo.kq$kq, reason: collision with other inner class name */
    public static class C0232kq {
        public float[] bob;
        public GradientDrawable.Orientation kq;
        public int[] oq;
    }

    public static boolean bob(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("linear-gradient");
    }

    public static GradientDrawable.Orientation fou(String str) {
        try {
            int i10 = str.contains("deg") ? Integer.parseInt(str.substring(0, str.length() - 3).trim()) : Integer.parseInt(str);
            if (i10 == 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (i10 == 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (i10 == 270) {
                return GradientDrawable.Orientation.RIGHT_LEFT;
            }
            if (i10 == 135) {
                return GradientDrawable.Orientation.TL_BR;
            }
            return i10 == 45 ? GradientDrawable.Orientation.BL_TR : GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    public static int kq(String str) {
        return kq(str, -16777216);
    }

    public static C0232kq oq(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String strSubstring = str.substring(str.indexOf("(") + 1, str.lastIndexOf(")"));
            if (TextUtils.isEmpty(strSubstring)) {
                return null;
            }
            int iKq = kq(strSubstring, '%');
            int iIndexOf = strSubstring.indexOf(",");
            String strSubstring2 = strSubstring.substring(0, iIndexOf);
            C0232kq c0232kq = new C0232kq();
            c0232kq.kq = fou(strSubstring2);
            String strSubstring3 = strSubstring.substring(iIndexOf + 1);
            int[] iArr = new int[iKq];
            float[] fArr = new float[iKq];
            for (int i10 = 0; i10 < iKq; i10++) {
                int iIndexOf2 = strSubstring3.indexOf("%");
                String strTrim = strSubstring3.substring(0, iIndexOf2 + 1).trim();
                int iIndexOf3 = (strTrim.contains("rgba") ? strTrim.indexOf(")") : strTrim.indexOf(" ")) + 1;
                iArr[i10] = kq(strTrim.substring(0, iIndexOf3).trim());
                fArr[i10] = bob.kq(strTrim.substring(iIndexOf3, strTrim.indexOf("%")).trim(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) / 100.0f;
                int i11 = iIndexOf2 + 2;
                if (strSubstring3.length() <= i11) {
                    break;
                }
                strSubstring3 = strSubstring3.substring(i11);
            }
            if (iKq < 2) {
                return null;
            }
            c0232kq.oq = iArr;
            c0232kq.bob = fArr;
            return c0232kq;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int kq(String str, int i10) {
        if (!TextUtils.isEmpty(str)) {
            if (str.equals("transparent")) {
                return 0;
            }
            if (str.charAt(0) == '#' && str.length() == 4) {
                StringBuilder sb = new StringBuilder("#");
                char[] charArray = str.toCharArray();
                for (int i11 = 1; i11 < charArray.length; i11++) {
                    sb.append(charArray[i11]);
                    sb.append(charArray[i11]);
                }
                return Color.parseColor(sb.toString());
            }
            if (str.charAt(0) == '#' && str.length() == 7) {
                return Color.parseColor(str);
            }
            if (str.charAt(0) == '#' && str.length() == 9) {
                return Color.parseColor(str);
            }
            if (!str.startsWith("rgba")) {
                return -16777216;
            }
            String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",");
            if (strArrSplit != null && strArrSplit.length == 4) {
                return (((int) ((Float.parseFloat(strArrSplit[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(strArrSplit[0])) << 16) | (((int) Float.parseFloat(strArrSplit[1])) << 8) | ((int) Float.parseFloat(strArrSplit[2]));
            }
        }
        return i10;
    }

    public static int kq(String str, char c10) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (str.charAt(i11) == c10) {
                i10++;
            }
        }
        return i10;
    }

    public static int kq(int i10, int i11) {
        if (i11 < 0 || i11 > 255) {
            Log.e("ColorUtils", "alpha must be between 0 and 255. ");
            i11 = 255;
        }
        return (i10 & 16777215) | (i11 << 24);
    }
}
