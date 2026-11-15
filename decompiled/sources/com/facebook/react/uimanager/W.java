package com.facebook.react.uimanager;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class W {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f15509c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f15510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final X f15511b;

    public static final class a {

        /* JADX INFO: renamed from: com.facebook.react.uimanager.W$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0345a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f15512a;

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
                f15512a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final W a(Dynamic dynamic) {
            Intrinsics.checkNotNullParameter(dynamic, "dynamic");
            int i10 = C0345a.f15512a[dynamic.getType().ordinal()];
            if (i10 == 1) {
                double dAsDouble = dynamic.asDouble();
                if (dAsDouble >= 0.0d) {
                    return new W((float) dAsDouble, X.POINT);
                }
                return null;
            }
            if (i10 != 2) {
                Z1.a.I("ReactNative", "Unsupported type for radius property: " + dynamic.getType());
                return null;
            }
            String strAsString = dynamic.asString();
            if (strAsString == null || !StringsKt.x(strAsString, "%", false, 2, null)) {
                Z1.a.I("ReactNative", "Invalid string value: " + strAsString);
                return null;
            }
            try {
                String strSubstring = strAsString.substring(0, strAsString.length() - 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                float f10 = Float.parseFloat(strSubstring);
                if (f10 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    return new W(f10, X.PERCENT);
                }
                return null;
            } catch (NumberFormatException unused) {
                Z1.a.I("ReactNative", "Invalid percentage format: " + strAsString);
                return null;
            }
        }

        private a() {
        }
    }

    public W(float f10, X type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f15510a = f10;
        this.f15511b = type;
    }

    public final X a() {
        return this.f15511b;
    }

    public final float b(float f10) {
        return this.f15511b == X.PERCENT ? (this.f15510a / 100) * f10 : this.f15510a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w10 = (W) obj;
        return Float.compare(this.f15510a, w10.f15510a) == 0 && this.f15511b == w10.f15511b;
    }

    public int hashCode() {
        return (Float.hashCode(this.f15510a) * 31) + this.f15511b.hashCode();
    }

    public String toString() {
        return "LengthPercentage(value=" + this.f15510a + ", type=" + this.f15511b + ")";
    }
}
