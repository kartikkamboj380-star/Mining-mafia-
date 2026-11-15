package p034d3;

import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public class B extends AbstractC6946b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f42947f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f42948g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c f42949h;

    public B(ReadableMap readableMap) {
        this.f42947f = readableMap != null ? readableMap.getDouble("value") : Double.NaN;
        this.f42948g = readableMap != null ? readableMap.getDouble("offset") : 0.0d;
    }

    @Override // p034d3.AbstractC6946b
    public String e() {
        return "ValueAnimatedNode[" + this.f42956d + "]: value: " + this.f42947f + " offset: " + this.f42948g;
    }

    public final void i() {
        this.f42948g += this.f42947f;
        this.f42947f = 0.0d;
    }

    public final void j() {
        this.f42947f += this.f42948g;
        this.f42948g = 0.0d;
    }

    public Object k() {
        return null;
    }

    public final double l() {
        if (Double.isNaN(this.f42948g + this.f42947f)) {
            h();
        }
        return this.f42948g + this.f42947f;
    }

    public final void m() {
        c cVar = this.f42949h;
        if (cVar != null) {
            double dL = l();
            double d10 = this.f42948g;
            cVar.a(dL - d10, d10);
        }
    }

    public final void n(c cVar) {
        this.f42949h = cVar;
    }

    public /* synthetic */ B(ReadableMap readableMap, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : readableMap);
    }
}
