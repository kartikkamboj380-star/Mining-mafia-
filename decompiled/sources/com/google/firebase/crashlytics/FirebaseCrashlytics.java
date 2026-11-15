package com.google.firebase.crashlytics;

import G6.a;
import H6.e;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import p007a6.f;
import p058f7.b;
import p087i6.d;
import p087i6.g;
import p087i6.l;
import p117l6.AbstractC7048i;
import p117l6.C7040a;
import p117l6.C7045f;
import p117l6.C7052m;
import p117l6.C7064z;
import p117l6.F;
import p117l6.K;
import p127m6.i;
import p176r5.InterfaceC7089f;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseCrashlytics {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final C7064z f40051a;

    private FirebaseCrashlytics(C7064z c7064z) {
        this.f40051a = c7064z;
    }

    static FirebaseCrashlytics b(f fVar, e eVar, a aVar, a aVar2, a aVar3, ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3) {
        Context contextM = fVar.m();
        String packageName = contextM.getPackageName();
        g.f().g("Initializing Firebase Crashlytics " + C7064z.q() + " for " + packageName);
        i iVar = new i(executorService, executorService2);
        p177r6.g gVar = new p177r6.g(contextM);
        F f10 = new F(fVar);
        K k10 = new K(contextM, packageName, eVar, f10);
        d dVar = new d(aVar);
        p077h6.d dVar2 = new p077h6.d(aVar2);
        C7052m c7052m = new C7052m(f10, gVar);
        b.e(c7052m);
        C7064z c7064z = new C7064z(fVar, k10, dVar, f10, dVar2.e(), dVar2.d(), gVar, c7052m, new l(aVar3), iVar);
        String strC = fVar.r().c();
        String strM = AbstractC7048i.m(contextM);
        List<C7045f> listJ = AbstractC7048i.j(contextM);
        g.f().b("Mapping file ID is: " + strM);
        for (C7045f c7045f : listJ) {
            g.f().b(String.format("Build id for %s on %s: %s", c7045f.c(), c7045f.a(), c7045f.b()));
        }
        try {
            C7040a c7040aA = C7040a.a(contextM, k10, strC, strM, listJ, new p087i6.f(contextM));
            g.f().i("Installer package name is: " + c7040aA.f46136d);
            p197t6.g gVarL = p197t6.g.l(contextM, strC, k10, new p167q6.b(), c7040aA.f46138f, c7040aA.f46139g, gVar, f10);
            gVarL.o(iVar).d(executorService3, new InterfaceC7089f() { // from class: h6.h
                @Override // p176r5.InterfaceC7089f
                public final void onFailure(Exception exc) {
                    g.f().e("Error fetching settings.", exc);
                }
            });
            if (c7064z.x(c7040aA, gVarL)) {
                c7064z.o(gVarL);
            }
            return new FirebaseCrashlytics(c7064z);
        } catch (PackageManager.NameNotFoundException e10) {
            g.f().e("Error retrieving app package info.", e10);
            return null;
        }
    }

    @NonNull
    public static FirebaseCrashlytics getInstance() {
        FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) f.o().k(FirebaseCrashlytics.class);
        if (firebaseCrashlytics != null) {
            return firebaseCrashlytics;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    @NonNull
    public Task<Boolean> checkForUnsentReports() {
        return this.f40051a.j();
    }

    public void deleteUnsentReports() {
        this.f40051a.k();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.f40051a.l();
    }

    public boolean isCrashlyticsCollectionEnabled() {
        return this.f40051a.s();
    }

    public void log(@NonNull String str) {
        this.f40051a.t(str);
    }

    public void recordException(@NonNull Throwable th) {
        if (th == null) {
            g.f().k("A null value was passed to recordException. Ignoring.");
        } else {
            this.f40051a.u(th, Collections.EMPTY_MAP);
        }
    }

    public void sendUnsentReports() {
        this.f40051a.y();
    }

    public void setCrashlyticsCollectionEnabled(boolean z9) {
        this.f40051a.z(Boolean.valueOf(z9));
    }

    public void setCustomKey(@NonNull String str, boolean z9) {
        this.f40051a.A(str, Boolean.toString(z9));
    }

    public void setCustomKeys(@NonNull p077h6.g gVar) {
        throw null;
    }

    public void setUserId(@NonNull String str) {
        this.f40051a.B(str);
    }

    public void setCrashlyticsCollectionEnabled(Boolean bool) {
        this.f40051a.z(bool);
    }

    public void setCustomKey(@NonNull String str, double d10) {
        this.f40051a.A(str, Double.toString(d10));
    }

    public void setCustomKey(@NonNull String str, float f10) {
        this.f40051a.A(str, Float.toString(f10));
    }

    public void setCustomKey(@NonNull String str, int i10) {
        this.f40051a.A(str, Integer.toString(i10));
    }

    public void recordException(@NonNull Throwable th, @NonNull p077h6.g gVar) {
        if (th == null) {
            g.f().k("A null value was passed to recordException. Ignoring.");
            return;
        }
        throw null;
    }

    public void setCustomKey(@NonNull String str, long j10) {
        this.f40051a.A(str, Long.toString(j10));
    }

    public void setCustomKey(@NonNull String str, @NonNull String str2) {
        this.f40051a.A(str, str2);
    }
}
