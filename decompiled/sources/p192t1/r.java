package p192t1;

import com.google.android.gms.common.api.Api;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p142o1.f;

/* JADX INFO: loaded from: classes.dex */
final class r implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f49505a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public r(s sVar) {
    }

    @Override // p192t1.m
    public boolean a(f fVar) {
        p142o1.a aVarB = fVar.b();
        boolean z9 = aVarB instanceof p142o1.a.C0488a;
        int iF = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if ((z9 ? ((p142o1.a.C0488a) aVarB).f() : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        p142o1.a aVarA = fVar.a();
        if (aVarA instanceof p142o1.a.C0488a) {
            iF = ((p142o1.a.C0488a) aVarA).f();
        }
        return iF > 100;
    }

    @Override // p192t1.m
    public boolean b() {
        return i.f49493a.b(null);
    }
}
