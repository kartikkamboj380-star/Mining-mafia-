package com.facebook.react.devsupport;

import android.content.Context;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class r implements S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f14749a = new a(null);

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // com.facebook.react.devsupport.S
    public p124m3.e a(Context applicationContext, l0 reactInstanceManagerHelper, String str, boolean z9, p124m3.i iVar, p124m3.b bVar, int i10, Map map, p044e3.i iVar2, p124m3.c cVar, p124m3.h hVar, boolean z10) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(reactInstanceManagerHelper, "reactInstanceManagerHelper");
        if (p084i3.a.f45069e) {
            return new k0(applicationContext);
        }
        return z10 ? new C1279a(applicationContext, reactInstanceManagerHelper, str, z9, iVar, bVar, i10, map, iVar2, cVar, hVar) : new t0();
    }

    @Override // com.facebook.react.devsupport.S
    public p124m3.e b(Context applicationContext, l0 reactInstanceManagerHelper, String str, boolean z9, p124m3.i iVar, p124m3.b bVar, int i10, Map map, p044e3.i iVar2, p124m3.c cVar, p124m3.h hVar) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(reactInstanceManagerHelper, "reactInstanceManagerHelper");
        if (!z9) {
            return new t0();
        }
        try {
            String str2 = "com.facebook.react.devsupport.BridgeDevSupportManager";
            Intrinsics.checkNotNullExpressionValue(str2, "toString(...)");
            Object objNewInstance = Class.forName(str2).getConstructor(Context.class, l0.class, String.class, Boolean.TYPE, p124m3.i.class, p124m3.b.class, Integer.TYPE, Map.class, p044e3.i.class, p124m3.c.class, p124m3.h.class).newInstance(applicationContext, reactInstanceManagerHelper, str, Boolean.TRUE, iVar, bVar, Integer.valueOf(i10), map, iVar2, cVar, hVar);
            Intrinsics.d(objNewInstance, "null cannot be cast to non-null type com.facebook.react.devsupport.interfaces.DevSupportManager");
            return (p124m3.e) objNewInstance;
        } catch (Exception unused) {
            return new k0(applicationContext);
        }
    }
}
