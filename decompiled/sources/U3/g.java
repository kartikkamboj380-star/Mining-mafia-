package U3;

import android.content.Context;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f5936g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f5937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f5938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f5939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Float f5940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Float f5941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Boolean f5942f;

    public static final class a {

        /* JADX INFO: renamed from: U3.g$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0091a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f5943a;

            static {
                int[] iArr = new int[ReadableType.values().length];
                try {
                    iArr[ReadableType.Number.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ReadableType.Map.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f5943a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a(ReadableMap readableMap, Context context) {
            Integer num;
            Integer numValueOf;
            Intrinsics.checkNotNullParameter(context, "context");
            if (readableMap == null || !readableMap.hasKey("offsetX") || !readableMap.hasKey("offsetY")) {
                return null;
            }
            float f10 = (float) readableMap.getDouble("offsetX");
            float f11 = (float) readableMap.getDouble("offsetY");
            if (readableMap.hasKey("color")) {
                ReadableType type = readableMap.getType("color");
                int i10 = C0091a.f5943a[type.ordinal()];
                if (i10 == 1) {
                    numValueOf = Integer.valueOf(readableMap.getInt("color"));
                } else {
                    if (i10 != 2) {
                        throw new JSApplicationCausedNativeException("Unsupported color type " + type);
                    }
                    numValueOf = ColorPropConverter.getColor(readableMap.getMap("color"), context);
                }
                num = numValueOf;
            } else {
                num = null;
            }
            return new g(f10, f11, num, readableMap.hasKey("blurRadius") ? Float.valueOf((float) readableMap.getDouble("blurRadius")) : null, readableMap.hasKey("spreadDistance") ? Float.valueOf((float) readableMap.getDouble("spreadDistance")) : null, readableMap.hasKey("inset") ? Boolean.valueOf(readableMap.getBoolean("inset")) : null);
        }

        private a() {
        }
    }

    public g(float f10, float f11, Integer num, Float f12, Float f13, Boolean bool) {
        this.f5937a = f10;
        this.f5938b = f11;
        this.f5939c = num;
        this.f5940d = f12;
        this.f5941e = f13;
        this.f5942f = bool;
    }

    public final Float a() {
        return this.f5940d;
    }

    public final Integer b() {
        return this.f5939c;
    }

    public final Boolean c() {
        return this.f5942f;
    }

    public final float d() {
        return this.f5937a;
    }

    public final float e() {
        return this.f5938b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.compare(this.f5937a, gVar.f5937a) == 0 && Float.compare(this.f5938b, gVar.f5938b) == 0 && Intrinsics.b(this.f5939c, gVar.f5939c) && Intrinsics.b(this.f5940d, gVar.f5940d) && Intrinsics.b(this.f5941e, gVar.f5941e) && Intrinsics.b(this.f5942f, gVar.f5942f);
    }

    public final Float f() {
        return this.f5941e;
    }

    public int hashCode() {
        int iHashCode = ((Float.hashCode(this.f5937a) * 31) + Float.hashCode(this.f5938b)) * 31;
        Integer num = this.f5939c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Float f10 = this.f5940d;
        int iHashCode3 = (iHashCode2 + (f10 == null ? 0 : f10.hashCode())) * 31;
        Float f11 = this.f5941e;
        int iHashCode4 = (iHashCode3 + (f11 == null ? 0 : f11.hashCode())) * 31;
        Boolean bool = this.f5942f;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "BoxShadow(offsetX=" + this.f5937a + ", offsetY=" + this.f5938b + ", color=" + this.f5939c + ", blurRadius=" + this.f5940d + ", spreadDistance=" + this.f5941e + ", inset=" + this.f5942f + ")";
    }
}
