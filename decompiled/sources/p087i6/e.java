package p087i6;

import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p038d7.d;
import p038d7.f;
import p137n6.j;
import p137n6.p;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f45084a;

    public e(p userMetadata) {
        Intrinsics.checkNotNullParameter(userMetadata, "userMetadata");
        this.f45084a = userMetadata;
    }

    @Override // p038d7.f
    public void a(p038d7.e rolloutsState) {
        Intrinsics.checkNotNullParameter(rolloutsState, "rolloutsState");
        p pVar = this.f45084a;
        Set<d> setB = rolloutsState.b();
        Intrinsics.checkNotNullExpressionValue(setB, "getRolloutAssignments(...)");
        ArrayList arrayList = new ArrayList(CollectionsKt.s(setB, 10));
        for (d dVar : setB) {
            arrayList.add(j.b(dVar.d(), dVar.b(), dVar.c(), dVar.f(), dVar.e()));
        }
        pVar.r(arrayList);
        g.f().b("Updated Crashlytics Rollout State");
    }
}
