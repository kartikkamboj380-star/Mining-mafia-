package com.bytedance.adsdk.oq.csi;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.SparseArray;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class fax {
    private static final Interpolator kq = new LinearInterpolator();
    private static SparseArray<WeakReference<Interpolator>> oq;

    fax() {
    }

    private static SparseArray<WeakReference<Interpolator>> kq() {
        if (oq == null) {
            oq = new SparseArray<>();
        }
        return oq;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x0276  */
    private static <T> com.bytedance.adsdk.oq.rjo.kq<T> oq(com.bytedance.adsdk.oq.rjo rjoVar, JsonReader jsonReader, float f10, tvh<T> tvhVar) throws IOException {
        Interpolator interpolatorKq;
        Interpolator interpolatorKq2;
        T t10;
        Interpolator interpolator;
        Interpolator interpolatorKq3;
        com.bytedance.adsdk.oq.rjo.kq<T> kqVar;
        T t11;
        PointF pointF;
        PointF pointF2;
        PointF pointF3;
        PointF pointF4;
        jsonReader.beginObject();
        boolean z9 = false;
        PointF pointFOq = null;
        PointF pointFOq2 = null;
        PointF pointF5 = null;
        T tOq = null;
        PointF pointF6 = null;
        PointF pointF7 = null;
        PointF pointF8 = null;
        PointF pointFOq3 = null;
        PointF pointFOq4 = null;
        float fNextDouble = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        T tOq2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "e":
                    tOq2 = tvhVar.oq(jsonReader, f10);
                    continue;
                    break;
                case "h":
                    t11 = tOq;
                    pointF = pointFOq3;
                    pointF2 = pointFOq4;
                    if (jsonReader.nextInt() != 1) {
                        z9 = false;
                        break;
                    } else {
                        z9 = true;
                        break;
                    }
                    break;
                case "i":
                    boolean z10 = z9;
                    t11 = tOq;
                    pointF = pointFOq3;
                    pointF2 = pointFOq4;
                    if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float fNextDouble2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float fNextDouble3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float fNextDouble4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float fNextDouble5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        while (jsonReader.hasNext()) {
                            String strNextName2 = jsonReader.nextName();
                            strNextName2.getClass();
                            if (strNextName2.equals("x")) {
                                JsonToken jsonTokenPeek = jsonReader.peek();
                                JsonToken jsonToken = JsonToken.NUMBER;
                                if (jsonTokenPeek == jsonToken) {
                                    fNextDouble4 = (float) jsonReader.nextDouble();
                                    fNextDouble2 = fNextDouble4;
                                } else {
                                    jsonReader.beginArray();
                                    fNextDouble2 = (float) jsonReader.nextDouble();
                                    fNextDouble4 = jsonReader.peek() == jsonToken ? (float) jsonReader.nextDouble() : fNextDouble2;
                                    jsonReader.endArray();
                                }
                            } else if (strNextName2.equals("y")) {
                                JsonToken jsonTokenPeek2 = jsonReader.peek();
                                JsonToken jsonToken2 = JsonToken.NUMBER;
                                if (jsonTokenPeek2 == jsonToken2) {
                                    fNextDouble5 = (float) jsonReader.nextDouble();
                                    fNextDouble3 = fNextDouble5;
                                } else {
                                    jsonReader.beginArray();
                                    fNextDouble3 = (float) jsonReader.nextDouble();
                                    fNextDouble5 = jsonReader.peek() == jsonToken2 ? (float) jsonReader.nextDouble() : fNextDouble3;
                                    jsonReader.endArray();
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        PointF pointF9 = new PointF(fNextDouble2, fNextDouble3);
                        pointF8 = new PointF(fNextDouble4, fNextDouble5);
                        jsonReader.endObject();
                        pointF7 = pointF9;
                    } else {
                        pointFOq2 = gm.oq(jsonReader, f10);
                    }
                    z9 = z10;
                    break;
                case "o":
                    boolean z11 = z9;
                    if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float fNextDouble6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float fNextDouble7 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float fNextDouble8 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float fNextDouble9 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        while (jsonReader.hasNext()) {
                            tOq = tOq;
                            String strNextName3 = jsonReader.nextName();
                            strNextName3.getClass();
                            if (strNextName3.equals("x")) {
                                pointF3 = pointFOq3;
                                pointF4 = pointFOq4;
                                JsonToken jsonTokenPeek3 = jsonReader.peek();
                                JsonToken jsonToken3 = JsonToken.NUMBER;
                                if (jsonTokenPeek3 == jsonToken3) {
                                    fNextDouble8 = (float) jsonReader.nextDouble();
                                    fNextDouble6 = fNextDouble8;
                                } else {
                                    jsonReader.beginArray();
                                    fNextDouble6 = (float) jsonReader.nextDouble();
                                    fNextDouble8 = jsonReader.peek() == jsonToken3 ? (float) jsonReader.nextDouble() : fNextDouble6;
                                    jsonReader.endArray();
                                }
                            } else if (strNextName3.equals("y")) {
                                JsonToken jsonTokenPeek4 = jsonReader.peek();
                                JsonToken jsonToken4 = JsonToken.NUMBER;
                                if (jsonTokenPeek4 == jsonToken4) {
                                    fNextDouble9 = (float) jsonReader.nextDouble();
                                    fNextDouble7 = fNextDouble9;
                                } else {
                                    jsonReader.beginArray();
                                    pointF3 = pointFOq3;
                                    pointF4 = pointFOq4;
                                    fNextDouble7 = (float) jsonReader.nextDouble();
                                    fNextDouble9 = jsonReader.peek() == jsonToken4 ? (float) jsonReader.nextDouble() : fNextDouble7;
                                    jsonReader.endArray();
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                            pointFOq3 = pointF3;
                            pointFOq4 = pointF4;
                        }
                        PointF pointF10 = new PointF(fNextDouble6, fNextDouble7);
                        PointF pointF11 = new PointF(fNextDouble8, fNextDouble9);
                        jsonReader.endObject();
                        pointF5 = pointF10;
                        pointF6 = pointF11;
                    } else {
                        pointFOq = gm.oq(jsonReader, f10);
                    }
                    z9 = z11;
                    continue;
                    break;
                case "s":
                    tOq = tvhVar.oq(jsonReader, f10);
                    continue;
                    break;
                case "t":
                    fNextDouble = (float) jsonReader.nextDouble();
                    continue;
                    break;
                case "ti":
                    pointFOq4 = gm.oq(jsonReader, f10);
                    continue;
                    break;
                case "to":
                    pointFOq3 = gm.oq(jsonReader, f10);
                    continue;
                    break;
                default:
                    jsonReader.skipValue();
                    continue;
                    break;
            }
            tOq = t11;
            pointFOq3 = pointF;
            pointFOq4 = pointF2;
        }
        boolean z12 = z9;
        T t12 = tOq;
        PointF pointF12 = pointFOq3;
        PointF pointF13 = pointFOq4;
        jsonReader.endObject();
        if (!z12) {
            if (pointFOq != null && pointFOq2 != null) {
                interpolatorKq3 = kq(pointFOq, pointFOq2);
                interpolator = interpolatorKq3;
                t10 = tOq2;
                interpolatorKq = null;
                interpolatorKq2 = null;
            } else if (pointF5 != null && pointF6 != null && pointF7 != null && pointF8 != null) {
                interpolatorKq = kq(pointF5, pointF7);
                interpolatorKq2 = kq(pointF6, pointF8);
                t10 = tOq2;
                interpolator = null;
            }
            if (interpolatorKq != null || interpolatorKq2 == null) {
                kqVar = new com.bytedance.adsdk.oq.rjo.kq<>(rjoVar, t12, t10, interpolator, fNextDouble, null);
            } else {
                kqVar = new com.bytedance.adsdk.oq.rjo.kq<>(rjoVar, t12, t10, interpolatorKq, interpolatorKq2, fNextDouble, null);
            }
            kqVar.syt = pointF12;
            kqVar.dgq = pointF13;
            return kqVar;
        }
        tOq2 = t12;
        interpolatorKq3 = kq;
        interpolator = interpolatorKq3;
        t10 = tOq2;
        interpolatorKq = null;
        interpolatorKq2 = null;
        if (interpolatorKq != null) {
            kqVar = new com.bytedance.adsdk.oq.rjo.kq<>(rjoVar, t12, t10, interpolator, fNextDouble, null);
        } else {
            kqVar = new com.bytedance.adsdk.oq.rjo.kq<>(rjoVar, t12, t10, interpolator, fNextDouble, null);
        }
        kqVar.syt = pointF12;
        kqVar.dgq = pointF13;
        return kqVar;
    }

    private static WeakReference<Interpolator> kq(int i10) {
        WeakReference<Interpolator> weakReference;
        synchronized (fax.class) {
            weakReference = kq().get(i10);
        }
        return weakReference;
    }

    private static void kq(int i10, WeakReference<Interpolator> weakReference) {
        synchronized (fax.class) {
            oq.put(i10, weakReference);
        }
    }

    static <T> com.bytedance.adsdk.oq.rjo.kq<T> kq(JsonReader jsonReader, com.bytedance.adsdk.oq.rjo rjoVar, float f10, tvh<T> tvhVar, boolean z9, boolean z10) {
        if (z9 && z10) {
            return oq(rjoVar, jsonReader, f10, tvhVar);
        }
        if (z9) {
            return kq(rjoVar, jsonReader, f10, tvhVar);
        }
        return kq(jsonReader, f10, tvhVar);
    }

    private static <T> com.bytedance.adsdk.oq.rjo.kq<T> kq(com.bytedance.adsdk.oq.rjo rjoVar, JsonReader jsonReader, float f10, tvh<T> tvhVar) throws IOException {
        Interpolator interpolatorKq;
        jsonReader.beginObject();
        PointF pointFOq = null;
        T tOq = null;
        T tOq2 = null;
        PointF pointFOq2 = null;
        PointF pointFOq3 = null;
        float fNextDouble = 0.0f;
        boolean z9 = false;
        PointF pointFOq4 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "e":
                    tOq = tvhVar.oq(jsonReader, f10);
                    break;
                case "h":
                    if (jsonReader.nextInt() != 1) {
                        z9 = false;
                        break;
                    } else {
                        z9 = true;
                        break;
                    }
                    break;
                case "i":
                    pointFOq4 = gm.oq(jsonReader, 1.0f);
                    break;
                case "o":
                    pointFOq = gm.oq(jsonReader, 1.0f);
                    break;
                case "s":
                    tOq2 = tvhVar.oq(jsonReader, f10);
                    break;
                case "t":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "ti":
                    pointFOq3 = gm.oq(jsonReader, f10);
                    break;
                case "to":
                    pointFOq2 = gm.oq(jsonReader, f10);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (!z9) {
            if (pointFOq != null && pointFOq4 != null) {
                interpolatorKq = kq(pointFOq, pointFOq4);
            }
            com.bytedance.adsdk.oq.rjo.kq<T> kqVar = new com.bytedance.adsdk.oq.rjo.kq<>(rjoVar, tOq2, tOq, interpolatorKq, fNextDouble, null);
            kqVar.syt = pointFOq2;
            kqVar.dgq = pointFOq3;
            return kqVar;
        }
        tOq = tOq2;
        interpolatorKq = kq;
        com.bytedance.adsdk.oq.rjo.kq<T> kqVar2 = new com.bytedance.adsdk.oq.rjo.kq<>(rjoVar, tOq2, tOq, interpolatorKq, fNextDouble, null);
        kqVar2.syt = pointFOq2;
        kqVar2.dgq = pointFOq3;
        return kqVar2;
    }

    private static Interpolator kq(PointF pointF, PointF pointF2) {
        Interpolator linearInterpolator;
        pointF.x = com.bytedance.adsdk.oq.rhi.csi.oq(pointF.x, -1.0f, 1.0f);
        pointF.y = com.bytedance.adsdk.oq.rhi.csi.oq(pointF.y, -100.0f, 100.0f);
        pointF2.x = com.bytedance.adsdk.oq.rhi.csi.oq(pointF2.x, -1.0f, 1.0f);
        float fOq = com.bytedance.adsdk.oq.rhi.csi.oq(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fOq;
        int iKq = com.bytedance.adsdk.oq.rhi.rhi.kq(pointF.x, pointF.y, pointF2.x, fOq);
        WeakReference<Interpolator> weakReferenceKq = com.bytedance.adsdk.oq.csi.kq() ? null : kq(iKq);
        Interpolator interpolator = weakReferenceKq != null ? weakReferenceKq.get() : null;
        if (weakReferenceKq != null && interpolator != null) {
            return interpolator;
        }
        try {
            linearInterpolator = com.bytedance.adsdk.oq.sns.kq(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e10) {
            if ("The Path cannot loop back on itself.".equals(e10.getMessage())) {
                linearInterpolator = com.bytedance.adsdk.oq.sns.kq(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), pointF2.y);
            } else {
                linearInterpolator = new LinearInterpolator();
            }
        }
        if (!com.bytedance.adsdk.oq.csi.kq()) {
            try {
                kq(iKq, (WeakReference<Interpolator>) new WeakReference(linearInterpolator));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return linearInterpolator;
    }

    private static <T> com.bytedance.adsdk.oq.rjo.kq<T> kq(JsonReader jsonReader, float f10, tvh<T> tvhVar) {
        return new com.bytedance.adsdk.oq.rjo.kq<>(tvhVar.oq(jsonReader, f10));
    }
}
