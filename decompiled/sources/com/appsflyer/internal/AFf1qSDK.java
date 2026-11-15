package com.appsflyer.internal;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1qSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int[] AFAdRevenueData = null;
    private static int getCurrencyIso4217Code = 0;
    private static int getMediationNetwork = 1;

    static {
        getMonetizationNetwork();
        ViewConfiguration.getScrollBarSize();
        getCurrencyIso4217Code = (getMediationNetwork + 85) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
    }

    private static void a(int[] iArr, int i10, Object[] objArr) {
        int length;
        int[] iArr2;
        long j10;
        AFk1iSDK aFk1iSDK = new AFk1iSDK();
        char[] cArr = new char[4];
        char c10 = 2;
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = AFAdRevenueData;
        long j11 = -6133639485864768852L;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            for (int i11 = 0; i11 < length2; i11++) {
                iArr4[i11] = (int) (((long) iArr3[i11]) ^ (-6133639485864768852L));
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = AFAdRevenueData;
        if (iArr6 != null) {
            int i12 = $10 + 113;
            $11 = i12 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            if (i12 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i13 = 0;
            while (i13 < length) {
                int i14 = $11 + 17;
                char c11 = c10;
                $10 = i14 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                if (i14 % 2 != 0) {
                    j10 = j11;
                    iArr2[i13] = (int) (((long) iArr6[i13]) & j10);
                    i13--;
                } else {
                    j10 = j11;
                    iArr2[i13] = (int) (((long) iArr6[i13]) ^ j10);
                    i13++;
                }
                c10 = c11;
                j11 = j10;
            }
            iArr6 = iArr2;
        }
        char c12 = c10;
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        aFk1iSDK.getRevenue = 0;
        while (true) {
            int i15 = aFk1iSDK.getRevenue;
            if (i15 >= iArr.length) {
                break;
            }
            $10 = ($11 + 71) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            int i16 = iArr[i15];
            char c13 = (char) (i16 >> 16);
            cArr[0] = c13;
            char c14 = (char) i16;
            cArr[1] = c14;
            char c15 = (char) (iArr[i15 + 1] >> 16);
            cArr[c12] = c15;
            char c16 = (char) iArr[i15 + 1];
            cArr[3] = c16;
            aFk1iSDK.getMediationNetwork = (c13 << 16) + c14;
            aFk1iSDK.getMonetizationNetwork = (c15 << 16) + c16;
            AFk1iSDK.getMonetizationNetwork(iArr5);
            int i17 = 0;
            while (i17 < 16) {
                int i18 = aFk1iSDK.getMediationNetwork ^ iArr5[i17];
                aFk1iSDK.getMediationNetwork = i18;
                int mediationNetwork = AFk1iSDK.getMediationNetwork(i18) ^ aFk1iSDK.getMonetizationNetwork;
                int i19 = aFk1iSDK.getMediationNetwork;
                aFk1iSDK.getMediationNetwork = mediationNetwork;
                aFk1iSDK.getMonetizationNetwork = i19;
                i17++;
                $10 = ($11 + 99) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            }
            int i20 = aFk1iSDK.getMediationNetwork;
            int i21 = aFk1iSDK.getMonetizationNetwork;
            aFk1iSDK.getMediationNetwork = i21;
            aFk1iSDK.getMonetizationNetwork = i20;
            int i22 = i20 ^ iArr5[16];
            aFk1iSDK.getMonetizationNetwork = i22;
            int i23 = i21 ^ iArr5[17];
            aFk1iSDK.getMediationNetwork = i23;
            cArr[0] = (char) (i23 >>> 16);
            cArr[1] = (char) i23;
            cArr[c12] = (char) (i22 >>> 16);
            cArr[3] = (char) i22;
            AFk1iSDK.getMonetizationNetwork(iArr5);
            int i24 = aFk1iSDK.getRevenue;
            cArr2[i24 * 2] = cArr[0];
            cArr2[(i24 * 2) + 1] = cArr[1];
            cArr2[(i24 * 2) + 2] = cArr[c12];
            cArr2[(i24 * 2) + 3] = cArr[3];
            aFk1iSDK.getRevenue = i24 + 2;
        }
        String str = new String(cArr2, 0, i10);
        int i25 = $10 + 77;
        $11 = i25 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i25 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    @NonNull
    private static AFi1uSDK getRevenue(@NonNull AFh1cSDK aFh1cSDK, String str, @NonNull String str2, @NonNull String str3) {
        if (str == null) {
            return new AFi1uSDK(aFh1cSDK.getCurrencyIso4217Code == AFh1gSDK.DEFAULT, AFi1ySDK.NA);
        }
        String string = "";
        Object[] objArr = new Object[1];
        a(new int[]{-1737175898, -1382589389, 713661469, -1134961719, -1969930269, 10614183, -828674959, -651693320, -1587602342, 405839388, 1857785845, -2125720599, -1949544352, -324845223, 902164262, 728372842, -1289227633, 161661437, 51240894, -1224567390, -2031796534, -1352392266, 1905647512, -1637846901, 1233763875, 492265299, -1206355691, 1997345169, 575501648, -182399273, 1663091008, 1388920687}, KeyEvent.keyCodeFromString("") + 64, objArr);
        String strIntern = ((String) objArr[0]).intern();
        if (aFh1cSDK.getCurrencyIso4217Code == AFh1gSDK.CUSTOM) {
            string = new StringBuilder(str2).reverse().toString();
        } else {
            str3 = strIntern;
        }
        boolean zEquals = getRevenue(new StringBuilder(str3).reverse().toString(), aFh1cSDK.getRevenue, "android", "v1", string).equals(str);
        return new AFi1uSDK(zEquals, zEquals ? AFi1ySDK.SUCCESS : AFi1ySDK.FAILURE);
    }

    @NonNull
    public final AFi1uSDK getMonetizationNetwork(@NonNull AFh1cSDK aFh1cSDK, String str, @NonNull String str2, @NonNull String str3) {
        int i10 = getMediationNetwork;
        int i11 = i10 + 119;
        getCurrencyIso4217Code = i11 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i11 % 2 != 0) {
            throw null;
        }
        if (aFh1cSDK == null || str2 == null || str3 == null) {
            return new AFi1uSDK(false, AFi1ySDK.INTERNAL_ERROR);
        }
        getCurrencyIso4217Code = (i10 + 85) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        return getRevenue(aFh1cSDK, str, str2, str3);
    }

    static void getMonetizationNetwork() {
        AFAdRevenueData = new int[]{-1535469978, -1012770009, 2079423438, -537713690, 188517261, 1637329726, 59481190, 913702862, 1690527878, -1038801859, 344452007, 1683103388, -581075556, -2036279421, 21770861, 2114604264, 1603244918, -208521163};
    }

    private static String getRevenue(String str, String str2, String str3, String str4, String str5) {
        getMediationNetwork = (getCurrencyIso4217Code + 83) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        String currencyIso4217Code = AFj1jSDK.getCurrencyIso4217Code(TextUtils.join("\u2063", new String[]{str2, str3, str4, str5, ""}), str);
        if (currencyIso4217Code.length() >= 12) {
            return currencyIso4217Code.substring(0, 12);
        }
        getMediationNetwork = (getCurrencyIso4217Code + 95) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        return currencyIso4217Code;
    }
}
