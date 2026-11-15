package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.protobuf.CodedOutputStream;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.MimeTypes;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qY0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4880qY0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f32657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f32658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f32659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f32660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f32661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f32662g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f32663h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f32664i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f32665j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f32666k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f32667l;

    C4880qY0(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        str.getClass();
        this.f32656a = str;
        this.f32657b = str2;
        this.f32658c = str3;
        this.f32659d = codecCapabilities;
        this.f32662g = z9;
        this.f32660e = z12;
        this.f32661f = z14;
        this.f32663h = z15;
        this.f32664i = A8.b(str2);
        this.f32667l = -3.4028235E38f;
        this.f32665j = -1;
        this.f32666k = -1;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    public static C4880qY0 a(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        boolean z15 = codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback");
        boolean z16 = codecCapabilities != null && codecCapabilities.isFeatureSupported("tunneled-playback");
        boolean z17 = z13 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback"));
        if (Build.VERSION.SDK_INT < 35 || codecCapabilities == null || !codecCapabilities.isFeatureSupported("detached-surface")) {
            z14 = false;
        } else {
            String str4 = Build.MANUFACTURER;
            if (str4.equals("Xiaomi") || str4.equals("OPPO") || str4.equals("realme") || str4.equals("motorola") || str4.equals("LENOVO")) {
                z14 = false;
            } else {
                z14 = true;
            }
        }
        return new C4880qY0(str, str2, str3, codecCapabilities, z9, z10, z11, z15, z16, z17, z14);
    }

    private final boolean j(JY0 jy0) {
        String str = this.f32657b;
        return str.equals(jy0.f19929o) || str.equals(SY0.g(jy0));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:20:0x006f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    /* JADX WARN: Code duplicated, block: B:28:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x008a  */
    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0094  */
    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    /* JADX WARN: Code duplicated, block: B:40:0x009f  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b4 A[PHI: r5
      0x00b4: PHI (r5v4 int) = (r5v3 int), (r5v3 int), (r5v5 int) binds: [B:42:0x00a5, B:44:0x00ad, B:47:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:62:0x0108  */
    /* JADX WARN: Code duplicated, block: B:64:0x010e  */
    /* JADX WARN: Code duplicated, block: B:82:0x012e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    private final boolean k(JY0 jy0, boolean z9) {
        int iIntValue;
        int iIntValue2;
        int i10;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrB;
        String str;
        int length;
        int i11;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        String str2;
        int iHashCode;
        Pair pairD = GM.d(jy0);
        String str3 = jy0.f19929o;
        byte b10 = -1;
        if (str3 != null && str3.equals("video/mv-hevc")) {
            String strH = A8.h(this.f32658c);
            if (!strH.equals("video/mv-hevc")) {
                if (strH.equals(MimeTypes.VIDEO_H265)) {
                    int i12 = SY0.f23243b;
                    String strK = AbstractC4034jq0.k(jy0.f19932r);
                    if (strK == null) {
                        pairD = null;
                    } else {
                        String strTrim = strK.trim();
                        String str4 = AbstractC4634ob0.f32117a;
                        pairD = GM.e(strK, strTrim.split("\\.", -1), jy0.f19904E);
                    }
                }
                if (pairD != null) {
                    iIntValue = ((Integer) pairD.first).intValue();
                    iIntValue2 = ((Integer) pairD.second).intValue();
                    i10 = 8;
                    if ("video/dolby-vision".equals(str3)) {
                        str2 = this.f32657b;
                        iHashCode = str2.hashCode();
                        if (iHashCode != -1662735862) {
                            if (iHashCode != -1662541442) {
                                if (iHashCode == 1331836730) {
                                    b10 = 0;
                                }
                            } else if (str2.equals(MimeTypes.VIDEO_H265)) {
                                b10 = 1;
                            }
                        } else if (str2.equals(MimeTypes.VIDEO_AV1)) {
                            b10 = 2;
                        }
                        if (b10 == 0) {
                            if (b10 != 1) {
                            }
                            iIntValue = 2;
                        } else {
                            iIntValue = 8;
                        }
                        iIntValue2 = 0;
                    }
                    if (this.f32664i) {
                        codecProfileLevelArrB = b();
                        str = this.f32657b;
                        if (str.equals("audio/ac4")) {
                            codecCapabilities = this.f32659d;
                            if (codecCapabilities != null) {
                                i10 = 16;
                            }
                            codecProfileLevelArrB = new MediaCodecInfo.CodecProfileLevel[]{SY0.f(257, i10), SY0.f(513, i10), SY0.f(514, i10), SY0.f(1026, i10), SY0.f(1028, i10)};
                        }
                        length = codecProfileLevelArrB.length;
                        for (i11 = 0; i11 < length; i11++) {
                            codecProfileLevel = codecProfileLevelArrB[i11];
                            if (codecProfileLevel.profile != iIntValue) {
                            }
                        }
                        String str5 = jy0.f19925k;
                        String str6 = this.f32658c;
                        StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 22 + str6.length());
                        sb.append("codec.profileLevel, ");
                        sb.append(str5);
                        sb.append(", ");
                        sb.append(str6);
                        m(sb.toString());
                        return false;
                    }
                    codecProfileLevelArrB = b();
                    str = this.f32657b;
                    if (str.equals("audio/ac4")) {
                        codecCapabilities = this.f32659d;
                        if (codecCapabilities != null) {
                            i10 = 16;
                        }
                        codecProfileLevelArrB = new MediaCodecInfo.CodecProfileLevel[]{SY0.f(257, i10), SY0.f(513, i10), SY0.f(514, i10), SY0.f(1026, i10), SY0.f(1028, i10)};
                    }
                    length = codecProfileLevelArrB.length;
                    while (i11 < length) {
                        codecProfileLevel = codecProfileLevelArrB[i11];
                        if (codecProfileLevel.profile != iIntValue) {
                        }
                    }
                    String str7 = jy0.f19925k;
                    String str8 = this.f32658c;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str7).length() + 22 + str8.length());
                    sb2.append("codec.profileLevel, ");
                    sb2.append(str7);
                    sb2.append(", ");
                    sb2.append(str8);
                    m(sb2.toString());
                    return false;
                }
            }
        } else if (pairD != null) {
            iIntValue = ((Integer) pairD.first).intValue();
            iIntValue2 = ((Integer) pairD.second).intValue();
            i10 = 8;
            if ("video/dolby-vision".equals(str3)) {
                str2 = this.f32657b;
                iHashCode = str2.hashCode();
                if (iHashCode != -1662735862) {
                    if (iHashCode != -1662541442) {
                        if (iHashCode == 1331836730 && str2.equals(MimeTypes.VIDEO_H264)) {
                            b10 = 0;
                        }
                    } else if (str2.equals(MimeTypes.VIDEO_H265)) {
                        b10 = 1;
                    }
                } else if (str2.equals(MimeTypes.VIDEO_AV1)) {
                    b10 = 2;
                }
                if (b10 == 0) {
                    iIntValue = 8;
                } else if (b10 != 1 || b10 == 2) {
                    iIntValue = 2;
                }
                iIntValue2 = 0;
            }
            if (this.f32664i || this.f32657b.equals("audio/ac4")) {
                codecProfileLevelArrB = b();
                str = this.f32657b;
                if (str.equals("audio/ac4") && codecProfileLevelArrB.length == 0) {
                    codecCapabilities = this.f32659d;
                    if (codecCapabilities != null && (audioCapabilities = codecCapabilities.getAudioCapabilities()) != null && audioCapabilities.getMaxInputChannelCount() > 18) {
                        i10 = 16;
                    }
                    codecProfileLevelArrB = new MediaCodecInfo.CodecProfileLevel[]{SY0.f(257, i10), SY0.f(513, i10), SY0.f(514, i10), SY0.f(1026, i10), SY0.f(1028, i10)};
                }
                length = codecProfileLevelArrB.length;
                while (i11 < length) {
                    codecProfileLevel = codecProfileLevelArrB[i11];
                    if (codecProfileLevel.profile != iIntValue && (codecProfileLevel.level >= iIntValue2 || !z9)) {
                        if (MimeTypes.VIDEO_H265.equals(str) && iIntValue == 2) {
                            String str9 = Build.DEVICE;
                            if ("sailfish".equals(str9) || "marlin".equals(str9)) {
                            }
                        }
                    }
                }
                String str10 = jy0.f19925k;
                String str11 = this.f32658c;
                StringBuilder sb3 = new StringBuilder(String.valueOf(str10).length() + 22 + str11.length());
                sb3.append("codec.profileLevel, ");
                sb3.append(str10);
                sb3.append(", ");
                sb3.append(str11);
                m(sb3.toString());
                return false;
            }
            if (iIntValue == 42) {
                iIntValue = 42;
                codecProfileLevelArrB = b();
                str = this.f32657b;
                if (str.equals("audio/ac4")) {
                    codecCapabilities = this.f32659d;
                    if (codecCapabilities != null) {
                        i10 = 16;
                    }
                    codecProfileLevelArrB = new MediaCodecInfo.CodecProfileLevel[]{SY0.f(257, i10), SY0.f(513, i10), SY0.f(514, i10), SY0.f(1026, i10), SY0.f(1028, i10)};
                }
                length = codecProfileLevelArrB.length;
                while (i11 < length) {
                    codecProfileLevel = codecProfileLevelArrB[i11];
                    if (codecProfileLevel.profile != iIntValue) {
                    }
                }
                String str12 = jy0.f19925k;
                String str13 = this.f32658c;
                StringBuilder sb4 = new StringBuilder(String.valueOf(str12).length() + 22 + str13.length());
                sb4.append("codec.profileLevel, ");
                sb4.append(str12);
                sb4.append(", ");
                sb4.append(str13);
                m(sb4.toString());
                return false;
            }
        }
        return true;
    }

    private final boolean l(JY0 jy0) {
        return (Objects.equals(jy0.f19929o, "audio/flac") && jy0.f19908I == 22 && Build.VERSION.SDK_INT < 34 && this.f32656a.equals("c2.android.flac.decoder")) ? false : true;
    }

    private final void m(String str) {
        String str2 = AbstractC4634ob0.f32117a;
        String str3 = this.f32657b;
        int length = String.valueOf(str3).length();
        int length2 = String.valueOf(str2).length();
        int length3 = str.length();
        String str4 = this.f32656a;
        StringBuilder sb = new StringBuilder(length3 + 14 + str4.length() + 2 + length + 3 + length2 + 1);
        sb.append("NoSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(str4);
        sb.append(", ");
        sb.append(str3);
        sb.append("] [");
        sb.append(str2);
        sb.append("]");
        YU.a("MediaCodecInfo", sb.toString());
    }

    private static boolean n(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point pointO = o(videoCapabilities, i10, i11);
        int i12 = pointO.x;
        int i13 = pointO.y;
        if (d10 == -1.0d || d10 < 1.0d) {
            return videoCapabilities.isSizeSupported(i12, i13);
        }
        double dFloor = Math.floor(d10);
        if (!videoCapabilities.areSizeAndRateSupported(i12, i13, dFloor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i12, i13);
        return achievableFrameRatesFor == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
    }

    private static Point o(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        String str = AbstractC4634ob0.f32117a;
        return new Point((((i10 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i11 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final MediaCodecInfo.CodecProfileLevel[] b() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f32659d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public final boolean c(JY0 jy0) {
        int i10;
        int i11;
        if (!j(jy0) || !k(jy0, true) || !l(jy0)) {
            return false;
        }
        if (this.f32664i) {
            int i12 = jy0.f19936v;
            if (i12 <= 0 || (i11 = jy0.f19937w) <= 0) {
                return true;
            }
            return g(i12, i11, jy0.f19940z);
        }
        int i13 = jy0.f19907H;
        if (i13 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f32659d;
            if (codecCapabilities == null) {
                m("sampleRate.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                m("sampleRate.aCaps");
                return false;
            }
            if (!audioCapabilities.isSampleRateSupported(i13)) {
                StringBuilder sb = new StringBuilder(String.valueOf(i13).length() + 20);
                sb.append("sampleRate.support, ");
                sb.append(i13);
                m(sb.toString());
                return false;
            }
        }
        int i14 = jy0.f19906G;
        if (i14 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.f32659d;
            if (codecCapabilities2 == null) {
                m("channelCount.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
            if (audioCapabilities2 == null) {
                m("channelCount.aCaps");
                return false;
            }
            String str = this.f32656a;
            String str2 = this.f32657b;
            int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
            if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                if ("audio/ac3".equals(str2)) {
                    i10 = 6;
                } else {
                    i10 = "audio/eac3".equals(str2) ? 16 : 30;
                }
                StringBuilder sb2 = new StringBuilder(str.length() + 32 + String.valueOf(maxInputChannelCount).length() + 4 + String.valueOf(i10).length() + 1);
                sb2.append("AssumedMaxChannelAdjustment: ");
                sb2.append(str);
                sb2.append(", [");
                sb2.append(maxInputChannelCount);
                sb2.append(" to ");
                sb2.append(i10);
                sb2.append("]");
                YU.c("MediaCodecInfo", sb2.toString());
                maxInputChannelCount = i10;
            }
            if (maxInputChannelCount < i14) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(i14).length() + 22);
                sb3.append("channelCount.support, ");
                sb3.append(i14);
                m(sb3.toString());
                return false;
            }
        }
        return true;
    }

    public final boolean d(JY0 jy0) {
        return j(jy0) && k(jy0, false) && l(jy0);
    }

    public final boolean e(JY0 jy0) {
        if (this.f32664i) {
            return this.f32660e;
        }
        Pair pairD = GM.d(jy0);
        return pairD != null && ((Integer) pairD.first).intValue() == 42;
    }

    public final AQ0 f(JY0 jy0, JY0 jy1) {
        JY0 jy2;
        JY0 jy3;
        int i10;
        String str = jy0.f19929o;
        String str2 = jy1.f19929o;
        int i11 = true != Objects.equals(str, str2) ? 8 : 0;
        if (this.f32664i) {
            if (jy0.f19900A != jy1.f19900A) {
                i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
            }
            boolean z9 = (jy0.f19936v == jy1.f19936v && jy0.f19937w == jy1.f19937w) ? false : true;
            if (!this.f32660e && z9) {
                i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
            }
            C3470fL0 c3470fL0 = jy0.f19904E;
            if ((!C3470fL0.a(c3470fL0) || !C3470fL0.a(jy1.f19904E)) && !Objects.equals(c3470fL0, jy1.f19904E)) {
                i11 |= 2048;
            }
            String str3 = this.f32656a;
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str3) && !jy0.d(jy1)) {
                i11 |= 2;
            }
            int i12 = jy0.f19938x;
            if (i12 != -1 && (i10 = jy0.f19939y) != -1 && i12 == jy1.f19938x && i10 == jy1.f19939y && z9) {
                i11 |= 2;
            }
            if (i11 == 0 && Objects.equals(str2, "video/dolby-vision")) {
                Pair pairD = GM.d(jy0);
                Pair pairD2 = GM.d(jy1);
                if (pairD == null || pairD2 == null || !((Integer) pairD.first).equals(pairD2.first)) {
                    i11 = 2;
                }
            }
            if (i11 == 0) {
                return new AQ0(str3, jy0, jy1, true == jy0.d(jy1) ? 3 : 2, 0);
            }
            jy2 = jy0;
            jy3 = jy1;
        } else {
            jy2 = jy0;
            jy3 = jy1;
            if (jy2.f19906G != jy3.f19906G) {
                i11 |= CodedOutputStream.DEFAULT_BUFFER_SIZE;
            }
            if (jy2.f19907H != jy3.f19907H) {
                i11 |= 8192;
            }
            if (jy2.f19908I != jy3.f19908I) {
                i11 |= 16384;
            }
            if (i11 == 0) {
                String str4 = this.f32657b;
                if (str4.equals("audio/mp4a-latm") || str4.equals("audio/ac4")) {
                    Pair pairD3 = GM.d(jy2);
                    Pair pairD4 = GM.d(jy3);
                    if (pairD3 != null && pairD4 != null) {
                        int iIntValue = ((Integer) pairD3.first).intValue();
                        int iIntValue2 = ((Integer) pairD4.first).intValue();
                        if (iIntValue == 42 && iIntValue2 == 42) {
                            return new AQ0(this.f32656a, jy2, jy3, 3, 0);
                        }
                        if (str4.equals("audio/ac4") && pairD3.equals(pairD4)) {
                            return new AQ0(this.f32656a, jy2, jy3, 3, 0);
                        }
                    }
                }
            }
            if (i11 == 0) {
                String str5 = this.f32657b;
                if (str5.equals("audio/eac3-joc") || str5.equals("audio/eac3")) {
                    return new AQ0(this.f32656a, jy2, jy3, 3, 0);
                }
            }
            if (!jy2.d(jy3)) {
                i11 |= 32;
            }
            if ("audio/opus".equals(this.f32657b)) {
                i11 |= 2;
            }
            if (i11 == 0) {
                return new AQ0(this.f32656a, jy2, jy3, 1, 0);
            }
        }
        return new AQ0(this.f32656a, jy2, jy3, 0, i11);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    public final boolean g(int i10, int i11, double d10) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f32659d;
        if (codecCapabilities == null) {
            m("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m("sizeAndRate.vCaps");
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int iA = AbstractC5761xY0.a(videoCapabilities, i10, i11, d10);
            if (iA != 2) {
                if (iA == 1) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 20 + String.valueOf(i11).length() + 1 + String.valueOf(d10).length());
                    sb.append("sizeAndRate.cover, ");
                    sb.append(i10);
                    sb.append("x");
                    sb.append(i11);
                    sb.append("@");
                    sb.append(d10);
                    m(sb.toString());
                    return false;
                }
                if (!n(videoCapabilities, i10, i11, d10)) {
                    if (i10 < i11) {
                        str = this.f32656a;
                        if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str)) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 22 + String.valueOf(i11).length() + 1 + String.valueOf(d10).length());
                            sb2.append("sizeAndRate.rotated, ");
                            sb2.append(i10);
                            sb2.append("x");
                            sb2.append(i11);
                            sb2.append("@");
                            sb2.append(d10);
                            String string = sb2.toString();
                            String str2 = this.f32657b;
                            int length = str.length();
                            String str3 = AbstractC4634ob0.f32117a;
                            int length2 = String.valueOf(str2).length();
                            StringBuilder sb3 = new StringBuilder(string.length() + 19 + length + 2 + length2 + 3 + String.valueOf(str3).length() + 1);
                            sb3.append("AssumedSupport [");
                            sb3.append(string);
                            sb3.append("] [");
                            sb3.append(str);
                            sb3.append(", ");
                            sb3.append(str2);
                            sb3.append("] [");
                            sb3.append(str3);
                            sb3.append("]");
                            YU.a("MediaCodecInfo", sb3.toString());
                        } else {
                            StringBuilder sb4 = new StringBuilder(String.valueOf(i10).length() + 22 + String.valueOf(i11).length() + 1 + String.valueOf(d10).length());
                            sb4.append("sizeAndRate.rotated, ");
                            sb4.append(i10);
                            sb4.append("x");
                            sb4.append(i11);
                            sb4.append("@");
                            sb4.append(d10);
                            String string2 = sb4.toString();
                            String str4 = this.f32657b;
                            int length3 = str.length();
                            String str5 = AbstractC4634ob0.f32117a;
                            int length4 = String.valueOf(str4).length();
                            StringBuilder sb5 = new StringBuilder(string2.length() + 19 + length3 + 2 + length4 + 3 + String.valueOf(str5).length() + 1);
                            sb5.append("AssumedSupport [");
                            sb5.append(string2);
                            sb5.append("] [");
                            sb5.append(str);
                            sb5.append(", ");
                            sb5.append(str4);
                            sb5.append("] [");
                            sb5.append(str5);
                            sb5.append("]");
                            YU.a("MediaCodecInfo", sb5.toString());
                        }
                    }
                    StringBuilder sb6 = new StringBuilder(String.valueOf(i10).length() + 22 + String.valueOf(i11).length() + 1 + String.valueOf(d10).length());
                    sb6.append("sizeAndRate.support, ");
                    sb6.append(i10);
                    sb6.append("x");
                    sb6.append(i11);
                    sb6.append("@");
                    sb6.append(d10);
                    m(sb6.toString());
                    return false;
                }
            }
        } else if (!n(videoCapabilities, i10, i11, d10)) {
            if (i10 < i11) {
                str = this.f32656a;
                if (("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && n(videoCapabilities, i11, i10, d10)) {
                    StringBuilder sb7 = new StringBuilder(String.valueOf(i10).length() + 22 + String.valueOf(i11).length() + 1 + String.valueOf(d10).length());
                    sb7.append("sizeAndRate.rotated, ");
                    sb7.append(i10);
                    sb7.append("x");
                    sb7.append(i11);
                    sb7.append("@");
                    sb7.append(d10);
                    String string3 = sb7.toString();
                    String str6 = this.f32657b;
                    int length5 = str.length();
                    String str7 = AbstractC4634ob0.f32117a;
                    int length6 = String.valueOf(str6).length();
                    StringBuilder sb8 = new StringBuilder(string3.length() + 19 + length5 + 2 + length6 + 3 + String.valueOf(str7).length() + 1);
                    sb8.append("AssumedSupport [");
                    sb8.append(string3);
                    sb8.append("] [");
                    sb8.append(str);
                    sb8.append(", ");
                    sb8.append(str6);
                    sb8.append("] [");
                    sb8.append(str7);
                    sb8.append("]");
                    YU.a("MediaCodecInfo", sb8.toString());
                }
            }
            StringBuilder sb9 = new StringBuilder(String.valueOf(i10).length() + 22 + String.valueOf(i11).length() + 1 + String.valueOf(d10).length());
            sb9.append("sizeAndRate.support, ");
            sb9.append(i10);
            sb9.append("x");
            sb9.append(i11);
            sb9.append("@");
            sb9.append(d10);
            m(sb9.toString());
            return false;
        }
        return true;
    }

    public final float h(int i10, int i11) {
        if (!this.f32664i) {
            return -3.4028235E38f;
        }
        float f10 = this.f32667l;
        if (f10 != -3.4028235E38f && this.f32665j == i10 && this.f32666k == i11) {
            return f10;
        }
        float f11 = 1024.0f;
        if (!g(i10, i11, 1024.0d)) {
            float f12 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            while (true) {
                float f13 = f11 - f12;
                if (Math.abs(f13) <= 5.0f) {
                    break;
                }
                float f14 = (f13 / 2.0f) + f12;
                boolean zG = g(i10, i11, f14);
                if (true == zG) {
                    f12 = f14;
                }
                if (true != zG) {
                    f11 = f14;
                }
            }
            f11 = f12;
        }
        this.f32667l = f11;
        this.f32665j = i10;
        this.f32666k = i11;
        return f11;
    }

    public final Point i(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f32659d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return o(videoCapabilities, i10, i11);
    }

    public final String toString() {
        return this.f32656a;
    }
}
