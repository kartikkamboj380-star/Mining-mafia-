package E;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
abstract class f {
    private static a a(a aVar, int i10, int i11, boolean z9, int i12) {
        if (aVar != null) {
            return aVar;
        }
        return z9 ? new a(i10, i12, i11) : new a(i10, i11);
    }

    static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayI = k.i(resources, theme, attributeSet, B.d.f102A);
        float f10 = k.f(typedArrayI, xmlPullParser, "startX", B.d.f111J, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float f11 = k.f(typedArrayI, xmlPullParser, "startY", B.d.f112K, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float f12 = k.f(typedArrayI, xmlPullParser, "endX", B.d.f113L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float f13 = k.f(typedArrayI, xmlPullParser, "endY", B.d.f114M, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float f14 = k.f(typedArrayI, xmlPullParser, "centerX", B.d.f106E, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float f15 = k.f(typedArrayI, xmlPullParser, "centerY", B.d.f107F, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        int iG = k.g(typedArrayI, xmlPullParser, HandleInvocationsFromAdViewer.KEY_AD_TYPE, B.d.f105D, 0);
        int iB = k.b(typedArrayI, xmlPullParser, "startColor", B.d.f103B, 0);
        boolean zH = k.h(xmlPullParser, "centerColor");
        int iB2 = k.b(typedArrayI, xmlPullParser, "centerColor", B.d.f110I, 0);
        int iB3 = k.b(typedArrayI, xmlPullParser, "endColor", B.d.f104C, 0);
        int iG2 = k.g(typedArrayI, xmlPullParser, "tileMode", B.d.f109H, 0);
        float f16 = k.f(typedArrayI, xmlPullParser, "gradientRadius", B.d.f108G, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        typedArrayI.recycle();
        a aVarA = a(c(resources, xmlPullParser, attributeSet, theme), iB, iB3, zH, iB2);
        if (iG != 1) {
            return iG != 2 ? new LinearGradient(f10, f11, f12, f13, aVarA.f530a, aVarA.f531b, d(iG2)) : new SweepGradient(f14, f15, aVarA.f530a, aVarA.f531b);
        }
        if (f16 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return new RadialGradient(f14, f15, f16, aVarA.f530a, aVarA.f531b, d(iG2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    private static a c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int depth2 = xmlPullParser.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayI = k.i(resources, theme, attributeSet, B.d.f115N);
                boolean zHasValue = typedArrayI.hasValue(B.d.f116O);
                boolean zHasValue2 = typedArrayI.hasValue(B.d.f117P);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color = typedArrayI.getColor(B.d.f116O, 0);
                float f10 = typedArrayI.getFloat(B.d.f117P, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                typedArrayI.recycle();
                arrayList2.add(Integer.valueOf(color));
                arrayList.add(Float.valueOf(f10));
            }
        }
        if (arrayList2.size() > 0) {
            return new a(arrayList2, arrayList);
        }
        return null;
    }

    private static Shader.TileMode d(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int[] f530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float[] f531b;

        a(List list, List list2) {
            int size = list.size();
            this.f530a = new int[size];
            this.f531b = new float[size];
            for (int i10 = 0; i10 < size; i10++) {
                this.f530a[i10] = ((Integer) list.get(i10)).intValue();
                this.f531b[i10] = ((Float) list2.get(i10)).floatValue();
            }
        }

        a(int i10, int i11) {
            this.f530a = new int[]{i10, i11};
            this.f531b = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
        }

        a(int i10, int i11, int i12) {
            this.f530a = new int[]{i10, i11, i12};
            this.f531b = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f, 1.0f};
        }
    }
}
