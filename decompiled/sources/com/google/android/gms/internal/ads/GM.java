package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.protobuf.CodedOutputStream;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.services.UnityAdsConstants;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GM {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f19033a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f19034b = {"", "A", "B", "C"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f19035c = Pattern.compile("^\\D?(\\d+)$");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f19036d = 0;

    public static String a(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static String b(int i10, boolean z9, int i11, int i12, int[] iArr, int i13) {
        int i14;
        Object[] objArr = {f19034b[i10], Integer.valueOf(i11), Integer.valueOf(i12), Character.valueOf(true != z9 ? 'L' : 'H'), Integer.valueOf(i13)};
        String str = AbstractC4634ob0.f32117a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i15 = 6;
        while (true) {
            if (i15 <= 0) {
                break;
            }
            int i16 = i15 - 1;
            if (iArr[i16] != 0) {
                break;
            }
            i15 = i16;
        }
        for (i14 = 0; i14 < i15; i14++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i14])));
        }
        return sb.toString();
    }

    public static String c(byte[] bArr) {
        int length = bArr.length;
        AbstractC2418Ss0.d(length >= 17, "Invalid APV CSD length: %s", length);
        byte b10 = bArr[0];
        AbstractC2418Ss0.d(b10 == 1, "Invalid APV CSD version: %s", b10);
        Object[] objArr = {Integer.valueOf(bArr[5]), Integer.valueOf(bArr[6]), Integer.valueOf(bArr[7])};
        String str = AbstractC4634ob0.f32117a;
        return String.format(Locale.US, "apv1.apvf%d.apvl%d.apvb%d", objArr);
    }

    /* JADX WARN: Code duplicated, block: B:192:0x031e  */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01f2, code lost:
    
        if (r1.equals("vp09") != true) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01fd, code lost:
    
        if (r1.equals("s263") != true) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0209, code lost:
    
        if (r1.equals("mp4a") != true) goto L507;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0214, code lost:
    
        if (r1.equals("iamf") != true) goto L508;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x021f, code lost:
    
        if (r1.equals("hvc1") != true) goto L509;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0229, code lost:
    
        if (r1.equals("hev1") != true) goto L510;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0233, code lost:
    
        if (r1.equals("avc2") != true) goto L511;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x023e, code lost:
    
        if (r1.equals("avc1") != true) goto L512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0248, code lost:
    
        if (r1.equals("av01") != true) goto L513;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0252, code lost:
    
        if (r1.equals("apv1") != true) goto L514;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x025c, code lost:
    
        if (r1.equals("ac-4") != true) goto L515;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0261, code lost:
    
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:?, code lost:
    
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:?, code lost:
    
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:?, code lost:
    
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:?, code lost:
    
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:?, code lost:
    
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:?, code lost:
    
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:?, code lost:
    
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:?, code lost:
    
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:?, code lost:
    
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:?, code lost:
    
        r1 = -1;
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v160 int, still in use, count: 1, list:
      (r1v160 int) from 0x009f: IF  (r1v160 int) != (1567 int)  -> B:20:0x00a1 A[HIDDEN] (LINE:160)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
    	at jadx.core.utils.InsnRemover.removeAllMarked(InsnRemover.java:276)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:354)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v160 int, still in use, count: 1, list:
      (r1v160 int) from 0x009f: IF  (r1v160 int) != (1567 int)  -> B:20:0x00a1 A[HIDDEN] (LINE:160)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair d(com.google.android.gms.internal.ads.JY0 r27) {
        /*
            Method dump skipped, instruction units count: 2358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.GM.d(com.google.android.gms.internal.ads.JY0):android.util.Pair");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:107:0x0196  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    public static Pair e(String str, String[] strArr, C3470fL0 c3470fL0) {
        int i10;
        Integer numValueOf;
        if (strArr.length < 4) {
            YU.c("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        Matcher matcher = f19035c.matcher(strArr[1]);
        if (!matcher.matches()) {
            YU.c("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        String strGroup = matcher.group(1);
        if (UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(strGroup)) {
            i10 = 1;
        } else if (CommonGetHeaderBiddingToken.HB_TOKEN_VERSION.equals(strGroup)) {
            i10 = (c3470fL0 == null || c3470fL0.f28265c != 6) ? 2 : 4096;
        } else {
            if (!"6".equals(strGroup)) {
                YU.c("CodecSpecificDataUtil", "Unknown HEVC profile string: ".concat(String.valueOf(strGroup)));
                return null;
            }
            i10 = 6;
        }
        String str2 = strArr[3];
        if (str2 != null) {
            switch (str2) {
                case "L30":
                    numValueOf = 1;
                    break;
                case "L60":
                    numValueOf = 4;
                    break;
                case "L63":
                    numValueOf = 16;
                    break;
                case "L90":
                    numValueOf = 64;
                    break;
                case "L93":
                    numValueOf = Integer.valueOf(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
                    break;
                case "L120":
                    numValueOf = Integer.valueOf(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
                    break;
                case "L123":
                    numValueOf = Integer.valueOf(CodedOutputStream.DEFAULT_BUFFER_SIZE);
                    break;
                case "L150":
                    numValueOf = 16384;
                    break;
                case "L153":
                    numValueOf = 65536;
                    break;
                case "L156":
                    numValueOf = 262144;
                    break;
                case "L180":
                    numValueOf = 1048576;
                    break;
                case "L183":
                    numValueOf = 4194304;
                    break;
                case "L186":
                    numValueOf = 16777216;
                    break;
                case "H30":
                    numValueOf = 2;
                    break;
                case "H60":
                    numValueOf = 8;
                    break;
                case "H63":
                    numValueOf = 32;
                    break;
                case "H90":
                    numValueOf = Integer.valueOf(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                    break;
                case "H93":
                    numValueOf = Integer.valueOf(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING);
                    break;
                case "H120":
                    numValueOf = 2048;
                    break;
                case "H123":
                    numValueOf = 8192;
                    break;
                case "H150":
                    numValueOf = 32768;
                    break;
                case "H153":
                    numValueOf = 131072;
                    break;
                case "H156":
                    numValueOf = 524288;
                    break;
                case "H180":
                    numValueOf = 2097152;
                    break;
                case "H183":
                    numValueOf = 8388608;
                    break;
                case "H186":
                    numValueOf = 33554432;
                    break;
                default:
                    numValueOf = null;
                    break;
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return new Pair(Integer.valueOf(i10), numValueOf);
        }
        YU.c("CodecSpecificDataUtil", "Unknown HEVC level string: ".concat(String.valueOf(str2)));
        return null;
    }

    public static byte[] f(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11 + 4];
        System.arraycopy(f19033a, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i10, bArr2, 4, i11);
        return bArr2;
    }
}
