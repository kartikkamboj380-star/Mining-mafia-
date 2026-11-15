package com.facebook.react.uimanager;

import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class TransformHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TransformHelper f15486a = new TransformHelper();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f15487b = new b();

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15488a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f15488a = iArr;
        }
    }

    public static final class b extends ThreadLocal {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public double[] initialValue() {
            return new double[16];
        }
    }

    private TransformHelper() {
    }

    private final double a(ReadableMap readableMap, String str) {
        double d10;
        boolean z9 = true;
        if (readableMap.getType(str) == ReadableType.String) {
            String string = readableMap.getString(str);
            Intrinsics.c(string);
            if (StringsKt.x(string, "rad", false, 2, null)) {
                string = StringsKt.X0(string, 3);
            } else if (StringsKt.x(string, "deg", false, 2, null)) {
                string = StringsKt.X0(string, 3);
                z9 = false;
            }
            d10 = Double.parseDouble(string);
        } else {
            d10 = readableMap.getDouble(str);
        }
        return z9 ? d10 : Y.l(d10);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    private final double[] b(float f10, float f11, ReadableArray readableArray, boolean z9) {
        if (readableArray == null || (f11 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            return null;
        }
        double d10 = ((double) f10) / 2.0d;
        double d11 = ((double) f11) / 2.0d;
        double[] dArr = new double[3];
        boolean z10 = false;
        dArr[0] = d10;
        int i10 = 1;
        dArr[1] = d11;
        dArr[2] = 0.0d;
        int iMin = Math.min(readableArray.size(), 3);
        int i11 = 0;
        while (i11 < iMin) {
            int i12 = a.f15488a[readableArray.getType(i11).ordinal()];
            if (i12 == i10) {
                dArr[i11] = readableArray.getDouble(i11);
            } else if (i12 == 2 && z9) {
                String string = readableArray.getString(i11);
                Intrinsics.c(string);
                if (StringsKt.x(string, "%", z10, 2, null)) {
                    dArr[i11] = (((double) (i11 == 0 ? f10 : f11)) * Double.parseDouble(StringsKt.X0(string, i10))) / 100.0d;
                }
            }
            i11++;
            z10 = z10;
            i10 = i10;
        }
        boolean z11 = z10;
        int i13 = i10;
        double d12 = (-d10) + dArr[z11 ? 1 : 0];
        double d13 = (-d11) + dArr[i13];
        double d14 = dArr[2];
        double[] dArr2 = new double[3];
        dArr2[z11 ? 1 : 0] = d12;
        dArr2[i13] = d13;
        dArr2[2] = d14;
        return dArr2;
    }

    private final double c(String str, double d10) {
        try {
            return StringsKt.x(str, "%", false, 2, null) ? (Double.parseDouble(StringsKt.X0(str, 1)) * d10) / 100.0d : Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            Z1.a.I("ReactNative", "Invalid translate value: " + str);
            return 0.0d;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:108:0x024a A[PHI: r6 r7
      0x024a: PHI (r6v24 int) = 
      (r6v4 int)
      (r6v5 int)
      (r6v6 int)
      (r6v7 int)
      (r6v8 int)
      (r6v9 int)
      (r6v10 int)
      (r6v11 int)
      (r6v12 int)
      (r6v13 int)
      (r6v25 int)
     binds: [B:107:0x0248, B:97:0x0218, B:91:0x01f9, B:87:0x01e1, B:83:0x01cb, B:79:0x01b5, B:75:0x019c, B:71:0x0184, B:67:0x016c, B:63:0x0156, B:29:0x00a5] A[DONT_GENERATE, DONT_INLINE]
      0x024a: PHI (r7v25 char) = 
      (r7v4 char)
      (r7v5 char)
      (r7v6 char)
      (r7v7 char)
      (r7v8 char)
      (r7v9 char)
      (r7v10 char)
      (r7v11 char)
      (r7v12 char)
      (r7v13 char)
      (r7v26 char)
     binds: [B:107:0x0248, B:97:0x0218, B:91:0x01f9, B:87:0x01e1, B:83:0x01cb, B:79:0x01b5, B:75:0x019c, B:71:0x0184, B:67:0x016c, B:63:0x0156, B:29:0x00a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a5  */
    /* JADX WARN: Instruction removed from duplicated block: B:108:0x024a, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(ReadableArray transforms, double[] result, float f10, float f11, ReadableArray readableArray, boolean z9) {
        int i10;
        char c10;
        double dC;
        double dC2;
        double dC3;
        double dC4;
        Intrinsics.checkNotNullParameter(transforms, "transforms");
        Intrinsics.checkNotNullParameter(result, "result");
        int i11 = 1;
        if (z9 && p204u3.b.w() && (transforms instanceof NativeArray)) {
            if (readableArray == 0 ? true : readableArray instanceof NativeArray) {
                nativeProcessTransform((NativeArray) transforms, result, f10, f11, (NativeArray) readableArray);
                return;
            }
        }
        Object obj = f15487b.get();
        Intrinsics.c(obj);
        double[] dArr = (double[]) obj;
        Y.r(result);
        double[] dArrB = f15486a.b(f10, f11, readableArray, z9);
        if (dArrB != null) {
            Y.r(dArr);
            Y.j(dArr, dArrB[0], dArrB[1], dArrB[2]);
            Y.p(result, result, dArr);
        }
        if (transforms.size() == 16 && transforms.getType(0) == ReadableType.Number) {
            Y.r(dArr);
            int size = transforms.size();
            for (int i12 = 0; i12 < size; i12++) {
                dArr[i12] = transforms.getDouble(i12);
            }
            Y.p(result, result, dArr);
        } else {
            int size2 = transforms.size();
            int i13 = 0;
            while (i13 < size2) {
                ReadableMap map = transforms.getMap(i13);
                Intrinsics.c(map);
                String strNextKey = map.keySetIterator().nextKey();
                Y.r(dArr);
                int i14 = i13;
                switch (strNextKey.hashCode()) {
                    case -1721943862:
                        i10 = size2;
                        c10 = 16;
                        if (strNextKey.equals("translateX")) {
                            if (map.getType(strNextKey) == ReadableType.String && z9) {
                                TransformHelper transformHelper = f15486a;
                                String string = map.getString(strNextKey);
                                Intrinsics.c(string);
                                dC = transformHelper.c(string, f10);
                            } else {
                                dC = map.getDouble(strNextKey);
                            }
                            Y.i(dArr, dC, 0.0d);
                        } else {
                            Z1.a.I("ReactNative", "Unsupported transform type: " + strNextKey);
                        }
                        break;
                    case -1721943861:
                        i10 = size2;
                        c10 = 16;
                        if (strNextKey.equals("translateY")) {
                            if (map.getType(strNextKey) == ReadableType.String && z9) {
                                TransformHelper transformHelper2 = f15486a;
                                String string2 = map.getString(strNextKey);
                                Intrinsics.c(string2);
                                dC2 = transformHelper2.c(string2, f11);
                            } else {
                                dC2 = map.getDouble(strNextKey);
                            }
                            Y.i(dArr, 0.0d, dC2);
                        } else {
                            Z1.a.I("ReactNative", "Unsupported transform type: " + strNextKey);
                        }
                        break;
                    case -1081239615:
                        i10 = size2;
                        c10 = 16;
                        if (strNextKey.equals("matrix")) {
                            ReadableArray array = map.getArray(strNextKey);
                            Intrinsics.c(array);
                            for (int i15 = 0; i15 < 16; i15++) {
                                dArr[i15] = array.getDouble(i15);
                            }
                        } else {
                            Z1.a.I("ReactNative", "Unsupported transform type: " + strNextKey);
                        }
                        break;
                    case -925180581:
                        i10 = size2;
                        c10 = 16;
                        if (strNextKey.equals("rotate")) {
                            Y.d(dArr, f15486a.a(map, strNextKey));
                        } else {
                            Z1.a.I("ReactNative", "Unsupported transform type: " + strNextKey);
                        }
                        break;
                    case -908189618:
                        i10 = size2;
                        c10 = 16;
                        if (strNextKey.equals("scaleX")) {
                            Y.e(dArr, map.getDouble(strNextKey));
                        } else {
                            Z1.a.I("ReactNative", "Unsupported transform type: " + strNextKey);
                        }
                        break;
                    case -908189617:
                        i10 = size2;
                        c10 = 16;
                        if (strNextKey.equals("scaleY")) {
                            Y.f(dArr, map.getDouble(strNextKey));
                        } else {
                            Z1.a.I("ReactNative", "Unsupported transform type: " + strNextKey);
                        }
                        break;
                    case 109250890:
                        i10 = size2;
                        c10 = 16;
                        if (strNextKey.equals("scale")) {
                            double d10 = map.getDouble(strNextKey);
                            Y.e(dArr, d10);
                            Y.f(dArr, d10);
                        } else {
                            Z1.a.I("ReactNative", "Unsupported transform type: " + strNextKey);
                        }
                        break;
                    case 109493390:
                        i10 = size2;
                        c10 = 16;
                        if (strNextKey.equals("skewX")) {
                            Y.g(dArr, f15486a.a(map, strNextKey));
                        } else {
                            Z1.a.I("ReactNative", "Unsupported transform type: " + strNextKey);
                        }
                        break;
                    case 109493391:
                        i10 = size2;
                        c10 = 16;
                        if (strNextKey.equals("skewY")) {
                            Y.h(dArr, f15486a.a(map, strNextKey));
                        } else {
                            Z1.a.I("ReactNative", "Unsupported transform type: " + strNextKey);
                        }
                        break;
                    case 207960636:
                        i10 = size2;
                        c10 = 16;
                        if (strNextKey.equals("perspective")) {
                            Y.a(dArr, map.getDouble(strNextKey));
                        } else {
                            Z1.a.I("ReactNative", "Unsupported transform type: " + strNextKey);
                        }
                        break;
                    case 1052832078:
                        if (strNextKey.equals("translate")) {
                            ReadableArray array2 = map.getArray(strNextKey);
                            Intrinsics.c(array2);
                            ReadableType type = array2.getType(0);
                            ReadableType readableType = ReadableType.String;
                            if (type == readableType && z9) {
                                TransformHelper transformHelper3 = f15486a;
                                String string3 = array2.getString(0);
                                Intrinsics.c(string3);
                                dC3 = transformHelper3.c(string3, f10);
                            } else {
                                dC3 = array2.getDouble(0);
                            }
                            if (array2.getType(i11) == readableType && z9) {
                                TransformHelper transformHelper4 = f15486a;
                                String string4 = array2.getString(i11);
                                Intrinsics.c(string4);
                                dC4 = transformHelper4.c(string4, f11);
                            } else {
                                dC4 = array2.getDouble(i11);
                            }
                            dArr = dArr;
                            double d11 = dC4;
                            i10 = size2;
                            double d12 = dC3;
                            c10 = 16;
                            Y.j(dArr, d12, d11, array2.size() > 2 ? array2.getDouble(2) : 0.0d);
                        } else {
                            i10 = size2;
                            c10 = 16;
                            Z1.a.I("ReactNative", "Unsupported transform type: " + strNextKey);
                        }
                        break;
                    case 1384173149:
                        if (strNextKey.equals("rotateX")) {
                            Y.b(dArr, f15486a.a(map, strNextKey));
                            i10 = size2;
                            c10 = 16;
                        }
                        i10 = size2;
                        c10 = 16;
                        Z1.a.I("ReactNative", "Unsupported transform type: " + strNextKey);
                        break;
                    case 1384173150:
                        if (strNextKey.equals("rotateY")) {
                            Y.c(dArr, f15486a.a(map, strNextKey));
                            i10 = size2;
                            c10 = 16;
                        }
                        i10 = size2;
                        c10 = 16;
                        Z1.a.I("ReactNative", "Unsupported transform type: " + strNextKey);
                        break;
                    case 1384173151:
                        if (strNextKey.equals("rotateZ")) {
                            i10 = size2;
                            c10 = 16;
                            Y.d(dArr, f15486a.a(map, strNextKey));
                        }
                        i10 = size2;
                        c10 = 16;
                        Z1.a.I("ReactNative", "Unsupported transform type: " + strNextKey);
                        break;
                    default:
                        i10 = size2;
                        c10 = 16;
                        Z1.a.I("ReactNative", "Unsupported transform type: " + strNextKey);
                        break;
                }
                Y.p(result, result, dArr);
                i13 = i14 + 1;
                size2 = i10;
                i11 = 1;
            }
        }
        if (dArrB != null) {
            Y.r(dArr);
            Y.j(dArr, -dArrB[0], -dArrB[1], -dArrB[2]);
            Y.p(result, result, dArr);
        }
    }

    private static final native void nativeProcessTransform(NativeArray nativeArray, double[] dArr, float f10, float f11, NativeArray nativeArray2);
}
