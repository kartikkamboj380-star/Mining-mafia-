package p191t0;

import I8.C0687p;
import K.n;
import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p169q8.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MeasurementManager f49480b;

    public k(MeasurementManager mMeasurementManager) {
        Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
        this.f49480b = mMeasurementManager;
    }

    static /* synthetic */ Object e(k kVar, b bVar) {
        C0687p c0687p = new C0687p(p179r8.b.c(bVar), 1);
        c0687p.G();
        kVar.d().getMeasurementApiStatus(new j(), n.a(c0687p));
        Object objA = c0687p.A();
        if (objA == p179r8.b.e()) {
            h.c(bVar);
        }
        return objA;
    }

    static /* synthetic */ Object f(k kVar, Uri uri, InputEvent inputEvent, b bVar) {
        C0687p c0687p = new C0687p(p179r8.b.c(bVar), 1);
        c0687p.G();
        kVar.d().registerSource(uri, inputEvent, new j(), n.a(c0687p));
        Object objA = c0687p.A();
        if (objA == p179r8.b.e()) {
            h.c(bVar);
        }
        return objA == p179r8.b.e() ? objA : Unit.f45918a;
    }

    static /* synthetic */ Object g(k kVar, Uri uri, b bVar) {
        C0687p c0687p = new C0687p(p179r8.b.c(bVar), 1);
        c0687p.G();
        kVar.d().registerTrigger(uri, new j(), n.a(c0687p));
        Object objA = c0687p.A();
        if (objA == p179r8.b.e()) {
            h.c(bVar);
        }
        return objA == p179r8.b.e() ? objA : Unit.f45918a;
    }

    @Override // p191t0.a
    @Nullable
    public Object a(@NotNull b bVar) {
        return e(this, bVar);
    }

    @Override // p191t0.a
    @Nullable
    public Object b(@NotNull Uri uri, @Nullable InputEvent inputEvent, @NotNull b bVar) {
        return f(this, uri, inputEvent, bVar);
    }

    @Override // p191t0.a
    @Nullable
    public Object c(@NotNull Uri uri, @NotNull b bVar) {
        return g(this, uri, bVar);
    }

    protected final MeasurementManager d() {
        return this.f49480b;
    }
}
