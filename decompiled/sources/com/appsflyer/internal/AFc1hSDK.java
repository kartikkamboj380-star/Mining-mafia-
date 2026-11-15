package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.hardware.SensorManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.unity3d.services.UnityAdsConstants;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1hSDK extends HashMap<String, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static long component4;
    private static char getCurrencyIso4217Code;
    private static char[] getMediationNetwork;
    private static char[] getRevenue;
    private final Context AFAdRevenueData;
    private final Map<String, Object> getMonetizationNetwork;

    public static class AFa1tSDK {
        @NonNull
        static byte[] getCurrencyIso4217Code(@NonNull String str) {
            return str.getBytes(Charset.defaultCharset());
        }

        static byte[] getRevenue(@NonNull byte[] bArr) {
            for (int i10 = 0; i10 < bArr.length; i10++) {
                bArr[i10] = (byte) (bArr[i10] ^ ((i10 % 2) + 42));
            }
            return bArr;
        }
    }

    static {
        getMediationNetwork();
        TextUtils.indexOf((CharSequence) "", '0');
        TextUtils.lastIndexOf("", '0', 0, 0);
        ViewConfiguration.getMaximumDrawingCacheSize();
        ExpandableListView.getPackedPositionForChild(0, 0);
        ExpandableListView.getPackedPositionChild(0L);
        View.resolveSizeAndState(0, 0, 0);
        TextUtils.lastIndexOf("", '0');
        Color.argb(0, 0, 0, 0);
        PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ExpandableListView.getPackedPositionForChild(0, 0);
        ImageFormat.getBitsPerPixel(0);
        PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        AudioTrack.getMaxVolume();
        KeyEvent.normalizeMetaState(0);
        TextUtils.lastIndexOf("", '0', 0);
        ExpandableListView.getPackedPositionType(0L);
        View.resolveSizeAndState(0, 0, 0);
        ViewConfiguration.getScrollFriction();
        component2 = (component1 + 87) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
    }

    public AFc1hSDK(Map<String, Object> map, Context context) {
        this.getMonetizationNetwork = map;
        this.AFAdRevenueData = context;
        put(getRevenue(), getMonetizationNetwork());
    }

    private static StringBuilder AFAdRevenueData(@NonNull String... strArr) {
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        component1 = (component2 + 33) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        for (int i10 = 0; i10 < 3; i10++) {
            arrayList.add(Integer.valueOf(strArr[i10].length()));
        }
        Collections.sort(arrayList);
        int iIntValue = ((Integer) arrayList.get(0)).intValue();
        StringBuilder sb = new StringBuilder();
        for (int i11 = 0; i11 < iIntValue; i11++) {
            int i12 = component1;
            component2 = (i12 + 61) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            component2 = (i12 + 17) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            Integer numValueOf = null;
            for (int i13 = 0; i13 < 3; i13++) {
                component2 = (component1 + 41) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                int iCharAt = strArr[i13].charAt(i11);
                if (numValueOf != null) {
                    iCharAt ^= numValueOf.intValue();
                }
                numValueOf = Integer.valueOf(iCharAt);
            }
            sb.append(Integer.toHexString(numValueOf.intValue()));
        }
        return sb;
    }

    private static void a(byte b10, String str, int i10, Object[] objArr) {
        int i11;
        Object charArray = str;
        if (str != null) {
            $11 = ($10 + 111) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        AFk1oSDK aFk1oSDK = new AFk1oSDK();
        char[] cArr2 = getRevenue;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i12 = 0; i12 < length; i12++) {
                cArr3[i12] = (char) (((long) cArr2[i12]) ^ 3069006688033654235L);
            }
            cArr2 = cArr3;
        }
        char c10 = (char) (3069006688033654235L ^ ((long) getCurrencyIso4217Code));
        char[] cArr4 = new char[i10];
        if (i10 % 2 != 0) {
            int i13 = ($11 + 117) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            $10 = i13;
            i11 = i10 - 1;
            cArr4[i11] = (char) (cArr[i11] - b10);
            $11 = (i13 + 55) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        } else {
            i11 = i10;
        }
        if (i11 > 1) {
            aFk1oSDK.AFAdRevenueData = 0;
            while (true) {
                int i14 = aFk1oSDK.AFAdRevenueData;
                if (i14 >= i11) {
                    break;
                }
                char c11 = cArr[i14];
                aFk1oSDK.getCurrencyIso4217Code = c11;
                char c12 = cArr[i14 + 1];
                aFk1oSDK.getRevenue = c12;
                if (c11 == c12) {
                    cArr4[i14] = (char) (c11 - b10);
                    cArr4[i14 + 1] = (char) (c12 - b10);
                } else {
                    int i15 = c11 / c10;
                    aFk1oSDK.getMonetizationNetwork = i15;
                    int i16 = c11 % c10;
                    aFk1oSDK.component3 = i16;
                    int i17 = c12 / c10;
                    aFk1oSDK.getMediationNetwork = i17;
                    int i18 = c12 % c10;
                    aFk1oSDK.component1 = i18;
                    if (i16 == i18) {
                        int i19 = ((i15 + c10) - 1) % c10;
                        aFk1oSDK.getMonetizationNetwork = i19;
                        int i20 = ((i17 + c10) - 1) % c10;
                        aFk1oSDK.getMediationNetwork = i20;
                        cArr4[i14] = cArr2[(i19 * c10) + i16];
                        cArr4[i14 + 1] = cArr2[(i20 * c10) + i18];
                    } else if (i15 == i17) {
                        int i21 = ((i16 + c10) - 1) % c10;
                        aFk1oSDK.component3 = i21;
                        int i22 = ((i18 + c10) - 1) % c10;
                        aFk1oSDK.component1 = i22;
                        cArr4[i14] = cArr2[(i15 * c10) + i21];
                        cArr4[i14 + 1] = cArr2[(i17 * c10) + i22];
                    } else {
                        cArr4[i14] = cArr2[(i15 * c10) + i18];
                        cArr4[i14 + 1] = cArr2[(i17 * c10) + i16];
                    }
                }
                aFk1oSDK.AFAdRevenueData = i14 + 2;
            }
        }
        for (int i23 = 0; i23 < i10; i23++) {
            cArr4[i23] = (char) (cArr4[i23] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    private static void b(char c10, int i10, int i11, Object[] objArr) {
        AFk1kSDK aFk1kSDK = new AFk1kSDK();
        long[] jArr = new long[i10];
        aFk1kSDK.getMediationNetwork = 0;
        while (true) {
            int i12 = aFk1kSDK.getMediationNetwork;
            if (i12 >= i10) {
                break;
            }
            $10 = ($11 + 113) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            jArr[i12] = (((long) ((char) (((long) getMediationNetwork[i11 + i12]) ^ 5211070536272185776L))) ^ (((long) i12) * (5211070536272185776L ^ component4))) ^ ((long) c10);
            aFk1kSDK.getMediationNetwork = i12 + 1;
        }
        char[] cArr = new char[i10];
        aFk1kSDK.getMediationNetwork = 0;
        $10 = ($11 + 5) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        while (true) {
            int i13 = aFk1kSDK.getMediationNetwork;
            if (i13 >= i10) {
                String str = new String(cArr);
                $10 = ($11 + 117) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                objArr[0] = str;
                return;
            }
            cArr[i13] = (char) jArr[i13];
            aFk1kSDK.getMediationNetwork = i13 + 1;
        }
    }

    static void getMediationNetwork() {
        getRevenue = new char[]{28789, 28768, 28779, 28769, 28795, 28713, 28706, 28787, 28771, 28717, 28776, 28774, 28781, 28778, 28780, 28716, 28791, 28719, 28723, 28788, 28695, 28712, 28727, 28724, 28682, 28721, 28714, 28704, 28793, 28792, 28726, 28722, 28725, 28783, 28718, 28777, 28709, 28711, 28770, 28708, 28782, 28784, 28728, 28707, 28710, 28775, 28702, 28729, 28785};
        getCurrencyIso4217Code = (char) 17884;
        getMediationNetwork = new char[]{5817, 23451, 36062, 61731, 8823, 2558, 17613, 37771, 61028, 15658, 34827, 50898, 5546, 2518, 17635, 37821, 61002, 15645, 34862, 50876, 5513, 24645, 48924, 2593, 22756, 38793, 57934, 12645, 35888, 56055, 10690, 25695, 45923, 3646, 23690, 43927, 59051, 13689, 32882, 57043, 11679, 30908, 46962, 588, 20699, 44936, 64161, 18801, 33814, 53964, 8675, 31923, 52032, 1626, 21650, 34848, 50461, 4688, 28579, 48378, 2544, 18187, 37997, 57784, 16103, 35802, 55588, 5759, 25528, 45215, 15744, 28861, 42977, 55813, 2374, 48242, 62121, 8593, 21528, 35661, 15969, 27810, 41943, 54815, 1395, 47214, 61090, 7623, 20492, 34616, 14951, 26837, 40943, 53982, 261, 46167, 60080, 6645, 19648, 33556, 13950, 25767, 39904, 52957, 32002, 45170, 59053, 38308, 55431, 4057, 29238, 41341, 5208, 23197, 35322, 64565, 9056, 38465, 2454, 17650, 2519, 17639, 37792, 61040, 15690, 34844, 50941, 5506, 24661, 48919, 2660, 22771, 38810, 57928, 12643, 35884, 28263, 8963, 62484, 35239, 23224, 61386, 41309, 29294, 2017, 55537, 28103, 16196, 61489, 34303, 22236, 60290};
        component4 = 8166711332525589634L;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x01f3  */
    private String getMonetizationNetwork() {
        long j10;
        String string;
        float f10;
        int i10;
        try {
            Map<String, Object> map = this.getMonetizationNetwork;
            Object[] objArr = new Object[1];
            a((byte) (TextUtils.indexOf((CharSequence) "", '0') + 30), "\u0017)\u0004'\u0016\u000e& \"\u0019\u0012\u0016", 12 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr);
            String string2 = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.getMonetizationNetwork;
            Object[] objArr2 = new Object[1];
            b((char) (TextUtils.getOffsetAfter("", 0) + 33270), 15 - KeyEvent.normalizeMetaState(0), Color.rgb(0, 0, 0) + 16777271, objArr2);
            String string3 = map2.get(((String) objArr2[0]).intern()).toString();
            Object[] objArr3 = new Object[1];
            a((byte) (122 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), "\u0013\u001e#\"\"/", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 5, objArr3);
            String strIntern = ((String) objArr3[0]).intern();
            j10 = 0;
            try {
                Object[] objArr4 = new Object[1];
                a((byte) (53 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), "\u000f\u0013\u0005\"㗥", 4 - TextUtils.lastIndexOf("", '0', 0, 0), objArr4);
                String strReplaceAll = strIntern.replaceAll(((String) objArr4[0]).intern(), "");
                StringBuilder sb = new StringBuilder();
                sb.append(string2);
                sb.append(string3);
                sb.append(strReplaceAll);
                String currencyIso4217Code = AFj1jSDK.getCurrencyIso4217Code(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("");
                sb2.append(currencyIso4217Code.substring(0, 16));
                string = sb2.toString();
            } catch (Exception e10) {
                e = e10;
                Object[] objArr5 = new Object[1];
                a((byte) (91 - View.resolveSize(0, 0)), ".%\"\u0012\r\u000e\u0017\r\u0019%\u0002&\u0015\u0016\u000b%&\u0001.%\u0012&\u0014\u0019\u001c\u0019\u0010-\u0005\u0018(&\u0001\u0018\u0017\r\u0019%", 38 - (ExpandableListView.getPackedPositionForGroup(0) > j10 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j10 ? 0 : -1)), objArr5);
                AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e);
                StringBuilder sb3 = new StringBuilder();
                Object[] objArr6 = new Object[1];
                a((byte) (View.combineMeasuredStates(0, 0) + 83), ")\u0017\u0017\u0007(%\u0002-&\u0012.\u0019\u0019\"\u0018\u000e-\u0002\u0019(&\u0002\u0017\u0015\u0010\u001e&\u0004\u001c\u0017!\u0004\u0004&0\u0005. \u001c\u0019\u001f\u0014\u0005\u0004", MotionEvent.axisFromString("") + 45, objArr6);
                sb3.append(((String) objArr6[0]).intern());
                sb3.append(e);
                AFLogger.afRDLog(sb3.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append("");
                Object[] objArr7 = new Object[1];
                a((byte) ((AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 80), "0\u0016.$\u0019)/\u0014\u0006*+$#&\r*#\"", 18 - (ViewConfiguration.getScrollBarSize() >> 8), objArr7);
                sb4.append(((String) objArr7[0]).intern());
                string = sb4.toString();
            }
        } catch (Exception e11) {
            e = e11;
            j10 = 0;
        }
        String str = string;
        try {
            Context context = this.AFAdRevenueData;
            Object[] objArr8 = new Object[1];
            b((char) (ExpandableListView.getPackedPositionChild(j10) + 13394), Color.alpha(0) + 37, (ViewConfiguration.getZoomControlsTimeout() > j10 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j10 ? 0 : -1)) + 69, objArr8);
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter(((String) objArr8[0]).intern()));
            int intExtra = -2700;
            if (intentRegisterReceiver != null) {
                Object[] objArr9 = new Object[1];
                b((char) (40032 - (ViewConfiguration.getEdgeSlop() >> 16)), View.getDefaultSize(0, 0) + 11, TextUtils.getOffsetAfter("", 0) + 107, objArr9);
                intExtra = intentRegisterReceiver.getIntExtra(((String) objArr9[0]).intern(), -2700);
            }
            String str2 = this.AFAdRevenueData.getApplicationInfo().nativeLibraryDir;
            if (str2 != null) {
                component2 = (component1 + 71) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                Object[] objArr10 = new Object[1];
                a((byte) ((ViewConfiguration.getTapTimeout() >> 16) + 114), "*!㘞", TextUtils.indexOf("", "", 0, 0) + 3, objArr10);
                if (str2.contains(((String) objArr10[0]).intern())) {
                    component2 = (component1 + 77) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                    i10 = 1;
                } else {
                    i10 = 0;
                }
            } else {
                i10 = 0;
            }
            Context context2 = this.AFAdRevenueData;
            Object[] objArr11 = new Object[1];
            a((byte) (Color.rgb(0, 0, 0) + 16777322), " &\u0018& \u0014", View.resolveSizeAndState(0, 0, 0) + 6, objArr11);
            int size = ((SensorManager) context2.getSystemService(((String) objArr11[0]).intern())).getSensorList(-1).size();
            StringBuilder sb5 = new StringBuilder();
            f10 = 0.0f;
            try {
                Object[] objArr12 = new Object[1];
                a((byte) (View.MeasureSpec.getSize(0) + 35), "㘛", 1 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), objArr12);
                sb5.append(((String) objArr12[0]).intern());
                sb5.append(intExtra);
                Object[] objArr13 = new Object[1];
                a((byte) (KeyEvent.keyCodeFromString("") + 69), ".0", (ViewConfiguration.getWindowTouchSlop() >> 8) + 2, objArr13);
                sb5.append(((String) objArr13[0]).intern());
                sb5.append(i10);
                Object[] objArr14 = new Object[1];
                a((byte) (121 - View.getDefaultSize(0, 0)), "\u0003&", (SystemClock.elapsedRealtimeNanos() > j10 ? 1 : (SystemClock.elapsedRealtimeNanos() == j10 ? 0 : -1)) + 1, objArr14);
                sb5.append(((String) objArr14[0]).intern());
                sb5.append(size);
                Object[] objArr15 = new Object[1];
                b((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 1, TextUtils.lastIndexOf("", '0') + 119, objArr15);
                sb5.append(((String) objArr15[0]).intern());
                sb5.append(this.getMonetizationNetwork.size());
                String string4 = sb5.toString();
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                byte[] revenue = AFa1tSDK.getRevenue(AFa1tSDK.getCurrencyIso4217Code(string4));
                StringBuilder sb7 = new StringBuilder();
                for (byte b10 : revenue) {
                    String hexString = Integer.toHexString(b10);
                    if (hexString.length() == 1) {
                        hexString = "0".concat(hexString);
                    }
                    sb7.append(hexString);
                }
                sb6.append(sb7.toString());
                String string5 = sb6.toString();
                component1 = (component2 + 59) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                return string5;
            } catch (Exception e12) {
                e = e12;
                Object[] objArr16 = new Object[1];
                b((char) (ViewConfiguration.getPressedStateDuration() >> 16), ExpandableListView.getPackedPositionChild(j10) + 17, ImageFormat.getBitsPerPixel(0) + 121, objArr16);
                AFLogger.afErrorLogForExcManagerOnly(((String) objArr16[0]).intern(), e);
                StringBuilder sb8 = new StringBuilder();
                Object[] objArr17 = new Object[1];
                a((byte) ((ViewConfiguration.getScrollFriction() > f10 ? 1 : (ViewConfiguration.getScrollFriction() == f10 ? 0 : -1)) + 82), ")\u0017\u0017\u0007(%\u0002-&\u0012.\u0019\u0019\"\u0018\u000e-\u0002\u0019(&\u0002\u0017\u0015\u0010\u001e&\u0004\u001c\u0017!\u0004\u0004&0\u0005. \u001c\u0019\u001f\u0014\u0005\u0004", View.combineMeasuredStates(0, 0) + 44, objArr17);
                sb8.append(((String) objArr17[0]).intern());
                sb8.append(e);
                AFLogger.afRDLog(sb8.toString());
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                Object[] objArr18 = new Object[1];
                b((char) (Color.alpha(0) + 26545), 16 - KeyEvent.getDeadChar(0, 0), 137 - (SystemClock.elapsedRealtimeNanos() > j10 ? 1 : (SystemClock.elapsedRealtimeNanos() == j10 ? 0 : -1)), objArr18);
                sb9.append(((String) objArr18[0]).intern());
                return sb9.toString();
            }
        } catch (Exception e13) {
            e = e13;
            f10 = 0.0f;
        }
    }

    @NonNull
    private String getRevenue() {
        try {
            String string = Integer.toString(Build.VERSION.SDK_INT);
            Map<String, Object> map = this.getMonetizationNetwork;
            Object[] objArr = new Object[1];
            a((byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 30), "\u0017)\u0004'\u0016\u000e& \"\u0019\u0012\u0016", (ViewConfiguration.getWindowTouchSlop() >> 8) + 12, objArr);
            String string2 = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.getMonetizationNetwork;
            Object[] objArr2 = new Object[1];
            b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 8044), TextUtils.getOffsetAfter("", 0) + 5, ViewConfiguration.getMinimumFlingVelocity() >> 16, objArr2);
            String string3 = map2.get(((String) objArr2[0]).intern()).toString();
            if (string3 == null) {
                component1 = (component2 + 47) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                Object[] objArr3 = new Object[1];
                b((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 8 - (Process.myTid() >> 22), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 5, objArr3);
                string3 = ((String) objArr3[0]).intern();
            }
            StringBuilder sb = new StringBuilder(string2);
            sb.reverse();
            StringBuilder sbAFAdRevenueData = AFAdRevenueData(string, string3, sb.toString());
            int length = sbAFAdRevenueData.length();
            if (length > 4) {
                sbAFAdRevenueData.delete(4, length);
            } else {
                while (length < 4) {
                    int i10 = component2 + 103;
                    component1 = i10 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                    if (i10 % 2 != 0) {
                        length += 9;
                        sbAFAdRevenueData.append('Y');
                    } else {
                        length++;
                        sbAFAdRevenueData.append('1');
                    }
                }
            }
            Object[] objArr4 = new Object[1];
            a((byte) (17 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), "\u0019(㘍", 3 - ExpandableListView.getPackedPositionGroup(0L), objArr4);
            sbAFAdRevenueData.insert(0, ((String) objArr4[0]).intern());
            return sbAFAdRevenueData.toString();
        } catch (Exception e10) {
            Object[] objArr5 = new Object[1];
            a((byte) (TextUtils.lastIndexOf("", '0', 0) + 50), "\u0002-.'\u000e\r\u0019&-\u0000)\u0017\u0017\u0007(%\u0002-&\u0012.\u0019\u0019\"\u0018\u000e-\u0002\u0019(&\u0002\u0019(-\u0000\u001c\u0017!\u0004", (KeyEvent.getMaxKeyCode() >> 16) + 40, objArr5);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e10);
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            b((char) (ViewConfiguration.getPressedStateDuration() >> 16), MotionEvent.axisFromString("") + 43, TextUtils.getOffsetBefore("", 0) + 13, objArr6);
            sb2.append(((String) objArr6[0]).intern());
            sb2.append(e10);
            AFLogger.afRDLog(sb2.toString());
            Object[] objArr7 = new Object[1];
            a((byte) (ImageFormat.getBitsPerPixel(0) + 17), "\u0019($\u001e㖳㖳㖳", (Process.myPid() >> 22) + 7, objArr7);
            return ((String) objArr7[0]).intern();
        }
    }
}
