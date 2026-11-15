package androidx.activity;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    public static final class a extends v {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f7439d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z9, Function1 function1) {
            super(z9);
            this.f7439d = function1;
        }

        @Override // androidx.activity.v
        public void d() {
            this.f7439d.invoke(this);
        }
    }

    public static final v a(w wVar, androidx.lifecycle.r rVar, boolean z9, Function1 onBackPressed) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        a aVar = new a(z9, onBackPressed);
        if (rVar != null) {
            wVar.i(rVar, aVar);
            return aVar;
        }
        wVar.h(aVar);
        return aVar;
    }

    public static /* synthetic */ v b(w wVar, androidx.lifecycle.r rVar, boolean z9, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            rVar = null;
        }
        if ((i10 & 2) != 0) {
            z9 = true;
        }
        return a(wVar, rVar, z9, function1);
    }
}
