package p203u2;

import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f49820a = a.BITMAP_ONLY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f49821b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float[] f49822c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f49823d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f49824e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f49825f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f49826g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f49827h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f49828i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f49829j = false;

    public enum a {
        OVERLAY_COLOR,
        BITMAP_ONLY
    }

    public static d a(float f10) {
        return new d().m(f10);
    }

    private float[] e() {
        if (this.f49822c == null) {
            this.f49822c = new float[8];
        }
        return this.f49822c;
    }

    public int b() {
        return this.f49825f;
    }

    public float c() {
        return this.f49824e;
    }

    public float[] d() {
        return this.f49822c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f49821b == dVar.f49821b && this.f49823d == dVar.f49823d && Float.compare(dVar.f49824e, this.f49824e) == 0 && this.f49825f == dVar.f49825f && Float.compare(dVar.f49826g, this.f49826g) == 0 && this.f49820a == dVar.f49820a && this.f49827h == dVar.f49827h && this.f49828i == dVar.f49828i) {
            return Arrays.equals(this.f49822c, dVar.f49822c);
        }
        return false;
    }

    public int f() {
        return this.f49823d;
    }

    public float g() {
        return this.f49826g;
    }

    public boolean h() {
        return this.f49828i;
    }

    public int hashCode() {
        a aVar = this.f49820a;
        int iHashCode = (((aVar != null ? aVar.hashCode() : 0) * 31) + (this.f49821b ? 1 : 0)) * 31;
        float[] fArr = this.f49822c;
        int iHashCode2 = (((iHashCode + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.f49823d) * 31;
        float f10 = this.f49824e;
        int iFloatToIntBits = (((iHashCode2 + (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.floatToIntBits(f10) : 0)) * 31) + this.f49825f) * 31;
        float f11 = this.f49826g;
        return ((((iFloatToIntBits + (f11 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.floatToIntBits(f11) : 0)) * 31) + (this.f49827h ? 1 : 0)) * 31) + (this.f49828i ? 1 : 0);
    }

    public boolean i() {
        return this.f49829j;
    }

    public boolean j() {
        return this.f49821b;
    }

    public a k() {
        return this.f49820a;
    }

    public boolean l() {
        return this.f49827h;
    }

    public d m(float f10) {
        Arrays.fill(e(), f10);
        return this;
    }

    public d n(int i10) {
        this.f49823d = i10;
        this.f49820a = a.OVERLAY_COLOR;
        return this;
    }

    public d o(boolean z9) {
        this.f49828i = z9;
        return this;
    }

    public d p(a aVar) {
        this.f49820a = aVar;
        return this;
    }
}
