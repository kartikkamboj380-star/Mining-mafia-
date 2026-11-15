package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import com.android.billingclient.api.BillingClient;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.protobuf.DescriptorProtos;
import com.unity3d.ads.BuildConfig;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import com.unity3d.services.core.device.MimeTypes;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ob0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4634ob0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f32117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f32118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f32119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static HashMap f32120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f32121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String[] f32122f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f32123g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f32124h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f32125i;

    static {
        String str = Build.DEVICE;
        String str2 = Build.MODEL;
        String str3 = Build.MANUFACTURER;
        int i10 = Build.VERSION.SDK_INT;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(str2).length() + 2 + String.valueOf(str3).length() + 2 + String.valueOf(i10).length());
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i10);
        f32117a = sb.toString();
        f32118b = new byte[0];
        f32119c = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f32121e = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", ScarConstants.IN_SIGNAL_KEY, "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f32122f = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f32123g = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f32124h = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f32125i = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, 149, 146, ModuleDescriptor.MODULE_VERSION, 156, 177, 182, 191, 184, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, TTAdConstant.MATE_VALID, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static Looper A() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    public static ExecutorService B(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.google.android.gms.internal.ads.Na0
            @Override // java.util.concurrent.ThreadFactory
            public final /* synthetic */ Thread newThread(Runnable runnable) {
                String str2 = AbstractC4634ob0.f32117a;
                return new Thread(runnable, str);
            }
        });
    }

    public static ScheduledExecutorService C(String str) {
        final String str2 = "ExoPlayer:AudioTrackReleaseThread";
        return Executors.newSingleThreadScheduledExecutor(new ThreadFactory(str2) { // from class: com.google.android.gms.internal.ads.ma0
            @Override // java.util.concurrent.ThreadFactory
            public final /* synthetic */ Thread newThread(Runnable runnable) {
                String str3 = AbstractC4634ob0.f32117a;
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
            }
        });
    }

    public static String D(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strA = AbstractC1483As0.a(str);
        int i10 = 0;
        String str2 = strA.split("-", 2)[0];
        if (f32120d == null) {
            f32120d = v();
        }
        String str3 = (String) f32120d.get(str2);
        if (str3 != null) {
            strA = str3.concat(String.valueOf(strA.substring(str2.length())));
            str2 = str3;
        }
        if ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) {
            while (true) {
                String[] strArr = f32122f;
                int length = strArr.length;
                if (i10 >= 18) {
                    break;
                }
                if (strA.startsWith(strArr[i10])) {
                    return String.valueOf(strArr[i10 + 1]).concat(String.valueOf(strA.substring(strArr[i10].length())));
                }
                i10 += 2;
            }
        }
        return strA;
    }

    public static String E(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static String F(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, StandardCharsets.UTF_8);
    }

    public static boolean G(int i10) {
        return i10 == 10 || i10 == 13;
    }

    public static int H(int[] iArr, int i10, boolean z9, boolean z10) {
        int i11;
        int i12;
        int iBinarySearch = Arrays.binarySearch(iArr, i10);
        if (iBinarySearch < 0) {
            i12 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i11 = iBinarySearch - 1;
                if (i11 < 0 || iArr[i11] != i10) {
                    break;
                }
                iBinarySearch = i11;
            }
            i12 = z9 ? iBinarySearch : i11;
        }
        return z10 ? Math.max(0, i12) : i12;
    }

    public static int I(long[] jArr, long j10, boolean z9, boolean z10) {
        int i10;
        int iBinarySearch = Arrays.binarySearch(jArr, j10);
        if (iBinarySearch < 0) {
            i10 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i11 = iBinarySearch - 1;
                if (i11 < 0 || jArr[i11] != j10) {
                    break;
                }
                iBinarySearch = i11;
            }
            i10 = iBinarySearch;
        }
        return z10 ? Math.max(0, i10) : i10;
    }

    public static int J(C6006zV c6006zV, long j10, boolean z9, boolean z10) {
        int iD = c6006zV.d() - 1;
        int i10 = 0;
        while (i10 <= iD) {
            int i11 = (i10 + iD) >>> 1;
            if (c6006zV.c(i11) < j10) {
                i10 = i11 + 1;
            } else {
                iD = i11 - 1;
            }
        }
        int i12 = iD + 1;
        if (i12 < c6006zV.d() && c6006zV.c(i12) == j10) {
            return i12;
        }
        if (iD == -1) {
            return 0;
        }
        return iD;
    }

    public static int K(long[] jArr, long j10, boolean z9, boolean z10) {
        int i10;
        int iBinarySearch = Arrays.binarySearch(jArr, j10);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        while (true) {
            i10 = iBinarySearch + 1;
            if (i10 >= jArr.length || jArr[i10] != j10) {
                break;
            }
            iBinarySearch = i10;
        }
        return !z9 ? i10 : iBinarySearch;
    }

    public static long L(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 / 1000;
    }

    public static long M(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 * 1000;
    }

    public static long N(long j10, int i10) {
        return P(j10, 1000000L, i10, RoundingMode.DOWN);
    }

    public static long O(long j10, int i10) {
        return P(j10, i10, 1000000L, RoundingMode.UP);
    }

    public static long P(long j10, long j11, long j12, RoundingMode roundingMode) {
        if (j10 == 0 || j11 == 0) {
            return 0L;
        }
        if (j12 >= j11 && j12 % j11 == 0) {
            return AbstractC4676ow0.a(j10, AbstractC4676ow0.a(j12, j11, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j12 < j11 && j11 % j12 == 0) {
            return AbstractC4676ow0.c(j10, AbstractC4676ow0.a(j11, j12, RoundingMode.UNNECESSARY));
        }
        if (j12 < j10 || j12 % j10 != 0) {
            return (j12 >= j10 || j10 % j12 != 0) ? s(j10, j11, j12, roundingMode) : AbstractC4676ow0.c(j11, AbstractC4676ow0.a(j10, j12, RoundingMode.UNNECESSARY));
        }
        return AbstractC4676ow0.a(j11, AbstractC4676ow0.a(j12, j10, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static void Q(long[] jArr, long j10, long j11) {
        long j12;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i10 = 0;
        if (j11 >= 1000000 && j11 % 1000000 == 0) {
            long jA = AbstractC4676ow0.a(j11, 1000000L, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = AbstractC4676ow0.a(jArr[i10], jA, roundingMode);
                i10++;
            }
            return;
        }
        if (j11 < 1000000 && 1000000 % j11 == 0) {
            long jA2 = AbstractC4676ow0.a(1000000L, j11, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = AbstractC4676ow0.c(jArr[i10], jA2);
                i10++;
            }
            return;
        }
        int i11 = 0;
        while (i11 < jArr.length) {
            long j13 = jArr[i11];
            if (j13 != 0) {
                if (j11 >= j13 && j11 % j13 == 0) {
                    jArr[i11] = AbstractC4676ow0.a(1000000L, AbstractC4676ow0.a(j11, j13, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j11 >= j13 || j13 % j11 != 0) {
                    j12 = j11;
                    jArr[i11] = s(j13, 1000000L, j12, roundingMode);
                } else {
                    jArr[i11] = AbstractC4676ow0.c(1000000L, AbstractC4676ow0.a(j13, j11, RoundingMode.UNNECESSARY));
                }
                j12 = j11;
            } else {
                j12 = j11;
            }
            i11++;
            j11 = j12;
        }
    }

    public static long R(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 * ((double) f10));
    }

    public static long S(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 / ((double) f10));
    }

    public static String T(int i10) {
        return new String(new byte[]{(byte) (i10 >> 24), (byte) (i10 >> 16), (byte) (i10 >> 8), (byte) i10}, StandardCharsets.US_ASCII);
    }

    public static JY0 U(int i10, int i11, int i12) {
        C5507vX0 c5507vX0 = new C5507vX0();
        c5507vX0.l0("audio/raw");
        c5507vX0.e(i11);
        c5507vX0.f(i12);
        c5507vX0.g(i10);
        return c5507vX0.m();
    }

    public static int V(int i10, ByteOrder byteOrder) {
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 2 : 268435456;
        }
        if (i10 == 24) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 21 : 1342177280;
        }
        if (i10 != 32) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 22 : 1610612736;
    }

    public static boolean a(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4;
    }

    public static int b(int i10) {
        int i11;
        int i12 = 6396;
        if (i10 != 10) {
            if (i10 == 16) {
                i11 = 205215996;
            } else if (i10 != 24) {
                switch (i10) {
                    case 1:
                        return 4;
                    case 2:
                        return 12;
                    case 3:
                        return 28;
                    case 4:
                        return 204;
                    case 5:
                        return 220;
                    case 6:
                        return 252;
                    case 7:
                        return 1276;
                    case 8:
                        return 6396;
                    default:
                        switch (i10) {
                            case 12:
                                return 743676;
                            case 13:
                                i11 = 30136348;
                                break;
                            case 14:
                                i11 = 202070268;
                                break;
                            default:
                                return 0;
                        }
                        break;
                }
            } else {
                i11 = 67108860;
            }
            i12 = 0;
        } else {
            i11 = 737532;
        }
        return Build.VERSION.SDK_INT >= 32 ? i11 : i12;
    }

    public static int c(int i10) {
        if (i10 == 30) {
            return 34;
        }
        switch (i10) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i10) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        switch (i10) {
                            case 20:
                                return 30;
                            case 21:
                            case 22:
                                return 31;
                            default:
                                return Api.BaseClientBuilder.API_PRIORITY_OTHER;
                        }
                }
        }
    }

    public static int d(int i10) {
        if (i10 != 2) {
            if (i10 == 3) {
                return 1;
            }
            if (i10 != 4) {
                if (i10 != 21) {
                    if (i10 != 22) {
                        if (i10 != 268435456) {
                            if (i10 != 1342177280) {
                                if (i10 != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    public static int e(int i10) {
        if (i10 == 2 || i10 == 4) {
            return 6005;
        }
        if (i10 == 10) {
            return 6004;
        }
        if (i10 == 7) {
            return 6005;
        }
        if (i10 == 8) {
            return 6003;
        }
        switch (i10) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i10) {
                    case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    case 25:
                    case 26:
                    case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x0065  */
    public static int f(Uri uri) {
        byte b10;
        int i10;
        String scheme = uri.getScheme();
        if (scheme != null && (AbstractC1483As0.e("rtsp", scheme) || AbstractC1483As0.e("rtspt", scheme))) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            switch (AbstractC1483As0.a(lastPathSegment.substring(iLastIndexOf + 1))) {
                case "ism":
                    b10 = 2;
                    break;
                case "mpd":
                    b10 = 0;
                    break;
                case "isml":
                    b10 = 3;
                    break;
                case "m3u8":
                    b10 = 1;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            if (b10 == 0) {
                i10 = 0;
            } else if (b10 != 1) {
                i10 = (b10 == 2 || b10 == 3) ? 1 : 4;
            } else {
                i10 = 2;
            }
            if (i10 != 4) {
                return i10;
            }
        }
        Pattern pattern = f32119c;
        String path = uri.getPath();
        path.getClass();
        Matcher matcher = pattern.matcher(path);
        if (!matcher.matches()) {
            return 4;
        }
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            if (strGroup.contains("format=mpd-time-csf")) {
                return 0;
            }
            if (strGroup.contains("format=m3u8-aapl")) {
                return 2;
            }
        }
        return 1;
    }

    public static int g(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f32123g[(i12 >>> 24) ^ (bArr[i10] & 255)] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    public static int h(byte[] bArr, int i10, int i11, int i12) {
        int iT = 65535;
        for (int i13 = 0; i13 < i11; i13++) {
            int iA = O10.a(bArr[i13]);
            iT = t(iA & 15, t(iA >> 4, iT));
        }
        return iT;
    }

    public static int i(byte[] bArr, int i10, int i11, int i12) {
        int i13 = 0;
        while (i10 < i11) {
            i13 = f32125i[i13 ^ (bArr[i10] & 255)];
            i10++;
        }
        return i13;
    }

    public static int j(ByteBuffer byteBuffer, int i10) {
        int i11 = byteBuffer.getInt(i10);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i11 : Integer.reverseBytes(i11);
    }

    public static boolean k(P10 p10, P10 p11, Inflater inflater) {
        boolean z9 = false;
        if (p10.C() == 0) {
            return false;
        }
        if (p11.I() < p10.C()) {
            int iC = p10.C();
            p11.B(iC + iC);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(p10.H(), p10.F(), p10.C());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(p11.H(), iInflate, p11.I() - iInflate);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                        break;
                    }
                    if (iInflate == p11.I()) {
                        int I9 = p11.I();
                        p11.B(I9 + I9);
                    }
                } else {
                    p11.E(iInflate);
                    z9 = true;
                    break;
                }
            } catch (DataFormatException unused) {
            } catch (Throwable th) {
                inflater.reset();
                throw th;
            }
        }
        inflater.reset();
        return z9;
    }

    public static boolean l(P10 p10, P10 p11, Inflater inflater) {
        return p10.C() > 0 && p10.M() == 120 && k(p10, p11, inflater);
    }

    public static boolean m(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean n(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static Point o(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && m(context)) {
            String strU = Build.VERSION.SDK_INT < 28 ? u("sys.display-size") : u("vendor.display-size");
            if (!TextUtils.isEmpty(strU)) {
                try {
                    String[] strArrSplit = strU.trim().split("x", -1);
                    if (strArrSplit.length == 2) {
                        int i10 = Integer.parseInt(strArrSplit[0]);
                        int i11 = Integer.parseInt(strArrSplit[1]);
                        if (i10 > 0 && i11 > 0) {
                            return new Point(i10, i11);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                YU.e("Util", "Invalid display size: ".concat(String.valueOf(strU)));
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    public static String p(int i10) {
        switch (i10) {
            case BillingClient.BillingResponseCode.FEATURE_NOT_SUPPORTED /* -2 */:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return BuildConfig.FLAVOR;
            case 1:
                return MimeTypes.BASE_TYPE_AUDIO;
            case 2:
                return MimeTypes.BASE_TYPE_VIDEO;
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            default:
                return "camera motion";
        }
    }

    public static int q(String str) {
        String[] strArrSplit;
        int length;
        if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z9 = length >= 3 && "neg".equals(strArrSplit[length + (-2)]);
        try {
            if (str2 == null) {
                throw null;
            }
            int i10 = Integer.parseInt(str2);
            return z9 ? -i10 : i10;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static boolean r(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i10 == 30) {
            String str = Build.MODEL;
            if (AbstractC1483As0.e(str, "moto g(20)") || AbstractC1483As0.e(str, "rmx3231")) {
                return true;
            }
        }
        return i10 == 34 && AbstractC1483As0.e(Build.MODEL, "sm-x200");
    }

    private static long s(long j10, long j11, long j12, RoundingMode roundingMode) {
        long jC = AbstractC4676ow0.c(j10, j11);
        if (jC != Long.MAX_VALUE && jC != Long.MIN_VALUE) {
            return AbstractC4676ow0.a(jC, j12, roundingMode);
        }
        long jB = AbstractC4676ow0.b(Math.abs(j11), Math.abs(j12));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long jA = AbstractC4676ow0.a(j11, jB, roundingMode2);
        long jA2 = AbstractC4676ow0.a(j12, jB, roundingMode2);
        long jB2 = AbstractC4676ow0.b(Math.abs(j10), Math.abs(jA2));
        long jA3 = AbstractC4676ow0.a(j10, jB2, roundingMode2);
        long jA4 = AbstractC4676ow0.a(jA2, jB2, roundingMode2);
        long jC2 = AbstractC4676ow0.c(jA3, jA);
        if (jC2 != Long.MAX_VALUE && jC2 != Long.MIN_VALUE) {
            return AbstractC4676ow0.a(jC2, jA4, roundingMode);
        }
        double d10 = jA3 * (jA / jA4);
        if (d10 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d10 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return AbstractC4046jw0.a(d10, roundingMode);
    }

    private static int t(int i10, int i11) {
        return (char) (f32124h[(i10 ^ (i11 >> 12)) & 255] ^ ((char) (i11 << 4)));
    }

    private static String u(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e10) {
            YU.f("Util", "Failed to read system property ".concat(str), e10);
            return null;
        }
    }

    private static HashMap v() {
        String[] iSOLanguages = Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = f32121e.length;
        HashMap map = new HashMap(length + 88);
        int i10 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    map.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f32121e;
            int length3 = strArr.length;
            if (i10 >= 88) {
                return map;
            }
            map.put(strArr[i10], strArr[i10 + 1]);
            i10 += 2;
        }
    }

    public static boolean w(SparseArray sparseArray, int i10) {
        return sparseArray.indexOfKey(i10) >= 0;
    }

    public static Object[] x(Object[] objArr, int i10) {
        AbstractC2418Ss0.a(i10 <= objArr.length);
        return Arrays.copyOf(objArr, i10);
    }

    public static Handler y(Handler.Callback callback) {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        return new Handler(looperMyLooper, null);
    }

    public static boolean z(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (!looper.getThread().isAlive()) {
            return false;
        }
        if (looper != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }
}
