package com.appsflyer.internal;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AFi1gSDK {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int $12 = 0;
    private static int $13 = 1;
    public static final Map AFInAppEventParameterName;
    private static long afDebugLog;
    private static int afErrorLog;
    private static long afInfoLog;
    private static int afLogForce;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f13269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static byte[] f13270e;
    private static int force;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static Object f13271i;
    private static byte[] unregisterClient;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static long f13272v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static Object f13273w;

    /* JADX WARN: Code duplicated, block: B:10:0x0038 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003b -> B:14:0x0049). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0039
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$c(short r7, byte r8, int r9) {
        /*
            int r0 = com.appsflyer.internal.AFi1gSDK.$13
            int r1 = r0 + 7
            int r1 = r1 % 128
            com.appsflyer.internal.AFi1gSDK.$12 = r1
            byte[] r1 = com.appsflyer.internal.AFi1gSDK.$$a
            int r9 = 1151 - r9
            int r8 = r8 + 1
            int r7 = 119 - r7
            byte[] r2 = new byte[r8]
            r3 = 0
            if (r1 != 0) goto L1f
            int r0 = r0 + 109
            int r0 = r0 % 128
            com.appsflyer.internal.AFi1gSDK.$12 = r0
            r0 = r9
            r4 = r3
            r9 = r8
            goto L49
        L1f:
            r0 = r3
        L20:
            int r4 = r0 + 1
            byte r5 = (byte) r7
            r2[r0] = r5
            if (r4 != r8) goto L3b
            java.lang.String r7 = new java.lang.String
            r7.<init>(r2, r3)
            int r8 = com.appsflyer.internal.AFi1gSDK.$12
            int r8 = r8 + 93
            int r9 = r8 % 128
            com.appsflyer.internal.AFi1gSDK.$13 = r9
            int r8 = r8 % 2
            if (r8 == 0) goto L39
            return r7
        L39:
            r7 = 0
            throw r7
        L3b:
            r0 = r1[r9]
            int r5 = com.appsflyer.internal.AFi1gSDK.$12
            int r5 = r5 + 55
            int r5 = r5 % 128
            com.appsflyer.internal.AFi1gSDK.$13 = r5
            r6 = r9
            r9 = r7
            r7 = r0
            r0 = r6
        L49:
            int r0 = r0 + 1
            int r7 = -r7
            int r9 = r9 + r7
            int r7 = r9 + (-3)
            r9 = r0
            r0 = r4
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFi1gSDK.$$c(short, byte, int):java.lang.String");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 75301. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    static {
        /*
            Method dump skipped, instruction units count: 7530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFi1gSDK.<clinit>():void");
    }

    private AFi1gSDK() {
    }

    public static int getCurrencyIso4217Code(int i10) throws Throwable {
        int i11 = $11;
        int i12 = ((i11 ^ 21) + ((i11 & 21) << 1)) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        $10 = i12;
        Object obj = f13273w;
        $11 = ((i12 ^ 11) + ((i12 & 11) << 1)) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        try {
            Object[] objArr = {Integer.valueOf(i10)};
            byte[] bArr = $$a;
            int iIntValue = ((Integer) Class.forName($$c(bArr[289], bArr[894], (short) 583), true, (ClassLoader) f13271i).getMethod($$c(bArr[56], bArr[326], bArr[7]), Integer.TYPE).invoke(obj, objArr)).intValue();
            $11 = ($10 + 97) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            return iIntValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object getMediationNetwork(int i10, int i11, char c10) throws Throwable {
        int i12 = $10;
        int i13 = (i12 & 25) + (i12 | 25);
        $11 = i13 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i13 % 2 == 0) {
            throw null;
        }
        Object obj = f13273w;
        $11 = ((i12 & 73) + (i12 | 73)) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        try {
            Object[] objArr = {Integer.valueOf(i10), Integer.valueOf(i11), Character.valueOf(c10)};
            byte[] bArr = $$a;
            Class<?> cls = Class.forName($$c(bArr[289], bArr[894], (short) 583), true, (ClassLoader) f13271i);
            byte b10 = bArr[232];
            byte b11 = bArr[13];
            String str$$c = $$c(b10, b11, b11);
            Class cls2 = Integer.TYPE;
            Object objInvoke = cls.getMethod(str$$c, cls2, cls2, Character.TYPE).invoke(obj, objArr);
            int i14 = $10;
            $11 = ((i14 & 121) + (i14 | 121)) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            return objInvoke;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int getRevenue(Object obj) throws Throwable {
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i10 = ~(380291229 | iCurrentTimeMillis);
        int i11 = (-1845393600) + (((i10 & 332130) | (332130 ^ i10)) * 345);
        int i12 = ~iCurrentTimeMillis;
        int i13 = ~((380291229 & i12) | (380291229 ^ i12));
        int i14 = i11 + (((i13 & 310411396) | (i13 ^ 310411396)) * 345);
        int i15 = -(-((~((iCurrentTimeMillis & (-332131)) | ((-332131) ^ iCurrentTimeMillis))) * 345));
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
        int i17 = ~((~iCurrentTimeMillis2) | 875520558);
        int i18 = -(-(((i17 & (-939486207)) | ((-939486207) ^ i17)) * (-712)));
        int i19 = (124585913 ^ i18) + ((i18 & 124585913) << 1);
        int i20 = ~iCurrentTimeMillis2;
        int i21 = (66472924 ^ i20) | (66472924 & i20);
        int i22 = ~((i21 & 875520558) | (i21 ^ 875520558));
        int i23 = ~((iCurrentTimeMillis2 & (-63965649)) | ((-63965649) ^ iCurrentTimeMillis2));
        int i24 = -(-(((i23 & i22) | (i22 ^ i23)) * (-712)));
        int i25 = ((i19 | i24) << 1) - (i24 ^ i19);
        int i26 = -(-(((~(i20 | 875520558)) | 66472924) * 712));
        if (i16 > ((i25 | i26) << 1) - (i26 ^ i25)) {
            throw null;
        }
        Object obj2 = f13273w;
        $10 = ($11 + 47) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        try {
            byte[] bArr = $$a;
            int iIntValue = ((Integer) Class.forName($$c(bArr[289], bArr[894], (short) 583), true, (ClassLoader) f13271i).getMethod($$c(bArr[56], bArr[326], bArr[7]), Object.class).invoke(obj2, obj)).intValue();
            int i27 = $11 + 39;
            $10 = i27 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            if (i27 % 2 != 0) {
                int i28 = 42 / 0;
            }
            return iIntValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static void init$0() {
        int i10 = $11;
        $10 = ((i10 ^ 27) + ((i10 & 27) << 1)) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        byte[] bArr = new byte[1172];
        System.arraycopy("\t\u009bf\u000fð\u0007ï\u0000\u0003\u00023Äò\u000eî\u0005ü\u0003íBèÑ\u0000úúò\nýôñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøÚ5È\u0010\föõýñÿ<Êîýú\n÷ð\u0011ðð\u0007ï\u0000\u0003\u00023Êîý?êÛì\bð\nòø\"éó\n\u0001úë\u0000ý\nô÷0Îý\u0001\u0000\u0003ÿê\b÷þð\u0007ï\u0000\u0003\u00023Êîý?êÎý&Øú\nþòöÿî(Ø\u0002ò\b\u0005ò(Îý\u0001\u0000\u0003ÿê\b÷þÿî+Úú\u0004ï,Øôÿî.Ñ\bü\u001fßûø\u0000\u001eØôÿî.ßûø\u0000\u001eØôÈ\u0000ê\u0010/È\u0000ê\u0010/\u0006è\u00120Â÷>åÚú\u0004\u0006è\u00120Â÷>·\u0004ú\tøô\u0006è\u00120¿\bð\u00046Ø×\u0003ü\fõÿî!Û\u0000ü\bðûøñ\bü\u0003ùÿûø\u0000ð\u0007ï\u0000\u0003\u00023¼ùBéÊ\tú\u0005=Ë\u000eðü\u0007÷þ\föé\u0013ø÷ÿð\u0014â\u0006ò\f\u0012÷\u0013õ\u0006è\u00120Â÷>â÷\u0007Ê\u0012ûòù\b÷þë\u0000ý\nô÷\u001dèù\u0005\u0015áúý\u0000ó\u0006è\u00120Â÷>åÚú\u0004\u0013×þ\u0001øþ\u001eÜÿ\n\u0001ñôúù\u000b\u0012ú\u0010õËëý\u000bîþAÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:È/ü÷Ô,Ë)\u0005ûú\u0000÷\u0004Íü3ÿî\u001fêï\u0001÷\u0000\fû\u0006è\u00120½\u0006îCÖ\u0000\u0003ÿî!ìê\t\u0006è\u00120Â÷>éÊ\fýþð\nþ\u0018Øûøþ\u001eÜÿ\n\u0001ñ\u0006è\u00120Â÷>âØûøþ\u001eÜÿ\n\u0001ñ\u0006è\u00120Â÷>çàê\u0010\u0015Øûøþ\u001eÜÿ\n\u0001ñ\n\u0001ú\u001bÎ\u0006ýð\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå-Øûøþ\u001eÜÿ\n\u0001ññÿ<Êîýú\n÷ð\u0011ðAÂø÷\fð\u0001\nò;êøØ7º\u001e\föñÿ<Êîýú\n÷ð\u0011ðAÂø÷\fð\u0001\nò;êøÚ5È\u0010\föõýÿî$åþø\u0005ê\b÷þ\u001dæîú\u0005ú\u0004\u0005ÿö\n\u0001ú\u000bî\u001fê\u0001ú\u0012Þÿð\u0012ù\u0011õ\u0002\u0006ò\fÿî+ÿ\u0006è\u00120Â÷>åÚú\u0004\u001eÜï\rî\u0006öù\u0002ú÷\b\b\u0000òó\nû:¸÷\u0003ü\fõ<çÜê/Úú\u0004ú\u000bú\u001dÜêÿî0Üì\u0001\u0000ôþ\f\u0012ìê\tüö\u0004î\fÿî.Ô\bëý$Ú\u000búüð\u0006è\u00120¶þ\bú;±\u000eö?Ñîö$Øûøþ\u001eÜÿ\n\u0001ñÿî#æê\u0001,Ô÷ÿö\u0006è\u00120¶þ\bú;±\u000eö?Ñîö(Ô÷ÿöÿî\u001eçì\u0012\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå'×þ\u0001øþ\u001eÜÿ\n\u0001ñ\u0002*Æ\u0002\f!Ìý\u000eå\u0006è\u00120Â÷>èÔúù\u000b\u0001üó\u0004\u0000òó\nû:¸÷\u0003ü\fõ<âØ\u001eåõûúö2Üê2Ô\bëý$Ú\u000búüð\u0006è\u00120½\u0002÷>éÆ\u0002\f Ê\fýþð\u0006è\u00120¿\bð\u00046èÔ\bëý$Ú\u000búüð\u0002\u000eî\u0000òó\nû:¸÷\u0003ü\fõ<éÞë\u000b\u001eÜê2Ô\bëý$Ú\u000búüð\fê\t\u0019àóü\nê\bð\u000e\u0016à\u0004í\u000eìö2Øô\nÿì\u0002ú\u0006\u0001ï\nê\bð\u000e\u0016à\u0004í\u000eìö&ìê\t Ö\u0004õ\u0005ô÷þÿî.Ñÿúþþ\u0006ô÷\u001dØ\u0006\b\u0012õ\u0015õú\u000bú\u001eÔ\bëýñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøÚ5Ç\u0011\fö$·Ëëý\u000bîþAÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:öÑùþü+\u0003É0Ë2úû\u0001È0Ì4\u0012ö\u0014õ·üL·\u0002òý\u0007þûõõP±\u0004üïHø\u0002Ú\u000fêì\u000eôö\r\u001eàê\u0010ÿî$Ûþ\u0006î\bì\u0016ê\b÷þ\u001dæîú\u0005ú\u0004".getBytes("ISO-8859-1"), 0, bArr, 0, 1172);
        $$a = bArr;
        $$b = 174;
        $10 = ($11 + 27) % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
    }

    private static void getCurrencyIso4217Code(int i10, int i11) {
        int i12 = $10 + 119;
        $11 = i12 % IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        if (i12 % 2 == 0) {
            int i13 = 21 / 0;
        }
    }
}
