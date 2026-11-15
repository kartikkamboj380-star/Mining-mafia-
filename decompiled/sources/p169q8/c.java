package p169q8;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p129m8.m;
import p179r8.b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final void a(Function2 function2, Object obj, b completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        b bVarC = b.c(b.a(function2, obj, completion));
        m.a aVar = m.f46450b;
        bVarC.resumeWith(m.b(Unit.f45918a));
    }
}
